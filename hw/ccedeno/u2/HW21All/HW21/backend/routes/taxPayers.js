const express = require('express');
const router = express.Router();

// Modelo de contribuyente
const TaxPayer = require('c:/Users/andre/OneDrive/Desktop/proyectos JS/HW21/backend/models/Taxpayer');

// GET: Obtener todos los contribuyentes
router.get('/', async (req, res) => {
    try {
        const taxPayers = await TaxPayer.find();
        res.json(taxPayers);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
});

// GET: Obtener contribuyentes por noveno dígito
router.get('/search/:ninthDigit', async (req, res) => {
    try {
        const ninthDigit = req.params.ninthDigit;
        const taxPayers = await TaxPayer.find({
            id: new RegExp(`^.{8}${ninthDigit}`)
        });
        res.json(taxPayers);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
});

module.exports = router;
