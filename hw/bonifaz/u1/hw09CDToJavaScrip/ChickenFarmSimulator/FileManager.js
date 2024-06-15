import fs from 'fs';

export class FileManager {
    static FileSave(data, fileName, type) {
        let fileExtension = "";
        let separator = "";

        if (type === 0) { // TXT
            fileExtension = ".txt";
            separator = "\n";
        } else if (type === 1) { // CSV
            fileExtension = ".csv";
            separator = ",";
        } else if (type === 2) { // JSON
            fileExtension = ".json";
            separator = ",";
        }

        fileName += fileExtension;

        fs.appendFileSync(fileName, data + separator);
    }

    static FileReadLastId(fileName, type) {
        let lastLine = "";
        let separator = "";
        let lastId = 0;

        if (type === 0) { // TXT
            fileName += ".txt";
            separator = ":";
        } else if (type === 1 || type === 2) { // CSV or JSON
            fileName += (type === 1) ? ".csv" : ".json";
            separator = ",";
        }

        try {
            const data = fs.readFileSync(fileName, 'utf8');
            const lines = data.split('\n');

            if (lines.length > 0) {
                lastLine = lines[lines.length - 1];
                const values = lastLine.split(separator);

                if (type === 2) {
                    lastId = parseInt(values[0].split(":")[1]);
                } else {
                    lastId = parseInt(values[0]);
                }
            }
        } catch (error) {
            console.error("Error reading last ID:", error);
        }

        return lastId;
    }

    static FileRead(fileName, type) {
        if (type === 0) { // TXT
            fileName += ".txt";
        } else if (type === 1) { // CSV
            fileName += ".csv";
        } else if (type === 2) { // JSON
            fileName += ".json";
        }

        try {
            const data = fs.readFileSync(fileName, 'utf8');
            console.log(data);
        } catch (error) {
            console.error("Error reading file:", error);
        }
    }

    static FindData(fileName, type, wordSearch) {
        let separator = "";
        let result = "";

        if (type === 0) { // TXT
            fileName += ".txt";
        } else if (type === 1) { // CSV
            fileName += ".csv";
        } else if (type === 2) { // JSON
            fileName += ".json";
        }

        try {
            const data = fs.readFileSync(fileName, 'utf8');
            const lines = data.split('\n');

            for (const line of lines) {
                if (line.includes(wordSearch)) {
                    result = line;
                    break;
                }
            }
        } catch (error) {
            console.error("Error finding data:", error);
        }

        return result;
    }

    static UpdateData(fileName, type, wordSearch, newData) {
        let separator = "";

        if (type === 0) { // TXT
            fileName += ".txt";
        } else if (type === 1) { // CSV
            fileName += ".csv";
        } else if (type === 2) { // JSON
            fileName += ".json";
        }

        try {
            const data = fs.readFileSync(fileName, 'utf8');
            const lines = data.split('\n');

            const updatedLines = lines.map(line => {
                if (line.includes(wordSearch)) {
                    return line.replace(wordSearch, newData);
                }
                return line;
            });

            fs.writeFileSync(fileName, updatedLines.join('\n'));
        } catch (error) {
            console.error("Error updating data:", error);
        }
    }

    static DeleteData(fileName, type, idEdit) {
        let separator = "";
        let fileExtension = "";

        if (type === 0) { // TXT
            fileName += ".txt";
            separator = ":";
        } else if (type === 1) { // CSV
            fileName += ".csv";
            separator = ",";
        } else if (type === 2) { // JSON
            fileName += ".json";
            separator = ",";
        }

        let lines = [];

        try {
            const data = fs.readFileSync(fileName, 'utf8');
            lines = data.split('\n');
        } catch (error) {
            console.error("Error reading file:", error);
        }

        const filteredLines = lines.filter(line => {
            const values = line.split(separator);
            const numero = (type === 2) ? parseInt(values[0].split(":")[1]) : parseInt(values[0]);
            return numero !== idEdit;
        });

        try {
            fs.writeFileSync(fileName, filteredLines.join('\n'));
        } catch (error) {
            console.error("Error deleting data:", error);
        }
    }
}

export default FileManager; // Línea de exportación
