import FileManager from '../utils/FileManager.js';

export default class Transaction {
    static sell(foodList, id, amount) {
        const foodItem = foodList.find(item => item.id === id);
        if (foodItem && foodItem.amountInLb >= amount) {
            foodItem.amountInLb -= amount;
            FileManager.save(foodList);
            console.log(`Sold ${amount} lb of ${foodItem.brand}. New stock: ${foodItem.amountInLb} lb`);
        } else {
            console.error('Not enough stock or item not found');
        }
    }

    static buy(foodList, id, amount) {
        const foodItem = foodList.find(item => item.id === id);
        if (foodItem) {
            foodItem.amountInLb += amount;
            FileManager.save(foodList);
            console.log(`Bought ${amount} lb of ${foodItem.brand}. New stock: ${foodItem.amountInLb} lb`);
        } else {
            console.error('Item not found');
        }
    }
}
