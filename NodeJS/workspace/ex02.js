var http = require('http');
var dt = require('./myfirstmodule');

http.createServer(function (req, res) {
    console.log("Starting Server");
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write("The date and time are currently: " + dt.myDateTime());
    res.end();
}).listen(8282);