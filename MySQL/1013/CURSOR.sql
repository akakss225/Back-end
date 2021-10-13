CURSOR
: SQL문을 실행했을 때 해당 SQL문 처리 정보를 저장
: SELECT문의 결과를 행별로 특정 작업 수행
>> 행별로 반복작업을 수행할 때 사용한다.

SELECT INTO >> 조회되는 행이 하나일 때 사용하는 것. but 커서는 조회되는 행이 여러개일 때 사용.

명시적 커서
1. 커서 선언 declaration
2. 커서 열기 open
3. 커서에서 읽어온 데이터 사용 fetch >> data를 하나씩 읽어오는 것을 fetch라고 함.
4. 커서 닫기 close

묵시적 커서 (자동 생성 커서)
>> SQL문을 사용했을 때 자동으로 선언되는 커서
>> OPEN, FETCH, CLOSE 지정 없음
SQL%NOTFOUND / FOUND / ROWCOUNT / ISOPEN 사용가능 (ORACLE)


예외처리


-- Oracle Sever Cursor == Java JDBC ResultSet class


-- 예외처리
DELIMITER $$
drop procedure if exists pbj.exception_test;
CREATE PROCEDURE pbj_db.exception_test()
BEGIN
	DECLARE CONTINUE HANDLER FOR 1146
    SELECT 'ERROR!!!';
    INSERT INTO pbj_db.abcdefghijklmnop(datetime) (
    SELECT NOW()
    );
END $$
DELIMITER ;

call pbj_db.exception_test();




