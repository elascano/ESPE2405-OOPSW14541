import Feline from "./Feline.js"

export default class Tiger extends Feline{
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate){
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate)
    }

    feed(){
        console.log('Feeding the tiger with meat')
    }
}