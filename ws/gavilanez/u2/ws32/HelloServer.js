const http = require ('node:http');
const hostname = '127.0.0.1';
const port = 3010;
const server = http.createServer((req, res) => {
    res.statusCode = 200;//200 ->todo de ejecuto con exito 404->no hay 504->error de programacion
    res.setHeader('Content-Type','text/plain');
    res.end('Hello, Kenny gavilanez!\n');
});
server.listen(port, hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`);
});