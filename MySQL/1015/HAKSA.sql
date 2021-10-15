
insert into bookRent values('2017071304','1091011','000001','20170713');
insert into bookRent values('2017071305','0792012','000002','20170713');
insert into bookRent values('2017071306','0494013','000003','20170713');


select * from student;
select * from books;
select * from bookrent;

-- 간단한 JOIN사용법
select br.id, s.name, b.title, br.rdate
from student s, books b, bookrent br
where s.id = br.id and br.bookno = b.no
and s.dept='컴퓨터공학';

alter table student add address varchar(20) not null;


update student set address = '인천광역시' where id = '0494013';
update student set address = '서울특별시' where id = '0792012';
update student set address = '부산광역시' where id = '1091011';

