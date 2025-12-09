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