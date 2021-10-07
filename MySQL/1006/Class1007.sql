# 피벗 기능 : 행/열을 바꿔서 출력
# JOIN : 두 테이블 사이에 공통된 columm을 이용해 연결하는 것. 굳이 같은 이름을 쓸 필요는없다. 다만 내부 값은 같아야한다.
# 등가조인(기본 INNER JOIN), 비등가조인, 자체조인(SELF JOIN), 외부조인(OUTER JOIN)

# ************ SUB QUERY ****************
# 매우 중요
# 메인쿼리의 조건식에 작성하는 쿼리를 뜻하며, 메인 쿼리이전에 서브쿼리가 먼저 실행이 된 후 메인쿼리가 실행된다.
# 주로 기존 테이블에서 조건을 추가한 테이블을 기준으로 명령을 실행시키기 위해 사용한다.
# 1. 단일행 서브쿼리 : 실행 결과가 하나인 서브쿼리
# 2. 다중행 서브쿼리 : 실행결과가 여러개의 행으로 나오는 서브쿼리 >> any / some / in / all 등과같은 연산자 사용


select deptno, job, max(sal)
from emp
group by deptno, job
order by deptno, job;

# ***************** 피벗 ****************** case문을 사용해서 구현함.
select deptno,
max(case when job = "CLERK" then sal end) as "CLERK",
max(case when job = "SALESMAN" then sal end) as "SALESMAN",
max(case when job = "PRESIDENT" then sal end) as "PRESIDENT",
max(case when job = "MANAGER" then sal end) as "MANAGER",
max(case when job = "ANALYST" then sal end) as "ANALYST"
from emp
group by deptno
order by deptno;
# 분기별 입사자 현황 피벗
select
count(case when quarter(hiredate) = 1 then empno end) as "1",
count(case when quarter(hiredate) = 2 then empno end) as "2",
count(case when quarter(hiredate) = 3 then empno end) as "3",
count(case when quarter(hiredate) = 4 then empno end) as "4"
from emp;

# LEFT JOIN
select emp.empno, emp.ename, emp.deptno, dept.dname
from emp
left join dept on emp.deptno = dept.deptno
order by emp.deptno;

# 비등가 JOIN
select emp.empno, emp.ename, emp.sal, salgrade.grade
from emp
left join salgrade on emp.sal between salgrade.losal and salgrade.hisal;

# SELF JOIN
select e1.empno, e1.ename, e1.mgr, e2.empno as MGR_EMPNO, e2.ename as MGR_ENAME
from emp e1
left join emp e2 on e1.mgr = e2.empno;

# FULL OUTER JOIN >> MySQL에선 LEFT JOIN 과 RIGHT JOIN 의 UNION으로 구함.
select *
from emp
left join salgrade on emp.sal between salgrade.losal and salgrade.hisal
union
select *
from emp
right join salgrade on emp.sal between salgrade.losal and salgrade.hisal;

# 테이블 3개 INNER JOIN
select orders.ono, member.id, member.name, goods.gname, orders.ea
from member join orders on member.id = orders.id
join goods on orders.gno = goods.gno;

# 테이블 3개 OUTER JOIN
select orders.ono, member.id, member.name, goods.gname, orders.ea
from orders left join member on orders.id = member.id
left join goods on orders.gno = goods.gno
union
select orders.ono, member.id, member.name, goods.gname, orders.ea
from orders right join member on orders.id = member.id
right join goods on orders.gno = goods.gno;


select orders.ono, orders.id, goods.gname, orders.ea
from orders
right join goods on orders.gno = goods.gno;




# SUB QUERY
select *
from emp
where sal in (select max(sal)
				from emp
			group by deptno);

# 단일행 서브쿼리
select *
from emp
where sal = (select max(sal)
				from emp
			where deptno = 10)
and deptno = 10;

select *
from emp
where sal > (
	select avg(sal)
	from emp
);

# 다중행 서브쿼리 >> in / any / some / all 등을 사용. 주로 in을 많이 사용.
# in
select *
from emp
where sal in (
	select max(sal)
    from emp
    group by deptno
);
# any >> 조건중 하나라도 만족하면 됨.
select *
from emp
where sal = any(
	select max(sal)
    from emp
    group by deptno
);
# some >> any와 같음
select *
from emp
where sal = some(
	select max(sal)
    from emp
    group by deptno
);

select *
from emp
where sal < any(
	select sal
    from emp
    where deptno = 30
)
order by sal, empno;

# all >> 모든 조건을 만족해야함
select *
from emp
where sal < all(
	select sal
    from emp
    where deptno = 30
)
order by sal, empno;

# 다중열 서브쿼리
select *
from emp
where (deptno, sal) in (
	select deptno, max(sal)
	from emp
    group by deptno
)
order by deptno;

# FROM절 서브쿼리(inline view) >> 가상의 테이블을 만들어 사용
select e10.empno, e10.ename, e10.deptno, d.dname, d.loc
from (select * from emp where deptno = 10) e10
join dept d on e10.deptno = d.deptno;

select emp.*
from (select deptno, max(sal) from emp group by deptno) t1
join dept d on t1.deptno = d.deptno;













