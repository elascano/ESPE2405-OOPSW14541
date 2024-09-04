import { Menu } from './Menu.js';

export class WinMenu extends Menu {
    paint() {
        console.log(`I'm a WinMenu: ${this.caption}`);
    }
}
