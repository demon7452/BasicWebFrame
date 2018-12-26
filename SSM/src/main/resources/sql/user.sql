DROP table IF EXISTS `user`;

create table user
(
  id          int auto_increment
  comment '用户ID '
    primary key,
  name        varchar(20) default '默认用户' null
  comment '用户名',
  email       varchar(30)                not null
  comment '邮箱',
  password    varchar(20)                not null
  comment '用户密码',
  create_time datetime                   not null
  comment '创建时间',
  update_time datetime                   not null
  comment '更新时间',
  constraint user_email_uindex
  unique (email)
)
  comment '用户表';

