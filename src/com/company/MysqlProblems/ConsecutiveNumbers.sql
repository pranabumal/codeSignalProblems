/*+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| num         | varchar |
+-------------+---------+
id is the primary key for this table.
id is an autoincrement column.


Write an SQL query to find all numbers that appear at least three times consecutively.

Return the result table in any order.

The query result format is in the following example.



Example 1:

Input:
Logs table:
+----+-----+
| id | num |
+----+-----+
| 1  | 1   |
| 2  | 1   |
| 3  | 1   |
| 4  | 2   |
| 5  | 1   |
| 6  | 2   |
| 7  | 2   |
+----+-----+
Output:
+-----------------+
| ConsecutiveNums |
+-----------------+
| 1               |
+-----------------+
Explanation: 1 is the only number that appears consecutively for at least three times.*/

-- SOLUTION --------------------------------------->>>>

SELECT DISTINCT l1.num AS ConsecutiveNums
FROM Logs l1
         JOIN Logs l2 ON l1.id = l2.id - 1
         JOIN Logs l3 ON l1.id = l3.id - 2
         JOIN Logs l4 ON l1.id = l4.id - 3
WHERE l1.num = l2.num AND l2.num = l3.num AND l3.num = l4.num;



select distinct Num as ConsecutiveNums
from Logs
where (Id + 1, Num) in (select * from Logs) and (Id + 2, Num) in (select * from Logs)
