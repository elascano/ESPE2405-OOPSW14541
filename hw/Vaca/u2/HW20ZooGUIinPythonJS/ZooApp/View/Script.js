document.getElementById('animalForm').addEventListener('submit', async function(event) {
    event.preventDefault();
  
    const animal = {
      id: document.getElementById('id').value,
      description: document.getElementById('description').value,
      bornOnDate: document.getElementById('bornOnDate').value,
      gender: document.getElementById('gender').value,
      cage: document.getElementById('cage').value,
      numberOfBones: document.getElementById('numberOfBones').value,
      vetebrate: document.getElementById('vetebrate').checked,
      food: document.getElementById('food').value.split(',')
    };
  
    const response = await fetch('http://localhost:5000/api/animals', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(animal),
    });
  
    if (response.ok) {
      alert('Animal added successfully!');
      document.getElementById('animalForm').reset();
    } else {
      alert('Failed to add animal.');
    }
  });
  