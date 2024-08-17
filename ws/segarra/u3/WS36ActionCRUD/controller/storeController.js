// controller/storeController.js
export default class StoreController {
    static calculateEfficiency(sales, inventory) {
        if (sales && inventory) {
            return (sales / inventory).toFixed(2);
        } else {
            return 'N/A';
        }
    }
}

