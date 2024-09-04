import { GUIFactory } from './GUIFactory.js';
import { LinuxButton } from './LinuxButton.js';
import { LinuxMenu } from './LinuxMenu.js';

export class LinuxFactory extends GUIFactory {
    createButton() {
        console.log("Creating Linux Button");
        return new LinuxButton();
    }

    createMenu() {
        console.log("Creating Linux Menu");
        return new LinuxMenu();
    }
}
