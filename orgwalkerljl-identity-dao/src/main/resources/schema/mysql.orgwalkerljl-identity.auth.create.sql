/**
 * 应用
 */
CREATE TABLE auth_res_app(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	name VARCHAR(64) NOT NULL COMMENT '名称',
	code VARCHAR(64) NOT NULL COMMENT '编码',
	domain VARCHAR(256) NOT NULL COMMENT '域名',
	icon VARCHAR(32) DEFAULT '' COMMENT 'ICON',
	share_role_id BIGINT(20) DEFAULT 0 COMMENT '共享角色ID',
	use_post_auth TINYINT(1) DEFAULT 0 COMMENT '是否使用岗位授权,1:是,0:否',
	manager_id VARCHAR(64) DEFAULT '' COMMENT '应用负责人Id',
	manager_name VARCHAR(64) DEFAULT '' COMMENT '应用负责人姓名',
	token CHAR(32) NOT NULL COMMENT 'token',
	remark VARCHAR(256) DEFAULT '' COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '应用';
/** 添加索引、约束等*/
ALTER TABLE auth_res_app ADD UNIQUE(code);

/**
 * 资源码
 */
CREATE TABLE auth_res_code(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	app_id BIGINT(20) NOT NULL COMMENT '应用Id',
	name VARCHAR(64) NOT NULL COMMENT '名称',
	code VARCHAR(128) NOT NULL COMMENT '编码',
	parent_id BIGINT(20) NOT NULL COMMENT '父资源码Id,根资源码Id为0',
	res_type TINYINT(2) NOT NULL COMMENT '资源类型',
	sensitive_type TINYINT(1) NOT NULL COMMENT '是否敏感资源,1:是,0:否',
	approver_id VARCHAR(64) DEFAULT '' COMMENT '敏感审批人Id',
	approver_name VARCHAR(64) DEFAULT '' COMMENT '敏感审批人姓名',
	remark VARCHAR(256) DEFAULT '' COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '资源码';
/** 添加索引、约束等*/
ALTER TABLE auth_res_code ADD UNIQUE(code);

/**
 * 菜单
 */
CREATE TABLE auth_res_menu(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	app_id BIGINT(20) NOT NULL COMMENT '应用Id',
	name VARCHAR(64) NOT NULL COMMENT '名称',
	parent_id BIGINT(20) NOT NULL COMMENT '父菜单Id,一级菜单Id为0',
	res_code_id BIGINT(20) NOT NULL COMMENT '资源码Id',
	url VARCHAR(512) NOT NULL COMMENT '地址',
	icon VARCHAR(32) DEFAULT '' COMMENT 'ICON',
	css VARCHAR(32) DEFAULT '' COMMENT 'CSS样式代码',
	`order` INT(11) NOT NULL COMMENT '菜单排序值,升序排序',
	remark VARCHAR(256) DEFAULT '' COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '菜单';
/** 添加索引、约束等*/
ALTER TABLE auth_res_menu ADD UNIQUE(res_code_id);

/**
 * 按钮
 */
CREATE TABLE auth_res_button(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	app_id BIGINT(20) NOT NULL COMMENT '应用Id',
	menu_id BIGINT(20) NOT NULL COMMENT '所属菜单Id',
	name VARCHAR(64) NOT NULL COMMENT '名称',
	res_code_id BIGINT(20) NOT NULL COMMENT '资源码Id',
	url VARCHAR(256) DEFAULT '' COMMENT 'URL',
	remark VARCHAR(256) DEFAULT '' COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '功能按钮';
/** 添加索引、约束等*/
ALTER TABLE auth_res_button ADD INDEX idx_menu_id(menu_id);
ALTER TABLE auth_res_button ADD UNIQUE(res_code_id);

/**
 * 数据权限分类
 */
CREATE TABLE auth_res_data_type(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	app_id BIGINT(20) NOT NULL COMMENT '所属应用Id',
	name VARCHAR(64) NOT NULL COMMENT '数据权限类型名称',
	type_key VARCHAR(64) NOT NULL COMMENT '类型Key',
	remark VARCHAR(256) DEFAULT NULL COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '数据权限分类';
/** 添加索引、约束等*/
ALTER TABLE auth_res_data_type ADD UNIQUE(app_id,type_key);
ALTER TABLE auth_res_data_type ADD UNIQUE(app_id,name);

/**
 * 数据权限
 */
CREATE TABLE auth_res_data(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	app_id BIGINT(20) NOT NULL COMMENT '所属应用Id',
	data_type_id BIGINT(20) NOT NULL COMMENT '所属分类Id',
	name VARCHAR(64) NOT NULL COMMENT '数据权限名称',
	res_code_id BIGINT(20) NOT NULL COMMENT '资源码Id',
	data_key VARCHAR(64) DEFAULT NULL COMMENT 'Key',
	remark VARCHAR(256) DEFAULT NULL COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '数据权限';
/** 添加索引、约束等*/
ALTER TABLE auth_res_data ADD UNIQUE(app_id,data_type_id,name);
ALTER TABLE auth_res_data ADD UNIQUE(res_code_id);

/**
 * API
 */
CREATE TABLE auth_res_api(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	app_id BIGINT(20) NOT NULL COMMENT '所属应用Id',
	name VARCHAR(64) NOT NULL COMMENT 'Api名称',
	res_code_id BIGINT(20) NOT NULL COMMENT '资源码Id',
	address VARCHAR(512) NOT NULL COMMENT '地址',
	remark VARCHAR(256) DEFAULT NULL COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT 'API';
/** 添加索引、约束等*/
ALTER TABLE auth_res_api ADD UNIQUE(name);
ALTER TABLE auth_res_api ADD UNIQUE(res_code_id);

/**
 * URL
 */
CREATE TABLE auth_res_url(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	app_id BIGINT(20) NOT NULL COMMENT '所属应用Id',
	name VARCHAR(64) NOT NULL COMMENT 'Url名称',
	res_code_id BIGINT(20) NOT NULL COMMENT '资源码Id',
	address VARCHAR(512) NOT NULL COMMENT '地址',
	remark VARCHAR(256) DEFAULT NULL COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT 'URL';
/** 添加索引、约束等*/
ALTER TABLE auth_res_url ADD INDEX auth_res_url_index_app_id(app_id);
ALTER TABLE auth_res_url ADD UNIQUE(name);
ALTER TABLE auth_res_url ADD UNIQUE(res_code_id);

/**
 * 角色
 */
CREATE TABLE auth_au_role(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	app_id BIGINT(20) NOT NULL COMMENT '所属应用Id',
	name VARCHAR(64) NOT NULL COMMENT '角色名称',
	remark VARCHAR(256) DEFAULT NULL COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '角色';
/** 添加索引、约束等*/
ALTER TABLE auth_au_role ADD INDEX idx_app_id(app_id);
ALTER TABLE auth_au_role ADD UNIQUE(app_id,name);

/**
 * 角色、资源码授权
 */
CREATE TABLE auth_au_role_res(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	role_id BIGINT(20) NOT NULL COMMENT '角色Id',
	res_code_id BIGINT(20) NOT NULL COMMENT '资源码Id',
	start_time DATETIME DEFAULT NULL COMMENT '生效开始时间',
	end_time DATETIME DEFAULT NULL COMMENT '生效结束时间',
	remark VARCHAR(256) DEFAULT NULL COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '角色、资源码授权';
/** 添加索引、约束等*/
ALTER TABLE auth_au_role_res ADD UNIQUE(role_id,res_code_id);

/**
 * 部门
 */
CREATE TABLE auth_au_dept(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	name VARCHAR(512) NOT NULL COMMENT '部门名称',
	code VARCHAR(16) NOT NULL COMMENT '部门编码',
	parent_id BIGINT(20) NOT NULL COMMENT '父级部门Id,根节点Id为0',
	remark VARCHAR(256) DEFAULT NULL COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '部门';
/** 添加索引、约束等*/
ALTER TABLE auth_au_dept ADD INDEX idx_code(code);
ALTER TABLE auth_au_dept ADD UNIQUE(code);

/**
 * 岗位
 */
CREATE TABLE auth_au_post(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	dept_id BIGINT(20) NOT NULL COMMENT '部门Id',
	name VARCHAR(512) NOT NULL COMMENT '岗位名称',
	code VARCHAR(16) NOT NULL COMMENT '岗位编码',
	simple_name VARCHAR(64) NOT NULL COMMENT '岗位简称',
	remark VARCHAR(256) DEFAULT NULL COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '岗位';
/** 添加索引、约束等*/
ALTER TABLE auth_au_post ADD INDEX idx_code(code);
ALTER TABLE auth_au_post ADD INDEX idx_dept_id(dept_id);
ALTER TABLE auth_au_post ADD UNIQUE(code);

/**
 * 岗位、角色授权
 */
CREATE TABLE auth_au_post_role(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	post_id BIGINT(20) NOT NULL COMMENT '岗位Id',
	role_id BIGINT(20) NOT NULL COMMENT '角色Id',
	start_date DATETIME DEFAULT NULL COMMENT '生效开始日期',
	end_date DATETIME DEFAULT NULL COMMENT '生效结束日期',
	remark VARCHAR(256) DEFAULT NULL COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '岗位、角色授权';
/** 添加索引、约束等*/
ALTER TABLE auth_au_post_role ADD INDEX idx_post_id(post_id);
ALTER TABLE auth_au_post_role ADD UNIQUE(post_id,role_id);

/**
 * 访问授权
 */
CREATE TABLE auth_au_auth(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT COMMENT '主键Id',
	object_type TINYINT(1) NOT NULL COMMENT '授权对象类型',
	object_id VARCHAR(64) NOT NULL COMMENT '授权对象Id',
 	auth_type TINYINT(1) NOT NULL COMMENT '授权类型',
	auth_id BIGINT(20) NOT NULL COMMENT '授权Id',
	start_time DATETIME DEFAULT NULL COMMENT '生效开始时间',
	end_time DATETIME DEFAULT NULL COMMENT '生效结束时间',
	remark VARCHAR(256) DEFAULT NULL COMMENT '备注',
	status TINYINT(1) NOT NULL COMMENT '状态,1:启用,2:停用,3:删除',
	creator VARCHAR(64) NOT NULL COMMENT '创建者',
	created_time DATETIME NOT NULL COMMENT '创建时间',
	modifier VARCHAR(64) NOT NULL COMMENT '修改者',
	modified_time DATETIME NOT NULL COMMENT '修改时间'
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '授权';
/** 添加索引、约束等*/
ALTER TABLE auth_au_auth ADD INDEX idx_object_id(object_id);
ALTER TABLE auth_au_auth ADD INDEX idx_auth_id(auth_id);
ALTER TABLE auth_au_auth ADD UNIQUE(object_type,object_id,auth_type,auth_id);