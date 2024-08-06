document.getElementById('store-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const inventory = parseFloat(document.getElementById('inventory').value);
    const sales = parseFloat(document.getElementById('sales').value);

    if (sales && inventory) {
        const efficiency = (sales / inventory).toFixed(2);
        document.getElementById('efficiency').textContent = efficiency;
    } else {
        document.getElementById('efficiency').textContent = 'N/A';
    }
});