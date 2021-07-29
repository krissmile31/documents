const cardContainer = document.querySelector('#flashcard-container');
const statusBar = document.querySelector('#status-bar');
const btnPrev = statusBar.querySelector('#prev');
const btnNext = statusBar.querySelector('#next');

// Task 1: flip word/ definition
function flipCard(event) {
    var element = document.getElementById('flashcard word')
    element.classList.remove('definition')
    
    cardContainer.appendChild(element)
    element.addEventListener('click', (event) => {
        element.classList.toggle('definition')
    })
}


function onClick(event) {
    const image = event.currentTarget

    const myCard = document.querySelector('.definition')
    if (myCard != null) {
        myCard.classList.remove('definition')
    }

    image.classList.add('definition')
   
    cardContainer.appendChild(click)
}

// Task 2: populate data
function createCard(word, definition) {
    
}

function populateCards(cardContainer) {
    
}

const cards = populateCards(cardContainer);

const statusNoWords = statusBar.querySelector('span');


// Task 3: mouse events - navigation
const statusCurrentIndex = statusBar.querySelector('strong');

// on start: show first word
let currentIndex = 0;


function setIndex(index) {
    // check if valid index

    // hide current card


    // show card at index


    // disable/ enable navigating buttons

}

function prevCard() {
    
}

function nextCard() {
    
}



// Task 4: keyboard events - navigation
function onKeyDown(event) {
    
}
