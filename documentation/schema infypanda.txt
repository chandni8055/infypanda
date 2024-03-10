drop schema infypanda;
create schema infypanda;

use infypanda;

drop table customer;
drop table address;
drop table food;
drop table restaurant;


create table customer(
id integer auto_increment primary key,
name varchar(50) NOT NULL,
mobile varchar(13) unique NOT NULL,
email varchar(50) unique NOT NULL,
password varchar(50));

create table address(
customer_id integer NOT NULL references customer(id),
building_number varchar(10),
locality varchar(20),
city varchar(15),
state varchar(15),
pincode varchar(6) NOT NULL,
CONSTRAINT fk_address_customer FOREIGN KEY (customer_id) REFERENCES customer(id));


create table restaurant(
id integer auto_increment primary key,
name varchar(50) NOT NULL,
city varchar(50),
locality varchar(50),
opening_time timestamp,
closing_time timestamp,
description varchar(400),
pincode varchar(6));


create table food(
id integer auto_increment primary key,
name varchar(50) NOT NULL,
restaurant_id integer NOT NULL references restaurant(id),
price integer,
food_type varchar(10),
description varchar(300),
category varchar(30),
CONSTRAINT fk_food_restaurant FOREIGN KEY (restaurant_id) REFERENCES restaurant(id));

commit;