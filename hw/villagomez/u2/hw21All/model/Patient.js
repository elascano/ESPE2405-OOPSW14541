class Patient {
    constructor(cedula, nombre, fechaNacimiento) {
        this._cedula = cedula;
        this._nombre = nombre;
        this._fechaNacimiento = fechaNacimiento;
    }

    get cedula() {
        return this._cedula;
    }

    get nombre() {
        return this._nombre;
    }

    get fechaNacimiento() {
        return this._fechaNacimiento;
    }

    calcularEdad() {
        const hoy = new Date();
        const nacimiento = new Date(this._fechaNacimiento);
        let edad = hoy.getFullYear() - nacimiento.getFullYear();
        const mes = hoy.getMonth() - nacimiento.getMonth();
        if (mes < 0 || (mes === 0 && hoy.getDate() < nacimiento.getDate())) {
            edad--;
        }
        return edad;
    }
}