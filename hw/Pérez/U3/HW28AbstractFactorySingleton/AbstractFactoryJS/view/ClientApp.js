import { GUIFactory } from '../model/GUIFactory.js';

const main = () => {
    const aFactory = GUIFactory.getFactory();
    const aButton = aFactory.createButton();
    aButton.caption = "Play";
    aButton.paint();

    const aMenu = aFactory.createMenu();
    aMenu.caption = "File";
    aMenu.paint();
};

main();
