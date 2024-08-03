// model/Doctor.js
class Doctor {
    constructor(id, name, specialty, schedule) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.schedule = schedule;
    }
}

module.exports = Doctor;
