-- 테이블에 날짜 데이터 입력하기

-- EMP 테이블의 구조만 복사
create table emp_temp like emp;

desc emp_temp;

-- 날짜데이터를 직접 입력해서 추가하기
insert into emp_temp values(9999, '홍길동', 'PRESIDENT', null, '2001/01/01',null,null,null);

select * from emp_temp;

insert into emp_temp values(2111, '이순신', 'MANAGER', 9999, null ,4000,null,20);

-- select를 이용한 여러데이터 동시 삽입
insert into emp_temp
select emp.empno, emp.ename, emp.job, emp.mgr, emp.hiredate, emp.sal, emp.comm, emp.deptno
from emp
join salgrade on emp.sal between salgrade.losal and salgrade.hisal
and salgrade.grade = 1;

select * from emp_temp;
