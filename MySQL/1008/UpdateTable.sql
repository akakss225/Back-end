-- 테이블에있는 데이터 수정하기
-- UPDATE문

create table dept_temp2 (select * from dept);

-- WHERE없이 수정시, 모든 데이터 변경
update dept_temp2
set loc = 'SEOUL';

-- AUTOCOMMIT기능이 꺼져있을때 ROLLBACK;을 사용하여 되돌릴 수 있다.
