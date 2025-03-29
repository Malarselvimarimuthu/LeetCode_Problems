# Write your MySQL query statement below
SELECT S.user_id , ROUND(IF(COUNT(C.user_id)=0,0,AVG(C.action = 'confirmed')) ,2) AS confirmation_rate 
FROM Signups S LEFT JOIN Confirmations C 
ON S.user_id = C.user_id
GROUP BY S.user_id;

