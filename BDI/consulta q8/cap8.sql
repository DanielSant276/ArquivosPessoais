CREATE TABLE empregado
(
  pnome varchar(50),
  mnome varchar(50),
  snome varchar(50),
  nss int, 
  datanasc date, 
  endereço varchar(50), 
  sexo char(1), 
  salario int, 
  nsssuper int,
  ndep19 int
);

INSERT INTO empregado
VALUES
('John', 'B', 'Smith', 123456789, '1955-01-09', 'R. A, 1', 'M', 3000, 333445555, 5),
('Franklin', 'T', 'Wong', 333445555, '1945-12-08', 'R. B, 2', 'M', 4000, 888665555, 5),
('Alicia', 'J', 'Zelaya', 999887777, '1958-06-19', 'Av. C, 3', 'F', 2500, 987654321, 4),
('Jennifer', 'S', 'Wallace', 987654321, '1931-07-20', 'Trav. D, 4', 'F', 4300, 888665555, 4),
('Ramesh', 'K', 'Narayan', 666884444, '1952-09-15', 'R. E, 5', 'M', 3800, 333445555, 5),
('Joyce', 'A', 'English', 453453453, '1962-06-30', 'R. F, 6', 'F', 2500, 333445555, 5),
('Ahmad', 'V', 'Jabbar', 987987987, '1959-03-29', 'Av G, 7', 'M', 2500, 987654321, 4),
('James', 'E', 'Borg', 888665555, '1927-09-10', 'Av H, 8', 'M', 5500, null, 1);

CREATE TABLE departamento
(
  dnome varchar(50),
  dnúmero int,
  nssger int,
  datinicger date
);

INSERT INTO departamento
VALUES
('Pesquisa', 5, 333445555, '1978-05-22'),
('Administrativo', 4, 987654321, '1985-01-01'),
('Gerencial', 1, 888665555, '1971-06-19');

CREATE TABLE locais_depto
(
  dnúmero int, 
  dlocalização varchar(50)
);

INSERT INTO locais_depto
VALUES
(1, 'Houston'),
(4, 'Stafford'),
(5, 'Bellaire'),
(5, 'Sugariand'),
(5, 'Houston');

CREATE TABLE projeto
(
  pnome varchar(50),
  pnúmero int, 
  plocalização varchar(50), 
  dnum int
);

INSERT INTO projeto
VALUES
('ProdutoX', 1, 'Bellaire', 5),
('ProdutoY', 2, 'Sugarland', 5),
('ProdutoZ', 3, 'Houston', 5),
('Automação', 10,' Stafford', 4),
('Reorganização', 20,' Houston', 1),
('Beneficiamento', 30,' Stafford', 4);

CREATE TABLE trabalha_em
(
  nssemp int,
  pnro int, 
  horas float
);

INSERT INTO trabalha_em
VALUES
(123456789, 1, 32.5),
(123456789, 2, 7.5),
(666884444, 3, 40.0),
(453453453, 1, 20.0),
(453453453, 2, 20.0),
(333445555, 2, 10.0),
(333445555, 3, 10.0),
(333445555, 10, 10.0),
(333445555, 20, 10.0),
(999887777, 30, 30.0),
(999887777, 10, 10.0),
(987987987, 10, 35.0),
(987987987, 30, 5.0),
(987654321, 30, 20.0),
(987654321, 20, Null);

CREATE TABLE dependente
(
  nssemp int, 
  nomedependente varchar(50), 
  sexo char(1), 
  dataniv varchar(50), 
  relação varchar(50)
);

INSERT INTO dependente
VALUES
(333445555, 'Alice', 'F', '1976-04-05', 'FILHA'),
(333445555, 'Theodore', 'M', '1973-10-25', 'FILHO'),
(333445555, 'Joy', 'F', '1948-05-03', 'ESPOSA'),
(987654321, 'Abner', 'M', '1978-02-29', 'MARIDO'),
(123456789, 'Michael', 'M', '1978-01-01', 'FILHO'),
(123456789, 'Alice', 'F', '1978-12-31', 'FILHA'),
(123456789, 'Elizabeth', 'F', '1957-05-05', 'ESPOSA');




