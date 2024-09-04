import { Button } from './Button.js';

export class WinButton extends Button {
    paint() {
        console.log(`I'm a WinButton: ${this.caption}`);
    }
}
