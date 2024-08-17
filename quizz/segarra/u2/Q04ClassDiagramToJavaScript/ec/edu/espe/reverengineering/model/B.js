class B {
    constructor(value = null) {
        this.value = value;
      }
    
      setValue(value) {
        this.value = value;
      }
    
      getValue() {
        return this.value;
      }
}

module.exports = B;