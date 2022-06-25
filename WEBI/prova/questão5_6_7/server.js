const express = require('express');
const fs = require('fs');
const app = express();
const bodyParser = require('body-parser');
const usuario = require('./models/usuario');

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

app.post('/login', function (req, res) {
  let nome;
  let email;
  let senha;
  let arquivo;

  async function gerarNomedoArquivo() {
    arquivo = await usuario.findAndCountAll().then(result => {
      return result.count + 1;
    });

    nome = req.body.nome;
    email = req.body.email;
    senha = req.body.senha;

    usuario.create({
      nome: nome,
      email: email,
      senha: senha,
      arquivo: arquivo
    }).then(function () {
      console.log("Usuário criado com sucesso!");
      res.redirect('/');
    }).catch(function (erro) {
      console.log(`Falha na criação de usuário! Erro: ${erro}`);
    });
  }
  gerarNomedoArquivo();
});

app.post('/validar', function (req, res) {
  usuario.findAll({
    where: {
      email: req.body.email,
      senha: req.body.senha,
    }
  }).then(data => {
    if (data.length == 1) {
      usuario.findAll({}).then(data => {
        criarPrincipal(req, res, data);
      }) 
    }
    else {
      console.log("Erro no Login");
      res.redirect('/');
    }
  });
});

app.get('/', function (req, res) {
  fs.readFile('login.html', function (err, data) {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.write(data);
    return res.end();
  });
});

app.get('/login', function (req, res) {
  fs.readFile('login.html', function (err, data) {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.write(data);
    return res.end();
  });
});

app.get('/cadastro', function (req, res) {
  fs.readFile('cadastro.html', function (err, data) {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.write(data);
    return res.end();
  });
});

app.get('/principal', function (req, res) {
  fs.readFile('principal.html', function (err, data) {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.write(data);
    return res.end();
  });
});

app.listen(8080, function () {
  usuario;
  console.log('Servidor Conectado');
})

function criarPrincipal(req, res, data) {
  var html = buildHtml(req);
  var databaseInfo = data;

  // console.log(data);

  res.writeHead(200, {
    'Content-Type': 'text/html',
    'Content-Length': html.length,
    'Expires': new Date().toUTCString()
  });
  res.end(html);

  function criaBody(data) {
    var body = '';
    let i;
    for (i = 0; i < data.length; i++) {
      body += `<div class="linha">
                 <p class="coluna-id">${data[i].dataValues.id}</p>
                 <p class="coluna-nome">${data[i].dataValues.nome}</p>
                 <p class="coluna-email">${data[i].dataValues.email}</p>
               </div>
               `
    }
    return body;
  }

  function buildHtml(req) {
    var database = data;
    var body = criaBody(database);

    return `<!DOCTYPE html>
    <html lang="pt-br">

    <head>
      <meta charset="UTF-8">
      <title>Principal</title>
      <style>
        #tela {
          display: flex;
          width: 100%;
          height: 100vh;
          align-items: center;
          justify-content: center;
          flex-direction: column;
        }

        #caixa {
          display: flex;
          flex-direction: column;
          align-items: center;
          justify-content: space-between;
          width: 35%;
          border: 1px solid #000000;
          padding: 10px 3% 50px 3%;
        }

        p {
          text-align: center;
        }

        .linha {
          display: flex;
          flex-direction: row;
          width: 100%;
        }

        .coluna-id {
          width: 10%;
        }

        .coluna-nome {
          width: 20%;
        }

        .coluna-email {
          width: 70%;
        }
      </style>
    </head>

    <body>
      <main>
        <div id="tela">
          <div id="caixa">
              <p>Usuários Cadastrados</p>
              ${body}
          </div>
        </div>
      </main>

      <script>
      </script>
    </body>

    </html>`
  };
}