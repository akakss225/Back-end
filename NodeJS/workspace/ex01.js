var http = require('http');
http.createServer(function(req, res){
    console.log("Starting Server")
    res.writeHead(200, {'Content-Type':'text/plain'});
    res.end('Hellow World!')
}).listen(8282);