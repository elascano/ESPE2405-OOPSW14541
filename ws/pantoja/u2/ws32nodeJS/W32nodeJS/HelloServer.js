const http = require('node:http');

const hostname = '127.0.0.1';
const port = 3016;

const server = http.createServer((req,res) => {      //500 error de programacion 
    res.statusCode = 200; 
    res.setHeader('Content-Type', 'textplain');
    res.end('Hello David Pantoja!\n');
});

server.listen(port,hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`);
});