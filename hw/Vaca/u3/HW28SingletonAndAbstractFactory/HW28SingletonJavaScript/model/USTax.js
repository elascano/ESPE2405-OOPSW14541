
class USTax {
    constructor() {
      if (!USTax.instance) {
        this.taxRate = 0.07; 
        USTax.instance = this;
      }
      return USTax.instance;
    }
  
    calculateTax(saleAmount) {
      return saleAmount * this.taxRate;
    }
  }
  
  export default USTax;
  