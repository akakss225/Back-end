# replace 함수 : 특정 문자를 다른 문자로 대체 교재 139p

select '010-1234-5678' as replace_before,
	replace('010-1234-5678', '-', '') as after1
from dual


