const express = require('express');

const mongoose = require('mongoose');

const { MongoURI } = require('./config');

const posts_Routes = require('./routes/APIs/posts')

const app = express();

app.use(express.json());

// condition with URI -> make connection -> MongoDB
mongoose.connect(MongoURI, {useNewUrlParser: true, useUnifiedTopology: true, useFindAndModify: false})
.then(() => console.log('Connected successfully with MONGODB!!!!'))
.catch(err => console.log(err));
app.get('/', (req, res) => {
    res.send('Hello World!');
});

app.use('/APIs/posts', posts_Routes);

// localhost:3000
const port = process.env.PORT || 3000;

app.listen(port, () => console.log(`Server run at port ${port}!`));