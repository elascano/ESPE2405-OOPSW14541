export default class Food {
    constructor(id, brand, type, price, stock) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.stock = stock; 
    }

    setId(id){
        this.id = id;
    }

    getId(){
        return this.id;
    }

    setBrand(brand){
        this.brand = brand;
    }

    getBrand(){
        return this.brand;
    }

    setType(type){
        this.type = type;
    }

    getType(){
        return this.type;
    }

    setPrice(price){
        this.price = price;
    }

    getPrice(){
        return this.price;
    }

    setAmountInLb(amountInLb){
        this.stock.setLb(amountInLb);
    }

    getAmountInLb(){
        return this.stock.getLb(); 
    }

    foodWithdraw(foodList) {
        foodList.forEach(food => {
            this.stock.reduceLb(food);
        });
    }
}

