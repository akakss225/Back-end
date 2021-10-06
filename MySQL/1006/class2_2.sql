# LPAD, RPAD : 왼쪽 오른쪽에 특정 문자를 원하는 자리수만큼 넣기

select ename ,lpad(ename, 10, ' ') as ename
from emp;