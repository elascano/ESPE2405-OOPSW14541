const mongoose = require('../database');
const Tutor = require('../Tutor');
const TutorClass = require('../script');

describe('Tutor', () => {
    beforeAll(async () => {
        await mongoose.connection.dropDatabase();
    });

    it('debería calcular la edad correctamente', () => {
        const tutor = new TutorClass('1234567890', 'Juan', 'Pérez', '2000-01-01', '14541', 'juan@example.com', '0987654321');
        expect(tutor.edad).toBe(new Date().getFullYear() - 2000);
    });

    it('debería guardar un tutor correctamente en MongoDB', async () => {
        const tutor = new TutorClass('1234567890', 'Laura', 'Martínez', '1995-05-15', '14534', 'laura@example.com', '0987654324');
        
        const nuevoTutor = new Tutor(tutor);
        await nuevoTutor.save();

        const tutoresGuardados = await Tutor.find({});
        expect(tutoresGuardados.length).toBe(1);
        expect(tutoresGuardados[0].cedula).toBe('1234567890');
        expect(tutoresGuardados[0].edad).toBe(new TutorClass().calcularEdad('1995-05-15'));
    });

    afterAll(async () => {
        await mongoose.connection.close();
    });
});
