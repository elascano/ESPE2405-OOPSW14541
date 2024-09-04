export class Button {
    constructor() {
        this.caption = "";
    }

    paint() {
        throw new Error("This method should be overridden by subclasses");
    }
}
