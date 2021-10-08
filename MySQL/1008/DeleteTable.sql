-- 테이블 데이터 삭제

create table emp_temp2 (select * from emp);

delete from emp_temp2
where job = 'MANAGER';

select * from emp_temp2;