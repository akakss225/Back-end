-- 데이터베이스를 위한 데이터를 저장한 데이터 사전

-- USER_ : 접속한 사용자가 소유한 객체 정보
-- ALL_ : 계정 권한이 있는 내용 조회 가능
-- DBA_ : DB의 모든 내용 조회 가능

-- MySQL INDEX 추가 삭제
-- 추가
-- ALTER TABLE table_name ADD INDEX index_name(standard);
-- 삭제
-- ALTER TABLE table_name DROP INDEX index_name;



-- 더 빠른 검색을 위한 INDEX
create index IDX_EMP_SAL on EMP(SAL);

-- 인덱스를 만들기 전에는 sal 이 800을 찾을때까지 full scan함.
-- but 인덱스가 있을때는 값을 가지고 range scan함.
select * 
from emp
where sal = 800;

-- 인덱스 삭제하는 방법
alter table emp drop index IDX_EMP_SAL;

