module.exports = {
    MongoURI: 'mongodb://Rain:vO84eYGHxpAbAKQw@cluster0-shard-00-00.i4iwd.mongodb.net:27017,cluster0-shard-00-01.i4iwd.mongodb.net:27017,cluster0-shard-00-02.i4iwd.mongodb.net:27017/Rainblog?ssl=true&replicaSet=atlas-hly8j5-shard-0&authSource=admin&retryWrites=true&w=majority'
}
// Access List Entry: 222.252.16.63/32
// var MongoClient = require('mongodb').MongoClient;

// var uri = "mongodb://<username>:<password>@cluster0-shard-00-00.i4iwd.mongodb.net:27017,cluster0-shard-00-01.i4iwd.mongodb.net:27017,cluster0-shard-00-02.i4iwd.mongodb.net:27017/<dbname>?ssl=true&replicaSet=atlas-hly8j5-shard-0&authSource=admin&retryWrites=true&w=majority";
// MongoClient.connect(uri, function(err, client) {
//   const collection = client.db("test").collection("devices");
//   // perform actions on the collection object
//   client.close();
// });