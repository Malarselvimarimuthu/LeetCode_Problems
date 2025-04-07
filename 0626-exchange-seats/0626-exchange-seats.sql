# Write your MySQL query statement below

SELECT id,
    COALESCE(
        CASE
            WHEN id%2 = 0 then LAG(STUDENT) OVER(ORDER BY id)
            ELSE LEAD(STUDENT) OVER(ORDER BY id) 
        END,
        student
    ) As Student
 From Seat;   