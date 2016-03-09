/** 
 * 应用
 */
insert into auth_res_app(id,name,code,domain,icon,share_role_id,use_post_auth,manager_id,manager_name,token,remark,status,creator,created_time,modifier,modified_time)
values
(1,'统一身份管理系统','idm','//idm.walkerljl.com','',0,0,'','','x','',1,'lijunlin',NOW(),'lijunlin',NOW());

/**
 * 资源码
 */
insert into auth_res_code(id,app_id,name,code,parent_id,res_type,sensitive_type,approver_id,approver_name,remark,status,creator,created_time,modifier,modified_time)
values
(1,1,'首页','idm_index',0,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(2,1,'系统配置','idm_sys',1,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(3,1,'配置信息','idm_sys_config',2,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(4,1,'单点登录','idm_sso',0,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(5,1,'用户信息','idm_user',4,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW()),
(6,1,'登录信息','idm__sso_logininfo',5,1,0,'','','',1,'lijunlin',NOW(),'lijunlin',NOW());

/**
 * 菜单
 */
insert into auth_res_menu(id,app_id,name,parent_id,res_code_id,url,icon,css,`order`,remark,status,creator,created_time,modifier,modified_time)
values
(1,1,'首页',0,1,'/','icon-desktop','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(2,1,'系统管理',1,2,'/sys/config','icon-dashboard','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(3,1,'配置信息管理',2,3,'/sys/config','icon-cog','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(4,1,'操作日志管理',2,3,'/sys/config','icon-cog','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(4,1,'任务调度管理',2,3,'/sys/config','icon-cog','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(4,1,'调度日志管理',2,3,'/sys/config','icon-cog','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(4,1,'单点登录',0,4,'/sso','icon-desktop','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(5,1,'用户信息',4,5,'/sso/user','icon-desktop','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(6,1,'登录信息',4,6,'/sso/logininfo','icon-desktop','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(7,1,'权限管理',0,7,'/auth','icon-desktop','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(8,1,'部门管理',7,8,'/auth/dept','icon-desktop','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(8,1,'岗位管理',7,8,'/auth/dept','icon-desktop','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(8,1,'角色管理',7,8,'/auth/dept','icon-desktop','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(8,1,'应用管理',7,8,'/auth/dept','icon-desktop','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(8,1,'应用资源管理',7,8,'/auth/dept','icon-desktop','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(8,1,'访问授权管理',7,8,'/auth/dept','icon-desktop','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(8,1,'权限批量操作',7,8,'/auth/dept','icon-desktop','',0,'',1,'lijunlin',NOW(),'lijunlin',NOW());

/**
 * 角色
 */
insert into auth_au_role(id,app_id,name,remark,status,creator,created_time,modifier,modified_time)
values
(1,1,'系统管理员','',1,'lijunlin',NOW(),'lijunlin',NOW());

/**
 * 角色、资源码授权
 */
insert into auth_au_role_res(id,role_id,res_code_id,start_time,end_time,remark,status,creator,created_time,modifier,modified_time)
values
(1,1,1,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(2,1,2,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(3,1,3,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(4,1,4,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(5,1,5,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW()),
(6,1,6,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW());

/**
 * 访问授权
 */
insert into auth_au_auth(object_type,object_id,auth_type,auth_id,start_time,end_time,remark,status,creator,created_time,modifier,modified_time)
values
(1,'lijunlin',1,1,null,null,'',1,'lijunlin',NOW(),'lijunlin',NOW());