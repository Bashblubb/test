--https://www.hackerrank.com/domains/sql/select/difficulty/all/page/1

--Weather Observation Station 5
(select city || ' ' || length(city) 
	from station 
	group by city 
	order by length(city) asc 
	fetch first row only) 
union 
(select city || ' ' || length(city) 
	from station 
	group by city 
	order by length(city) desc 
	fetch first row only);
	
	
--Weather Observation Station 6
select distinct(city) 
from station 
where substr(city,1,1) in ('A', 'E','I','O','U') 
 
 
 --Weather Observation Station 7
select distinct(city) 
from station 
where right(city, length(city) - length(city) +1) in ('a', 'e','i','o','u'); 

--Weather Observation Station 8
select distinct(city) 
from station 
where substr(city,1,1) in ('A', 'E','I','O','U') 
and 
right(city, length(city) - length(city) +1) in ('a', 'e','i','o','u');

--Weather Observation Station 9
select distinct(city) 
from station 
where substr(city,1,1) not in ('A', 'E','I','O','U'); 

--Weather Observation Station 10
select distinct(city) 
from station 
where right(city, length(city) - length(city) +1) not in ('a', 'e','i','o','u'); 

--Weather Observation Station 11
select distinct(city) 
from station 
where substr(city,1,1) not in ('A', 'E','I','O','U') 
or
right(city, length(city) - length(city) +1) not in ('a', 'e','i','o','u');

--Weather Observation Station 12
select distinct(city) 
from station 
where substr(city,1,1) not in ('A', 'E','I','O','U') 
and
right(city, length(city) - length(city) +1) not in ('a', 'e','i','o','u');

--Higher than 75 Marks
select name 
from students 
where marks > 75 
order by right(name, length(name) - length(name) +3) asc, id asc;
