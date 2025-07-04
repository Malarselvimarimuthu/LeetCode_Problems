# Write your MySQL query statement below
WITH temp AS(
    SELECT t.request_at AS 'Day', t.status
    FROM Trips AS t 
    JOIN Users AS u1 ON t.client_id = u1.users_id
    JOIN Users AS u2 ON t.driver_id = u2.users_id
    WHERE request_at BETWEEN '2013-10-01' AND '2013-10-03'AND u1.banned='No' AND u2.banned='No'
)

SELECT Day,
ROUND(SUM(CASE
    WHEN status!='completed' THEN 1
    ELSE 0
    END)/COUNT(*),2) AS 'Cancellation Rate'
FROM temp
GROUP BY Day
ORDER BY Day