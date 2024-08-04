function login() {
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // Usuario y contraseña correctos
    const correctUsername = "scurpin";
    const correctPassword = "1214";

    // Validar que el nombre de usuario no contenga números
    if (!username.match(/^[a-zA-Z\s]+$/)) {
        document.getElementById('error-message').innerText = 'El nombre de usuario no debe contener números.';
        return;
    }

    // Validar credenciales
    if (username === correctUsername && password === correctPassword) {
        // Redirigir al menú principal
        window.location.href = 'menu.html';
    } else {
        document.getElementById('error-message').innerText = 'Usuario o contraseña incorrectos. Por favor, intente de nuevo.';
    }
}

