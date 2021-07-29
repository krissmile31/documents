/* eslint-disable no-console */
import express from 'express';
import bodyParser from 'body-parser';
import helmet from 'helmet';
import mongoose from 'mongoose';

import cors from 'cors';
import { env, dbConnection } from '@/config';
import routes from '@/routes';

const bootstrap = () => {
  process.stdout.write('\u001b[2J\u001b[0;0H');

  const app = express();
  app.use(helmet());
  app.use(bodyParser.json()); // easier access to params
  app.use(cors()); // enable cross origin for react app

  app.use('/', routes); // register routes

  // start server
  app.listen(env.port, env.host, err => {
    if (err) {
      throw new Error('Server failed to start');
    }
    console.log(`Server is running on http://${env.host}:${env.port}`);
  });
  app.on('ready', () => {});

  // connect to db
  mongoose.connect(
    `mongodb://${dbConnection.host}:${dbConnection.port}/${dbConnection.database}`,
    {
      useNewUrlParser: true,
      useCreateIndex: true,
      useUnifiedTopology: true,
      useFindAndModify: false,
    }
  );
  mongoose.connection
    .on('error', console.error.bind(console, 'connection error:'))
    .once('open', () => {
      console.log(`Connected to '${dbConnection.database}'`);
      app.emit('ready');
    });
};

bootstrap();
