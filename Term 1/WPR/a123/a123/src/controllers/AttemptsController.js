import { Router } from 'express';
import Question from '@/models/Question';
import Attempt from '@/models/Attempt';

const router = Router();
// POST: /attempts
router.post('/attempts', async (req, res) => {
  // array of 10 random questions from the questions collection

  const qs = await Question.find().exec();
// đây là bài khác
  let attempt = {
    questions: [],
    completed: false,
    score: 0,
    correctAnswers: {},
    startedAt: new Date(),
  };


  qs.forEach(q => {
    attempt.questions.push({
      _id: q._id,
      text: q.text,
      answers: q.answers,
    });
    attempt.correctAnswers[q._id] = q.correctAnswerId;
  });
  attempt = await Attempt.create(attempt);
  res.status(201).json(attempt);

});

// POST: /attempts/:id/submit
router.post('/attempts/:id/submit', async (req, res) => {
  const id = req.params.id;
  const attempt = await Attempt.findOne({ _id: id });
  const answers = req.body;

  let score = 0;

  // compute score
  Object.keys(answers).forEach(qId => {
    score = attempt.correctAnswers[qId] === answers[qId] ? score + 1 : score;
  });

  // scoreText = attempt.
  let scoreText = ''
  if (score < 5) {
    scoreText = 'Practice more to improve :D';
  }
  if (score >= 5 && score < 7) {
    scoreText = 'Good, keep up!';
  }
  if (score >= 7 && score < 9) {
    scoreText = 'Well done!';
  }
  if (score >= 9 && score <= 10) {
    scoreText = 'Perfect!!';
  }
  attempt.answers = answers;
  attempt.score = score;
  attempt.scoreText = scoreText


  //complete
  if (Object.keys(answers).length === 10)
    attempt.complete = true;
  res.status(200).json(attempt);
});

export default router;
