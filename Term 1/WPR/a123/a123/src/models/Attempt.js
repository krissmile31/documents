import { model, Schema } from 'mongoose';

const schema = new Schema({
  questions:Array,
  completed: Boolean,
  score: Number,
  scoreText:String,
  correctAnswers:Object,
  startAt:Date

});

const Attempt = model('Attempt', schema, 'attempts');
export default Attempt;
