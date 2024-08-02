class TutorClass {
    constructor(cedula, nombres, apellidos, fechaNacimiento, codigoCarrera, email, celular) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = this.calcularEdad(fechaNacimiento);
        this.codigoCarrera = codigoCarrera;
        this.email = email;
        this.celular = celular;
    }

    calcularEdad(fechaNacimiento) {
        const fechaNac = new Date(fechaNacimiento);
        const hoy = new Date();
        let edad = hoy.getFullYear() - fechaNac.getFullYear();
        const diferenciaMes = hoy.getMonth() - fechaNac.getMonth();
        if (diferenciaMes < 0 || (diferenciaMes === 0 && hoy.getDate() < fechaNac.getDate())) {
            edad--;
        }
        return edad;
    }
}

document.getElementById('fechaNacimiento').addEventListener('change', function() {
    const fechaNacimiento = this.value;
    if (fechaNacimiento) {
        const tutor = new TutorClass('', '', '', fechaNacimiento, '', '', '');
        document.getElementById('edad').value = tutor.edad;
    } else {
        document.getElementById('edad').value = '';
    }
});

document.getElementById('tutorForm').addEventListener('submit', async function(event) {
    event.preventDefault();

    const cedula = document.getElementById('cedula').value;
    const nombres = document.getElementById('nombres').value;
    const apellidos = document.getElementById('apellidos').value;
    const fechaNacimiento = document.getElementById('fechaNacimiento').value;
    const codigoCarrera = document.getElementById('codigoCarrera').value;
    const email = document.getElementById('email').value;
    const celular = document.getElementById('celular').value;

    const tutor = new TutorClass(cedula, nombres, apellidos, fechaNacimiento, codigoCarrera, email, celular);

    try {
        const response = await fetch('/guardarTutor', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(tutor)
        });
        if (response.ok) {
            alert('Tutor guardado exitosamente en MongoDB');
        } else {
            alert('Error al guardar el tutor en MongoDB');
        }
    } catch (error) {
        console.error('Error al guardar el tutor en MongoDB', error);
    }
});

document.getElementById('regresar').addEventListener('click', function() {
    // Lógica para regresar a la página anterior
    window.history.back();
});

document.getElementById('salir').addEventListener('click', function() {
    // Lógica para salir de la aplicación
    window.close();
});