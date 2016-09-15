 --https://www.hackerrank.com/challenges/binary-search-tree-1

 --Binary Search Tree
select * from
(
	(select n,'Root' 
		from bst 
		where p is null)
	union
	(select n, 'Inner' 
		from bst 
		where n in 
			(select distinct(t1.n) 
				from bst as t1 
				inner join bst as t2 on t1.n = t2.p) 
		and p is not null)
	union
	(select n, 'Leaf' 
		from bst 
		where n not in 
			(select distinct(t1.n) 
				from bst as t1 
				inner join bst as t2 on t1.n = t2.p) 
		and p is not null)
)
order by n asc;
