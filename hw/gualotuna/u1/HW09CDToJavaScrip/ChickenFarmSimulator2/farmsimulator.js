const Chicken = require("./Chicken");
function main() {
    console.log("Brayan's Chicken Farm Simulator V 0.5");
    
    let chicken = new Chicken(1, "Lucy", "white and brown", 0, true, new Date());
    console.log("Chicken --> \n" + chicken.toString());
    
    let id = 2;
    let name = "Maruja";
    let color = "black";
    let age = 1;
    let molting = false;
    let bornOnDate = new Date();
    
    chicken = new Chicken(id, name, color, age, molting, bornOnDate);
    console.log("Chicken 2 --> \n" + chicken.toString());
}

main();