SELECT DATANASC, ENDEREÇO
FROM EMPREGADO
WHERE PNOME = 'John' AND MNOME = 'B' AND SNOME = 'Smith' 

SELECT PNOME, SNOME, ENDEREÇO
FROM EMPREGADO, DEPARTAMENTO
WHERE DNOME = 'Pesquisa' AND DNUMERO = NDEP 

SELECT PNUMERO, DNUM, SNOME, ENDEREÇO, DATANASC
FROM PROJETO, DEPARTAMENTO, EMPREGADO
WHERE DNUM = DNUMERO AND SSNGER = NSS AND PLOCALIZAÇÃO = 'Stafford' 

SELECT PNOME, SNOME
FROM EMPREGADO
WHERE ((SELECT PNRO
        FROM TRABALHA_EM
        WHERE NSS = NSSEMP)
        CONTAINS
        (SELECT PNUMERO
        FROM PROJETO
        WHERE DNUM = 5))

(SELECT PNUMERO
 FROM PROJETO, DEPARTAMENTO, EMPREGADO
 WHERE DNUM=DNUMERO AND NSSGER=NSS AND SNOME='Smith')
 UNION
 (SELECT PNUMERO
  FROM PROJETO, TRABALHA_EM, EMPREGADO
  WHERE PNUMERO=PNRO AND NSSEMP=NSS AND SNOME='Smith')

SELECT SNOME, PNOME
FROM EMPREGADO
WHERE (SELECT COUNT (*)
       FROM DEPENDENTE
       WHERE NSS=NSSEMP) >= 2 


SELECT PNOME, SNOME
FROM EMPREGADO
WHERE NOT EXISTS (SELECT *
                  FROM DEPENDENTE
                  WHERE NSS=NSSEMP) 


SELECT PNOME, SNOME
FROM EMPREGADO
WHERE EXISTS (SELECT *
              FROM DEPENDENTE
              WHERE NSS=NSSEMP)
              AND EXISTS (SELECT *
                          FROM DEPARTAMENTO
                          WHERE NSS=NSSGER) 

















CREATE TABLE obra
(
  codigo int,
  titulo varchar(255),
  ano date,
  PRIMARY KEY (codigo)
);

INSERT INTO obra
VALUES
(1 ,'a arte', "1847-01-09"),
(2, 'a fera', "1882-01-09"),
(3, 'a outra', "1889-01-09"),
(4, 'o tigue', "1875-01-09"),
(5, 'a largata', "1885-01-09"),
(6, 'a alice', "1815-01-09"),
(7, 'vida', "1795-02-09"),
(8, 'eco', "1797-04-20"),
(9, 'amor', "1800-03-09"),
(10, 'rei', "1995-05-09"),
(11, 'alem', "1995-11-09"),
(12, 'mona', "1995-12-09"),
(13, 'liza', "1995-08-09"),
(14, 'davinci', "1997-11-09"),
(15, 'a arte', "1975-08-09")
;

CREATE TABLE escultura
(
  peso int,
  material varchar(255),
  cdgObra int,
  FOREIGN KEY (cdgObra) REFERENCES obra(codigo)
);

INSERT INTO escultura
VALUES
(11 ,'aço', 8),
(20, 'cobre', 9),
(11, 'aço', 10),
(20, 'cobre', 11),
(7, 'ferro', 12),
(11, 'aço', 13),
(7, 'cobre', 14),
(8, 'ferro', 15)
;

CREATE TABLE pintura
(
  estilo varchar(255),
  cdgObra int,
  FOREIGN KEY (cdgObra) REFERENCES obra(codigo)
);

INSERT INTO pintura
VALUES
( 'impressinista', 1),
( 'expressionista', 2),
( 'abstrata', 3),
( 'classica', 4),
( 'figurativa', 5),
( 'fotorrealista', 6),
( 'cubista', 7)
;

