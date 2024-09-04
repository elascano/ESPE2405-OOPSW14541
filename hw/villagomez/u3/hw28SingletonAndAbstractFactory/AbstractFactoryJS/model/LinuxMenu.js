import { Menu } from './Menu.js';

export class LinuxMenu extends Menu {
    paint() {
        console.log(`I'm a LinuxMenu: ${this.caption}`);
    }
}
