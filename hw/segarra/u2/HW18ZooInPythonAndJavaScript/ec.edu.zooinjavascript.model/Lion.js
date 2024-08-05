import Feline from "./Feline.js";

export default class Lion extends Feline{
    
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate, food){
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate)
        this.food = food
    }

    

    feed(quantity, food){
        console.log(`Feeding the lion with ${quantity} ${food}(s)`)
    }
}