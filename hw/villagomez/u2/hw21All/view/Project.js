class AppointmentController {
    async addAppointment(data) {
        try {
            const response = await fetch('http://localhost:5000/api/appointments', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(data)
            });

            if (response.ok) {
                console.log('Cita guardada con éxito');
                return true;
            } else {
                console.error('Error al guardar la cita');
                return false;
            }
        } catch (error) {
            console.error('Error:', error);
            return false;
        }
    }

    async getAppointments() {
        try {
            const response = await fetch('http://localhost:5000/api/appointments');
            return await response.json();
        } catch (error) {
            console.error('Error al obtener las citas:', error);
            return [];
        }
    }
}

class Project {
    constructor() {
        this.appointmentController = new AppointmentController();
        this.initialize();
    }

    initialize() {
        document.getElementById('add-appointment-btn').addEventListener('click', () => this.addAppointment());
    }

    async addAppointment() {
        const cedula = document.getElementById('cedula').value;
        const nombre = document.getElementById('nombre').value;
        const fechaNacimiento = document.getElementById('fecha-nacimiento').value;
        const especialidad = document.getElementById('especialidad').value;
        const doctor = document.getElementById('doctores').value;
        const fechaCita = document.getElementById('fecha-cita').value;

        const paciente = { cedula, nombre, fechaNacimiento };
        const data = { paciente, especialidad, doctor, fechaCita };

        const success = await this.appointmentController.addAppointment(data);

        if (success) {
            this.clearFields();
            this.mostrarCitas(); // Actualizar la lista de citas
        }
    }

    clearFields() {
        document.getElementById('cedula').value = '';
        document.getElementById('nombre').value = '';
        document.getElementById('fecha-nacimiento').value = '';
        document.getElementById('especialidad').value = '';
        document.getElementById('doctores').value = '';
        document.getElementById('fecha-cita').value = '';
    }

    async mostrarCitas() {
        const citasAgendadas = await this.appointmentController.getAppointments();
        const appointmentsList = document.getElementById('appointments');
        appointmentsList.innerHTML = '';
        citasAgendadas.forEach((cita, index) => {
            const li = document.createElement('li');
            li.innerHTML = `
                <strong>Cita ${index + 1}:</strong><br>
                ${cita.paciente.nombre}, ${cita.especialidad}, ${cita.doctor}, ${cita.fechaCita}
            `;
            appointmentsList.appendChild(li);
        });
    }
}

const project = new Project();