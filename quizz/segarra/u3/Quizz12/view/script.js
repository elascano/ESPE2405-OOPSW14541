import Store from './model/store.mjs';
import StoreController from './controller/storeController.mjs';

document.getElementById('store-form').addEventListener('submit', async function(event) {
    event.preventDefault();
    console.log('Form submitted'); 

    const id = document.getElementById('store-id').value;
    const name = document.getElementById('store-name').value;
    const inventory = parseFloat(document.getElementById('inventory').value);
    const sales = parseFloat(document.getElementById('sales').value);

    const efficiency = StoreController.calculateEfficiency(sales, inventory);
    document.getElementById('efficiency').textContent = efficiency;

    const store = new Store(id, name, inventory, sales);
    store.setEfficiency(efficiency);

    console.log('Store data:', store); 

    try {
        const response = await fetch('/api/store', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(store)
        });

        if (response.ok) {
            alert('Store saved successfully!');
        } else {
            alert('Failed to save store.');
        }
    } catch (error) {
        console.error('Error:', error);
        alert('Failed to save store.');
    }
});
