const mongoose = require('mongoose');

const dataSchema = new mongoose.Schema(
    {
        canton: {
            require: true,
            type: String
        },
        coordenadas: {
            require: true,
            type: String
        },
        tipo_vivienda: {
            require: true,
            type: String
        },
        nivel_riesgo: {
            require: true,
            type: String
        },
        personas: [
            {
                dui: {
                    require: true,
                    type: String
                },
                nombres: {
                    require: true,
                    type: String
                },
                apellidos: {
                    require: true,
                    type: String
                },
                fecha_nacimiento: {
                    require: true,
                    type: String
                },
                grado_escolar: {
                    require: true,
                    type: String
                },
                alfabetizado: {
                    require: true,
                    type: String
                }
            }
        ]
    }
);

module.exports = mongoose.model('familia', dataSchema)