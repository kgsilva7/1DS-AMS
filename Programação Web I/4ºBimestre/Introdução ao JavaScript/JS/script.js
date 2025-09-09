function validateDate() {
    const dia = parseInt(document.getElementById('dia').value);
    const mes = parseInt(document.getElementById('mes').value);
    const ano = parseInt(document.getElementById('ano').value);

    const birthDate = new Date(ano, mes - 1, dia);
    const today = new Date();

    let age = today.getFullYear() - birthDate.getFullYear();
    const m = today.getMonth() - birthDate.getMonth();
    if (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) {
        age--;
    }

    document.getElementById('ageMessage').innerText = `Você tem ${age} anos.`;
    document.getElementById('ageModal').style.display = 'block';

    return false;
}

function closeModal() {
    document.getElementById('ageModal').style.display = 'none';
}
