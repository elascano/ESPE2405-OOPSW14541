const B = require('./B');

class A {
    constructor() {
        this.b1 = new B();
        this.b2 = new B();
    }

    setB1(b1) {
        this.b1 = b1;
    }
    
    getB1() {
        return this.b1;
    }

    setB2(b2) {
        this.b2 = b2;
    }
    
    getB2() {
        return this.b2;
    }

    m1(x, y) {

    }
}

module.exports = A;