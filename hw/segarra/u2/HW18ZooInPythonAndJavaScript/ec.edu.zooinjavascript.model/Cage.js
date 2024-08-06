export default class Cage{

    #idCage
    #type

    constructor(id, type){
        this.#idCage = id
        this.#type = type
    }

   #getIdCage(){
        return this.#idCage
   }

   #getType(){
        return this.#type
   }

}