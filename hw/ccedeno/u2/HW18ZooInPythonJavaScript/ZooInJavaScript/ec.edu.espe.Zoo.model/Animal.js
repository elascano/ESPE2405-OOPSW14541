class Animal {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
      this.id = id;
      this.description = description;
      this.dateOnborn = new Date(dateOnborn);
      this.gender = gender;
      this.numberOfBones = numberOfBones;
      this.cage = cage;
      this.numberOfLegs = 0;
    }
  
    toString() {
      return `Animal{id=${this.id}, description=${this.description}, dateOnborn=${this.dateOnborn}, gender=${this.gender}, numberOfBones=${this.numberOfBones}, cage=${this.cage}}`;
    }
  
    feed(food) {
      throw new Error('Method "feed" must be implemented');
    }
  
    register(cage) {
      console.log(`Register the animal ---> ${this.constructor.name} in cage ${cage}`);
    }
  
    // Getters and Setters
    getId() {
      return this.id;
    }
  
    setId(id) {
      this.id = id;
    }
  
    getDescription() {
      return this.description;
    }
  
    setDescription(description) {
      this.description = description;
    }
  
    getDateOnborn() {
      return this.dateOnborn;
    }
  
    setDateOnborn(dateOnborn) {
      this.dateOnborn = new Date(dateOnborn);
    }
  
    getGender() {
      return this.gender;
    }
  
    setGender(gender) {
      this.gender = gender;
    }
  
    getNumberOfBones() {
      return this.numberOfBones;
    }
  
    setNumberOfBones(numberOfBones) {
      this.numberOfBones = numberOfBones;
    }
  
    getCage() {
      return this.cage;
    }
  
    setCage(cage) {
      this.cage = cage;
    }
  }
  
  module.exports = Animal;
  