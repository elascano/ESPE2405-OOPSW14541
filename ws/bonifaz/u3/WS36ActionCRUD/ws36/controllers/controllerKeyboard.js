// controllers/controllerKeyboard.js
const Keyboard = require('../models/keyboard');

exports.createKeyboard = async (req, res) => {
    try {
        const keyboard = new Keyboard(req.body);
        await keyboard.save();
        res.status(201).send(keyboard);
    } catch (error) {
        res.status(400).send(error);
    }
};

exports.getKeyboards = async (req, res) => {
    try {
        const keyboards = await Keyboard.find();
        res.status(200).send(keyboards);
    } catch (error) {
        res.status(500).send(error);
    }
};
