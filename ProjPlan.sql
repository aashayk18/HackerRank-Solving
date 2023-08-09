with 
    T(sd1,ed1,sd2,ed2,sd3,ed3) as 
        (select 
            Yesterday.start_date, Yesterday.end_date, 
            Today.start_date, Today.end_date, 
            Tomorrow.start_date, Tomorrow.end_date 
        from 
            Projects Yesterday
            right join Projects Today on Yesterday.end_date = Today.start_date
            left join Projects Tomorrow on Today.end_date = Tomorrow.start_date),
    StartDate(projectNo,project_start_date) as (select row_number() over (order by sd2),sd2 from T where sd1 is null),
    EndDate(projectNo,project_end_date) as (select row_number() over (order by ed2), ed2 from T where sd3 is null)
select sd.project_start_date, ed.project_end_date from StartDate sd inner join EndDate ed on sd.projectNo=ed.projectNo
order by (ed.project_end_date-sd.project_start_date), sd.project_start_date;