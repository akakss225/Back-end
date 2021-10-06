# 다중행 함수 chapter.7

# 집계함수
# SUM : 합계
# COUNT : 데이터 갯수
# MAX : 최댓값
# MIN : 최솟값
# AVG : 평균값

# GROUP BY : 결과값을 원하는 열로 묶어서 출력

# ROLLUP : 함수형태로 생김.

# DB통계 / 분석 발전사
# 1. SQL
# 2. OLAP , DATA MINING
# 3. 빅테이터 처리기술



select sum(sal) from emp;
# 집계함수의 경우 null값을 빼고 계산하려는 경향이 있음. 즉, 안전하게 모든 행의 수를 구하기 위해서는 *를 넣는것이 가장 좋음
select count(*), avg(sal), max(sal), min(sal) from emp;

# union을 이용한 집계
select avg(sal), '10' as deptno from emp where deptno = 10
union all
select avg(sal), '20' as deptno from emp where deptno = 20
union all
select avg(sal), '30' as deptno from emp where deptno = 30;

# group by로 집계
select deptno, avg(sal), count(*), sum(sal), max(sal), min(sal)
from emp
group by deptno;

# GROUP BY 두개 이상 집계
select deptno, job, avg(sal), count(*), sum(sal), max(sal), min(sal)
from emp
group by deptno, job
order by deptno, job;

# GROUP BY에 조건을 달고싶을때 사용하는 HAVING. HAVING은 무조건 GROUP BY이후에 나온다. WHERE은 GROUP BY 이전에 나온다.
select deptno, avg(sal)
from emp
where sal > 1000
group by deptno
having avg(sal) > 2000
order by deptno;

# ROLLUP
select deptno, job, avg(sal), count(*), sum(sal), max(sal), min(sal)
from emp
group by deptno, job with rollup;

# GROUPING
select deptno, job, count(*), grouping(deptno)
from emp
group by deptno, job with rollup;

# 오라클 : LISTAGG / MySQL : GROUP_CONCAT
select deptno, group_concat(ename order by sal desc separator ', ') as ename
from emp
group by deptno;









