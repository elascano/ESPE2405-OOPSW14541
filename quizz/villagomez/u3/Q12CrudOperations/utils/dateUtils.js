exports.calculateYearsOfExistence = (dateOfBuilding) => {
    const currentDate = new Date();
    const yearsDiff = currentDate.getFullYear() - dateOfBuilding.getFullYear();
    
    if (
        currentDate.getMonth() < dateOfBuilding.getMonth() ||
        (currentDate.getMonth() === dateOfBuilding.getMonth() && currentDate.getDate() < dateOfBuilding.getDate())
    ) {
        return yearsDiff - 1;
    }
    
    return yearsDiff;
};