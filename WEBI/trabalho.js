function validacao() {
    var nome = document.getElementById("nome")
    if (nome.value == "" || nome.value.length < 10) {
        nome.classList.add("erro")
        document.getElementById("erro_nome").style.display = "inline"
    } else {
        nome.classList.remove("erro")
        document.getElementById("erro_nome").style.display = "none"
    }

    var endereço = document.getElementById("endereco")
    if (endereco.value == "") {
        endereco.classList.add("erro")
        document.getElementById("erro_endereco").style.display = "inline"
    } else {
        endereco.classList.remove("erro")
        document.getElementById("erro_endereco").style.display = "none"
    }

    var cep = document.getElementById("cep")
    if (cep.value == "" || cep.value.length < 7) {
        cep.classList.add("erro")
    } else {
        cep.classList.remove("erro")
    }

}

function postMask(t, mask) {
    let i = t.value.length;
    let exit = mask.substring(1, 0);
    let text = mask.substring(i)
    if (text.substring(0, 1) != exit) {
        t.value += text.substring(0, 1);
    }
}

function removeChar(e) {
    console.log(e);
    if (e.charCode > 47 && e.charCode < 58) {
        e.preventDefault();
    }
}

