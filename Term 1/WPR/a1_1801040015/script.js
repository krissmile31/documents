// TODO(you): Write the JavaScript necessary to complete the assignment.
function _(x) {
    return document.getElementById(x);
}
// const question = document.querySelector('.question');
// for(choice of question.querySelectorAll('.choice')) {
//     choice.addEventListener('.click', choiceSelected);
// };
fetch('https://wpr-quiz-api.herokuapp.com/attempts', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({
        
    })
}).then(response => {
    return response.json()
})
.then(data => console.log(data))



_('blueButton').onclick = () => {
    _('introduction').style.display='none';
    _('review-quiz').style.display='none';
    _('attempt-quiz').style.display='block';

}

_('greenButton').onclick = () => { 
    alert('Are you sure want to finish this quiz?');
    _('greenButton').style.display='none';
    _('review-quiz').style.display='block';
    submit();
   
      
}

var answers = ["option1","option2","option3","option4","option2","option2","option1","option4","option3","option1"];
var count = 0;
function checkOneQuestion(index) {
    var temp = document.getElementsByName("question" + index);
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
            if (temp[i].value == answers[index-1]) {
                temp[i].parentElement.innerHTML += "<span class=correct>Correct answer</span>";
                temp[i].parentElement.style.background = '#ddd';
            }
        }
        }
        
    _("review-quiz").innerHTML = "<div class=result><h2>Result:</h2><p class=answer>" + count + "/10</p><p><strong>" + 
    count/10*100 + "%	</strong><p>Practice more to improve it :D	</p><button id=blueButton onclick=location.reload()>" +
    "Try again </button></div>";			
   
    }
    
function submit() {
    for (var index = 1; index <= 10; index++) {
        disable(index);
        checkOneQuestion(index); 
    }
}

function disable(index) {  
    var radio = document.getElementsByName("question" + index);
    var len=radio.length;
    for(var i=0;i<len;i++)   
       radio[i].disabled=true;
}

