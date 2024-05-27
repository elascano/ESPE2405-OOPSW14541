/**
 * @autor Carlos Pérez, The Java Bandits, DCCO-ESPE
 */
class ChickenFarmSimulator {
    static main(args) {
        console.log("Hello chickens from Carlos Perez");
        console.log("Chicken Farm Simulator 2K24 V 0.1");

        let chicken = new Chicken(1, "Lucy", "Black", 1, true, new Date());

        console.log("Chicken -->", chicken);

        let id = 2;
        let name = "Maruja";
        let color = "white";
        let age = 0;
        let molting = false;
        let bornOnDate = new Date();

        chicken = new Chicken(id, name, color, age, molting, bornOnDate);
        console.log("Chicken -->", chicken);
    }
}

class Chicken {
    constructor(id, name, color, age, molting, bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
        this.bornOnDate = bornOnDate;
    }

    toString() {
        return `Chicken{id=${this.id}, name='${this.name}', color='${this.color}', age=${this.age}, molting=${this.molting}, bornOnDate=${this.bornOnDate}}`;
    }
}

// Ejecutar la función principal
ChickenFarmSimulator.main();
