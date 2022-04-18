
-- This Script is create to hold the user username/password from P0
-- Data Definition Language (DDL): create, alter, truncate, drop.

-- Create user table that will hold the customer(user) and password, incluide their firts and second names.
CREATE TABLE users(
first_name TEXT,
second_name TEXT,
username varchar (50) NOT NULL,
userpassword varchar (50) NOT NULL 

);

-- Create Shop table that we have information about the product that we have ecommerce.
CREATE TABLE shop (
shop_id serial PRIMARY KEY,
brands_type TEXT,
color_name TEXT,
size_number int,
brands_name TEXT


);

-- Insert values to shop table
INSERT INTO shop (brands_type, color_name, size_number, brands_name)
VALUES ('Canvas Platform Chuck Taylor All Star','White', 7, 'Converse'),
       ('EraCore Classics','Black', 6, 'Vanz' ),
       ('Women Disruptor 2 Wedge','Pink', 8, 'Fila');

SELECT * FROM shop; 

-- Create Customer table that we have the information of the Customer
CREATE TABLE customer (
customer_id serial PRIMARY KEY,
first_name TEXT,
second_name TEXT,
email TEXT,
address TEXT,
shop_id_fk int REFERENCES shop (shop_id)

);

-- Insert values to customer table
INSERT INTO customer (first_name, second_name, email, address)
VALUES ('Martha', 'Sanz', 'Sanz@gmail.com', '35 Street, NY' ),
	   ('Joseph', 'Pineda', 'Pineda@gmail.com', '145 Street, NJ'), 
	   ('Josephine', 'Chist', 'C@gmail.com', '123 Jake street');
	  
SELECT * FROM customer;






--INNER JOIN
--returns all records with matching data (from the PK/FK) in both tables
SELECT * FROM  customer INNER JOIN shop  ON shop_id = shop_id_fk ;










	  