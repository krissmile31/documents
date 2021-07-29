// TODO(you): Write the JavaScript necessary to complete the assignment.
// var pos = 1;
// var questions = ['question 5', 'question 8', 'question 3', 'question 2', 'question 1', 'question 4', 'question 9', 'question 3', 'question 6', 'question 7'];

function _(x) {
    return document.getElementById(x);
}

// function renderQuestion() {
//     const test = _('testt');
//     _('test_status').innerHTML = 'Question ' + pos + ' of ' + questions.length;
//     for (const question of questions) { 
//         test.innerHTML = '<h3>' + question + '</h3>'; 
//         test.innerHTML += "<div class='option'><input type='radio'> &emsp;option 1	</div>	"; 
//         test.innerHTML += "<input type='radio' name ='choices' value='A'> &emsp; option 2"; 
//         test.innerHTML += "<input type='radio' name ='choices' value='A'> &emsp; option 3"; 
//         test.innerHTML += "<input type='radio' name ='choices' value='A'> &emsp; option 4"; 
//     }
// }


// _('blueButton').onclick = () => {
//     _('introduction').style.display='none';
//     _('review-quiz').style.display='none'
//     _('attempt-quiz').style.display='block';
// }


// _('greenButton').onclick = () => { 
    // _('attempt-quiz').style.display='block'  
//     _('review-quiz').style.display='block';
//     // alert('Are you sure want to finish this quiz?')
// }

// function attempt() {
//     const intro = document.getElementById('introduction');
//     intro.classList.remove('hidden');
//     attempt.classList.add('quiz');
// }
// DEMO
var answers = ["a","c","a","d","b","b","a","c","d","b"];

function checkOneQuestion(index) {
    var temp = document.getElementsByName("question" + index);
    for (let i = 0; i < temp.length; i++) {
        if (temp[i].checked) {
            if (temp[i].value == answers[index-1]){
                temp[i].parentElement.innerHTML += "<span class=correct>Correct answer</span>";
                temp[i].parentElement.style.background = '#d4edda';
            } else {
                temp[i].parentElement.innerHTML += "<span class=wrong>Your answer</span>";
                temp[i].parentElement.style.background = '#f8d7da';
            }
            return;
        } 
    }
}

function submit() {
    var userAnswers = [];
    for (var index = 1; index <= 10; index++) {
        checkOneQuestion(index);
    }
}
