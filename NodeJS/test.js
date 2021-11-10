var mysql = require('mysql')

var connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'Sumin298365!',
    database: 'company'
});

connection.connect();
connection.query('SELECT * from board', (error, rows, fields) => {
    if (error) throw error;
    console.log('User info is: ', rows);
    });

connection.end();