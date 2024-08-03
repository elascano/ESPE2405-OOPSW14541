module.exports = {
    computeAgeInDays: function (birthDate) {
        const today = new Date();
        // Calcular la diferencia en milisegundos entre las dos fechas
        const diffTime = Math.abs(today.getTime() - birthDate.getTime());
        // Convertir la diferencia de milisegundos a días
        const diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24));
        return diffDays;
    },
    computeAgeInYears: function (birthDate) {
        const today = new Date();
        const birthYear = birthDate.getFullYear();
        const birthMonth = birthDate.getMonth() + 1; // Meses en JavaScript van de 0 a 11
        const birthDay = birthDate.getDate();
        
        const todayYear = today.getFullYear();
        const todayMonth = today.getMonth() + 1; // Meses en JavaScript van de 0 a 11
        const todayDay = today.getDate();
        
        let age = todayYear - birthYear;
        
        // Ajustar la edad si no se ha alcanzado el mes y día de cumpleaños
        if (todayMonth < birthMonth || (todayMonth === birthMonth && todayDay < birthDay)) {
            age--;
        }
        
        return age;
    }
};
