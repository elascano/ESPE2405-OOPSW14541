import Bird from "./Bird.js"

export default class Eagle extends Bird{
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate){
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate)
    }

    feed(){
        console.log('Feeding the eagle with mice')
    }

}