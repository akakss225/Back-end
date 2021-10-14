번외.

1. 상품테이블(재고)을 생성하시오.
	상품번호, 상품명, 가격, 재고량

create table GOODS(
	gNo char(7) primary key,
    gName varchar(10) not null,
    gPrice int not null,
    gStock int
);



2. 입고테이블을 생성하시오.
	입고번호, 상품번호, 입고량, 입고날짜

create table WAREHOUSING(
	iNo int primary key,
    gNo char(7) not null,
	iStock int,
    iDate datetime
);



3. 출고테이블을 생성하시오.
	출고번호, 상품번호, 출고량, 출고날짜

create table RELEASING(
	oNo int primary key,
    gNo char(7) not null,
    oStock int,
    oDate datetime
);



4. 1번테이블에 데이터를 5건이상 입력하시오.

insert into GOODS values('0000001', '냉장고', 1300000, 6);
insert into GOODS values('0000002', '컴퓨터', 500000, 2);
insert into GOODS values('0000003', '세탁기', 770000, 3);
insert into GOODS values('0000004', '정수기', 320000, 10);
insert into GOODS values('0000005', '청소기', 150000, 9);
insert into GOODS values('0000006', '건조기', 630000, 1);
insert into GOODS values('0000007', 'TV', 1000000, 6);

select * from goods;



5. 입고테이블에 데이터가 입력되면 재고 테이블을 업데이트 하는 트리거를 작성하시오.
	insert into 입고 ....
	update 재고 set 재고량=재고량+입고량 ...
	update jego set jegoea=jegoea+inputea
        where ...
힌트 :   :new테이블 사용

delimiter $$
create trigger update_item
after insert on WAREHOUSING
for each row
begin
	declare item_iNo int;
    declare item_gNo char(7);
    declare item_iStock int;
    
    set item_iNo = NEW.iNo;
    set item_gNo = NEW.gNo;
    set item_iStock = NEW.iStock;
    
    update GOODS set gStock = gStock + item_iStock where gNo = item_gNo;
    
end $$
delimiter ;
select * from GOODS;
show triggers;
insert into WAREHOUSING values(1, '0000001', 2, now());
select * from WAREHOUSING;

6. 출고테이블에 데이터가 입력되면 재고 테이블을 업데이트 하는 트리거를 작성하시오.
	insert into 출고 ....
	update 재고 set 재고량=재고량-출고량 ...
힌트 :  :new테이블 사용


delimiter $$
create trigger update_item2
after insert on RELEASING
for each row
begin
	declare item_oNo int;
    declare item_gNo char(7);
    declare item_oStock int;
    
    set item_oNo = NEW.oNo;
    set item_gNo = NEW.gNo;
    set item_oStock = NEW.oStock;
    
    update GOODS set gStock = gStock - item_oStock where gNo = item_gNo;
    
end $$
delimiter ;

select * from GOODS;
show triggers;
insert into RELEASING values(1, '0000001', 2, now());
select * from WAREHOUSING;


