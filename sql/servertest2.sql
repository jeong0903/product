select * from product;


insert into product (product_id, pname, quantity, price)
values (product_seq.nextVal, '테스트상품', 10, 10000);

commit;