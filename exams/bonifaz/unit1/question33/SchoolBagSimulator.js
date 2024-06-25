const SchoolBag = require('./SchoolBag');

class SchoolBagSimulator {
    static main() {
        console.log("Christian's School Bag simulator V0.9");

        let SchoolBag = new SchoolBag(1, "Totto", "White and brown");
        console.log("SchoolBag -->\n" + SchoolBag.toString());

        let id = 2;
        let brand = "Nike";
        let color = "black";
   

        SchoolBag = new SchoolBag(id, brand, color);
        console.log("SchoolBag2 --> \n" + SchoolBag.toString());
    }
}

SchoolBagSimulator.main();