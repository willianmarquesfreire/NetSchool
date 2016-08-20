create table pessoa (
    id bigint not null primary key
);
create table telefone (
    pessoa_id bigint not null,
    id bigint not null primary key,
    ddd varchar (3) not null,
    numero varchar (20) not null,
    mensagem boolean,
    tipo varchar (20),
    foreign key (pessoa_id) references pessoa (id)
);

create table pessoa_fisica(
    pessoa_id bigint not null primary key,
    nome varchar (60) not null,
    nascimento date,
    cpf varchar (20),
    foreign key (pessoa_id) references pessoa(id)
);

create table pessoa_juridica(
    pessoa_id bigint not null primary key,
    nome_fantasia varchar (60) not null,
    razao_social varchar (60),
    cnpj varchar (20),
    foreign key (pessoa_id) references pessoa(id)
);

create table aluno (
    pessoa_id bigint not null primary key,
    registro_academico varchar (60),
    foreign key (pessoa_id) references pessoa_fisica (pessoa_id)
);

create table professor (
    pessoa_id bigint not null primary key,
    titulo varchar (60) not null,
    foreign key (pessoa_id) references pessoa_fisica (pessoa_id) 
);

create table instituicao (
    pessoa_id bigint not null primary key,
    foreign key (pessoa_id) references pessoa_juridica (pessoa_id)
);

create table curso (
    id bigint not null primary key,
    nome varchar (60) not null,
    instituicao bigint not null,
    foreign key (instituicao) references instituicao (pessoa_id)
);

create table calendario (
    id bigint not null primary key,
    ano int not null,
    instituicao bigint not null,
    foreign key (instituicao) references instituicao (pessoa_id)
);

create table dia (
    id bigint not null primary key,
    referencia date not null,
    descricao varchar (60) not null,
    calendario bigint,
    foreign key (calendario) references calendario (id)
);

create table grade_curricular (
    id bigint not null primary key,
    descricao varchar (60) not null,
    inicio date,
    fim date,
    curso bigint,
    foreign key (curso) references curso (id)
);

create table periodo (
    id bigint not null primary key,
    descricao varchar (60) not null,
    inicio date,
    fim date,
    grade_curricular bigint,
    tipo_periodo varchar(20),
    foreign key (grade_curricular) references grade_curricular (id)
);

create table turma (
    id bigint not null primary key,
    nome varchar (60),
    grade_curricular bigint,
    foreign key (grade_curricular) references grade_curricular (id)
);

create table disciplina (
    id bigint not null primary key,
    nome varchar (60) not null
);

create table periodo_disciplina (
    id bigint not null primary key,
    carga_horaria int not null,
    professor bigint not null,
    disciplina bigint not null,
    periodo bigint not null,
    foreign key (professor) references professor (pessoa_id),
    foreign key (disciplina) references disciplina (id),
    foreign key (periodo) references periodo (id)
);

create table aluno_periodo_disciplina (
    id bigint not null primary key,
    aluno bigint not null,
    foreign key (aluno) references aluno (pessoa_id)
);

create table presenca (
    id bigint not null primary key,
    confirmada boolean not null default false,
    dia bigint,
    aluno_periodo_disciplina bigint,
    foreign key (dia) references dia (id),
    foreign key (aluno_periodo_disciplina) references aluno_periodo_disciplina (id)
);

create table avaliacao (
    id bigint not null primary key,
    descricao varchar (60) not null,
    periodo_disciplina bigint,
    dia bigint,
    tipo_avaliacao varchar (20),
    foreign key (dia) references dia (id)
);

create table nota (
    id bigint not null primary key,
    valor bigint not null,
    aluno_periodo_disciplina bigint not null,
    avaliacao bigint not null,
    foreign key (aluno_periodo_disciplina) references aluno_periodo_disciplina (id),
    foreign key (avaliacao) references avaliacao (id)
);


