CREATE TABLE autor
(
  codigo int,
  nacionalidade varchar(255),
  nome varchar(255),
  PRIMARY KEY (codigo)
);

INSERT INTO autor
VALUES
(1, 'brasileiro','augusto'),
(2, 'chileno','alan'),
(3, 'brasileiro','Laura'),
(4, 'cubano','augusto'),
(5, 'brasileiro','Pedro'),
(6, 'alemão','Livia'),
(7, 'brasileiro','Sergio'),
(8, 'argentino','augusto'),
(9, 'brasileiro','Alfredo'),
(10, 'libanês','Rebeca'),
(11, 'brasileiro','Alice'),
(12, 'sírio','Luan'),
(13, 'brasileiro','Otavio'),
(14, 'francês','Loe'),
(15, 'brasileiro','Cleo')
;

CREATE TABLE salao
(
  codigo int,
  posiçao int,
  andar int,
  PRIMARY KEY (codigo)
);

INSERT INTO salao
VALUES
(1, 2,1),
(2, 5,2),
(3, 7,3),
(4, 1,4),
(5, 14,3),
(6, 8,5),
(7, 3,5),
(8, 12,4),
(9, 6,3),
(10, 9,6),
(11, 10,3),
(12, 11,1),
(13, 20,3),
(14, 4,4),
(15, 14,3)
;

CREATE TABLE autorObra
(
  cdgAutor int,
  cdgObra int,
  FOREIGN KEY (cdgAutor) REFERENCES autor(codigo), 
  FOREIGN KEY (cdgObra) REFERENCES obra(codigo)
);

INSERT INTO autorObra
VALUES

(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10,10),
(11,11),
(12,12),
(13,13),
(14,14),
(15,15)
;

CREATE TABLE salaoObra
(
  cdgSalao int,
  cdgObra int,
  FOREIGN KEY (cdgSalao) REFERENCES salao(codigo), 
  FOREIGN KEY (cdgObra) REFERENCES obra(codigo)
);

INSERT INTO salaoObra
VALUES
(1, 2),
(2, 1),
(3, 3),
(4, 8),
(5, 4),
(6, 7),
(7, 12),
(8, 9),
(9, 10),
(10,12),
(11,6),
(12,15),
(13,14),
(14, 11),
(15,5)
;


CREATE TABLE funcionario
(
  id int,
  cpf varchar(255),
  nome varchar(255),
  salario float,
  PRIMARY KEY (id)
);

INSERT INTO funcionario
VALUES
(1, "2000-04-29","alice", 1000),
(2, "2000-04-29","marta", 1010),
(3, "2000-04-29","luan", 1100),
(4, "2000-04-29","ligia", 1230),
(5, "2000-04-29","mary", 1470),
(6, "2000-04-29","joao", 1450),
(7, "2000-04-29","lucas", 1950),
(8, "2000-04-29","felipe", 1000),
(9, "2000-04-29","lua", 1001),
(10,"2000-04-29","ali", 1002),
(11,"2000-04-29","luiz", 1003),
(12,"2000-04-29","caio", 1000),
(13,"2000-04-29","lara", 1004),
(14,"2000-04-29","vitor", 1005),
(15,"2000-04-29","vera", 1010)
;

CREATE TABLE guardas
(
  idFuncionario int,
  horaEntrada time,
  horaSaida time,
  FOREIGN KEY (idFuncionario) REFERENCES funcionario(id)
);

INSERT INTO guardas
VALUES
(1, '01:00:00','10:00:00'),
(2, '02:00:00','11:00:00'),
(3, '03:00:00','12:00:00'),
(4, '01:00:00','10:00:00'),
(5, '02:00:00','11:00:00'),
(6, '03:00:00','12:00:00'),
(7, '01:00:00','13:00:00'),
(8, '02:00:00','10:00:00')
;

CREATE TABLE restauradores
(
  idFuncionario int,
  especialidade varchar(255),
  FOREIGN KEY (idFuncionario) REFERENCES funcionario(id)
);

