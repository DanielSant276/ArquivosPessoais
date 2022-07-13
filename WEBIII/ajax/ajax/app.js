const express = require('express');
const app = express();

app.get("/",(req, res) => {

  res.sendFile(__dirname + "/index.html");

})

app.get("/user",(req, res) => {

  let user =
  {
      name: "gabriel",
      cpf: "854.929.750-05",
      matricula: "2000320032"
  };
  
  res.send(user);

})

app.listen(3000 || process.env.PORT);

