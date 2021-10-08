-- 테이블에 데이터 추가하기
-- 테이블에 데이터를 추가하는 INSERT문
-- >> INSERT INTO 테이블이름 VALUES(열1 데이터, 열2 데이터, ...)

-- 테이블 복사방법
-- 1. 구조 + 데이터 복사
-- >> CREATE TABLE 테이블이름 (SELECT * FROM 기존테이블);
-- 2. 구조 복사
-- >> CREATE TABLE 테이블이름 like 기존테이블;
-- 3. 데이터 복사
-- >> INSERT INTO 데이터를 받을 테이블 (SELECT * FROM 기존테이블);

-- 데이터와 구조를 모두 복사하는 구문
create table dept_temp (select * from dept);

-- 복제한 테이블에 데이터 삽입
insert into dept_temp values(50, 'database', 'seoul'), (60, 'network', 'busan');

-- NULLABLE데이터 삽입
insert into dept_temp values(70, 'web', null);

-- NULLABLE데이터 삽입2
insert into dept_temp(deptno, dname) values(80, 'mobile');
