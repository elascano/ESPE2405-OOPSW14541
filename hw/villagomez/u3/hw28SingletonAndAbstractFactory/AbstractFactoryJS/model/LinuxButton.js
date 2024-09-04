import { Button } from './Button.js';

export class LinuxButton extends Button {
    paint() {
        console.log(`I'm a LinuxButton: ${this.caption}`);
    }
}
