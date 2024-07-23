class Eagle extends Bird {
    constructor(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate) {
        super(id, description, bornOnDate, gender, cage, numberOfBones, vetebrate);
    }

    feed(food) {
        console.log("Feeding the eagle with mice");
    }
}
