const cardContainer = document.querySelector('#flashcard-container');
const statusBar = document.querySelector('#status-bar');
const btnPrev = statusBar.querySelector('#prev');
const btnNext = statusBar.querySelector('#next');

// Task 1: flip word/ definition
function flipCard() {
    const word = document.getElementById('word');
    const def = document.getElementById('definition');
    if(word.style.display != 'none'){
        word.style.display = 'none';
        def.style.display = 'flex';
    }else if(def.style.display != 'none'){
        def.style.display = 'none';
        word.style.display = 'flex';
    }
}


// Task 2: populate data
// function createCard(word, definition) {
//     //click the button
    
//     //generate word and definition
// }
// function populateCards(cardContainer) {
    
// }
// const cards = populateCards(cardContainer);
// const statusNoWords = statusBar.querySelector('span');

let currentWord = 0;
const totalWords = Object.keys(KOREAN).length;
const word = document.getElementById('word');
const definition = document.getElementById('definition');


function loadCard(index){
    word.textContent = Object.keys(KOREAN)[index];
    definition.textContent = KOREAN[Object.keys(KOREAN)[index]];
    setIndex(index)
}

loadCard(0);


// Task 3: mouse events - navigation
const statusCurrentIndex = statusBar.querySelector('strong');

// on start: show first word
let currentIndex = 0;


function setIndex(index) {
    // check if valid index
    if(currentWord >= totalWords-1){
        btnNext.disabled = true;
    }else if(currentWord == 0){
        btnPrev.disabled = true;
    }else if(currentWord < totalWords ){
        btnNext.disabled = false;
    }
    // hide current card


    // show card at index


    // disable/ enable navigating buttons

}

function prevCard() {
    if(currentWord < totalWords && currentWord >= 1){
        statusCurrentIndex.textContent = currentWord;
        currentWord--;
    }
    loadCard(currentWord);
}

function nextCard() {
    currentWord++;
    if(currentWord < totalWords){
        statusCurrentIndex.textContent = currentWord + 1;
    }
    btnPrev.disabled = false;
    loadCard(currentWord);
}



// Task 4: keyboard events - navigation
function onKeyDown(event) {
    
}
