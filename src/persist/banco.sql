create database funcionario;

use banco;

create table funcionario(
id int primary key auto_increment
nome varchar(150),
matricula int,
salario double not null
);

create table dependente(
id int primary key auto_increment,
nome varchar(150),
idade int not null,
fk_funcionario int not null,
 foreign key(fk_funcionario) references funcionario(id)
);