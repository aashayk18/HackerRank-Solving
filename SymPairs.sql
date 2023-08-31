with F(sno,x,y) as (select row_number() over(order by x),Functions.* from Functions)
select f1.x,f1.y from F f1 inner join F f2 on f1.sno<f2.sno and f1.x=f2.y and f2.x=f1.y
where f1.x<=f1.y
order by f1.x;