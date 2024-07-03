
const A = require('./A');
const B = require('./B');
const C = require('./C');

class E {
    constructor() {
        this.a = new A(); 
        this.b = []; 
        for (let i = 0; i < 10; i++) {
            this.b.push(new B(i));
        }
    }

    m2(z) {
      
    }
}

module.exports = E;

