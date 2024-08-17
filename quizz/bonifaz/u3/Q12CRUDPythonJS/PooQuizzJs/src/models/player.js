class Player {
    constructor(id, name, description, goal, asist, GA) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.goal = goal;
        this.asist = asist;
        this.GA = GA;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getName() {
        return this.name;
    }

    setName(name) {
        this.name = name;
    }

    getDescription() {
        return this.description;
    }

    setDescription(description) {
        this.description = description;
    }

    getGoal() {
        return this.goal;
    }

    setGoal(goal) {
        this.goal = goal;
    }

    getAsist() {
        return this.asist;
    }

    setAsist(asist) {
        this.asist = asist;
    }

    getGA() {
        return this.GA;
    }

    setGA(GA) {
        this.GA = GA;
    }
}

module.exports = Player;
