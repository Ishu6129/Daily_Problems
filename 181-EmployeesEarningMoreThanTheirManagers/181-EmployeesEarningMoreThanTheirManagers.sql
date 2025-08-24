-- Last updated: 24/08/2025, 22:49:12
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m ON e.managerId = m.id
WHERE e.salary>m.salary;