create table sys_user
(
   id                   int(10) not null,
   username             varchar(50),
   realname             varchar(50),
   password             varchar(50),
   createDate           date,
   lastLoginTime        date,
   enabled              int(5),
   accountNonExpired    int(5),
   accountNonLocked     int(5),
   credentialsNonExpired int(5),
   primary key (id)
);


create table sys_role
(
   id                   int(10) not null,
   roleName             varchar(50),
   roleDesc             varchar(50),
   primary key (id)
);

create table sys_user_role
(
   user_id              int(10),
   role_id              int(10)
);


create table sys_permission
(
   id                   int(10) not null,
   permName             varchar(50),
   permTag              varchar(50),
   primary key (id)
);


create table sys_role_permission
(
   role_id              int(10),
   perm_id              int(10)
);


INSERT INTO  `sys_user` (`id`, `username`, `realname`, `password`, `createDate`, `lastLoginTime`, `enabled`, `accountNonExpired`, `accountNonLocked`, `credentialsNonExpired`) VALUES ('1', 'po', 'wangzekun', '123456', '2020-06-21', NULL, '1', '1', '1', '1');
INSERT INTO  `sys_user` (`id`, `username`, `realname`, `password`, `createDate`, `lastLoginTime`, `enabled`, `accountNonExpired`, `accountNonLocked`, `credentialsNonExpired`) VALUES ('2', 'kun', 'wangzekun', '123456', '2020-06-21', NULL, '1', '1', '1', '1');

INSERT INTO  `sys_role` (`id`, `roleName`, `roleDesc`) VALUES ('1', '普通用户', '普通用户');
INSERT INTO  `sys_role` (`id`, `roleName`, `roleDesc`) VALUES ('2', '系统管理员', '系统管理员');

INSERT INTO  `sys_permission` (`id`, `permName`, `permTag`) VALUES ('1', '产品查询', 'ROLE_LIST_PRODUCT');
INSERT INTO  `sys_permission` (`id`, `permName`, `permTag`) VALUES ('2', '产品添加', 'ROLE_ADD_PRODUCT');
INSERT INTO  `sys_permission` (`id`, `permName`, `permTag`) VALUES ('3', '产品修改', 'ROLE_UPDATE_PRODUCT');
INSERT INTO  `sys_permission` (`id`, `permName`, `permTag`) VALUES ('4', '产品删除', 'ROLE_DELETE_PRODUCT');

INSERT INTO  `sys_user_role` (`user_id`, `role_id`) VALUES ('1', '1');
INSERT INTO  `sys_user_role` (`user_id`, `role_id`) VALUES ('2', '2');

INSERT INTO  `sys_role_permission` (`role_id`, `perm_id`) VALUES ('1', '1');
INSERT INTO  `sys_role_permission` (`role_id`, `perm_id`) VALUES ('1', '2');
INSERT INTO  `sys_role_permission` (`role_id`, `perm_id`) VALUES ('2', '3');
INSERT INTO  `sys_role_permission` (`role_id`, `perm_id`) VALUES ('2', '4');


