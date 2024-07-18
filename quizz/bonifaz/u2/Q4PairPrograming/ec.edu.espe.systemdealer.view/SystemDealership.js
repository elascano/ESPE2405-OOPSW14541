const readline = require('readline');
const Dealership = require('../ec.edu.espe.systemdealer.model/Dealership');
const FileManager = require('../utils/FileManager');
const Menu = require('./Menu');

class SystemDealership {
    constructor() {
        this.fileManager = new FileManager();
        this.rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });
    }

    main() {
        this.rl.question('Introduzca el Concesionaria: ', (brand) => {
            this.dealership = new Dealership(brand);
            const menu = new Menu(this.dealership, this.fileManager);
            menu.showMenu();
        });
    }
}

const systemDealership = new SystemDealership();
systemDealership.main();