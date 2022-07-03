const express = require('express');
const bp = require('body-parser');
const cors = require('cors');

let app = express();

app.use(cors());
let urlencodedParser = bp.urlencoded({extended:false});

app.post('/', urlencodedParser, function(req, res) {
  let objParam = {
    name: req.body.name,
    age: 26
  }
  
  res.json(objParam);
});

app.listen(3000);