INSERT INTO restauradores
VALUES
(9, 'livros raros'),
(10,'livros raros'),
(11,'livros classicos'),
(12,'livros classicos'),
(13,'livros classicos'),
(14,'livros classicos'),
(15,'livros classicos')
;


CREATE TABLE vigiar
(
  idFuncionario int,
  qtdGuardas varchar(255),
  FOREIGN KEY (idFuncionario) REFERENCES funcionario(id)
);

INSERT INTO vigiar
VALUES
(1, 2),
(2, 4),
(3, 2),
(4, 1),
(5, 4),
(6, 7),
(7, 12),
(8, 7),
(9, 10),
(10,12),
(11,6),
(12,1),
(13,2),
(14, 3),
(15,9);

CREATE TABLE manutençao
(
  codigo int,
  qtdMateria int,
  dataInicio date,
  previsaoTermino date,
  custo float,
  serviço varchar(255),
  PRIMARY KEY (codigo)
);

INSERT INTO manutençao
VALUES
(1, 2, "2020-01-09", "2021-01-09", 1000, 'limpar'),
(2, 1, "2020-02-09", "2021-02-09", 1000, 'limpar'),
(3, 3,"2020-03-09", "2021-03-09", 1000, 'limpar'),
(4, 8, "2020-05-09", "2021-05-09", 1000, 'limpar'),
(5, 4, "2020-01-12", "2021-01-12", 1000, 'limpar'),
(6, 7, "2020-01-10", "2021-01-10", 1000, 'limpar'),
(7, 12, "2020-01-12", "2021-01-12", 1000, 'limpar'),
(8, 9, "2020-01-13", "2021-01-13", 1000,'limpar' ),
(9, 10, "2020-01-14", "2021-01-14", 1000, 'limpar'),
(10,12, "2020-01-15", "2021-01-15", 1000, 'limpar'),
(11,6, "2020-01-16", "2021-01-16", 1000, 'limpar'),
(12,15, "2020-01-17", "2021-01-17", 1000, 'limpar'),
(13,14, "2020-01-18", "2021-01-18", 1000, 'limpar'),
(14, 11, "2020-01-19", "2021-01-19", 1000, 'limpar'),
(15,5, "2020-01-20", "2021-01-20", 1000, 'limpar')

;

CREATE TABLE materiaPrima
(
  codigo int,
  qtd int,
  nome varchar(255),
  PRIMARY KEY (codigo)
);

INSERT INTO materiaPrima
VALUES
(1, 2, 'pano'),
(2, 1, 'escova'),
(3, 3, 'bucha'),
(4, 8, 'escova'),
(5, 4, 'pano'),
(6, 7, 'pano'),
(7, 12, 'pano'),
(8, 9,'pano' ),
(9, 10, 'pano'),
(10,12, 'pano'),
(11,6, 'pano'),
(12,15, 'pano'),
(13,14, 'pano'),
(14, 11, 'pano'),
(15,5, 'pano')
;

CREATE TABLE manutençaoDados
(
  cdgMateria int,
  idFuncionario int,
  cdgManutençao int,
  cdgObra int,
  FOREIGN KEY (cdgMateria) REFERENCES materiaPrima(codigo), 
  FOREIGN KEY (idFuncionario) REFERENCES funcionario(id),
  FOREIGN KEY (cdgManutençao) REFERENCES manutençao(codigo), 
  FOREIGN KEY (cdgObra) REFERENCES obra(codigo)
);

INSERT INTO manutençaoDados
VALUES
(1, 15, 1, 1 ),    
(2, 14, 2, 2), 
(3, 13, 3, 3),
(4, 12, 4, 4),
(5, 11, 5, 5),
(6, 10, 6, 6),
(7, 9, 7, 7),
(8, 8, 8, 8), 
(9, 7, 9, 9),
(10, 6, 10, 10),
(11, 5, 11, 11),
(12, 4, 12, 12),
(13, 3, 13, 13),
(14, 2, 14, 14),
(15, 1, 15, 15)
;