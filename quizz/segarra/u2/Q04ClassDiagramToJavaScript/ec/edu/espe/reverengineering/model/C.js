const B = require('./B');

class C {
    constructor() {
        this.b = new B();
      }
    
      setB(b) {
        this.b = b;
      }
    
      getB() {
        return this.b;
      }
}

module.exports = C;