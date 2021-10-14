-- 1. emp테이블에서 SAL을 10% 인상하는 Stored Procedure를 작성하시오.

delimiter $$
create procedure up_sal()
begin
	declare after_sal double default 0.1;
    select ename, sal, (sal +(sal*after_sal)) as Upgrade_SAL from emp;
end $$
delimiter ;

call up_sal;

-- 2. 1번에서 인상률을 parameter로 변경해서 stored procedure를 작성하시오.

delimiter $$
drop procedure if exists up_sal;
create procedure up_sal(increase_rate double)
begin
	select ename, sal, (sal + (sal*increase_rate)) as Upgrade_SAL from emp;
end $$
delimiter ;

call up_sal(0.2);
