class ClientApp {
    constructor(factory) {
        this.factory = factory;
    }

    createUI() {
        const button = this.factory.createButton();
        const menu = this.factory.createMenu();

        button.paint();
        menu.paint();
    }
}