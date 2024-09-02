class Subject {
    registerObserver(observer) {
        throw new Error("You have to implement the method registerObserver!");
    }

    removeObserver(observer) {
        throw new Error("You have to implement the method removeObserver!");
    }

    notifyObservers() {
        throw new Error("You have to implement the method notifyObservers!");
    }
}
