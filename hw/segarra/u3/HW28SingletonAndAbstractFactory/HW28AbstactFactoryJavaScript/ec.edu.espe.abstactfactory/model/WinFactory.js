class WinFactory extends GUIFactory {
    createButton() {
        return new WinButton();
    }

    createMenu() {
        return new WinMenu();
    }
}