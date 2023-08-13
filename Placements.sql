SELECT ST.name
FROM Students AS ST JOIN Packages as P ON ST.id = P.id JOIN Friends as F ON ST.id = F.id JOIN Packages as PF ON F.Friend_id = PF.id WHERE P.Salary < PF.Salary ORDER BY PF.Salary