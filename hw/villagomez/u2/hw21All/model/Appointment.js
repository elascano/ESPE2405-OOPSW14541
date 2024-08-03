const conectarMongoDB = require('../controller/ConnectMongoDB');

class Appointment {
    constructor(paciente, especialidad, doctor, fechaCita) {
        this._paciente = paciente;
        this._especialidad = especialidad;
        this._doctor = doctor;
        this._fechaCita = fechaCita;
    }

    get paciente() {
        return this._paciente;
    }

    get especialidad() {
        return this._especialidad;
    }

    get doctor() {
        return this._doctor;
    }

    get fechaCita() {
        return this._fechaCita;
    }

    async guardar() {
        const appointmentsCollection = await conectarMongoDB();
        const cita = {
            paciente: {
                cedula: this._paciente.cedula,
                nombre: this._paciente.nombre,
                fechaNacimiento: this._paciente.fechaNacimiento,
            },
            especialidad: this._especialidad,
            doctor: this._doctor,
            fechaCita: this._fechaCita,
        };
        
        const resultado = await appointmentsCollection.insertOne(cita);
        console.log('Cita guardada con éxito:', resultado.insertedId);
        return resultado.insertedId;
    }

    get detallesCita() {
        return `
            Cédula: ${this._paciente.cedula}
            Nombre: ${this._paciente.nombre}
            Fecha de Nacimiento: ${this._paciente.fechaNacimiento}
            Edad: ${this._paciente.calcularEdad()} años
            Especialidad: ${this._especialidad}
            Doctor: ${this._doctor}
            Fecha de la Cita: ${this._fechaCita}
        `;
    }
}

module.exports = Appointment;