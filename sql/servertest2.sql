select * from product;


insert into product (product_id, pname, quantity, price)
values (product_seq.nextVal, '컴퓨터', 2, 10000);

commit;