function navigateTo(page) {
    if (page === 'classification') {
        window.location.href = 'index.html';
    } else if (page === 'contribuyente' || page === 'pricing') {
        alert('Funcionalidad aún no implementada.');
    }
}

function logout() {
    window.location.href = 'login.html';
}
