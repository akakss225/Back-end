var http = require('http');
console.log("Starting Server")
http.createServer(function(req, res){
    res.writeHead(200, {'Content-Type':'text/plain'});
    res.end('Hellow World!')
}).listen(8282);