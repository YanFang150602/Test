use mybatis;

create table t_user(
	id int primary key auto_increment,
    u_name varchar(20) not null,
    u_no varchar(20) not null,
    u_gender varchar(4) not null,
    u_level int default 1
);

create table t_level(
	id int primary key auto_increment,
    l_name varchar(20)
);

insert into t_level(l_name) values('初级会员');
insert into t_level(l_name) values('普通会员');
insert into t_level(l_name) values('高级会员');
insert into t_level(l_name) values('黄金会员');
insert into t_level(l_name) values('铂金会员');

select * from t_level;
select * from t_user;

alter table t_user add column u_level int default 0 comment '用户级别';

update t_user set u_level=3 where id=1;

#1、被关联为外键的表需要有数据
#1、关联外键表中外键字段值要与被关联为外键的表中的字段值保持一致
alter table t_user add constraint foreign key(u_level) references t_level(id);