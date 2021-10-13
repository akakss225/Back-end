PL/SQL 구조

procedure(프로시저) : 절차. 실행문을 여러개 묶어놓은 것

stored procedure : procedure를 db서버에 저장한 것. 함수와 유사.

PL/SQL은 오라클 문법임.

블록
: PL/SQL 프로그램의 기본단위
>> DECLARE(선언부) : 실행에 사용될 변수 상수 커서 등을 선언
>> BEGIN(실행부) : 조건문 반복문 SELECT DML 함수등을 정의
>> EXCEPTION(예외 처리부) : PL/SQL 실행 도중 발생하는 오류를 해결하는 문장

조건문
1. IF-THEN-END IF
2. IF-THEN-ELSE-END IF
3. IF-THEN-ELSEIF-THEN-ELSE-END IF

반복문
1. [loop_name]:LOOP-LEAVE [loop_name] - END LOOP
2. [whlie_name]:WHILE [조건] DO - ITERATE [while_name](뒤까지 안하고 다시 앞으로) - END WHILE
3. [repeat_name]:REPEAT - LEAVE [repeat_name] - END REPEAT



-- 프로시저 기본 생성
-- delimiter >> 프로시저 내부에 세미콜론(;)이 많기 때문에 이를 허용하기 위한 문법
delimiter $$
drop procedure if exists test_pro;
create procedure test_pro()
begin
	declare result varchar(20);
    set result = 'Hello world';
    select result;
end$$
delimiter ;
call test_pro;


delimiter $$
drop procedure if exists test_pro2;
create procedure test_pro2()
begin
	declare result dept.deptno%type;
    set result = 50;
    select result;
end$$
delimiter ;
call test_pro2;


-- IF-THEN-ELSE-END IF
delimiter $$
drop procedure if exists test_pro3;
create procedure test_pro3()
begin
	declare result int default 87;
    declare answer char(1);
    if result > 90 then
			set answer = 'A';
		elseif result > 80 then
			set answer = 'B';
		elseif result > 70 then
			set answer = 'C';
		else 
			set answer = 'D';
	end if;
	select answer
end $$
delimiter ;
call test_pro3;

-- 반복문
DELIMITER $$
DROP PROCEDURE IF EXISTS repeat_test $$
CREATE PROCEDURE repeat_test(IN var INT)
BEGIN
    DECLARE nCnt INT DEFAULT 0;
    DECLARE nTot INT DEFAULT 0; 
    repeat_xxxx:REPEAT
        SET nCnt = nCnt + 1;     
        SET nTot = nTot + nCnt;        
        IF (nCnt >= 5) THEN
            LEAVE repeat_xxxx; -- 반복문 탈출
        END IF; 
 
        UNTIL nCnt >= var -- 주의 조건이 참이면 반복문 완료 (문장완료를 알리는 ';' 없음)
    END REPEAT;
 
    SELECT CONCAT(CONCAT(CONCAT('1 부터 ', nCnt), ' 까지의 합은 '), nTot) AS total;
END $$
DELIMITER ;

call repeat_test(10);