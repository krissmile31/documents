

// create an array of links for at least 5 cards
var cards = ["https://s3.amazonaws.com/images.penguinmagic.com/images/products/original/5080a.jpg",
"https://purlinglondon.com/app/uploads/2016/05/The-King-of-Diamonds.jpg",
"https://cdn2.bigcommerce.com/n-d57o0b/1kujmu/products/297/images/924/2D__57497.1440113502.1280.1280.png?c=2",
"https://st2.depositphotos.com/1803332/9245/v/950/depositphotos_92458378-stock-illustration-single-playing-cards-vector-joker.jpg",
"https://i.pinimg.com/originals/2b/0e/0b/2b0e0ba6b1a0148ab645bea22c1dcc46.jpg"]

// Loop the array of images to create img elements add to the board view and display.
function myCards() {
    for (let i=0; i<cards.length; i++) {
        var myCard = document.getElementById("img");
        mycard.innerHTML = "<img src="+images[i]+">"
    } 
    setTimeout(myCards, 10)     
}

mediumZoom('.zoom', {
    height: 50

})
