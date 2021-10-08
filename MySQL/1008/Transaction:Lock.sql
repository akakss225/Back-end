-- 트랜잭션 : 더이상 분할할 수 없는 최소 수행 단위
-- >> 한 개 이상의 DML
-- >> ALL OR NOTHING
-- 읽기 일관성 : 어떤 특정 세션에서 테이블의 데이터를 변경중일 때 그 외 다른세션에서는 데이터의 변경이 확정되기 전까지 변경사항을 알 필요가 없으므로
-- 			  데이터를 변경중인 세션을 제외한 나머지 세션에서는 현재 진행중인 변경과 무관한 본래의 데이터를 보여주는 것
-- LOCK : 조작중인 데이터를 다른 세션이 조작할 수 없게 잠금
-- 행 레벨 록 : 조작중인 행에 LOCK
-- 테이블 레벨 록 : DML을 사용하여 데이터가 변경중인 테이블에 LOCK. DDL(create / alter / drop)사용불가.




create table dept_tcl (select * from dept);

-- AUTO COMMIT기능 꺼주기 >> ROLLBACK을 사용하기 위해
select @@autocommit;
set autocommit = 0;

select * from dept_tcl;

delete from dept_tcl
where deptno = 40;

commit;


-- 만약 현재 workbench에서 먼저 update를 하고 commit을 하기 전에 다른 IDE에서 같은 값을 수정하면,
-- 먼저 수행한 변경사항을 commit하기 전까지 lock이 걸린다.
update dept_tcl
set dname = 'DATABASE'
where deptno = 30;


