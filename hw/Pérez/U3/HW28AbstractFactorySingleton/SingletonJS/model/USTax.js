export class USTax {
    static instance = null;

    constructor() {
        if (USTax.instance) {
            return USTax.instance;
        }
        USTax.instance = this;
    }

    static getInstance() {
        if (!USTax.instance) {
            USTax.instance = new USTax();
        }
        return USTax.instance;
    }

    salesTotal() {
        return 12.23;
    }
}
