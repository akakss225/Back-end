create table member(
	id varchar(50) primary key,
    name varchar(50) not null
);

insert into member values('hkd', '홍길동');


create table orders(
	ono varchar(10) primary key,
    id varchar(50) not null,
    gName varchar(10) not null,
    ea int not null
);

insert into orders values("2021000001", "hkd", "새우깡", 1);

select * from orders;

select *
from orders
left join member on orders.id = member.id;