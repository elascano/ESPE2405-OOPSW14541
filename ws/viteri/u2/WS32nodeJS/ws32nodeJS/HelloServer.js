const http = require('node:http');

const hostname ='127.0.0.1';
const port = 3024;

const server = http.createServer((req, res) => {
    res.statusCode = 200;
    res.setHeader('Content_Type','text/plain');
    res.end('Hello, Alexis Viteri\n');
    })

    server.listen(port, hostname,() => {
        console.log(`Server running at http://${hostname};${port}/`);

    });