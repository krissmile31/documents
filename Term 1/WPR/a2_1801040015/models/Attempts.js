const mongoose = require('mongoose');

const Schema = mongoose.Schema;

const posts_Schema = new Schema ({
    questions: {
        type: Array,
        required: true,
    },
    completed: {
        type: Array,
        required: true,
    },
    score: {
        type: Number,
        required: true,
    },
    scoreText: {
        type: String,
        required: true,
    },
    correctAnswers: {
        type: Object,
        required: true,
    },
    startAt: {
        type: Date,
        default: Date.now,
    }
});

module.exports = mongoose.model('Attempt', posts_Schema)