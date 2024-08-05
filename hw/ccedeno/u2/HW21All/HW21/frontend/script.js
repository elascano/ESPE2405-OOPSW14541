// Lista de contribuyentes predefinidos
const predefinedTaxPayers = [
    { id: '1234567890123', email: 'email1@example.com', name: 'Nombre 1', password: 'password1', documentation: 'docs1' },
    { id: '1234567890124', email: 'email2@example.com', name: 'Nombre 2', password: 'password2', documentation: 'docs2' },
    { id: '1234567890125', email: 'email3@example.com', name: 'Nombre 3', password: 'password3', documentation: 'docs3' }
];

// Función para manejar la búsqueda por noveno dígito
async function searchNinthDigit() {
    const ninthDigit = document.getElementById('ninthDigit').value;
    if (ninthDigit.length !== 1 || isNaN(ninthDigit)) {
        alert('Por favor, ingrese un solo dígito válido.');
        return;
    }

    const results = predefinedTaxPayers.filter(taxPayer => taxPayer.id.charAt(8) === ninthDigit);
    displaySearchResults(results, ninthDigit);
}

// Función para mostrar los resultados de la búsqueda
function displaySearchResults(results, ninthDigit) {
    const resultsList = document.getElementById('resultsList');
    resultsList.innerHTML = '';

    if (results.length === 0) {
        resultsList.innerHTML = `<p>No se encontraron contribuyentes con el noveno dígito ${ninthDigit}</p>`;
    } else {
        results.forEach(taxPayer => {
            const listItem = document.createElement('div');
            listItem.classList.add('taxpayer');
            listItem.innerHTML = `
                <p><strong>ID:</strong> ${taxPayer.id}</p>
                <p><strong>Email:</strong> ${taxPayer.email}</p>
                <p><strong>Nombre:</strong> ${taxPayer.name}</p>
                <p><strong>Password:</strong> ${taxPayer.password}</p>
                <p><strong>Documentation:</strong> ${taxPayer.documentation}</p>
            `;
            resultsList.appendChild(listItem);
        });
    }
}

// Función para mostrar la lista predefinida de contribuyentes
function displayPredefinedTaxPayers() {
    const resultsList = document.getElementById('resultsList');
    resultsList.innerHTML = '';

    predefinedTaxPayers.forEach(taxPayer => {
        const listItem = document.createElement('div');
        listItem.classList.add('taxpayer');
        listItem.innerHTML = `
            <p><strong>ID:</strong> ${taxPayer.id}</p>
            <p><strong>Email:</strong> ${taxPayer.email}</p>
            <p><strong>Nombre:</strong> ${taxPayer.name}</p>
            <p><strong>Password:</strong> ${taxPayer.password}</p>
            <p><strong>Documentation:</strong> ${taxPayer.documentation}</p>
        `;
        resultsList.appendChild(listItem);
    });
}

// Función para manejar el botón de regresar
function goBack() {
    window.location.href = 'menu.html';
}


