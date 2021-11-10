var http = require('http');
var dt = require('./myfirstmodule');
console.log("Starting Server");
http.createServer(function (req, res) {
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write("The date and time are currently: " + dt.myDateTime());
    res.end();
}).listen(8282);