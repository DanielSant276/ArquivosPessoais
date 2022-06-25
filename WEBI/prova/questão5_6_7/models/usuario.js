const db = require('./db');

const usuario = db.sequelize.define('usuarios', {
  id: {
    type: db.Sequelize.INTEGER,
    autoIncrement: true,
    primaryKey: true,
  },
  nome: {
    type: db.Sequelize.STRING,
  },
  email: {
    type: db.Sequelize.STRING,
  },
  senha: {
    type: db.Sequelize.STRING,
  },
  arquivo: {
    type: db.Sequelize.STRING,
  }
});

usuario.sync({force: false});

module.exports = usuario;