CREATE DATABASE DAY10;
use DAY10;


CREATE  TABLE STUDENT_TABLE(
rollno int  ,
name varchar(20),
department varchar(20),
section varchar(20),
mark int

);
Insert into STUDENT_TABLE values(01,"aakash" ,"BSC CT", "A" , 90),
(02,"bharani " ,"BSC CT", "A" , 80),
(03,"chitra" ,"BSC CT", "A" , 70),
(04,"dharshan" ,"BSC CT", "A" , 100),
(05,"elizbeth" ,"BSC CT", "A" , 60);


UPDATE  STUDENT_TABLE SET name =" CHANDRU" WHERE rollno =03;
Select name ,department,section from STUDENT_TABLE WHERE mark <=60;  
alter  TABLE STUDENT_TABLE add gender varchar(20);
Select * from STUDENT_TABLE ; 
ALTER TABLE STUDENT_TABLE
DROP COLUMN section;
truncate table STUDENT_TABLE;
drop database DAY10;
