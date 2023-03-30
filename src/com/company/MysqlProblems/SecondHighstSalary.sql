/* +-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| salary      | int  |
+-------------+------+
id is the primary key column for this table.
Each row of this table contains information about the salary of an employee.


Write an SQL query to report the second highest salary from the Employee table. If there is no second highest salary, the query should report null.

The query result format is in the following example. */


/* Example 1:

Input:
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
Output:
+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+
Example 2:

Input:
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
+----+--------+
Output:
+---------------------+
| SecondHighestSalary |
+---------------------+
| null                |
+---------------------+ */



-- SOLUTION --------------------------------------->>>>

select max(salary) as SecondHighestSalary
from  employee
where (
      salary != (select max(salary) from employee)
);
-- # 0.0002335


select max(e1.salary) as SecondHighestSalary
from  employee e1
where (
  e1.salary != (select max(e2.salary) from employee e2)
);
-- # 0.000244


SELECT max(E1.salary) AS SecondHighestSalary
FROM employee E1
WHERE E1.salary <> (SELECT max(E3.salary) FROM employee E3);
-- # 0.00027675
