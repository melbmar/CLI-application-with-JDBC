-- This Script is create to hold the user username/password from P0
-- Data Definition Language (DDL): create, alter, truncate, drop.


-- Create Customer table that we have the information of the Customer
CREATE TABLE customer (
customer_id serial PRIMARY KEY,
first_name TEXT,
second_name TEXT,
email TEXT,
address TEXT

);

-- Insert values to customer table
INSERT INTO customer (first_name, second_name, email, address)
VALUES ('Martha', 'Sanz', 'Sanz@gmail.com', '35 Street, NY'),
	   ('Joseph', 'Pineda', 'Pineda@gmail.com', '145 Street, NJ'), 
	   ('Josephine', 'Chist', 'C@gmail.com', '123 Jake street');
	  
SELECT * FROM customer;


-- Create Shop table that we have information about the product that we have ecommerce.
CREATE TABLE shop (
shop_id serial PRIMARY KEY,
brands_type TEXT,
color_name TEXT,
size_number int

);


-- Insert values to shop table
INSERT INTO shop (brands_type, color_name, size_number)
VALUES ('Canvas Platform Chuck Taylor All Star','White', 7),
       ('EraCore Classics','Black', 6),
       ('Women Disruptor 2 Wedge','Pink', 8);

SELECT * FROM shop; 

-- Create Item table that we have information about the product that we have ecommerce.
-- Create item table that we have information about the item then will have relationship
-- By using foreign key to make the relationship with id.
CREATE TABLE items (
items_id serial PRIMARY KEY,
brands_name TEXT,
price NUMERIC(5,2), -- Used NUMERIC TO store decimal VALUES en that COLUMN.
shop_id_fk int REFERENCES shop (shop_id) --foreign key: establishes a relationship between the tables

);

INSERT INTO items(brands_name, price)
VALUES ('Converse', 50.00),
       ('Vanz', 45.00),
       ('Fila', 101.00);

SELECT * FROM itmes;

-- Create user table that will hold the customer(user) and password, incluide their firts and second names.
CREATE TABLE users(
user_id serial PRIMARY KEY,
username varchar (50) NOT null,
userpassword varchar (50) NOT NULL  ,
firts_name TEXT,
second_name TEXT 

);


	  