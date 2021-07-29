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

// let answer_pack = {
//     'answer': {}
// };

// async function getAPI() {

// }

// async function submitAPI(attempt_id, answer_pack) {
//     console.log(answer_pack);
//     const url = 'https://wpr-quiz-api.herokuapp.com/attempts/' + String(attempt_id) + '/submit';

//     let response = await fetch(url, {
//         method: 'POST',
//         headers: {
//             'Content-Type': 'application/json'
//         },
//         data: JSON.stringify(answer_pack)
//     });
//     let result = await response.json();
//     console.log('Status: ' + response.status);
//     console.log(result);
//     return result;
// }
// document.getElementsByClassName('question1').onclick = () => {
//     document.getElementsByClassName('option').style.background = '#ddd';
// }

// let start_button = document.getElementById('start-button');
// start_button.addEventListener('click', async() => {
//     document.getElementById('introduction').style.display='none';

//     const question_pack = await getAPI();
//     const questions = question_pack.questions, question_count = question.length, attempt_id = question_pack._id;

//     let question_section = document.getElementById('attempt-quiz');
//     for (let i=0; i<question_count; ++i)
//     question_section.appendChild(createQuestionContainer(questions[i], i, question_count));

//     let button = document.createElement('button');
//     button.textContent = 'Press me to submit';

//     button.addEventListener('click', () => {
//         disableRadioButtons();
//         submitAPI(attempt_id, answer_pack);
//     })
//     question_section.appendChild(button);
//     question_section.style.display = 'flex';
// })

// function processAnswer () {
//     let selected_element = null;

//     for (const element of document.getElementsByName(this.name)) {
//         if(element.classList.contains('selected')) {
//             selected_element = element;
//             break
//         }
//     }

//     if (selected_element != null) {
//         selected_element.classList.remove('selected');

//         let selected_parent = selected_element.parentNode;
//         selected_parent.addEventListener('mouseover', hover, false);
//         selected_parent.addEventListener('mouseout', hover, false);
//         selected_parent.style.backgroundColor = '#f1f1f1'; 

//     }

//     this.classList.add('selected');
//     answer_pack['answer'][this.name] = this.value;

// }

fetch('https://wpr-quiz-api.herokuapp.com/attempts', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({
        name: 'User1'
    })
}).then(res => {
    return res.json()
})
.then(data => console.log(data))
.catch(error => console.log('ERROR'))
// _('blueButton').onclick = () => {
//     _('introduction').style.display='none';
//     _('review-quiz').style.display='none';
//     _('attempt-quiz').style.display='block';
// }


// _('greenButton').onclick = () => {  
//     // alert('Are you sure want to finish this quiz?');
//     _('greenButton').style.display='none';
//     _('review-quiz').style.display='block';
//     _('attempt_quiz').style.pointerEvents='none'; 
//     _('attempt_quiz').style.display='block'; 
// }

// _('reload').onclick = () => {
//     window.location.reload();
// }
// var list = document.getElementsByClassName('correct');
// for (let i=0; i<list.length; i++){
//     list[i].style.property = new style;
// }

// function attempt() {
//     const intro = document.getElementById('introduction');
//     intro.classList.remove('hidden');
//     attempt.classList.add('quiz');
// }

// var g;
//         var h;
//         var i;
//         var j;
//         var k;
//         var e; 
//         var f;
//         var a;
//         var b;
//         var c;
        
// function submit() {
//     var count = 0;
    
