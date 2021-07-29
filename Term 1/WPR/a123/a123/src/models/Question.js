import { model, Schema } from 'mongoose';

const schema = new Schema({
  text: String,
  answers: Array,
  correctAnswerId: Number,
});
const Question = model('Question', schema, 'questions');
export default Question;
