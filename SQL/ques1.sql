-- Ques 1 You are given two tables:

-- 1) employee_information
-- Contains employee details such as:
-- employee_id
-- name
-- department

-- 2) last_quarter_bonus
-- Contains bonus details:
-- employee_id
-- bonus

-- Task:
-- Print the employee_id and name of employees who:
-- 1. Work in the HR department
-- 2. Have received a bonus greater than or equal to 5000

SELECT e.employee_id, e.name
FROM employee_information e
JOIN last_quarter_bonus b
ON e.employee_id = b.employee_id
WHERE e.department = 'HR'
AND b.bonus >= 5000;


--- Ques 2 
SELECT stock_name, current_price, predicted_price
FROM stocks
WHERE predicted_price > current_price
ORDER BY predicted_price ASC;


---ques 3 

SELECT s.roll_number, s.name
FROM student_information s
JOIN examination_marks e
ON s.roll_number = e.roll_number
WHERE (e.subject_one + e.subject_two + e.subject_three) < 100;


--que 4 
