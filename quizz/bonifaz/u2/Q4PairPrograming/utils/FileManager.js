const fs = require('fs');

class FileManager {
    saveData(fileName, data) {
        fs.writeFileSync(fileName, JSON.stringify(data, null, 2));
    }

    loadData(fileName) {
        const rawData = fs.readFileSync(fileName);
        return JSON.parse(rawData);
    }
        
}

module.exports = FileManager;