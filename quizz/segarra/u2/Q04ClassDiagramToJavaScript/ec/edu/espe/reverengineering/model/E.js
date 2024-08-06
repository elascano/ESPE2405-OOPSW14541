const A = require('./A');
const B = require('./B');
const C = require('./C');

class E {
    constructor() {
        this.a = new A();
        this.b = new Array(10).fill(new B());
    }

    setA(a) {
        this.a = a;
    }
    
    getA() {
        return this.a;
    }
    
    setBs(bArray) {
        this.b = bArray;
    }
    
    getBs() {
        return this.b;
    }

    m2(z) {
        
    }
}

module.exports = E;