const mysql      = require('mysql');
let connection = mysql.createConnection({
	host     : '127.0.0.1',
	user     : 'root',
	password : '',
	database : 'test'
});
connection.connect(function(err){
	if(!err) {
		console.log('Database is connected ');
	} else {
		console.log('Error connecting database', err);
	}
});
module.exports = connection;
