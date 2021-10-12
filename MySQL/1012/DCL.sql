15장

사용자?
>> 데이터베이스에 접속하여 데이터를 사용/관리하는 계정
>> 업무의 분할과 효율, 보안을 고려하여 생성

데이터베이스 스키마?
>> 데이터를 저장 및 관리하기 위해 정의한 데이터베이스 구조의 범위를 분류
-- create user [user name] >> 아직 권한이 없음

오라클에서 시스템 권한을 부여하는 방법
>> grant [시스템 권한] to [사용자 이름/롤이름...]

권한 취소
>> REVOKE [시스템 권한] from [사용자 이름/롤이름...]


* GRANT와 REVOKE을 묶어서 DCL(Data Control Language) 라고 한다.

롤?
>> ROLE. 여러 종류의 권한을 묶어놓은 그룹을 의미
사전 정의된 ROLE
>> CONNECT
>> RESOURCE
>> DBA

사용자 정의 롤
1. create role문으로 롤 생성
2. grant 명령어로 생성한 롤에 권한 포함
3. grant 명령어로 권한이 포함된 롤을 실행
4. revoke를 이용해 권한 회수





