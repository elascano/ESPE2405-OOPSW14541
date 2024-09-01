import GUIFactory from './GUIFactory.js';
import WinButton from './WinButton.js';
import WinMenu from './WinMenu.js';

class WinFactory extends GUIFactory {
    createButton() {
        return new WinButton();
    }

    createMenu() {
        return new WinMenu();
    }
}

export default WinFactory;
