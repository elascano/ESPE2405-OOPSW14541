class Store {
    constructor(id, name, inventory, sales) {
        this.id = id;
        this.name = name;
        this.inventory = inventory;
        this.sales = sales;
        this.efficiency = null;
    }

    setId(id) {
        this.id = id;
    }
    getId() {
        return this.id;
    }
    setName(name) {
        this.name = name;
    }
    getName() {
        return this.name;
    }
    setInventory(inventory) {
        this.inventory = inventory;
    }
    getInventory() {
        return this.inventory;
    }
    setSales(sales) {
        this.sales = sales;
    }
    getSales() {
        return this.sales;
    }
    setEfficiency(efficiency) {
        this.efficiency = efficiency;
    }
    getEfficiency() {
        return this.efficiency;
    }
}

export default Store;
