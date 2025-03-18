create or replace procedure print_message
is
begin
    dbms_output.put_line('hi pl/sql');
end print_message;
/
set SERVEROUTPUT on size 30000;
execute print_message;

BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE employees';
EXCEPTION
    WHEN OTHERS THEN
        IF SQLCODE = -942 THEN
            NULL; -- Table does not exist, do nothing
        ELSE
            RAISE;
        END IF;
END;
/



BEGIN
    EXECUTE IMMEDIATE 'Create table employees(
        employee_id number(10) primary key,
        first_name varchar2(50),
        last_name varchar2(50),
        performance_rating number(10),
        salary number(10),
        department_id number(10),
        bonus number(10)
    )';
END;
/

BEGIN
    EXECUTE IMMEDIATE 'INSERT INTO employees (employee_id, first_name, last_name, performance_rating, salary, department_id, bonus) VALUES (6, ''John'', ''Doe'', 10, 50000, 101, 12500)';
    EXECUTE IMMEDIATE 'INSERT INTO employees (employee_id, first_name, last_name, performance_rating, salary, department_id, bonus) VALUES (7, ''Jane'', ''Smith'', 7, 45000, 102, 11250)';
    EXECUTE IMMEDIATE 'INSERT INTO employees (employee_id, first_name, last_name, performance_rating, salary, department_id, bonus) VALUES (8, ''Alice'', ''Johnson'', 5, 40000, 103, 10000)';
    EXECUTE IMMEDIATE 'INSERT INTO employees (employee_id, first_name, last_name, performance_rating, salary, department_id, bonus) VALUES (9, ''Bob'', ''Brown'', 4, 55000, 104, 13750)';
    EXECUTE IMMEDIATE 'INSERT INTO employees (employee_id, first_name, last_name, performance_rating, salary, department_id, bonus) VALUES (10, ''Charlie'', ''Davis'', 2, 35000, 105, 8750)';
END;
/



DECLARE
    CURSOR emp_cur IS
        SELECT * from employees
        where salary > 5000;
    emp_rec emp_cur%ROWTYPE;
BEGIN
    open emp_cur;
    loop
        fetch emp_cur into emp_rec;
        exit when emp_cur%NOTFOUND;
        dbms_output.put_line(emp_rec.employee_id || ' - ' || emp_rec.first_name
            || ' - ' || emp_rec.last_name || ' - ' || emp_rec.performance_rating
            || ' - ' || emp_rec.salary || ' - ' || emp_rec.department_id || ' - ' ||
            emp_rec.bonus);
    end loop;
    close emp_cur;
end;    

DECLARE
    name VARCHAR2(50) := 'Mike';
    salary NUMBER := 5001;
BEGIN
    INSERT INTO employees (employee_id, first_name, last_name, performance_rating, salary, department_id, bonus) 
    VALUES (12, name, 'XYZ', 6, salary, 50, 3);
    COMMIT;
END;
/


DECLARE
    dept_id NUMBER := 50;
    percent_increase NUMBER := 10;
BEGIN
    FOR emp IN (SELECT employee_id, salary FROM employees WHERE department_id = dept_id) LOOP
        UPDATE employees
        SET salary = emp.salary * (1 + percent_increase / 100)
        WHERE employee_id = emp.employee_id;
    END LOOP;
    COMMIT;
END;
/

SELECT * FROM employees;


DECLARE
    bonus_rate NUMBER := 1;
BEGIN
    FOR emp IN (SELECT employee_id, performance_rating, salary FROM employees) LOOP
        IF emp.performance_rating <= 4 THEN
            UPDATE employees 
            SET performance_rating=5
            WHERE employee_id = emp.employee_id;
        ELSE
            UPDATE employees 
            SET performance_rating=5
            WHERE employee_id = emp.employee_id;
        END IF;
    END LOOP;
    COMMIT;
END;
/


        








        