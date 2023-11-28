/**
 * Author:  Raul Verduzco Cruz <ztr4w at nephewbob>
 * Created: 22 nov. 2023
 */

create table customers(
    id bigint not null auto_increment,
    name varchar(100) not null,
    last_name varchar(100) not null,
    email varchar(100) not null unique,
    phone varchar(15) not null unique,
    city varchar(100) not null,
    neighborhood varchar(100) not null,
    street varchar(100) not null,
    number int not null,

    primary key(id)
);
