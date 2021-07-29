function linearEquation(a, b) {
    if(a==0)
        return 'Many root' 
    else {
        const x = -b/a
        return 'One root: x= ' + x
    }
}

function quadraticEquation(a, b, c) {
    const del = b*b - 4*a*c
    if (del < 0)
        return 'No root'
    else if (del == 0){
        const x = -b/(2*a)
        return 'One root: x= ' + x
    }
    else {
        const x1 = (-b + Math.sqrt(del))/(2*a)
        const x2 = (-b - Math.sqrt(del))/(2*a)
        return 'There are 2 roots x1, x2:  x1= ' + x1 + ',  x2= ' + x2 
    }
}

// event handlers
function onClick() {
    const a = document.querySelector('#a').value;
    const b = document.querySelector('#b').value;
    const c = document.querySelector('#c').value;

    const solution = quadraticEquation(a,b,c);
       
    
    // get result view 
    const result = document.querySelector('p');
    result.textContent = solution;
}

// events
const button = document.querySelector('button');
button.addEventListener('click', onClick);