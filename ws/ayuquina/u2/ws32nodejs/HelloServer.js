const http = require('node:http');

const hostname = '127.0.0.1';
const port = 3004;
                               //(request, response)
const server = http.createServer((req, res)=> {

    res.statusCode = 200;//200 quiere decir que todo se ejecutó bien, 404 quiere decir que no existe, 500 error de programación
    res.setHeader('Content-Type', 'text/plain')
    res.end('Hello Danny Ayuquina!!!!\n')

});

server.listen(port, hostname, ()=>{
    console.log(`Server running at http;//${hostname}:${port}/`);
})
//CTRL+C Para detener el programa 
