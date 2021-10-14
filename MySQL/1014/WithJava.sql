create table student(
	id char(7) primary key,
    name varchar(10) not null,
    dept varchar(20) not null
);

insert into student values('1091011', '김철수', '컴퓨터시스템'), ('0792012', '최고봉', '멀티미디어'), ('0494013', '이기자', '컴퓨터공학');



select * from student;