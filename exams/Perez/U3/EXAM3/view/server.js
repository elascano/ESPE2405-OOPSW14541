const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.json());
app.use(express.static('view'));

mongoose.connect('mongodb+srv://carlosp:carlosp@cluster0.qouhg0b.mongodb.net/strategyLastName', {
    useNewUrlParser: true,
    useUnifiedTopology: true
});

const ArraySchema = new mongoose.Schema({
    unsorted: String,
    size: Number,
    sortAlgorithm: String,
    sorted: String
});

const ArrayModel = mongoose.model('arrayFirstName', ArraySchema);

app.post('/save', async (req, res) => {
    const arrayData = new ArrayModel(req.body);
    try {
        await arrayData.save();
        res.send({ message: 'Data saved successfully' });
    } catch (error) {
        res.status(500).send(error);
    }
});

const port = process.env.PORT || 3000;
app.listen(port, () => {
    console.log(`Server running on port ${port}`);
});
