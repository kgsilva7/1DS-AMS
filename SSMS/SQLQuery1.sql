-- comando para criar o banco de dados
CREATE DATABASE ExercBD01
use ExercBD01
-- Criando uma tabela
CREATE TABLE pet
(
NumRegistro int, -- criando campo para a inser��o de registro
Nome varchar(80), -- criando o campo nome
Especie varchar(80), --cria��o do campo espec�e
Raca varchar(30), -- cria��o do campo ra�a
Cor varchar(30), -- cria��o do campo Cor
Nascimento datetime, --cria��o do campo nascimento
Sexo varchar(9) -- cria��o do campo Sexo
);

-- comando para criar o banco de dados
CREATE DATABASE ExercBD02

use ExercBD02

CREATE TABLE Departamento (
CodFunc int, -- Criando Campo CodFunc
NomeDepto varchar(50), --Criando campo NomeDepto
);

CREATE TABLE Funcionario --criando tabela funcionario
(
CodFunc int, --criando campo CodFunc
NomeFunc varchar(80), --criando campo NomeFunc
CodDepto int, --criando campo CodDepto
Ramal int NULL, --criando campo ramal
Salario float,
DataAdmissao datetime, --criando campo DataAdmissao
DataCadastro datetime, --criando campo DataCadastro
Sexo char(1)
);


-- comando para criar o banco de dados
CREATE DATABASE ExercBD03
use ExercBD03
CREATE TABLE Produtos
(
--Criando o campo ID_produtos
ID_Produto Int Primary Key Identity,
--Criando o campo Nome
Nome varchar(30) NOT NULL,
--criando o campo Pre�o
Preco float not null,
--criando o campo estoque
Estoque int not null,
);
-- Criando o cadastro de funcion�rio
CREATE TABLE Funcionario
(
--Criando o campo RM(registro de Matricula)
RM int Primary Key Identity,
--Criando o campo Nome
Nome varchar(30) not null,
--Criando um campo CPF
CPF varchar(15) Unique not null,
--criando um campo Cargo
Cargo varchar(30) not null,
);

--Criando cadastro de departamento
CREATE TABLE Departamento
(
--Criando o campo ID_produtos
ID_Departamento Int Primary Key Identity,
--criando o campo Nome
Nome varchar(30) not null,
--criando um campo Endere�o
Endere�o varchar(100) not null,
--criando um campo Responsavel
Responsavel varchar(30) not null,
);

--Criando cadastro de Fornecedores
CREATE TABLE Fornecedor
(
--Criando o campo ID_produtos
ID_Fornecedor Int Primary Key Identity,
--criando o campo Nome
Nome varchar(30) not null,
--criando o campo CNPJ
CNPJ varchar(18) not null,
--criando o campo Telefone
Telefone varchar(14) not null,
);
