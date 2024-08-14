function resetForm() {
    document.getElementById('id').value = '';
    document.getElementById('name').value = '';
    document.getElementById('description').value = '';
    document.getElementById('goal').value = '';
    document.getElementById('asist').value = '';
}

async function savePlayer() {
    const id = document.getElementById('id').value;
    const name = document.getElementById('name').value;
    const description = document.getElementById('description').value;
    const goal = parseInt(document.getElementById('goal').value, 10);
    const asist = parseInt(document.getElementById('asist').value, 10);
    const GA = goal + asist; // Calcular GA en el cliente

    const player = {
        id: id,
        name: name,
        description: description,
        goal: goal,
        asist: asist,
        GA: GA
    };

    try {
        console.log('Sending player data:', player);
        const response = await fetch('/savePlayer', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(player)
        });
        if (response.ok) {
            alert('Player saved successfully');
            resetForm();
        } else {
            alert('Error saving player');
        }
    } catch (error) {
        console.error('Error:', error);
        alert('Error saving player');
    }
}

