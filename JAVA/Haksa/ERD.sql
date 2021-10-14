SET SESSION FOREIGN_KEY_CHECKS=0;


/* Create Tables */

CREATE TABLE department
(
	did char(10) NOT NULL,
	dname varchar(50) NOT NULL,
	PRIMARY KEY (did)
);


CREATE TABLE student
(
	sid char(10) NOT NULL,
	name varchar(20) NOT NULL,
	did char(10) NOT NULL,
	PRIMARY KEY (sid)
);



