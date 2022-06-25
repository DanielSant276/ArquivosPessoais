function nameVerify() {
  let fullName = document.getElementById('name-form').value;

  if (fullName == '') {
    document.getElementById('invalid-name').innerHTML = 'Preencha o nome';
    document.getElementById('name-form').classList.add('border-red');
  }
  else if (fullName.length < 10) {
    document.getElementById('invalid-name').innerHTML = 'Nome inválido';
    document.getElementById('name-form').classList.add('border-red');
  }
  else {
    document.getElementById('invalid-name').innerHTML = '';
    document.getElementById('name-form').classList.remove('border-red');
  }
}

function addressVerify() {
  let address = document.getElementById('address-form').value;

  if (address == '' || address[0] == ' ') {
    document.getElementById('invalid-address').innerHTML = 'Endereço inválido';
    document.getElementById('address-form').classList.add('border-red');
  }
  else {
    document.getElementById('invalid-address').innerHTML = '';
    document.getElementById('address-form').classList.remove('border-red');
  }
}

function cepVerify() {
  let cep = document.getElementById('cep-form').value;

  if (cep.length < 8) {
    document.getElementById('invalid-cep').innerHTML = 'CEP inválido';
    document.getElementById('cep-form').classList.add('border-red');
  }
  else {
    document.getElementById('invalid-cep').innerHTML = '';
    document.getElementById('cep-form').classList.remove('border-red');
  }
}

function mask(t, mask) {
  let i = t.value.length;
  let saida = mask.substring(1, 0);
  let texto = mask.substring(i)
  if (texto.substring(0, 1) != saida) {
    t.value += texto.substring(0, 1);
  }
}

function birthDateValidation() {
  let birth = document.getElementById('birth-date-form').value;

  if (birth == '') {
    document.getElementById('invalid-birth-date').innerHTML = 'Preencher data de nascimento';
    document.getElementById('birth-date-form').classList.add('border-red');
  }
  else {
    document.getElementById('invalid-birth-date').innerHTML = '';
    document.getElementById('birth-date-form').classList.remove('border-red');
  }
}

function ageNumber() {
  let birth = document.getElementById('birth-date-form').value;
  
  let date = new Date();
  let year = date.getFullYear();
  let month = date.getMonth() + 1;
  let day = date.getDate();

  let age = year - birth.slice(6, 10);

  if (!(birth.slice(3, 5) == month && birth.slice(0, 2) <= day)) {
    age --;
  }

  if (birth.length >= 9) {
    document.getElementById('birth-date').innerHTML = 'Você tem ' + age + ' anos';
  }
}

function validaCPF(cpf) {
  cpf = cpf.split('.').join('').split('-').join('');

  digitoUm = false;
  digitoDois = false;
  soma = 0;
  contador = 10;

  for(i=0; i < cpf.length - 2; i++) {
    soma += cpf[i] * (contador - i);
  }

  if ((soma * 10 % 11) == cpf[9]) {
    digitoUm = true;
  }

  soma = 0
  for(i=0; i < cpf.length - 1; i++) {
    soma += cpf[i] * (contador + 1 - i);
  }

  if ((soma * 10 % 11) == cpf[10]) {
    digitoDois = true;
  }

  if (digitoUm && digitoDois) {
    return true;
  }
  else {
    return false;
  }
}

function cpfValidation() {
  let cpf = document.getElementById('cpf-form').value;

  if (cpf == '') {
    document.getElementById('invalid-cpf').innerHTML = 'Preencher o CPF';
    document.getElementById('cpf-form').classList.add('border-red');
  }
  else if (!validaCPF(cpf)) {
    document.getElementById('invalid-cpf').innerHTML = 'CPF inválido';
    document.getElementById('cpf-form').classList.add('border-red');
  }
  else {
    document.getElementById('invalid-cpf').innerHTML = '';
    document.getElementById('cpf-form').classList.remove('border-red');
  }
}

function validateForm() {
  nameVerify();
  addressVerify();
  cepVerify();
  birthDateValidation();
  ageNumber();
  cpfValidation();
}