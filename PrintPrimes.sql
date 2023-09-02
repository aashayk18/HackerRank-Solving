with 
    recursive AllNumbers(n) as 
            (select 1 
            union all 
            select n+1 
            from allNumbers 
            where n<1000)
select group_concat(Num.n separator '&') from AllNumbers Num
where not exists
        (select n from AllNumbers FactorsOfNum 
        where FactorsOfNum.n>1 and FactorsOfNum.n<Num.n and Num.n%FactorsOfNum.n=0) 
        and Num.n>1;