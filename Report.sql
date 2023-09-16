(select s.name,g.grade,s.marks from students s join grades g on s.marks>=g.min_mark and s.marks<=g.max_mark
where grade >=8 )
union 
(select  'NULL', g.grade,s.marks from students s join grades g on s.marks>=g.min_mark and s.marks<=g.max_mark
where grade < 8 )
order by grade desc, name asc, marks asc;