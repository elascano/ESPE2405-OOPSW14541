export default class Food{
    
    #id
    #description

    constructor(id, description){
        this.#id = id
        this.#description = description
    }

    #getId(){
        return this.#id
    }

    #getDescription(){
        return this.#description
    }
}