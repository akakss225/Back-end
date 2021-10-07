# 2. 전체회원수를 구하시오.
select count(*)
from member2;


# 3. 성별 회원수를 구하시오.
# 성별, 회원수
select gender, count(gender)
from member2
group by gender;

# 4. 가장 많이(갯수기준) 판매된 상품부터 출력하시오.
# 상품명 , 판매수량
select name, sum(ordersDetail.ea) as num
from goods
join ordersDetail on goods.gno = ordersDetail.gno
group by name
order by sum(ordersDetail.ea) desc;

-- 5. 주문내역을 출력하시오.
-- 회원명, 상품명, 주문갯수
select member2.name, goods.name as goods_name, ordersDetail.ea
from member2
join orders2 on member2.id = orders2.id
join ordersDetail on orders2.ono = ordersDetail.ono
join goods on ordersDetail.gno = goods.gno;

-- 6. 성이 '홍'인 회원을 검색하시오.
select member2.name as order_name, member2.id, goods.name as goods_name, ordersDetail.ea
from member2
join orders2 on member2.id = orders2.id
join ordersDetail on orders2.ono = ordersDetail.ono
join goods on ordersDetail.gno = goods.gno
where member2.name like "홍%";


-- 7. 년도, 상품별 판매수량을 구하시오.
-- 년도, 상품명, 판매갯수
select orders2.orderdate, goods.name, ordersDetail.ea
from orders2
join ordersDetail on orders2.ono = ordersDetail.ono
join goods on ordersDetail.gno = goods.gno;






