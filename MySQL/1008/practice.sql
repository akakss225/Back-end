-- 1. 동아리(Dongari) 테이블을 생성하시오.
-- 	동아리ID, 동아리이름

create table DONGARI (
	dId varchar(5),
    dName varchar(10)
);
insert into dongari values('00001', 'FRONT'), ('00002', 'BACK'), ('00003', 'WEB'), ('00004', 'APP');

select * from dongari;

-- 2. 동아리(DongariJoin) 가입현황 테이블을 생성하시오.
--    => 한 명의 학생이 여러 동아리에 복 수로 가입할 수 있음.
-- 	번호, 학생ID, 동아리ID

create table DongariJoin (
	num int,
    id char(7),
    dId varchar(5)
);

select * from student;

insert into dongarijoin values(1, '1091011', '00002'), (2, '1091011', '00004'),
							(3, '0494013', '00002'), (4, '1010101', '00001'), (5, '1010101', '00004'),
                            (6, '2020202', '00001'), (7, '2020202', '00003');

select * from dongarijoin;                            


-- 3. 동아리 가입현황 목록을 출력하시오.	
-- 	동아리이름, 학생명, 학생ID

select dongari.dname , student.name, student.id
from student
join dongarijoin on student.id = dongarijoin.id
join dongari on dongarijoin.dId = dongari.dId;


-- 4. 동아리에 가입하지 않은 학생목록을 출력하시오.
-- 	학생이름

select student.name
from student
where student.name not in(select distinct student.name
from student
right join dongarijoin on student.id = dongarijoin.id);




-- 5. 한 명의 학생도 가입하지 않은 동아리목록을 출력하시오.
-- => 있다고 가정
-- 	동아리이름

select dongari.dname
from dongari
where dongari.dname not in (
	select distinct dongari.dname
    from dongari
    right join dongarijoin on dongari.dId = dongarijoin.dId
);



-- 6. Book테이블을 생성하고, bid를 pk로 설정하고,데이터를 입력하시오.
-- bid char(4) -- 책번호
-- title varchar(20) -- 책제목
-- 0001 자바
-- 0002 Oracle
-- 0003 HTML
-- 0004 JSP

create table Book(
	bId char(4) primary key,
    TITLE varchar(20)
);

insert into Book values('0001', 'JAVA'), ('0002', 'ORACLE'), ('0003', 'HTML'), ('0004', 'JSP');



-- 7. bookRent 테이블을 생성하시오. 
-- no는 pk.
-- no number -- 대출번호
-- id varchar(10) -- 학번
-- bid char(4) -- 책번호
-- rdate date -- 대출일

create table BookRent(
	no int primary key,
    id char(7),
    bId char(4),
    rDate date
);


-- 8. 7번 테이블에 다음 데이터를 입력하시오.
-- 1 20160001 0001 2016-12-01
-- 2 20162233 0002 2016-12-02

insert into BookRent values(1, '2020202', '0001', '2016-12-01'), (2, '1010101', '0002', '2016-12-02');
select * from BookRent;


-- 9. 학번,학생명,대출한 책이름, 대출일을 출력하시오.

select student.id, student.name, book.title, bookrent.rdate
from student
join bookrent on student.id = bookrent.id
join book on bookrent.bId = book.bId;


-- 10. 한번도 대출되지 않은 책의 목록을 출력하시오.

select book.title
from book
where book.title not in (
	select distinct book.title
    from book
    join bookrent on book.bId = bookrent.bId
);


