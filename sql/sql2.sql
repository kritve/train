create database sql_concepts;
use sql_concepts;


create database library08;
use library08;

create table books(
bookID int primary key auto_increment,
title varchar(255) not null,
author varchar(255),
publicationyear int,
genre varchar(50),
availablecopies int);

insert into books values(null,"","",2021,"",1);

create user 'root1'@'localhost' identified by 'password';
grant select, update, delete, insert on library08.books to 'root1'@'localhost';

select * from information_schema.user_privileges;

revoke delete on library08.books from 'root1'@'localhost';
show grants for 'root1'@'localhost';

create table customers(
customer_id int not null auto_increment,
name varchar(255) not null,
email varchar(255) not null,
primary key(customer_id));

insert into customers values(12,"q","q");
insert into customers values(13,"w","w");

start transaction;

update customers set name ="ABC XYZ"
where customer_id = 1;
commit;

select * from customer;

set autocommit =0;
update customers set name = "ABC PQR"
where customer_id =1;
rollback;

create table strangerthings(
id int primary key,
character_name varchar(255),
last_seen date,
next_appearance date,
location varchar(255));

insert into strangerthings values(1,'we','2024-11-01','2025-12-01','q');
insert into strangerthings values(2,'rt','2023-11-01','2023-12-01','q');


select character_name, datediff(next_appearance, last_seen) as days_until_next_appearance from strangerthings;
select character_name, dayofweek(next_appearance) as day_of_week from strangerthings;
select character_name, dayname(next_appearance) as day_of_week from strangerthings;
select character_name, dayofmonth(next_appearance) as day_of_week from strangerthings;
select character_name, dayofyear(next_appearance) as day_of_week from strangerthings;
select character_name, dayofyear(next_appearance),
if(dayofyear(next_appearance) = '1', 'Happy New Year!',
'Just another day...') as message from strangerthings;

select character_name, adddate(next_appearance, interval 1 day) as next_appearance_tomorrow from strangerthings;



DROP TABLE IF EXISTS employees;

create table employees(
id varchar(30) primary key,
name varchar(255),
email varchar(255),
password varchar(255),
salary decimal(10,2),
job_experience int);


DELIMITER //
CREATE TRIGGER adjust_salary_before_insert
BEFORE DELETE ON employees
FOR EACH ROW
BEGIN
    IF NEW.job_experience > 5 THEN
        SET NEW.salary = NEW.salary * 1.20;
    ELSE
        SET NEW.salary = NEW.salary * 1.10;
    END IF;
END;
DELIMITER ;


INSERT INTO employees (id, name, email, password, salary, job_experience) VALUES
('E001', 'Alice Johnson', 'alice.johnson@example.com', 'password123', 75000.00, 5),
('E002', 'Bob Smith', 'bob.smith@example.com', 'securepass456', 82000.00, 7),
('E003', 'Carol White', 'carol.white@example.com', 'mypassword789', 90000.00, 10),
('E004', 'David Brown', 'david.brown@example.com', 'passwordabc', 65000.00, 3),
('E005', 'Eve Davis', 'eve.davis@example.com', 'securepassxyz', 78000.00, 6);

select * from employees

