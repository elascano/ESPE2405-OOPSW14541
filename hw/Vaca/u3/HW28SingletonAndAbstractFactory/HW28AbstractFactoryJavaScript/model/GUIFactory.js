class GUIFactory {
    createButton() {
        throw new Error("This method must be overridden!");
    }

    createMenu() {
        throw new Error("This method must be overridden!");
    }
}

export default GUIFactory;
