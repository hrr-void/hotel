/**
 * Author:  Raul Verduzco Cruz <ztr4w at nephewbob>
 * Created: 28 nov. 2023
 */

create table reservations(
    id bigint not null auto_increment,
    reservation_date date not null,
    reservation_end date not null,
    cost int not null,
    method_of_payment varchar(10) not null,
    customer_id bigint not null,

    primary key(id),
    constraint fk_reservations_customer_id foreign key(customer_id) references customers(id)
);
