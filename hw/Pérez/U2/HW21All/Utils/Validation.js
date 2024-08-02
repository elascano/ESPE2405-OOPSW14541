const fs = require('fs').promises;
const path = require('path');

async function findAccountById(fileName, idToCheck) {
    try {
        const filePath = path.join(__dirname, '..', 'data', fileName);
        const data = await fs.readFile(filePath, 'utf-8');
        const commensalList = JSON.parse(data);

        return commensalList.some(commensal => commensal.id === idToCheck);
    } catch (error) {
        console.error(`Error finding data in the file ${fileName}: ${error.message}`);
        return false;
    }
}

async function validateIdInput(idInput, jsonFiles) {
    if (!validateId(idInput)) {
        console.log("The ID entered is not valid; please type again.");
        return false;
    }

    const idToCheck = parseInt(idInput, 10);

    for (const fileName of jsonFiles) {
        if (await findAccountById(fileName, idToCheck)) {
            console.log("The ID has already been entered. Please try again.");
            return false;
        }
    }

    return idToCheck.toString(); // Return as string to maintain consistency with input
}

function validateId(idInput) {
    if (idInput.length !== 10 || isNaN(idInput)) {
        return false;
    }

    const digits = idInput.split('').map(Number);
    let evenPositionSum = 0;
    let oddPositionSum = 0;

    for (let i = 0; i < 9; i += 2) {
        let doubledDigit = digits[i] * 2;
        if (doubledDigit > 9) {
            doubledDigit -= 9;
        }
        evenPositionSum += doubledDigit;
    }

    for (let i = 1; i < 9; i += 2) {
        oddPositionSum += digits[i];
    }

    const totalSum = evenPositionSum + oddPositionSum;
    const remainder = totalSum % 10;
    let checkDigit = 10 - remainder;
    if (checkDigit === 10) {
        checkDigit = 0;
    }

    return checkDigit === digits[9];
}

module.exports = {
    validateId,
    findAccountById,
    validateIdInput
};
