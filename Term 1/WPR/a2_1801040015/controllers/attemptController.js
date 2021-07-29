import { Router } from 'express';
import Questions from '@/models/Questions';
import Attempts from '@/models/Attempts';

const router = Router();
router.post('/attempts', async (req, res) => {
    const ques = await Questions.find().exec();
    let attempt = {
        questions: [],
        completed: false,
        score: 0,
        correctAnswers: {},
        startedAt: new Date(),
    };

    ques.forEach(c => {
        attempt.questions.push({
            _id: c._id,
            text: c.text,
            answer: c.answers,
        });
        attempt.correctAnswers[c._id] = c.correctAnswerId;
    });

    attempt = await Attempts.create(attempt);
    res.status(200).json(attempt);
});

router.post('/attempts/:id/submit', async (req, res) => {
    const id = req.params.id;
    const attempt = await Attempts.findOne({_id: id});
    const answers = req.body;

    let score = 0;

    Object.keys(answers).forEach(i => {
        score = attempt.correctAnswers[i] == answer[i] ? score + 1 : score;
    });

    let scoreText = '';

    if (score < 5) {
        scoreText += 'Practice more to improve it :D';
    }
    if (score >= 5 && score < 7) {
        scoreText += 'Good, keep up!';
    }
    if (score >= 7 && score < 9) {
        scoreText += 'Well done!';
    }
    if(score >= 9 && score <= 10) {
        scoreText += 'Perfect!!';
    }

    attempt.answers = answers;
    attempt.score = score;
    attempt.scoreText = scoreText;

    if (Object.keys(answers).length == 10) {
        attempt.completed = true;
    }
    res.status(200).json(attempt);
});

export default router;
