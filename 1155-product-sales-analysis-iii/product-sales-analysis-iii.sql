SELECT product_id, MIN(year) as first_year, quantity, price
FROM sales
WHERE (product_id, year) IN (
    SELECT product_id, MIN(year)
    FROM sales
    GROUP BY product_id
)
GROUP BY product_id, quantity, price