const E = require('../model/E');
const C = require('../model/C');
const A = require('../model/A');
const B = require('../model/B');

const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function main() {
    const e = new E();
    const c = new C();

    //e = prompt("Ingrese e:");
    //c = prompt("Ingrese c:");

    e.m2(c);
    
    console.log(e);
    console.log(c);

    const a = new A();
    const b1 = new B();
    const b2 = new B();

    //a = prompt("Ingrese a:");
    //b1 = prompt("Ingrese b1:");
    //b2 = prompt("Ingrese b2:");

    a.m1(b1, b2);

    console.log(a);
    console.log(b1);
    console.log(b2);
  }
  
  main();