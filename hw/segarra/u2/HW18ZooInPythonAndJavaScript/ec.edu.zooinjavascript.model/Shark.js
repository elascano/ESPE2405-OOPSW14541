import Fish from "./Fish.js";

export default class Shark extends Fish{
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate){
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate)
    }

    feed(){
        console.log('Feeding a shark with fish')
    }

}