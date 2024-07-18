const express = require('express');
const mongoose = require('mongoose');
const Commensal = require('./model/Commensal'); 

const app = express();
const PORT = process.env.PORT || 3000;
const MONGODB_URI = 'mongodb+srv://carlosp:carlosp@cluster0.qouhg0b.mongodb.net/oop?retryWrites=true&w=majority';

mongoose.connect(MONGODB_URI, {
    useNewUrlParser: true,
    useUnifiedTopology: true
}).then(() => {
    console.log('Connected to MongoDB');
}).catch(err => {
    console.error('Error connecting to MongoDB:', err.message);
});

app.use(express.json());
app.use(express.urlencoded({ extended: false }));


app.post('/create-account', async (req, res) => {
    const { id, name, email, password, grade, balance } = req.body;

    try {
        
        const commensal = new Commensal({
            id,
            name,
            email,
            password,
            grade,
            type: 'commensal', 
            balance
        });

        
        await commensal.save();

        res.status(201).json({ message: 'Account created successfully' });
    } catch (error) {
        console.error('Error creating account:', error.message);
        res.status(500).json({ error: 'Internal server error' });
    }
});

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});
