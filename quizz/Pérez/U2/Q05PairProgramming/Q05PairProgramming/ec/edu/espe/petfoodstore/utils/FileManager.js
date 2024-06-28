import fs from 'fs';

export default class FileManager {
    static load() {
        try {
            if (fs.existsSync('food.json')) { // Verificar si el archivo existe
                const data = fs.readFileSync('food.json', 'utf8');
                const parsedData = JSON.parse(data);
                return Array.isArray(parsedData) ? parsedData : []; // Asegurarse de devolver un array
            } else {
                return [];
            }
        } catch (err) {
            console.error('Error reading file:', err);
            return [];
        }
    }

    static save(foodList) {
        fs.writeFile('food.json', JSON.stringify(foodList, null, 2), (err) => {
            if (err) {
                console.error('Error writing file:', err);
            } else {
                console.log('Food data saved to food.json');
            }
        });
    }
}
