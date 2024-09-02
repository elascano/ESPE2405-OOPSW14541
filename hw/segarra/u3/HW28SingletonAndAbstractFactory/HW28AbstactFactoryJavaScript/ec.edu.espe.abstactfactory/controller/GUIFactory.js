class GUIFactory {
    static getFactory(os) {
        switch (os) {
            case 'Windows':
                return new WinFactory();
            case 'Linux':
                return new LinuxFactory();
            default:
                throw new Error('Unknown operating system');
        }
    }

    createButton() {
        throw new Error('This method should be overridden!');
    }

    createMenu() {
        throw new Error('This method should be overridden!');
    }
}