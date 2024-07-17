-- select a.employee_id  , a.name , count(a.reports_to) , avg(a.age)
-- from employees a 
-- join employees b on a.employee_id = b.employee_id 
-- where a.employee_id = b.reports_to


SELECT b.employee_id, b.name, COUNT(a.employee_id) as reports_count, round(AVG(a.age)) as average_age
FROM employees a
JOIN employees b ON a.reports_to = b.employee_id
GROUP BY b.employee_id, b.name
order by b.employee_id asc