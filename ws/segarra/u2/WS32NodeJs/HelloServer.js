const http =  require('node:http');
const hostname = '127.0.0.1';//va a correr en esta maquina
const port = 3019;//donde va a estar el servidor
//req lo que necesito ---- res lo que devuelve
const server = http.createServer((req, res) => {
    res.statusCode = 200; //el 200 en la web significa que todo se ejecuto bien
    res.setHeader('Content-Type', 'text/plain');
    res.end('Hello, Eduardo Segarra!\n');
});

server.listen(port, hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`);
});