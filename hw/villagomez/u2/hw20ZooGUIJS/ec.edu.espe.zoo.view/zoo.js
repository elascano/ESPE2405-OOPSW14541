document.getElementById('numberOfBones').addEventListener('input', function() {
    document.getElementById('bonesValue').textContent = this.value;
});

function registerAnimal() {
    const id = document.getElementById('id').value;
    const description = document.getElementById('description').value;
    const bornOnDate = document.getElementById('bornOnDate').value;
    const gender = document.getElementById('gender').value;
    const cage = document.getElementById('cage').value;
    const numberOfBones = document.getElementById('numberOfBones').value;
    const vertebrate = document.querySelector('input[name="vertebrate"]:checked').value;
    const food = Array.from(document.getElementById('food').selectedOptions).map(option => option.value);

    console.log('ID:', id);
    console.log('Description:', description);
    console.log('Born On Date:', bornOnDate);
    console.log('Gender:', gender);
    console.log('Cage:', cage);
    console.log('Number of Bones:', numberOfBones);
    console.log('Vertebrate:', vertebrate);
    console.log('Food:', food);

}

function feedAnimal() {
    alert("Animal has been fed!");
}