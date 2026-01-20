select * from <tablename>;
--to retrive name that starts with a letter or ends with an alphabet
select * from <tablename> where name like "j%" or "%j";

--DATE 09 DECEMBER 2025
/*---------------------------------------------------
1. Retrieve all records from the Students table.
---------------------------------------------------*/
SELECT * FROM Students;


-----------------
DELETE FROM Employees
WHERE salary < (SELECT AVG(salary) FROM Employees);


DELETE FROM emp_details
WHERE emp_salary < (
    SELECT avg_salary
    FROM (
        SELECT AVG(emp_salary) AS avg_salary
        FROM emp_details
    ) AS t
);




ALTER TABLE students
DROP COLUMN department;



----------------------------------------------------
-- 2. Display RollNo and Name of all students.
----------------------------------------------------
SELECT RollNo, Name FROM Students;


----------------------------------------------------
-- 3. Display students whose name starts with 'A'
----------------------------------------------------
SELECT * FROM Students
WHERE Name LIKE 'A%';


----------------------------------------------------
-- 4. Retrieve students whose RollNo is between 101 and 110
----------------------------------------------------
SELECT * FROM Students
WHERE RollNo BETWEEN 101 AND 110;


----------------------------------------------------
-- 5. Display students from departments 'CSE' and 'ECE'
----------------------------------------------------
SELECT * FROM Students
WHERE Department IN ('CSE', 'ECE');


----------------------------------------------------
-- 6. Count the total number of students
----------------------------------------------------
SELECT COUNT(*) AS TotalStudents
FROM Students;


----------------------------------------------------
-- 7. Find the maximum marks scored by any student
----------------------------------------------------
SELECT MAX(Marks) AS MaxMarks
FROM Students;


----------------------------------------------------
-- 8. Calculate the average marks of students in each subject
----------------------------------------------------
SELECT Subject, AVG(Marks) AS AverageMarks
FROM Students
GROUP BY Subject;


----------------------------------------------------
-- 9. Retrieve subjects where average marks are greater than 60
----------------------------------------------------
SELECT Subject, AVG(Marks) AS AverageMarks
FROM Students
GROUP BY Subject
HAVING AVG(Marks) > 60;


----------------------------------------------------
-- 2. Display details of employees whose EmpId > 5
----------------------------------------------------
SELECT * FROM Employees
WHERE EmpId > 5;


----------------------------------------------------
-- 3. Retrieve all products with Price greater than 1000
----------------------------------------------------
SELECT * FROM Products
WHERE Price > 1000;


----------------------------------------------------
-- 4. Display students ordered by Name in ascending order
----------------------------------------------------
SELECT * FROM Students
ORDER BY Name ASC;

------------------------------------------------------------
--5. Update the exisiting column
--------------------------------------------------------------
UPDATE <table_name> SET column_name = value WHERE column_1 = value_1;

----example update employee set emp_name = "Sia" WHERE emp_id = 102;

---------------------------------------------------------------------
---6. to update all the rows at once
----------------------------------------------------------------------
update <table_name> set column_name = value;
update employee set salary = 23000;
update employee set salary = 50000 where emp_id in (102,104,106);

-----------------------------------------------------------------------
--7. to change specific things 
------------------------------------------------------------------------
update employee
    -> set salary = case emp_name
    -> when "john" then 23456
    -> when "Sia" then 100000
    -> END;


    --example 2 to change gender after inserting gender column name 
    alter table employee add gender varchar(5);
     update employee set gender = case emp_id
    -> when 101 then 'm'
    -> when 102 then 'f'
    -> when 103 then 'm'
    -> when 104 then 'f'
    -> when 105 then 'm'
    -> when 106 then 'f'
    -> end;

----- it will change only the specified value - remaining all values will be null - becasue database is 
----chnaged at once 

---------------------------------------------------------------------
----8. ALTER COMMAND 
----------------------------------------------------------------------
alter table <table_name> add <new_column> <new_datatype>;
alter table employee add gender varchar(5);

--------------------------------------------------------------------------
---9-to update the datatype 
---------------------------------------------------------------------------
alter table <table_name> modify column_name new_datatype;

alter table employee modify phone_numbers varchar(10);

 update employee set phone_numbers = case emp_id
    -> when 101 then 12345
    -> when 102 then 23456
    -> when 103 then 34567
    -> when 104 then 45678
    -> when 106 then 56789
    -> when 107 then 67890
    -> when 105 then 789901
    -> end;


    -----------------------------------------------------------------
-------DATE 15 DECEMBER 2025------------------------------------------
-- DELETE vs DROP in SQL
-- --------------------------------------------
-- DELETE:
-- - Removes rows (records) from a table.
-- - Works at the DATA level.
-- - Syntax: DELETE FROM table_name WHERE condition;
-- - Table structure remains intact.
-- - Can use WHERE to delete specific rows.
-- - If no WHERE is given, all rows are deleted but table still exists.
-- - Can be rolled back if inside a transaction.

-- DROP:
-- - Removes the entire database object (e.g., table, view, database).
-- - Works at the SCHEMA level.
-- - Syntax: DROP TABLE table_name;
-- - Deletes both the table structure and all its data permanently.
-- - Cannot use WHERE (no selective deletion).
-- - Once dropped, the table no longer exists unless recreated.
-- - Generally cannot be rolled back.

-- Quick Analogy:
-- DELETE = Emptying the contents of a box.
-- DROP   = Throwing the entire box away.
---------------------------------------------------------------------------
--------------15 DECEMBER 2025----------------------------------------------
----------------------------------------------------------------------------
---> To Update the table name 
ALTER TABLE table_name ADD new_col new_type;

