# Write your MySQL query statement below

Select name as Customers from customers where id NOT IN (select customerId from orders);
