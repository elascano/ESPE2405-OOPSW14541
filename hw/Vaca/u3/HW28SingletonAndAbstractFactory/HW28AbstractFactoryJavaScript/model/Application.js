class Application {
    constructor(factory) {
        this.button = factory.createButton();
        this.menu = factory.createMenu();
    }

    paint() {
        this.button.paint();
        this.menu.paint();
    }
}

export default Application;
