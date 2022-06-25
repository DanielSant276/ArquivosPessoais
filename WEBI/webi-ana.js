function validaNome() {
  nome = document.getElementById('nome').value;

  if (nome == '') {
    document.getElementById('nome-erro').innerHTML = 'Preencha Nome';
    document.getElementById('nome').classList.add('borda-vermelha');
  }
  else if (nome.length < 10 ) {
    document.getElementById('nome-erro').innerHTML = 'Nome inválido';
    document.getElementById('nome').classList.add('borda-vermelha');
  }
  else {
    document.getElementById('nome-erro').innerHTML = '';
    document.getElementById('nome').classList.remove('borda-vermelha');
  }
}

function validaEndereco() {
  endereco = document.getElementById('endereco').value;
  

  if (endereco == '') {
    document.getElementById('endereco-erro').innerHTML = 'Endereço inválido';
    document.getElementById('endereco').classList.add('borda-vermelha');
  }
  else {
    document.getElementById('endereco-erro').innerHTML = '';
    document.getElementById('endereco').classList.remove('borda-vermelha');
  }
}

function validaForm() {
  validaNome();
  validaEndereco();
}