class LinuxFactory extends GUIFactory {
    createButton() {
        return new LinuxButton();
    }

    createMenu() {
        return new LinuxMenu();
    }
}