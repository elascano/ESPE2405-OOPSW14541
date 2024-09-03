import { USTax } from '../model/USTax.js';

const main = () => {
    const tax = USTax.getInstance();
    const total = tax.salesTotal();
    console.log(`Total sales with taxes ${total}`);
};

main();
