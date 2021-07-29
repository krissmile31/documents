const mongoose = require('mongoose');

const Schema = mongoose.Schema;

const posts_Schema = new Schema({
    answers: {     
        type: Array,
        required: true,
    },
    text: {    
        type: String,
        required: true,
    },  
    correctAnswerId: {
        type: Number,       
    } 
});

module.exports = mongoose.model('Questions', posts_Schema);