const { ipcMain } = require('electron');
const MongoDbManager = require('../utils/MongoDbManager');
const Shoes = require('../models/Shoes');

class ShoesController {
    constructor(dbUri, dbName) {
        this.mongoDbManager = new MongoDbManager(dbUri, dbName);

        ipcMain.on('create-shoe', async (event, shoeData) => {
            const shoe = new Shoes(shoeData.id, shoeData.price, shoeData.size, shoeData.brand);
            await this.mongoDbManager.connect();
            await this.mongoDbManager.addShoe(shoe);
            await this.mongoDbManager.close();
        });
    }
}

module.exports = ShoesController;