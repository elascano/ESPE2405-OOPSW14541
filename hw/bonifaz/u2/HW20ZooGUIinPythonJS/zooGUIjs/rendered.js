function register() {
    const id = document.getElementById('id').value;
    const description = document.getElementById('description').value;
    const bornOnDate = document.getElementById('bornOnDate').value;
    const gender = document.getElementById('gender').value;
    const cage = document.getElementById('cage').value;
    const numberOfBones = document.getElementById('numberOfBones').value;
    const vertebrate = document.getElementById('vertebrate').checked;
    const foodOptions = document.getElementById('food').options;
    let food = [];
    for (let option of foodOptions) {
        if (option.selected) {
            food.push(option.value);
        }
    }

    alert(`Id: ${id}\nDescription: ${description}\nBorn on date: ${bornOnDate}\nGender: ${gender}\nCage: ${cage}\nNumber of bones: ${numberOfBones}\nVertebrate: ${vertebrate}\nFood: ${food.join(', ')}`);
}
