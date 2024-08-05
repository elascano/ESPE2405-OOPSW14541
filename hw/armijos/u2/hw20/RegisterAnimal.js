function registerAnimal() {
    const id = document.getElementById('id').value;
    const description = document.getElementById('description').value;
    const bornOnDate = document.getElementById('bornOnDate').value;
    const gender = document.getElementById('gender').value;
    const cage = document.getElementById('cage').value;
    const numberOfBones = document.getElementById('numberOfBones').value;
    const vertebrate = document.getElementById('vertebrate').checked;
    const foods = Array.from(document.getElementById('foods').selectedOptions).map(option => option.value);

    const animal = {
        id: id,
        description: description,
        bornOnDate: bornOnDate,
        gender: gender,
        cage: cage,
        numberOfBones: numberOfBones,
        vertebrate: vertebrate,
        foods: foods
    };

    console.log('Registered Animal:', animal);
    // Aquí podrías hacer una llamada a una API para guardar el objeto `animal` en una base de datos.
}

function feedAnimal() {
    const foods = Array.from(document.getElementById('foods').selectedOptions).map(option => option.value);
    console.log('Feeding Animal with:', foods);
}

document.getElementById('numberOfBones').addEventListener('input', function() {
    document.getElementById('bonesCount').innerText = this.value;
});
