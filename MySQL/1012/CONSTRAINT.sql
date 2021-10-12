뷰 : SELECT문을 저장한 객체.
>> 가상 테이블


뷰의 사용 목적
1. 편의성 : SELECT문의 복잡도 완화 >> 복잡한 JOIN을 단순화 하기 위해
2. 보안성 : 테이블의 일부 데이터만 노출

시퀀스 : 번호 생성기
>> 글 번호 자동생성. 중복되지않게 만들어준다.
>> 동시접속 충돌 방지

MySQL은 기본적으로 시퀀스기능을 지원하지 않음. 따라서 직접 만들어서 써야함
1. 시퀀스를 사용할 테이블 생성
2. 시퀀스를 생성할 프로시저 생성
3. 생성한 시퀀스의 다음값을 가져오는 함수 생성
4. 시퀀스를 생성할 프로시저 실행
5. 최종적으로 nextval사용

제약조건
>> NOT NULL			: 지정한 열에 NULL을 허용하지 않는다.
>> UNIQUE			: 지정한 열이 유일한 값을 가져야함. 즉 중복을 허용하지 않음. 단 NULL은 값의 중복에서 제외된다.
>> PRIMARY KEY		: 지정한 열이 유일한 값이면서 NULL을 허용하지 않는다. 이는 테이블에 하나만 지정할 수 있다.
>> FOREIGN KEY		: 다른 테이블의 열을 참조하여 존재하는 값만 입력할 수 있다.  RDB(관계형 데이터베이스)를 구체화 시켜주는 중요한 로직
>> CHECK			: 설정한 조건식을 만족하는 데이터만 입력 가능하다. Validation

PK를 만들 때 
1. 이름을 만든다
>> 이름이 배포시에 중복될 수 있음
>> 관리할 떄 이름을 이용해 빨리 찾을 수 있음
2. 이름을 안만든다
>> 이름이 배포시 중복되지 않는다
>> 관리할 때 이름을 찾기가 불편하다.

FOREIGN KEY(REFERENCE KEY)
>> 다른테이블의 기본키를 참조
>> 참조하고있는 키의 데이터와 NULL만 사용가능




-- VIEW생성
create view vw_emp20
as
select empno, ename, job, deptno
from emp
where deptno = 20;

select * from vw_emp20;

-- 세개의 테이블을 JOIN한 VIEW생성
create or replace view v_emp 
as
select emp.empno, emp.ename, dept.dname, emp.sal, salgrade.grade
from emp
join dept on emp.deptno = dept.deptno
join salgrade on emp.sal between salgrade.losal and salgrade.hisal;

select * from v_emp;


-- 휘발성 뷰. >> INLINE VIEW라고 하며, 이는 실행후 사라진다.
select *
from (
select emp.empno, emp.ename, dept.dname, emp.sal, salgrade.grade
from emp
join dept on emp.deptno = dept.deptno
join salgrade on emp.sal between salgrade.losal and salgrade.hisal
) e;

-- VIEW 삭제
drop view vw_emp20;


-- 페이징 처리를 할때 사용하는 >> 인라인 뷰를 사용한 TOP-N SQL문

select 
@rownum:=@rownum+1, e.* 
from emp e
where (@rownum:=0)=0;

-- 특정 정렬 기준으로 rownum을 다시 주는 방법 >> INLINE VIEW사용
set @rownum:=0;

select @rownum:=@rownum+1, e.*
from ( select *
	from emp
    order by sal desc) e
limit 4,6;

-- SEQUENCE
create table table_sequence(
	bno int auto_increment primary key,
    title varchar(50) not null,
    content varchar(1000) not null,
    id varchar(10) not null,
    wdate datetime default now() not null
);

insert into table_sequence values();



-- NOT NULL
create table table_notnull (
	login_id varchar(20) not null,
    login_pw varchar(20) not null,
    tel varchar(20)
);

insert into table_notnull values('TEST_ID_)!', '1234', '010-1234-5678');
-- 오류
insert into table_notnull values('TEST_ID_)!', null, '010-1234-5678');
insert into table_notnull values('TEST_ID_)!', '5678', null);

-- UNIQUE
create table TABLE_UNIQUE(
	LOGIN_ID varchar(20) unique,
    LOGIN_PW varchar(20) not null,
    TEL varchar(20)
);

insert into table_unique values('hkd', '1234', '010-1111-2222')	,
								('lss', '1234', '010-2222-3333');

-- PK >> 이름을 따로 안붙히면, 자동생성됨.
create table TABLE_PK(
	LOGIN_ID varchar(20) primary key,
    LOGIN_PW varchar(20) not null,
    TEL varchar(20) unique
);


-- FK
create table dept_fk(
	deptno int primary key,
    dname varchar(14),
    loc varchar(13)
);

create table emp_fk(
	empno int primary key,
    ename varchar(10),
    job varchar(9),
    mgr int,
    hiredate date,
    sal int,
    comm int,
    deptno int references dept_fk(deptno)
);

insert into dept_fk values(10, 'TEST_DNAME', 'TEST_LOC');

insert into emp_fk values(1, '홍길동', null, null, null, null ,null, 10);

insert into emp_fk values(2, '이순신', null, null, null, null ,null, 20);


select *
from dept_fk;

select *
from emp_fk;

-- FK로 참조행 데이터 삭제하기
-- ON DELETE CASCADE
-- 이를 설정 안해주면 FK로 설정된 테이블 두개에서 데이터 삭제가 일어나지 않는다.
-- ON DELETE SET NULL >> 삭제는 아니고 null값으로 만든다.


-- CHECK
create table TABLE_CHECK(
	LOGIN_ID varchar(20) primary key,
    LOGIN_PW varchar(20) check(length(LOGIN_PW) > 3),
    TEL varchar(20)
);

-- Passward 길이가 3 미만이기때문에 insert가 안됨.
insert into TABLE_CHECK values('hkd', '123', '010-1111-2222');

-- 정상 구문
insert into TABLE_CHECK values('hkd', '1234', '010-1111-2222');

select * from TABLE_CHECK;

-- DEFAULT
create table TABLE_DEFAULT(
	LOGIN_ID varchar(20) primary key,
    LOGIN_PW varchar(20) default '1234',
    TEL varchar(20)
);

insert into table_default values('TEST_ID', null, '010-1234-1234');
insert into table_default(LOGIN_ID, TEL) values('TEST_ID2' , '010-1234-1234');
select * from table_default;

