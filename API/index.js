require('dotenv').config();

const express = require ('express');
const mongoose = require ('mongoose');
const mongoString = process.env.DATABASE_URL;
const routes = require('./route/routes');

mongoose.connect(mongoString);
const database = mongoose.connection;

database.on('error', (error) =>{
    console.log(error);
})

database.once('conected', () =>{
    console.log('database conected');
})

const app = express()

app.use(express.json());
app.use('/api', routes)

app.listen(3000, () =>{
    console.log('server started at port 3000');
})