const http = require('node:http');

const hostname = '127.0.0.1';
const port = 3023;

const server = http.createServer((req, res) =>{
        res.statusCode = 200; //ejecución con éxito
        res.setHeader('Content-Type', 'text/plain');
        res.end('Hello, Doménica Villagómez\n');
});


server.listen(port, hostname, ()=>{
    console.log(`Server running at http://${hostname}:${port}/`);
})
