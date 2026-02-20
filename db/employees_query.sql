--1
SELECT name, position
FROM sparta_employees;

--2
select distinct position
from sparta_employees;

--3
select *
from sparta_employees
where salary between 40000 and 60000;

--4
select *
from sparta_employees
where hire_date < '2023-01-01';
