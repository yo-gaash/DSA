select name as Customers
from Customers
left join Orders 
on Customers.id = orders. customerId
where customerId is null;