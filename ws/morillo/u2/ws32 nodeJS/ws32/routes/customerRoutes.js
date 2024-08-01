const express = require("express");
const customer = require("../models/customer");
const router = express.Router();

//Get all Customers
router.get("/customers", async (req, res) => {
    try {
        const customers = await customer.find();
        res.json(customers);
    }catch (error){
        res.status(500).json({message: err.message});
    }
});

module.exports = router;
