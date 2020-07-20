create database sm;
use sm;

create table t_student(
    id int primary key auto_increment,
    s_name varchar(20) not null,
    s_sex varchar(4) not null,
    s_classes int not null
);

create table t_classes(
	id int primary key auto_increment,
    c_name varchar(20) not null
);

alter table t_student add constraint foreign key(s_classes) references t_classes(id);

drop procedure p_getClassesNameByStudentID;

delimiter $$
create procedure p_getClassesNameByStudentID(
	in studentId int,
    out classesName varchar(20))
begin
	select c.c_name
    into classesName
    from t_student s,t_classes c
    where  s.s_classes = c.id
    and s.id = studentId;
end
$$

set @studentId=1;
set @classesName='';
call sm.p_getClassesNameByStudentID(@studentId,@classesName);
select @classesName;
