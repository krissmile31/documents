exports.getList = function(connection, callback) {
	connection.query(
		'SELECT * FROM product',
		function(error, results, fields) {
			callback(results);
		});
};
exports.add = function(connection, name, ingredient, recipe, price, description, imageURL, callback) {
	const product = {
		id:null,
		name:name,
		ingredient:ingredient,
		recipe:recipe,
		price:price,
		description:description,
		imageURL: imageURL
	};
	connection.query(
		'INSERT INTO product SET ?',
		product,
		function(error, results, fields) {
			if (error) {
				callback({code: -1, message: 'The name of product already exists'});
			} else {
				callback({code: 0, message: 'Success'});
			}
		});
};
exports.delete = function(connection, productID, callback) {
	connection.query(
		'DELETE FROM product WHERE id = ?',
		[productID],
		function(error, results, fields) {
			if (error) {
				callback({code:-1, message:'Are you sure?'});
			} else {
				callback({code:0, message:'Success'});
			}
		});
};
exports.edit = function(connection, productID, ingredient, recipe, price, description, imageURL, callback) {
	const product = {
		ingredient:ingredient,
		recipe:recipe,
		price:price,
		description:description,
		imageURL:imageURL
	};
	connection.query(
		'UPDATE product SET ? WHERE id = ?',
		[product, productID],
		function(error, results, fields) {
			if (error) {
				console.log('edit: ', error);
				callback({code: -1, message: 'Are you sure?'});
			} else {
				callback({code: 0, message: 'Success'});
			}
		});
};
exports.detail = function(connection, productID, cols, callback) {
	connection.query(
		`SELECT ${cols} FROM product WHERE id = ?`,
		productID,
		function(err, results, fields) {
			console.log('len', results.length);
			if (err || results.length <= 0) {
				callback({code:-1, message:'Error'});
			} else {
				callback({code:0, product:results[0]});
			}
		});
};