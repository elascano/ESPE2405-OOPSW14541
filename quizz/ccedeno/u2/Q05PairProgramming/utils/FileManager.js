const fs = require('fs');

class FileManager {
    saveToFile(productList, filename) {
        fs.writeFileSync(filename, JSON.stringify(productList));
    }

    readFile(filename) {
        if (fs.existsSync(filename)) {
            const data = fs.readFileSync(filename, 'utf8');
            return JSON.parse(data);
        } else {
            throw new Error('File not found');
        }
    }
}

module.exports = FileManager;