function registerAnimal() {
    // Obtener los valores de los campos
    var id = document.getElementById("id").value;
    var description = document.getElementById("description").value;
    var bornDate = document.getElementById("bornDate").value;
    var gender = document.getElementById("gender").value;
    var cage = document.getElementById("cage").value;
    var bones = document.getElementById("bones").value;
    var vertebrate = document.getElementById("vertebrate").checked;
    var foodOptions = document.getElementById("food").selectedOptions;
    var food = [];
    for (var i = 0; i < foodOptions.length; i++) {
        food.push(foodOptions[i].value);
    }

    // Aquí puedes implementar la lógica para enviar los datos a un servidor o realizar alguna acción

    // Ejemplo: Mostrar los datos en consola
    console.log("ID:", id);
    console.log("Description:", description);
    console.log("Born on Date:", bornDate);
    console.log("Gender:", gender);
    console.log("Cage:", cage);
    console.log("Number of Bones:", bones);
    console.log("Vertebrate:", vertebrate);
    console.log("Food:", food);
}

function feedAnimal() {
    // Implementa la lógica para la función "Feed" aquí
    alert("Implementa la lógica para la función 'Feed' aquí");
}
