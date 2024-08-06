import Bird from "./Bird.js";

export default class Condor extends Bird{
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate){
        super(id, description, bornOnDate, gender, cage, numberOfBones, vertebrate)
    }

    feed(){
        console.log('Feeding a condor with dead animals')
    }

}