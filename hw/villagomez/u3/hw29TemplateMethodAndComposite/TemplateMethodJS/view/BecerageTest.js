import { Tea } from './Tea.js';
import { Coffee } from './Coffee.js';

const main = () => {
    const tea = new Tea();
    const coffee = new Coffee();

    console.log("\nMaking tea ...");
    tea.prepareRecipe();

    console.log("\nMaking coffee ...");
    coffee.prepareRecipe();
};

main();
