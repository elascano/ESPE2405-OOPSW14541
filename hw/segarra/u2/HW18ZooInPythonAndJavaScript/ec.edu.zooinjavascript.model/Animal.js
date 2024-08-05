export default class Animal {

    #id
    #description
    #bornOnDate
    #gender
    #cage
    #numberOfBones
    #vertebrate

    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate) {
        this.#id = id
        this.#description = description
        this.#bornOnDate = bornOnDate
        this.#gender = gender
        this.#cage = cage
        this.#numberOfBones = numberOfBones
        this.#vertebrate = vertebrate
    }

    #getId(){
        return this.#id
    }

    getIdProtected() {
        return this.#getId()
      }

    #getDescription(){
        return this.#description
    }

    getDescriptionProtected(){
        return this.#getDescription()
    }

    #getBornOnDate(){
        const today = new Date()
        const age = today.getFullYear() - this.bornOnDate.getFullYear()
        return age
    }

    getBornOnDateProtected(){
        return this.#getBornOnDate()
    }

    #getGender(){
        return this.#gender
    }

    getGenderProtected(){
        return this.#getGender()
    }

    #getCage(){
        return this.#cage
    }

    getCageProtected(){
        return this.#getCage()
    }

    #getNumberOfBones(){
        return this.#numberOfBones
    }

    getNumberOfBonesProtected(){
        return this.#getNumberOfBones()
    }

    #getVertebrate(){
        return this.#vertebrate
    }

    getVertebrateProtected(){
        return this.#getVertebrate()
    }
    
    feed(){
    }

    register(){
        console.log(`Registering the animal --> ${this.#description} in cage ${this.#cage}`);
    }

}