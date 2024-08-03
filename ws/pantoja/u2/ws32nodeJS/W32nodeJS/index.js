const port = 3016; //David's port 3016
const express = require("express");
const app = express();
const mongoose = require("mongoose");

mongoose.connect(`mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/oop?retryWrites=true&w=majority`,
    {useNewUrlParser: true})

const db = mongoose.connection;

db.on("error", (error) => console.error(error));
db.once("open", () => console.log("System connected to MongoDb Database"));

app.use(express.json());

const customerRouter = require("./routes/customerRoutes");

app.use("/computestore", customerRouter);         //http//localhost:3016/computestore

app.listen(port, () => console.log ("My Computers Store Server is running on port  -->  " + port));




