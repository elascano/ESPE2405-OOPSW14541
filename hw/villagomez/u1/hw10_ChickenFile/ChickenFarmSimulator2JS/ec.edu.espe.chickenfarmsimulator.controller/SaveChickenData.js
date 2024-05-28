const fs = require('fs');

class SaveChickenData {
  static saveChickenData(chicken, filePath) {
    const data = `Id: ${chicken.id}\nName: ${chicken.name}\nColor: ${chicken.color}\nAge: ${chicken.age}\nMolting: ${chicken.molting}\nBorn on date: ${chicken.bornOnDate}`;

    return new Promise((resolve, reject) => {
      fs.writeFile(filePath, data, (err) => {
        if (err) {
          reject(err);
        } else {
          resolve('Chicken data saved successfully.');
        }
      });
    });
  }
}

module.exports = SaveChickenData;