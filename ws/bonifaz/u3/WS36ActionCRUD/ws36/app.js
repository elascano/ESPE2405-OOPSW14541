// app.js
const express = require('express');
const bodyParser = require('body-parser');
const { connectDB } = require('./utils/mongoDBUtils');
const keyboardController = require('./controllers/controllerKeyboard');

const app = express();
const port = process.env.PORT || 3000;

connectDB();

app.use(bodyParser.json());

app.post('/keyboards', keyboardController.createKeyboard);
app.get('/keyboards', keyboardController.getKeyboards);

app.listen(port, () => {
    console.log(`Server running on port ${port}`);
});
