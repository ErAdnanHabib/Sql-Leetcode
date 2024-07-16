SELECT MAX(num) AS num
FROM(
    select num from mynumbers
    group by num having count(num) = 1
) as faltu
