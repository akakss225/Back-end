-- 데이터 정의어를 사용할 때 기본이 AUTO COMMIT.
-- 즉, create를 하면서 자동으로 COMMIT이 된다. >> 현재 트랜잭션이 종료됨을 의미 >> 수정하려고 rollback하면 앞선 과정이 전부 rollback될 수 있음.
-- 따라서 create전에 commit 혹은 rollback을 해야한다. >> 확인하는 과정




-- ****************** DDL ( Create / Alter / Drop ) ********************
-- 12
create table emp_ddl (
	EMPNO int,
    ENAME VARCHAR(10),
    JOB VARCHAR(9),
    MGR int,
    HIREDATE date,
    SAL int,
    COMM int,
    DEPTNO int
);

desc emp_ddl;

create table dept_ddl (select * from dept);


-- COLUMM추가 ADD
create table emp_alter (select * from emp);

alter table emp_alter
add HP varchar(20);

desc emp_alter;

-- MODIFY
alter table emp_alter
modify HP varchar(10);

desc emp_alter;

-- RENAME

alter table emp_alter
rename column hp to TEL;
desc emp_alter;


-- DROP
alter table emp_alter
drop TEL;

desc emp_alter;
