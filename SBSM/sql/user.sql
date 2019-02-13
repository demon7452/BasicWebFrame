DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
  id   int auto_increment,
  name varchar(20) null,
  constraint user_pk primary key (id)
);