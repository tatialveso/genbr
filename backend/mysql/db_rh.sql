create database db_rh;
use db_rh;

create table tb_funcionaries (
	id bigint auto_increment,
    nome varchar(255) not null,
    data_nascimento date,
    cargo varchar(255) not null,
    salario decimal(8,2) not null,
    primary key (id)
);

insert into tb_funcionaries(nome, data_nascimento, cargo, salario) values (
	"Carolina Azevedo",
    "1996-03-20",
    "Pessoa Instrutora Lead",
    4000.00
);

insert into tb_funcionaries(nome, data_nascimento, cargo, salario) values (
	"Alberto Novaes",
    "1980-10-04",
    "Pessoa Instrutora de Jornada",
    3000.00
);

insert into tb_funcionaries(nome, cargo, salario) values (
	"Amanda Gonçalves",
    "Pessoa Instrutora de Jornada",
    3500.00
);

insert into tb_funcionaries(nome, cargo, salario) values (
	"Armando Silva",
    "Pessoa Instrutora Lead",
    4500.00
);

select * from tb_funcionaries where salario > 2000.00;
select * from tb_funcionaries where salario < 2000.00;