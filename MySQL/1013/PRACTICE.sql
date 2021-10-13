with temp as (
	select 'M' GENDER from dual union all
    select 'F' GENDER from dual union all
    select 'X' GENDER from dual
)
select GENDER, (case GENDER when 'M' then '남' when 'F' then '여' when 'X' then '' end) result from temp;

------------------------------------------------------------------------------------

select ename, deptno, (case deptno when '10' then 'NEW YORK'  when '20' then 'DALLAS' else 'NONE' end) LOC
from emp
where empno in('7839', '7566', '7499')
order by deptno;

------------------------------------------------------------------------------------


select ename, comm, if(comm is null, 'N', 'Y')
from emp
where empno in('7839', '7566', '7499');


------------------------------------------------------------------------------------

select ename, job, 
(case job when 'CLERK' then (case mgr when '7788' then 'SCOTT'
									 when '7698' then 'BLAKE'
                                     when '7782' then 'CLARK' end)
		 when 'ANALYST' then (case mgr when '7566' then 'JONES'
									   when '7698' then 'BLAKE' end) end) MANAGER
from emp
where empno in('7876', '7900', '7934', '7902', '7788')
order by job, empno;

------------------------------------------------------------------------------------


select sum(if(date_format(hiredate, '%m') = '01', 1, 0)) '1월',
	   sum(if(date_format(hiredate, '%m') = '02', 1, 0)) '2월',
       sum(if(date_format(hiredate, '%m') = '03', 1, 0)) '3월',
       sum(if(date_format(hiredate, '%m') = '04', 1, 0)) '4월',
       sum(if(date_format(hiredate, '%m') = '05', 1, 0)) '5월',
       sum(if(date_format(hiredate, '%m') = '06', 1, 0)) '6월',
       sum(if(date_format(hiredate, '%m') = '07', 1, 0)) '7월',
       sum(if(date_format(hiredate, '%m') = '08', 1, 0)) '8월',
       sum(if(date_format(hiredate, '%m') = '09', 1, 0)) '9월',
       sum(if(date_format(hiredate, '%m') = '10', 1, 0)) '10월',
       sum(if(date_format(hiredate, '%m') = '11', 1, 0)) '11월',
       sum(if(date_format(hiredate, '%m') = '12', 1, 0)) '12월'
from emp;
       



