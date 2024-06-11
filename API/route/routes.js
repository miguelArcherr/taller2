const express = require('express');

const Model = require('../model/model');
const router = express.Router()

//insert (post)
router.post('/postfamily', async (req, res) => {
    const data = new Model({
        canton: req.body.canton,
        coordenadas: req.body.coordenadas,
        tipo_vivienda: req.body.tipo_vivienda,
        nivel_riesgo: req.body.nivel_riesgo,
        personas: req.body.personas
    })

    try{
        const dataTosave = await data.save()
        res.status(200).json({"result": "ok"})
    }
    catch(error){
        res.status(400).json({"message": error.message})
    }
});

//select all (get)

router.get('/getallfamilies', async(req, res) => {
    try{
        const data = await Model.find()
        res.json(data)
    }
    catch(error){
        res.status(400).json({"message": error.message})
    }
})

//select (get: .../api)

router.get('/getfamily', async(req, res) => {
    try{
        const data = await Model.findById(req.query.id)
        res.json(data)
    }
    catch(error){
        res.status(400).json({"message": error.message})
    }
})

//update (patch)

//delete (delete)


module.exports = router;
