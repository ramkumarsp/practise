//Query to get the nth max salary in a table
select *,
ROW_NUMBER() over (order by salary) ROW_NUMBER,
RANK() over (order by salary) RANK,
DENSE_RANK() over (order by salary) DENSE_RANK
from employee
order by employee.salary
where DENSE_RANK = n;

//get the list of buyer_id with total wprth more than 100 and having more than 1 house_id
select h.buyer_id as BUYER_ID, SUM(p.price) as TOTAL_WORTH from house h join price p on h.house_id = p.house_id
group by h.buyer_id having COUNT(h.house_id) > AND TOTAL_WORTH > 100;

//given tables people(id, name, gender) and relation table(c_id, p_id) then print in a table like result (child, father, mother)
select c.name child,
MAX(CASE WHEN p.gender = 'M' THEN p.name END) father,
MAX(CASE WHEN p.gender = 'F' THEN p.name END) mother
FROM relation r
INNER JOIN people c ON c.id = r.c_id
INNER JOIN people p ON p.id - r.p_id
GROUP BY r.c_id, c.name;