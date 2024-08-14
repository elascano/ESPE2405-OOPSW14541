function login() {
    const admin = document.getElementById('admin').value;
    const password = document.getElementById('password').value;

    // Perform validation and authentication here
    if (admin === "" || password === "") {
        alert("Por favor, complete todos los campos.");
    } else {
        // Placeholder for actual login logic
        alert(`Bienvenido, ${admin}!`);
    }
}

function cancel() {
    document.getElementById('loginForm').reset();
}