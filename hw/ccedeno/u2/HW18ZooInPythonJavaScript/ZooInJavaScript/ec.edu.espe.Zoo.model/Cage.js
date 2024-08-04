class Cage {
    constructor(id, type) {
      this.id = id;
      this.type = type;
    }
  
    toString() {
      return `Cage{id=${this.id}, type=${this.type}}`;
    }
  
    // Getters and Setters
    getId() {
      return this.id;
    }
  
    setId(id) {
      this.id = id;
    }
  
    getType() {
      return this.type;
    }
  
    setType(type) {
      this.type = type;
    }
  }
  
  module.exports = Cage;
  