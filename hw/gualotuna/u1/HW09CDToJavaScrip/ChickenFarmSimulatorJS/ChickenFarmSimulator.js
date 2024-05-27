
function main() {
    const title = "Brayan's Chicken Farm Simulator V 0.5";
    document.getElementById('title').innerText = title;

    let chicken = new Chicken(1, "Lucy", "white and brown", 0, true, new Date());
    document.getElementById('message').innerText = "Chicken --> \n" + chicken.toString();
    
    let id = 2;
    let name = "Maruja";
    let color = "black";
    let age = 1;
    let molting = false;
    let bornOnDate = new Date();
    
    chicken = new Chicken(id, name, color, age, molting, bornOnDate);
    document.getElementById('message').innerText += "\nChicken 2 --> \n" + chicken.toString();
}

main();