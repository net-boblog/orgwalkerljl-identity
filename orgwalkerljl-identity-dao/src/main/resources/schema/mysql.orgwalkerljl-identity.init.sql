/** 
 * 应用
 */
insert into idm_app(id,name,code,domain,icon,share_role_id,use_post_auth,manager_id,manager_name,token,remark,status,creator,created_time,modifier,modified_time)
values
(1,'统一身份管理系统','idm','//idm.walkerljl.com','',0,0,'','','x','',1,'lijunlin',NOW(),'lijunlin',NOW());

/**
 * 应用配置
 */
INSERT INTO idm_config(app_id,name,`key`,`value`,remark,status,creator,created_time,modifier,modified_time)
VALUES
(1,'系统是否正在升级','system.upgrading','false','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,'系统管理员列表','admins','jarvis','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,'系统管理员邮件列表','admin.mail.list','x@163.com','',1,'lijunlin',NOW(),'lijunlin',NOW());

/**
 * 资源码
 */
insert into auth_res_code(id,app_id,name,code,parent_id,res_type,sensitive_type,approver_id,approver_name,remark,status,creator,created_time,modifier,modified_time)
values
(1,0,'首页','index',0,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(2,1,'系统配置','sys',1,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(3,1,'配置信息','sys_config',2,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(4,1,'操作日志管理','sys_log',2,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(5,1,'任务调度管理','sys_schedule',2,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(6,1,'调度日志管理','sys_schedule_log',2,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(7,0,'单点登录','sso',0,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(8,1,'用户信息管理','sso_user',7,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(9,1,'登录日志管理','sso_logininfo',7,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(10,1,'权限管理','auth',0,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(11,1,'部门管理','auth_dept',10,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(12,1,'岗位管理','auth_post',10,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(13,0,'角色管理','auth_role',10,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(14,1,'应用资源管理','auth_res',10,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(15,1,'访问授权管理','auth_auth',10,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(16,1,'权限批量操作','auth_batchoper',10,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW());

/**
 * 菜单
 */
insert into auth_res_menu(id,app_id,name,parent_id,res_code_id,url,icon,css,`order`,remark,status,creator,created_time,modifier,modified_time)
values
(1,1,'首页',0,1,'/','icon-desktop','',1,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(2,1,'系统管理',0,2,'/sys','icon-dashboard','',2,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(3,1,'配置信息管理',2,3,'/sys/config','icon-cog','',3,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(4,1,'操作日志管理',2,4,'/sys/log','icon-cog','',4,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(5,1,'任务调度管理',2,5,'/sys/schedule','icon-cog','',5,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(6,1,'调度日志管理',2,6,'/sys/schedulelog','icon-cog','',6,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(7,1,'单点登录',0,7,'/sso','icon-desktop','',7,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(8,1,'用户信息管理',7,8,'/sso/user','icon-desktop','',8,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(9,1,'登录日志管理',7,9,'/sso/logininfo','icon-desktop','',9,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(10,1,'权限管理',0,10,'/auth','icon-desktop','',10,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(11,1,'部门管理',10,11,'/auth/dept','icon-desktop','',11,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(12,1,'岗位管理',10,12,'/auth/post','icon-desktop','',12,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(13,1,'角色管理',10,13,'/auth/role','icon-desktop','',13,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(14,1,'应用资源管理',10,15,'/auth/res','icon-desktop','',14,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(15,1,'访问授权管理',10,16,'/auth/auth','icon-desktop','',15,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(16,1,'权限批量操作',10,17,'/auth/bacthoper','icon-desktop','',16,'',1,'lijunlin',NOW(),'lijunlin',NOW());

/**
 * 角色
 */
insert into auth_au_role(id,app_id,name,remark,status,creator,created_time,modifier,modified_time)
values
(1,1,'系统管理员','',1,'lijunlin',NOW(),'lijunlin',NOW());

/**
 * 角色、资源码授权
 */
insert into auth_au_role_res(role_id,res_code_id,start_time,end_time,remark,status,creator,created_time,modifier,modified_time)
values
(1,1,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,2,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,3,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,4,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,5,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,6,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,7,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,8,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,9,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,10,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,11,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,12,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,13,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,14,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,15,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(1,16,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW());

/**
 * 访问授权
 */
insert into auth_au_auth(object_type,object_id,auth_type,auth_id,start_time,end_time,remark,status,creator,created_time,modifier,modified_time)
values
(1,'lijunlin',1,1,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW());