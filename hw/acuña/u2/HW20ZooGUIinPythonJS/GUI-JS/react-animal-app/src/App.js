import React, { useState } from 'react';

function FrmAnimal() {
    const [txtId, setTxtId] = useState('');
    const [description, setDescription] = useState('');
    const [gender, setGender] = useState('Male');
    const [numberOfBones, setNumberOfBones] = useState(0);
    const [cage, setCage] = useState('Felines Cage');
    const [food, setFood] = useState([]);
    const [vertebrate, setVertebrate] = useState(false);

    const handleIdChange = (event) => {
        setTxtId(event.target.value);
    };

    const handleDescriptionChange = (event) => {
        setDescription(event.target.value);
    };

    const handleGenderChange = (event) => {
        setGender(event.target.value);
    };

    const handleBonesChange = (event) => {
        setNumberOfBones(event.target.value);
    };

    const handleCageChange = (event) => {
        setCage(event.target.value);
    };

    const handleFoodChange = (event) => {
        const selectedFood = Array.from(event.target.selectedOptions, option => option.value);
        setFood(selectedFood);
    };

    const handleVertebrateChange = (event) => {
        setVertebrate(event.target.checked);
    };

    const handleSubmit = (event) => {
        event.preventDefault();
        // Aquí puedes implementar la lógica para registrar el animal
        console.log({
            id: txtId,
            description,
            gender,
            numberOfBones,
            cage,
            food,
            vertebrate
        });
    };

    return (
        <div>
            <h1>ANIMALS</h1>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Id:</label>
                    <input type="text" value={txtId} onChange={handleIdChange} />
                </div>
                <div>
                    <label>Description:</label>
                    <textarea value={description} onChange={handleDescriptionChange} />
                </div>
                <div>
                    <label>Gender:</label>
                    <select value={gender} onChange={handleGenderChange}>
                        <option value="Male">Male</option>
                        <option value="Female">Female</option>
                        <option value="Other">Other</option>
                    </select>
                </div>
                <div>
                    <label>Number of Bones:</label>
                    <input type="number" value={numberOfBones} onChange={handleBonesChange} />
                </div>
                <div>
                    <label>Cage:</label>
                    <select value={cage} onChange={handleCageChange}>
                        <option value="Felines Cage">Felines Cage</option>
                        <option value="Monkeys Cage">Monkeys Cage</option>
                        <option value="Shark Pool">Shark Pool</option>
                        <option value="Birds Cage">Birds Cage</option>
                    </select>
                </div>
                <div>
                    <label>Food:</label>
                    <select multiple value={food} onChange={handleFoodChange}>
                        <option value="Mouse">Mouse</option>
                        <option value="Rabbit">Rabbit</option>
                        <option value="Dear">Dear</option>
                        <option value="Meat">Meat</option>
                        <option value="Grains">Grains</option>
                        <option value="Fish">Fish</option>
                    </select>
                </div>
                <div>
                    <label>Vertebrate:</label>
                    <input type="checkbox" checked={vertebrate} onChange={handleVertebrateChange} />
                </div>
                <div>
                    <button type="submit">Register</button>
                    <button type="button">Feed</button>
                </div>
            </form>
        </div>
    );
}

export default FrmAnimal;