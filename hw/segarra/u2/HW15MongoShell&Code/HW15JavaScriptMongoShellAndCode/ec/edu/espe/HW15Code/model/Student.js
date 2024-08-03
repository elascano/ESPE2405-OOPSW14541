//Studen.js

export default class Food {
    constructor(id, name, male, siblings) {
        this.id = id;
        this.name = name;
        this.male = male;
        this.siblings = siblings;
    }

    setId(id){
        this.id = id;
    }

    getId(){
        return this.id;
    }

    setName(name){
        this.name = name;
    }

    getName(){
        return this.name;
    }

    setMale(male){
        this.male = male;
    }

    getMale(){
        return this.male;
    }

    setSiblings(siblings){
        this.siblings = siblings;
    }

    getSiblings(){
        return this.siblings;
    }
}