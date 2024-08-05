const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const port = 5000;

app.use(bodyParser.json());
app.use(cors());

let animals = [];

app.post('/api/animals', (req, res) => {
  const animal = req.body;
  animals.push(animal);
  res.status(201).send(animal);
});

app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});