//     q1 = document.querySelector('.question1').value;
     // q2 = document.querySelector('.question2').value;
    // q3 = document.querySelector('.question3').value;
    // q4 = document.querySelector('.question4').value;
    // q5 = document.querySelector('.question5').value;
    // q6 = document.querySelector('.question6').value;
    // q7 = document.querySelector('.question7').value;
    // q8 = document.querySelector('.question8').value;
    // q9 = document.querySelector('.question9').value;
    // q10 = document.querySelector('.question10').value;
    // if (q1=="option1") {
    //     count++;
    //     g = 1;
    //     document.querySelector('.question1').value = q1;
    //     document.querySelector('.check1').innerHTML = "<span class=correct>option 1" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";   
        
    // } else {
    //     document.querySelector('.question1').value = q1;
    //     document.querySelector('.check1').innerHTML = "<span>option 1" + " &emsp; &emsp;Correct &emsp; Answer" +	"</span>";
    //     document.querySelector('.check1').innerHTML = "<span>" + document.querySelector('.question1').value + " &emsp; &emsp;Your Answer" +	"</span>"; 
    //     document.querySelector('.question1').classList.add('wrong');   
    // }

    // if (q2=="option2") {
    //     count++;
    //     h = 1
    //     document.querySelector('.question2').value = q2;
    //     document.querySelector('.check2').innerHTML = "<span class=correct>option 2" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    // } else {
    //     document.querySelector('.question2').value = q2;
    //     document.querySelector('.check2').innerHTML = "<span>option 2" + " &emsp; &emsp;Correct &emsp; Answer" +	"</span>";
    //     document.querySelector('.check2').innerHTML = "<span>" + document.querySelector('.question2').value + " &emsp; &emsp;Your Answer" +	"</span>";    
    // }


    // if (q3=="option3") {
    //     count++;
    //     i = 1;
    //     document.querySelector('.question3').value = q3;
    //     document.querySelector('.check3').innerHTML = "<span>option 3" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    // } else {
    //     document.querySelector('.question3').value = q3;
    //     document.querySelector('.check3').innerHTML = "<span>option 3" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>"; 
    //     document.querySelector('.check3').innerHTML = "<span>" + document.querySelector('.question3').value + " &emsp; &emsp;Your Answer" +	"</span>";    
    // }


    // if (q4=="option4") {
    //     count++;
    //     j = 1;
    //     document.querySelector('.question4').value = q4;
    //     document.querySelector('.check4').innerHTML = "<span>option 4" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    // } else {
    //     document.querySelector('.question4').value = q4;
    //     document.querySelector('.check4').innerHTML = "<span>option 4" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";     
    //     document.querySelector('.check4').innerHTML = "<span>" + document.querySelector('.question4').value + " &emsp; &emsp;Your Answer" +	"</span>";    
    // }

    // if (q5=="option2") {
    //     count++;
    //     k = 1;
    //     document.querySelector('.question5').value = q5;
    //     document.querySelector('.check5').innerHTML = "<span>option 2" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    // } else {
    //     document.querySelector('.question5').value = q5;
    //     document.querySelector('.check5').innerHTML = "<span>option 2" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    //     document.querySelector('.check5').innerHTML = "<span>" + document.querySelector('.question5').value + " &emsp; &emsp;Your Answer" +	"</span>";    
    // }

    // if (q6=="option2") {
    //     count++;
    //     e = 1;
    //     document.querySelector('.question6').value = q6;
    //     document.querySelector('.check6').innerHTML = "<span>option 2" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    // } else {
    //     document.querySelector('.question6').value = q6;
    //     document.querySelector('.check6').innerHTML = "<span>option 2" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    //     document.querySelector('.check6').innerHTML = "<span>" + document.querySelector('.question6').value + " &emsp; &emsp;Your Answer" +	"</span>";    
    // }

    // if (q7=="option1") {
    //     count++;
    //     f = 1;
    //     document.querySelector('.question7').value = q7;
    //     document.querySelector('.check7').innerHTML = "<span>option 1" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    // } else {
    //     document.querySelector('.question7').value = q7;
    //     document.querySelector('.check7').innerHTML = "<span>option 1" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    //     document.querySelector('.check7').innerHTML = "<span>" + document.querySelector('.question7').value + " &emsp; &emsp;Your Answer" +	"</span>";    
    // }


    // if (q8=="option3") {
    //     count++;
    //     a = 1;
    //     document.querySelector('.question8').value = q8;
    //     document.querySelector('.check8').innerHTML = "<span>option 3" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    // } else {
    //     document.querySelector('.question8').value = q8;
    //     document.querySelector('.check8').innerHTML = "<span>option 3" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    //     document.querySelector('.check8').innerHTML = "<span>" + document.querySelector('.question8').value + " &emsp; &emsp;Your Answer" +	"</span>";    
    // }

    // if (q9=="option1") {
    //     count++;
    //     b = 1;
    //     document.querySelector('.question9').value = q9;
    //     document.querySelector('.check9').innerHTML = "<span>option 1" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    // } else {
    //     document.querySelector('.question9').value = q9;
    //     document.querySelector('.check9').innerHTML = "<span>option 1" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    //     document.querySelector('.check9').innerHTML = "<span>" + document.querySelector('.question9').value + " &emsp; &emsp;Your Answer" +	"</span>";    
    // }

    // if (q10=="option4") {
    //     count++;
    //     c = 1;
    //     document.querySelector('.question10').value = q10;
    //     document.querySelector('.check10').innerHTML = "<span>option 4" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    // } else {
    //     document.querySelector('.question10').value = q10;
    //     document.querySelector('.check10').innerHTML = "<span>option 4" + " &emsp; &emsp;Correct &nbsp; Answer" +	"</span>";    
    //     document.querySelector('.check10').innerHTML = "<span>" + document.querySelector('.question10').value + " &emsp; &emsp;Your Answer" +	"</span>";    
    // }

//     if (g == 1) {
    
//         test.innerHTML = "";
//         reload001.innerHTML = "<div id=center001><button id=blueButton onclick=repeat001()>Try again</button></div>";
//     }

//     function repeat001() {
//         location.reload();
//     }
// }

// function repeat() {
//     function repeat001() {
//         location.reload();
//     }
// }
var answers = ["option1","option2","option3","option4","option2","option2","option1","option4","option3","option1"];

var answers = ["a","c","a","d","b","b","a","c","d","b"];

function checkOneQuestion(index) {
    var temp = document.getElementsByName("question" + index);
    var count = 0;
    for (let i = 0; i < temp.length; i++) {
        if (temp[i].checked) {
            if (temp[i].value == answers[index-1]) {
                temp[i].parentElement.innerHTML += "<span class=correct>Correct answer</span>";
                temp[i].parentElement.style.background = '#d4edda';
                count++;
            } else {
                temp[i].parentElement.innerHTML += "<span class=wrong>Your answer</span>";
                temp[i].parentElement.style.background = '#f8d7da';
            }
        }
        else {   
            temp[i].value == answers[index-1];
            temp[i].parentElement.innerHTML += "<span class=correct>Correct answer</span>";
            temp[i].parentElement.style.background = '#ddd';
            }
            
        } 
    return;
    }


function submit() {
    var userAnswers = [];
    for (var index = 1; index <= 10; index++) {
        checkOneQuestion(index);
    }
    
}
