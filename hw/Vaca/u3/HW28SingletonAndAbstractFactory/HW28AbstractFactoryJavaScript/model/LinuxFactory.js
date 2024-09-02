import GUIFactory from './GUIFactory.js';
import LinuxButton from './LinuxButton.js';
import LinuxMenu from './LinuxMenu.js';

class LinuxFactory extends GUIFactory {
    createButton() {
        return new LinuxButton();
    }

    createMenu() {
        return new LinuxMenu();
    }
}

export default LinuxFactory;
