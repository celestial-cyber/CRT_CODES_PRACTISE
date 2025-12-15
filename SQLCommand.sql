select * from <tablename>;
--to retrive name that starts with a letter or ends with an alphabet
select * from <tablename> where name like "j%" or "%j";

--DATE 09 DECEMBER 2025
/*---------------------------------------------------
1. Retrieve all records from the Students table.
---------------------------------------------------*/
SELECT * FROM Students;


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