--HOME WORK QUES--------------------
-- Add a new column 'email' of type VARCHAR(255) to an existing table
ALTER TABLE your_table_name
ADD COLUMN email VARCHAR(255);

-------change datatype--------------
ALTER TABLE your_table_name
MODIFY COLUMN phone INT;

-- The following SQL command modifies the 'salary' column in the 'employee' table:
-- 
-- alter table employee
--     modify column salary decimal(10,2);
--
-- Explanation:
-- DECIMAL(10,2) defines the precision and scale of the column:
--   - 10 → Precision: The total number of digits that can be stored (both before and after the decimal point).
--   - 2 → Scale: The number of digits allowed after the decimal point.
--
-- So, DECIMAL(10,2) means:
--   - Up to 10 digits in total.
--   - Out of those, 2 digits are reserved for the fractional (decimal) part.
--   - Example: Maximum value = 99999999.99 (8 digits before the decimal + 2 digits after).
--
-- This is commonly used for monetary values like salaries, where exact decimal representation is important.
-- Add a new column 'address' after the 'name' column in the employee table
ALTER TABLE employee
    ADD COLUMN address VARCHAR(255) AFTER name;

-- Explanation:
-- ADD COLUMN → introduces a new column to the table.
-- address VARCHAR(255) → creates the column named 'address' with a variable-length string data type,
--                        allowing up to 255 characters (you can adjust the size as needed).
-- AFTER name → ensures the new column is placed immediately after the 'name' column in the table structure.
-- The goal: Add a new column 'dept' at the very beginning of the 'employee' table.
-- 
-- Incorrect attempt:
-- alter table employee
--     add column dept varchar(10) first email;
--
-- Problem:
--   You cannot combine FIRST with another column name.
--   FIRST alone means "place this new column at the very start of the table."
--
-- ✅ Correct code using FIRST:
ALTER TABLE employee
    ADD COLUMN dept VARCHAR(10) FIRST;
   

   ----do not use "." in the name it will show error like to add sno use sno not sno.


-- Explanation:
-- ADD COLUMN dept VARCHAR(10) → Creates a new column named 'dept' that can store strings up to 10 characters.
-- FIRST → Places the new column 'dept' as the very first column in the table structure.
--
-- Note:
-- - Use AFTER <column_name> if you want to place the column after a specific existing column.
-- - Use FIRST if you want the new column to appear at the very beginning of the table.
------------------------------------------------------------------------------------------------------------
--- DATE 22 DECEMBER 2025 -----------------------------------------------------
---------------------------------------------------------------------------------------------------------
--- If we want to modify a place of the column 
--- we can use - 
Alter table empployee
modify column sno int first 


mysql>
mysql> ALTER TABLE employee
    ->     MODIFY emp_id INT NOT NULL AUTO_INCREMENT;
Query OK, 7 rows affected (0.33 sec)
Records: 7  Duplicates: 0  Warnings: 0

mysql> INSERT INTO employee (sno) VALUES (1),(2),(3),(4),(5),(6),(7);
Query OK, 7 rows affected (0.03 sec)
Records: 7  Duplicates: 0  Warnings: 0

--------------------------------------------------------------------------
---to rename the column name 
---------------------------------------
alter table <table_name> rename column <existing_Col> to <new_column>;

 alter table employee_details
    -> rename column phone_number to contact;

------rename tableName
alter table <table_name> rename table <table_name> to <new_name>

RENAME TABLE employee_details TO emp_details;

ALTER TABLE employee_details RENAME TO emp_details;

-------delete - to remove a specific row--------------------------
delete from <table_name> where condtion;
example delete from <table_name> where column_name = value1;


delete from employee_details
    -> where last_name is null; ---- it will remove total column where row value will be null


--------------------------------------------------------------------------------------------------------
-------29th December 2025 Monday ---------------------------------------------------
--to change the column name - syntax 
alter table <tablename> change <existing_col_name> <new_col_name> new_datatype;
mysql> alter table employee
    -> change emp_name empname varchar(20);
----to delete a specific row with a value 
mysql> delete from employee where emp_id = 107;
Query OK, 1 row affected (0.01 sec)


----to remove null values 
delet from table_name 
where column_name is null;


-------to delete all the rows at once-----------
delete from <table_name>;

-----------------to remove a column if to remove with "either" "or" condition
syntax - delete from table_name where column_name in (value1 , value2);
DELETE FROM employee
WHERE empname IN ('Priya', 'Kiran');

-------------------------------to remove databases-----------------------------------------------------
drop database <database_name>
drop table <table_name>
-------------------------------------------------------------------------------------------------------

---------------DATE 05TH JANUUARY 2026-------------------------------------------------------
--to remove a column using drop

alter table <tablename> drop column <column_name>;
--anything with drop will remve everything 


--constraints 
--1.primary key- should be unique - should not be null and the primary key of the table will be used only once or only one column 
--one primary key per the table 

-- Create student table with primary key
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);

-- Insert some values into student table
INSERT INTO student (id, name, age) VALUES (1, 'Alice', 20);
INSERT INTO student (id, name, age) VALUES (2, 'Bob', 21);
INSERT INTO student (id, name, age) VALUES (3, 'Charlie', 22);

-------UNIQUE CONSTRAINTS------------------
CREATE TABLE Emails (
    email VARCHAR(255) UNIQUE,
    name VARCHAR(100)
);



