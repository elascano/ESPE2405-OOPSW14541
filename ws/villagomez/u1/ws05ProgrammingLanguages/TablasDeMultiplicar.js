
function imprimirTablasMultiplicar() {
    for (let i = 1; i <= 10; i++) {
        console.log(`Tabla del ${i}`);
        for (let j = 1; j <= 10; j++) {
            let resultado = i * j;
            console.log(`${i} x ${j} = ${resultado}`);
        }
        console.log('--------------------');
    }
}

imprimirTablasMultiplicar();