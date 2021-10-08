-- 테이블 데이터 삭제

create table emp_temp2 (select * from emp);

delete from emp_temp2
where job = 'MANAGER';

select * from emp_temp2;

delete from emp_temp2
where empno in 
(select emp.empno from emp 
join salgrade on emp.sal between salgrade.losal and salgrade.hisal 
and salgrade.grade = 3 
and deptno = 30);

select * from emp_temp2;