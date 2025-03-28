# Write your MySQL query statement below
SELECT Tod.id as Id 
FROM Weather Yes 
CROSS JOIN Weather Tod 
WHERE DATEDIFF(Tod.recordDate,Yes.recordDate) = 1 
AND Yes.temperature < Tod.temperature;