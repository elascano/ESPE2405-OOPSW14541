import { WinFactory } from './WinFactory.js';
import { LinuxFactory } from './LinuxFactory.js';

export class GUIFactory {
    static getFactory() {
        const sys = this.readFromConfigFile("OS_TYPE");
        if (sys === 0) {
            return new WinFactory();
        } else {
            return new LinuxFactory();
        }
    }

    static readFromConfigFile(option) {
        return 0;
    }

    createButton() {
        throw new Error("This method should be overridden by subclasses");
    }

    createMenu() {
        throw new Error("This method should be overridden by subclasses");
    }
}
