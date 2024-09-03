import { GUIFactory } from './GUIFactory.js';
import { WinButton } from './WinButton.js';
import { WinMenu } from './WinMenu.js';

export class WinFactory extends GUIFactory {
    createButton() {
        console.log("Creating Windows Button");
        return new WinButton();
    }

    createMenu() {
        console.log("Creating Windows Menu");
        return new WinMenu();
    }
}
