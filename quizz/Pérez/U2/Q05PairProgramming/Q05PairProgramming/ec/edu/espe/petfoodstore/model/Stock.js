export default class Stock {
    constructor(lb) {
        this.lb = lb;
    }

    setLb(lb){
        this.lb = lb;
    }

    getLb(){
        return this.lb;
    }

    reduceLb(food) {
        this.lb -= food.stock.getLb(); // Accede correctamente al lb del stock de food
    }
}
