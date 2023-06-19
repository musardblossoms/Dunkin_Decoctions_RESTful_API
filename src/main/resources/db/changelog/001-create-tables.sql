create sequence hibernate_sequence start with 1 increment by 1;

create table health_potions (
    id INTEGER not null UNIQUE,
    name varchar(40),
    cost int,
    stock int not null,
    rarity varchar (20),
    hp_recovery int not null,
    primary key (id)
);

create table special_effects (
    id bigint not null,
    name varchar (255),
    cost int,
    stock int not null,
    rarity varchar (20),
    description varchar (255),
    duration int,
    primary key (id)
);

create table one_time_use (
    id bigint not null,
    name varchar(255),
    cost int,
    stock int not null,
    rarity varchar (20),
    description varchar (255),
    primary key (id)
);
