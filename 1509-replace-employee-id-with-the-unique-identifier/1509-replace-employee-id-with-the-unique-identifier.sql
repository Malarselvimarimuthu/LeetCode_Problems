# Write your MySQL query statement below
SELECT E.unique_id , T.name FROM Employees T LEFT JOIN EmployeeUNI E
ON E.id = T.id;