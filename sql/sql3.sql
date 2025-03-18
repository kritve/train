
use sql_concepts;


create table sql_concepts.EmployeeRecords(
empid int not null,
name varchar(20) not null,
role varchar(20) default null,
city varchar(20),
country varchar(20),
primary key(empid));

DELIMITER //;
create procedure sql_concepts.EmployeeRecords(
in in_id int,
in in_name varchar(20),
in in_role varchar(20),
in in_city varchar(20),
in in_country varchar(20),
out out_result varchar(25))
begin
	insert into sql_concepts.EmployeeRecords( empid, name, role, city, country) values
    (in_id, in_name, in_role, in_city, in_country);
    commit;
    set out_result:= 'TRUE';
END;





