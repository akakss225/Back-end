함수 >> 프로시저와 거의 비슷 but return이 있음

* 트리거란? *
: 데이터베이스 내 이벤트(insert, update, delete) 발생시 자동 실행될 기능을 정의한것
트리거 사용의 장점
>> 간편한 데이터 작업
>> 복잡한 데이터 규칙 정의
>> 보안성, 안정성을 위한 대처 활용

트리거는 행 트리거 / 문장 트리거로 나뉜다.
>> 행 트리거 : 조건을 만족하는 여러 행에 대해 트리거를 반복 실행하는 것
>> 문장 트리거 : 트리거를 설정한 테이블에서 이벤트가 발생했을 때 여러 행에 대해 트리거를 단 한번만 실행하는 것
트리거 속성
>> BEFORE / AFTER : 트리거가 실행되는 시기를 지정
>> INSTEAD OF : 트리거를 원래 문장 대신 수행
>> WHEN : 트리거를 시작하는 조건식을 지정
** 주의사항 **
: INSERT, UPDATE, DELETE 동작에 대한 트리거가 지원되는데 이때 주의할 점은 MySQL은 각 테이블에 각 형태의 단 하나의 트리거만 허용한다.

트리거에서 데이터가 저장되는 상태
		:old.    :new. 
insert	 X		  O
update	 O		  O
delete	 O		  X






-- 함수 생성 및 사용 권한을 주어야 사용할 수 있음!!!
SET GLOBAL log_bin_trust_function_creators='ON';

delimiter $$
create function func_aftertax(_sal double)
returns double
begin
	declare tax double default 0.05;
    return (round(_sal - (_sal*tax)));
end $$
delimiter ;

select ename, sal, func_aftertax(sal) as aftersal
from emp;

desc emp;



-- 트리거 예제 >> 아직 안함 이따 ㄱㄱ
create table emp_trg (select * from emp);
delimiter $$
create trigger trg_emp_weekend
before update on emp_trg
for each row
begin
	declare result varchar(10);
    
end $$
delimiter ;





