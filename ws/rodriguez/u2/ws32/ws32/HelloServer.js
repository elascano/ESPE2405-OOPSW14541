const http = require('node:http');
const hostname = '127.0.0.1';
const port = '3018';
const server = http.createServer((req, res)=>{
res.statusCode = 200; //200 ejecucion bien , 400 no hay , 500 error de programacion
res.setHeader('Content-type','text/plain');
res.end('Hello, David Rodriguez\n');
});

server.listen(port, hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`);
});
