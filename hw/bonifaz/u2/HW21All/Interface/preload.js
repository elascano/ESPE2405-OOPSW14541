window.addEventListener('DOMContentLoaded', () => {
    const startDateInput = document.getElementById('startDate');
    const endDateInput = document.getElementById('endDate');
    const remainingDaysInput = document.getElementById('remainingDays');

    startDateInput.addEventListener('change', calculateDays);
    endDateInput.addEventListener('change', calculateDays);
});

function calculateDays() {
    const startDate = new Date(document.getElementById('startDate').value);
    const endDate = new Date(document.getElementById('endDate').value);
    if (!isNaN(startDate) && !isNaN(endDate)) {
        const diffTime = Math.abs(endDate - startDate);
        const diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24));
        document.getElementById('remainingDays').value = diffDays;
    }
}

async function addContributor() {
    const id = document.getElementById('id').value;
    const email = document.getElementById('email').value;
    const name = document.getElementById('name').value;
    const password = document.getElementById('password').value;
    const documentation = document.getElementById('documentation').checked;
    const startDate = document.getElementById('startDate').value;
    const endDate = document.getElementById('endDate').value;
    const remainingDays = document.getElementById('remainingDays').value;

    const contributor = {
        id, email, name, password, documentation, startDate, endDate, remainingDays
    };

    const response = await fetch('http://localhost:3000/add-contributor', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(contributor)
    });

    const result = await response.json();
    alert(result.message);
}

function goBack() {
    window.history.back();
}

