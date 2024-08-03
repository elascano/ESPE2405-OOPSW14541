const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

const fs = require('fs');

const SoccerPlayer = require('./ec.ed.espe.soccerplayersystem.model/SoccerPlayer');
const SaveSoccerPlayerData = require('./ec.ed.espe.soccerplayersystem.controller/SaveSoccerPlayerData');
const playerArray = [];


class SoccerPlayerSystem {
    static async main() {
        console.log("Domenica's Soccer Player System");
        let op;

        const askPlayerData = async () => {
            const id = await new Promise((resolve) => readline.question('Enter the ID: ', resolve));
            const name = await new Promise((resolve) => readline.question('Enter the name: ', resolve));
            const team = await new Promise((resolve) => readline.question('Enter the team: ', resolve));
            const position = await new Promise((resolve) => readline.question('Enter the position in game: ', resolve));

            return new SoccerPlayer(parseInt(id), name, team, position);
        };

        const player = await askPlayerData();
        const playerArray = [player]; 

        const jsonData = JSON.stringify(playerArray, null, 2);
        fs.writeFileSync('jugadores.json', jsonData);

    }
}

module.exports = ChickenFarmSimulator;
