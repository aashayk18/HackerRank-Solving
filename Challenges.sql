with t1_cte as(
select c.hacker_id, h.name, count(distinct c.challenge_id) as challenge_count
from Challenges c left join Hackers h
on c.hacker_id = h.hacker_id
group by c.hacker_id, h.name
order by challenge_count desc, c.hacker_id
),

t2_cte as(
select t1.challenge_count,
case when count(t1.challenge_count)>1 and t1.challenge_count< (select max(challenge_count) from t1_cte)
then "False"
else "True"
end as Flag
from t1_cte as t1
group by t1.challenge_count
)

select t1.hacker_id, t1.name, t1.challenge_count 
from t1_cte t1 left join t2_cte t2 on t1.challenge_count = t2.challenge_count
where t2.Flag = "True";