class CreateJsonFile {
    static create(inventory) {
        return JSON.stringify(inventory.viewInventory());
    }
}
