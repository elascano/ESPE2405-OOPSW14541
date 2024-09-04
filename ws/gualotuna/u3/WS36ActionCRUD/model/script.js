document.getElementById('buildingForm').addEventListener('submit', async function(event) {
    event.preventDefault();

    const building = {
        name: document.getElementById('name').value,
        address: document.getElementById('address').value,
        floors: document.getElementById('floors').value,
        departmentName: document.getElementById('departmentName').value,
        creationDate: document.getElementById('creationDate').value
    };

    try {
        const response = await fetch('/api/buildings', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(building)
        });

        if (response.ok) {
            alert('Edificio registrado con éxito!');
        } else {
            alert('Error al registrar el edificio.');
        }
    } catch (error) {
        console.error('Error:', error);
        alert('Error al registrar el edificio.');
    }
});
