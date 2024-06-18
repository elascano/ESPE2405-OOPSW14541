const fs = require('fs');

class FileManager {
    static save(data, fileName, type) {
        if (type === 0) { // TXT
            fileName = fileName + '.txt';
        } else if (type === 1) { // CSV
            fileName = fileName + '.csv';
        } else if (type === 2) { // JSON
            fileName = fileName + '.json';
        }

        fs.appendFile(fileName, data + '\n', (err) => {
            if (err) {
                console.error('Error writing to the file: ' + err.message);
            } else {
                console.log('Data successfully saved to ' + fileName);
            }
        });
    }
}
module.exports = FileManager;