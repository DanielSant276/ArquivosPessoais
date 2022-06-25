const express = require('express');
const fs = require('fs');
const app = express();

const handlebars = require('express-handlebars')


var hbs = exphbs.create({
  // Specify helpers which are only registered on this instance.
  helpers: {
    foo: function () { return 'FOO!'; },
    bar: function () { return 'BAR!'; }
  }
});

app.engine('handlebars', hbs.engine);
app.set('view engine', 'handlebars');


app.listen(8080, function() {
  console.log('conectado');
})