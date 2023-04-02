/*Table: Employee

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| salary      | int     |
| managerId   | int     |
+-------------+---------+
id is the primary key column for this table.
Each row of this table indicates the ID of an employee, their name, salary, and the ID of their manager.


Write an SQL query to find the employees who earn more than their managers.

Return the result table in any order.

The query result format is in the following example.



Example 1:

Input:
Employee table:
+----+-------+--------+-----------+
| id | name  | salary | managerId |
+----+-------+--------+-----------+
| 1  | Joe   | 70000  | 3         |
| 2  | Henry | 80000  | 4         |
| 3  | Sam   | 60000  | Null      |
| 4  | Max   | 90000  | Null      |
+----+-------+--------+-----------+
Output:
+----------+
| Employee |
+----------+
| Joe      |
+----------+
Explanation: Joe is the only employee who earns more than his manager.*/

-- SOLUTION --------------------------------------->>>>
select  e1.name as Employee, e1.salary as emSal , e2. name as managerName, e2.salary as maSal
    from
        employee e1
        left join employee e2 on e2.id=e1.managerId
where e1.managerId is not null and (e1.salary > e2.salary)
