function checkParity() {
    const number = parseInt(document.getElementById('number').value);
    const message = (number % 2 === 0) ? "O número é par." : "O número é ímpar.";
    
    document.getElementById('parityMessage').innerText = message;
    document.getElementById('parityModal').style.display = 'block';
    
    document.body.classList.add('no-scroll');

    return false;
}

function closeModal() {
    document.getElementById('parityModal').style.display = 'none';
    
    document.body.classList.remove('no-scroll');
}
