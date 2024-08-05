class Animal {
    constructor(id, description, dateOnborn, gender, numberOfBones, cage) {
        this.id = id;
        this.description = description;
        this.dateOnborn = dateOnborn;
        this.gender = gender;
        this.numberOfBones = numberOfBones;
        this.cage = cage;
    }

    toString() {
        return `Animal{id=${this.id}, description=${this.description}, dateOnborn=${this.dateOnborn}, gender=${this.gender}, numberOfBones=${this.numberOfBones}, cage=${this.cage}}`;
    }
}

module.exports = Animal;
