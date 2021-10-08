-- with : 가상의 테이블을 미리 만드는 문법
-- 일반 서브쿼리 : 하위쿼리가 실행된 후 그 결과를 이용해서 상위쿼리 실행
-- 상호연관 서브쿼리 : 상위쿼리의 테이블의 한 행이 하위쿼리에 전달되서 수행.
-- selec절에 사용하는 서브쿼리


-- DB s/w 튜닝
-- 1. 쿼리튜닝
-- >> 기존 쿼리를 수정해서 더 빠른 실행이 가능하도록 변ㅕㅇ
-- 2. 인덱스튜닝
-- >> 인덱스를 생성해서 검색속도 향상
-- 3. 테이블 재설계
-- >> 테이블을 다시만들어서 검색속도 향상. 다만 비용이많이 듬(다른 소스코드를 다 바꿔줘야하기 때문)

-- Query Optimizer : 쿼리를 컴파일할 때 구문을 분석해서 최적화된 쿼리로 변경해서 실행





with e10 as (select * from emp where deptno = 10),
d as (select * from dept)
select e10.empno, e10.ename, e10.deptno, d.dname, d.loc
from e10, d
where e10.deptno = d.deptno;


-- 상호연관 서브쿼리
-- 바깥쪽 테이블과 안쪽 테이블이 서로 연관이 된다면, 이를 상호연관 서브쿼리라고 한다.
select *
from emp e1
where sal > (select min(sal) from emp e2 where e1.deptno = e2.deptno);

-- SELECT 절 서브쿼리 >> 일종의 JOIN과 비슷
select empno, ename, job, sal, (select grade from salgrade where emp.sal between losal and hisal) as salgrade,
deptno, (select dname from dept where emp.deptno = dept.deptno) as dname
from emp;

-- SELECT 절 서브쿼리보단 JOIN을 사용하는게 속도적으로 더 좋음
select emp.empno, emp.ename, emp.job, emp.sal, salgrade.grade, emp.deptno,  dept.dname
from emp
join dept on emp.deptno = dept.deptno
join salgrade on emp.sal between salgrade.losal and salgrade.hisal;






