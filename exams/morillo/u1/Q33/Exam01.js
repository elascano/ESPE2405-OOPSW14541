const fs = require('fs');

class Table {
    constructor(id, shape, material, price) {
        this.id = id;
        this.shape = shape;
        this.material = material;
        this.price = price;
    }
    static fromJson(json) {
        const { id, shape, material, price } = json;
        return new Table(id, shape, material, price);
    }

    toJson() {
        return {
            id: this.id,
            shape: this.shape,
            material: this.material,
            price: this.price
        };
    }
}

class TableManager {
    constructor(jsonFilePath) {
        this.jsonFilePath = jsonFilePath;
        this.tables = [];
        this.loadTablesFromJson();
    }

    loadTablesFromJson() {
        try {
            const data = fs.readFileSync(this.jsonFilePath, 'utf8');
            const jsonArray = JSON.parse(data);
            this.tables = jsonArray.map(tableJson => Table.fromJson(tableJson));
        } catch (error) {
            console.error('Error al leer el archivo JSON:', error);
        }
    }

    saveTablesToJson() {
        try {
            const jsonTables = this.tables.map(table => table.toJson());
            const jsonString = JSON.stringify(jsonTables, null, 2);
            fs.writeFileSync(this.jsonFilePath, jsonString, 'utf8');
            console.log('Mesas guardadas en el archivo JSON exitosamente.');
        } catch (error) {
            console.error('Error al escribir el archivo JSON:', error);
        }
    }

    addTable(table) {
        this.tables.push(table);
        this.saveTablesToJson();
    }

    displayTables() {
        console.log('Mesas:');
        this.tables.forEach(table => {
            console.log(`ID: ${table.id}, Forma: ${table.shape}, Material: ${table.material}, Precio: ${table.price}`);
        });
    }
}

const tableManager = new TableManager('mesas.json');
const nuevaMesa = new Table('M001', 'Redonda', 'Madera', 149.99);
tableManager.addTable(nuevaMesa);
tableManager.displayTables();