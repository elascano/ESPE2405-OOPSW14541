import { Chicken } from '../ec.edu.espe.farmsimulator.model/Chicken.js';
//const Chicken = import("../ec.edu.espe.farmsimulator.model/Chicken.js");

/*author:
    Luis Vaca, TheJavaBandits, DCCO-ESPE
*/

class ChickenFarmSimulator {
    static main() {
        console.log("Vaca's Chicken Farm Simulator V 0.5");

        let chicken1 = new Chicken(1, "Lucy", "brown", 1, true, new Date());
        console.log("Chicken 1 --> " + chicken1.toString());

        let id = 2;
        let name = "Maruja";
        let color = "black";
        let age = 1;
        let molting = false;
        let bornOnDate = new Date();

        let chicken2 = new Chicken(id, name, color, age, molting, bornOnDate);
        console.log("Chicken 2 --> " + chicken2.toString());
    }
}

ChickenFarmSimulator.main();