create table event(

    id bigint not null auto_increment,
    title varchar(100) not null,
    description varchar(100) not null ,
    date varchar(6) not null ,
    local varchar(100) not null,
    maxpeople varchar(100) not null,

    primary key(id)

);