# ------------------ 문자열 함수 -------------------
# CONCAT : 두 문자열 데이터를 합치기
# TRIM, LTRIM, RTRIM : 특정 문자열 지우기 ( LTRIM : 왼쪽 공백 제거 / RTRIM : 오른쪽 공백 제거 ) 142p

# ------------------ 숫자 함수 -------------------
# ROUND					: 반올림
# CEILING				: 올림
# ABS					: 절댓값
# FLOOR					: 버림
# TRUNCATE(숫자, 자릿수)	: 소숫점 자릿수버림
# POW					: 제곱
# MOD					: 나머지
# format(num, 0)		: num을 3자리수마다 , 를 이용해 출력

# ------------------ 날짜 함수 -------------------
# SYSDATE : 현재 날짜 출력 >> 연산할때마다 계속 초기화됨
# NOW : 현재 날짜 출력 >> 한번 입력해놓으면 고정됨
# DATE_ADD(날짜, INTERVAL) : 입력 날짜에 INTERVAL num 만큼 더한 것 출력
# DATE_SUB(날짜, INTERVAL) : 입력 날짜에 INTERVAL num 만큼 뺀것 출력
# DATEDIFF(날짜1, 날짜2) : 단순 일수차이
# TIMESTAMPDIFF(단위, 날짜1, 날짜2) : 입력 단위별로 날짜의 차이. second, minute, hour, day, week, month, year
# DATE_FORMAT(날짜, 형식) : 날짜를 내가 지정한 형식으로 출력
# QUATER : 분기 구하기

# ------------------ 논리 함수 -------------------
# COALESCE(A,'A의값이 없는 경우의 값') : null 값이면 뒤의 매개변수로 값을 변경
# IFNULL(A,''A의값이 없는 경우의 값') : null 값이면 뒤의 매개변수로 값을 변경


# ****** IF 문 *******
# if(조건, '조건이 충족될 시 출력되는 구문', '조건이 거짓일 경우 출력되는 구문')
# ****** CASE 문 *******
# case when 조건 then 결과 end from 테이블;



# CONCAT
select ename from emp where ename = 'SMITH';
select concat(empno, ename) as result from emp where ename = 'SMITH';
select concat(empno, ':', ename) as result2 from emp where ename = 'SMITH';

# TRIM 공백제거
select concat('[','  MySQL  ',']') as before_, concat('[',trim('  MySQL  '),']') as after_ from dual;
select concat('[','  MySQL  ',']') as before_1, concat('[',ltrim('  MySQL  '),']') as after_1 from dual;
select concat('[','  MySQL  ',']') as before_2, concat('[',rtrim('  MySQL  '),']') as after_2 from dual;
# TRIM 문자열 제거
select concat('[','__MySQL__',']') as before_3, concat('[',trim('_' from '__MySQL__'),']') as after_3 from dual;
select concat('[','__MySQL__',']') as before_3, concat('[',trim(leading '_' from '__MySQL__'),']') as after_3 from dual;


# ROUND 반올림
select round(1234.5678), round(1234.5678, 0), round(1234.5678, 1), round(1234.5678, -1) from dual;

# TRUNCATE 소숫점 자릿수 버림
select truncate(1234.5678,0), truncate(1234.5678,1), truncate(1234.5678,-1) from dual;

# CEILING 올림
select ceil(3.141592), ceil(-3.14) from dual;

# FLOOR 버림
select floor(3.14), floor(-3.14) from dual;

# MOD 나머지
select mod(10, 5), mod(11, 5) from dual;

# SYSDATE 현재날짜
select sysdate() from dual;

# NOW 현재날짜 
select now() from dual;

# DATE_ADD 날짜 더하기
select date_add(now(), interval 1 month) from dual;

# DATEDIFF 날짜 차이구하기
select empno, ename, hiredate, sysdate(), datediff(now(), hiredate)  from emp;

# TIMESTAMPDIFF 기준별 날짜 차이 구하기
select empno, ename, hiredate, sysdate(), timestampdiff( month ,now(), hiredate)  from emp;

# DATE_FORMAT 지정형식으로 날짜 출력하기
select date_format(sysdate(), '%Y/%m/%d/%H/%i/%s') from dual;
select date_format(sysdate(), '%a') from dual;
# 분기함수 지정 날짜 분기 출력하기
select quarter(sysdate()) from dual;

# 금액을 구할때 단위를 입력해주는 함수
select sal, concat(format(sal, 0),'$') from emp;

select *
from emp
where hiredate > '1981-06-01'
order by hiredate;

# IFNULL null값이라면 다른값으로 치환하기
select ename, comm, ifnull(comm, 0) from emp;
# avg함수의 경우 null 값은 제외하고 구하기 때문에 이 경우 분모는 4가 됨.
select avg(comm) from emp; 
# 따라서 null값도 0으로 보고 계산을 해야하는 경우 ifnull을 사용
select avg(comm) ,avg(ifnull(comm,0)) from emp;

# IF 삼항 연산자와 비슷
select ename, deptno, if(deptno = 30, deptno, -1) as dept from emp;

# IF 중첩 가능 >> else if 와 비슷
select ename, deptno, if(deptno = 30, deptno, if(deptno = 20, deptno, -1)) as dept2 from emp;

# 다중조건문은 case 사용
select empno, ename, job, sal,
	case 
		when job = 'MANAGER' then sal*1.1
		when job = 'SALESMAN' then sal*1.05
		when job = 'ANALYST' then sal
		else sal*1.03
	end as after_sal
from emp;

# CASE의 경우 비교연산자도 사용가능
select empno, ename, comm, sal,
	case
		when comm is null then '해당사항없음'
        when comm = 0 then '수당없음'
        when comm > 0 then concat('수당 : ', comm+sal)
	end as after_sal
from emp;







