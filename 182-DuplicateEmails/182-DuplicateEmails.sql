-- Last updated: 09/08/2025, 01:08:17
SELECT email AS "Email"
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;
