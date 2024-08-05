import Commensal from "./Commensal.js";

export default class Dinner extends Commensal{
    constructor(id, name, email, password, grade, type, balance, bookedDays){
        super(id, name, email, password, grade, type, balance, bookedDays);
    }
}