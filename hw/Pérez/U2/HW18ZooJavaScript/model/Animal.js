export class Animal {
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate) {
        this.id = id;
        this.description = description;
        this.bornOnDate = bornOnDate;
        this.gender = gender;
        this.cage = cage;
        this.numberOfBones = numberOfBones;
        this.vetebrate = vetebrate;
    }

    feed(food) {
        throw new Error('Method "feed" must be implemented.');
    }

    register() {
        console.log(`Registering the animal --> ${this.constructor.name} in cage ${this.getCage()}`);
    }

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

    getBornOnDate() {
        return this.bornOnDate;
    }

    setBornOnDate(bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    getGender() {
        return this.gender;
    }

    setGender(gender) {
        this.gender = gender;
    }

    getCage() {
        return this.cage;
    }

    setCage(cage) {
        this.cage = cage;
    }

    getNumberOfBones() {
        return this.numberOfBones;
    }

    setNumberOfBones(numberOfBones) {
        this.numberOfBones = numberOfBones;
    }

    isVetebrate() {
        return this.vetebrate;
    }

    setVetebrate(vetebrate) {
        this.vetebrate = vetebrate;
    }

    toString() {
        return `Animal{id=${this.id}, description=${this.description}, bornOnDate=${this.bornOnDate}, gender=${this.gender}, cage=${this.cage}, numberOfBones=${this.numberOfBones}, vetebrate=${this.vetebrate}}`;
    }
}
