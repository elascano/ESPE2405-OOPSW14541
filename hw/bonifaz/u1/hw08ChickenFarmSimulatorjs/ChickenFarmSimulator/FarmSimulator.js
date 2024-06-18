const Chicken = require('./Chicken');

class FarmSimulator {
    static main() {
        console.log("Christian's Chicken farm simulator V0.9");

        let chicken = new Chicken(1, "Luccy", "White and brown", 0, true, new Date());
        console.log("Chicken -->\n" + chicken.toString());

        let id = 2;
        let name = "Marujaa";
        let color = "black";
        let age = 1;
        let molting = false;
        let bornOnDate = new Date();

        chicken = new Chicken(id, name, color, age, molting, bornOnDate);
        console.log("Chicken 2 --> \n" + chicken.toString());
    }
}

FarmSimulator.main();
