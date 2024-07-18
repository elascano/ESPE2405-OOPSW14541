const SchoolBag = require('./SchoolBag');

class SchoolBagSimulator {
    static generateData() {
        const schoolBags = [];

        let schoolBag1 = new SchoolBag(1, "Totto", "White and brown");
        schoolBags.push(schoolBag1);

        let schoolBag2 = new SchoolBag(2, "Nike", "black");
        schoolBags.push(schoolBag2);

        return schoolBags;
    }

    static main() {
        console.log("Christian's School Bag simulator V0.9");
        const schoolBags = SchoolBagSimulator.generateData();

        schoolBags.forEach((bag, index) => {
            console.log(`SchoolBag${index + 1} -->\n${bag.toString()}`);
        });
    }
}

SchoolBagSimulator.main();

module.exports = SchoolBagSimulator;

