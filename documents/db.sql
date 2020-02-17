create table login(
username varchar(50) not null,
password varchar(50));


insert into login values("admin", "1234"); 
 

create table messages(
Member_login varchar(50),
Subject varchar(50),
Body varchar(100));

insert into messages values("bodagala", "Loan Repayment","Loan Repayment Details");
insert into messages values("manzoor", "Loan Repayment","Loan Repayment Details");