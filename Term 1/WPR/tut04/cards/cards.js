const cardView = document.querySelector('#card')
const title = document.createElement('h1')
title.textContent = 'Card boards'
cardView.appendChild(title)
for (const c of cards) {
    const image = document.createElement('img')
    image.src = c
    cardView.appendChild(image)
    image.addEventListener('click', onClick)
}

function onClick(event) {
    const image = event.currentTarget

    const myCard = document.querySelector('img.choice')
    if (myCard != null) {
        myCard.classList.remove('choice')
    }

    image.classList.add('choice')
    const click = document.createElement('h2')
    click.textContent = 'Hooray!'
    cardView.appendChild(click)
}