create table user
(
	id bigint auto_increment comment '用户ID'
		primary key,
	name varchar(45) not null comment '用户名',
	password varchar(45) not null comment '密码',
	is_servant int default '0' not null comment '是否是服务人员;0:false; 1:true;',
	score int default '0' not null comment '评分',
	create_time datetime not null comment '创建时间',
	update_time datetime not null comment '更新时间',
	constraint name_UNIQUE
		unique (name)
)
;

