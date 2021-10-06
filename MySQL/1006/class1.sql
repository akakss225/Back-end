
select job,substring(job,1,2) as job
from emp;

select job, instr(job, 'A') as result from emp;

