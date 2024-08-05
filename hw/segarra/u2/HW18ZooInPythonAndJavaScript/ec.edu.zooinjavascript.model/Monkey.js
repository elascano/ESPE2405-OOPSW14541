import Primate from "./Primate.js"

export default class Monkey extends Primate{
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate){
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate)
    }

    feed(){
        console.log('Feeding the monkey with bananas')
    }
}