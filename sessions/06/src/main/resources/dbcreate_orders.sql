CREATE DATABASE IF NOT EXISTS orders;
USE orders;
CREATE TABLE IF NOT EXISTS users (
       user_id int auto_increment,
       first_name varchar(50) not null,
       second_name varchar(50) not null,
       address varchar(100),
       email varchar(100),
       primary key(user_id)
);
CREATE TABLE IF NOT EXISTS products (
       product_id int auto_increment,
       product_name varchar(50) not null,
       description varchar(100),
       price decimal(15,2) not null,
       primary key(product_id)
);
CREATE TABLE IF NOT EXISTS orders (
       order_id int auto_increment,
       user_id int,
       product_id int,
       units int,
       total_paid decimal(15,2) not null,
       primary key(order_id),
       foreign key(user_id) references users(user_id),
       foreign key(product_id) references products(product_id)
);
