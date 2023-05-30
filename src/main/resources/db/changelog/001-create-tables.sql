create sequence hibernate_sequence start with 1 increment by 1;

create table health_potions (
    id bigint not null,
    name varchar(40),
    cost decimal(p,2),
    stock int not null,
    rarity varchar (20),
    hp_recovery int not null,
    primary key (id)
);