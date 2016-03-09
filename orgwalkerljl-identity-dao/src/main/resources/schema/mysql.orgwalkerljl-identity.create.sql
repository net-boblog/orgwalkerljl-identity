/**
 * 应用
 */
CREATE TABLE idm_app(
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
ALTER TABLE idm_app ADD UNIQUE(code);
