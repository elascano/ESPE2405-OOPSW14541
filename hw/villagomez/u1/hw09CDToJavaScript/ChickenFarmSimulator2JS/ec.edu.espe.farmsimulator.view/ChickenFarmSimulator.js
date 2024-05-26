const Chicken = require('../ec.edu.espe.farmsilumator.model/Chicken');
/*author: 
    Doménica Villagómez, CommitCrew, DCCO-ESPE
*/
class ChickenFarmSimulator {
    static main() {
        console.log("Domenica's Chicken Farm Simulator V. 0.5");

        let chicken1 = new Chicken(1, "Lucy", "white and brown", 0, true, new Date());
        console.log("Chicken 1 -->\n" + chicken1.toString());

        const id = 2;
        const name = "Maruja";
        const color = "black";
        const age = 1;
        const molting = false;
        const bornOnDate = new Date();

        let chicken2 = new Chicken(id, name, color, age, molting, bornOnDate);
        console.log("Chicken 2 -->\n" + chicken2.toString());
    }
}

if (require.main === module) {
    ChickenFarmSimulator.main();
}

module.exports = ChickenFarmSimulator;