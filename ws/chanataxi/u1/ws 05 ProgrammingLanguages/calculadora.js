const readline = require('readline');

const rl = readline.createInterface({   
    input: process.stdin,
    output: process.stdout
});

function mostrarTablaMultiplicar(numero) {
    console.log(`Tabla de multiplicar del ${numero}:`);
    for (let i = 1; i <= 10; i++) {
        console.log(`${numero} x ${i} = ${numero * i}`);
    }
}

rl.question('Introduce un número para mostrar su tabla de multiplicar: ', (num) => {
    const numero = parseFloat(num);

    if (isNaN(numero)) {
        console.log('Por favor, introduce un número válido.');
    } else {
        mostrarTablaMultiplicar(numero);
    }

    rl.close();
});
