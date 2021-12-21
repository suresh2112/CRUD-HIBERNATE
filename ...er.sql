use saradacollege;
create table super_class(
super_id int (9) auto_increment ,
super_dept varchar(90) not null,
constraint super_1 primary key(super_id));
insert into super_class values(1000,'ECE');

insert into super_class values(1001,'EEE');

insert into super_class values(1002,'MECH');

insert into super_class values(1003,'CIVIL');
select * FROM super_class;
create table child_class(
child_id int(10) auto_increment,
child_name varchar(9) not null,
super_id int (9),
constraint child primary key(child_id));
set foreign_key_check=0;
alter table child_class add constraint child_class_p foreign key(super_id) references super_class(super_id);
set foreign_key_check=0;
insert into child_class values(100,'s',10000);




