select name from salesPerson
where name not in ( select sp.name 
        from salesperson sp
        inner join orders o
        on sp.sales_id = o.sales_id
        inner join company c
        on o.com_id = c.com_id
        where c.name = "RED"
        );