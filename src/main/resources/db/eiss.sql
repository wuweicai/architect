/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50727
Source Host           : localhost:3306
Source Database       : eiss

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2019-12-14 13:58:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cron`
-- ----------------------------
DROP TABLE IF EXISTS `cron`;
CREATE TABLE `cron` (
  `cron` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cron
-- ----------------------------
INSERT INTO `cron` VALUES ('0/5 * * * * ?');

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` varchar(20) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `descr` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_task`
-- ----------------------------
DROP TABLE IF EXISTS `sys_task`;
CREATE TABLE `sys_task` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cron_Expression` varchar(255) DEFAULT NULL COMMENT 'cron表达式',
  `method_Name` varchar(255) DEFAULT NULL COMMENT '任务调用的方法名',
  `is_Concurrent` varchar(255) DEFAULT NULL COMMENT '任务是否有状态',
  `description` varchar(255) DEFAULT NULL COMMENT '任务描述',
  `update_By` varchar(64) DEFAULT NULL COMMENT '更新者',
  `bean_Class` varchar(255) DEFAULT NULL COMMENT '任务执行时调用哪个类的方法 包名+类名',
  `create_Date` datetime DEFAULT NULL COMMENT '创建时间',
  `job_Status` varchar(255) DEFAULT NULL COMMENT '任务状态',
  `job_Group` varchar(255) DEFAULT NULL COMMENT '任务分组',
  `update_Date` datetime DEFAULT NULL COMMENT '更新时间',
  `create_By` varchar(64) DEFAULT NULL COMMENT '创建者',
  `spring_Bean` varchar(255) DEFAULT NULL COMMENT 'Spring bean',
  `job_Name` varchar(255) DEFAULT NULL COMMENT '任务名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of sys_task
-- ----------------------------
INSERT INTO `sys_task` VALUES ('1', '1/5 * * * * ? *', 'run', null, null, null, 'com.yytg.yycdsecurityoauth2.quarts.multi.test.WelcomeJob', null, '1', null, null, null, null, 'WellcomJob');

-- ----------------------------
-- Table structure for `t_sys_dept`
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_dept`;
CREATE TABLE `t_sys_dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `pid` int(11) NOT NULL DEFAULT '0',
  `pids` varchar(128) DEFAULT NULL COMMENT '祖先结点id集',
  `state` int(1) DEFAULT NULL COMMENT '0：正常\n1：失效\n',
  `leader` varchar(20) DEFAULT NULL COMMENT '负责人',
  `phone` varchar(15) DEFAULT NULL COMMENT '联系电话',
  `mail` varchar(45) DEFAULT NULL COMMENT '邮箱',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_dept
-- ----------------------------
INSERT INTO `t_sys_dept` VALUES ('1', '总公司', '0', '0', '0', 'kking', '13888888888', 'KKing@kking.wang', '2019-02-27 16:27:01', '2019-03-04 17:01:11');
INSERT INTO `t_sys_dept` VALUES ('16', '省公司', '1', '0,1', '0', null, null, null, '2019-03-05 19:30:19', '2019-03-20 15:56:41');
INSERT INTO `t_sys_dept` VALUES ('17', '杭州市', '16', '0,1,16', '0', null, null, null, '2019-03-05 19:30:29', '2019-03-20 15:56:41');
INSERT INTO `t_sys_dept` VALUES ('18', '一级渠道', '1', '0,1', '0', null, null, null, '2019-03-05 19:30:40', '2019-03-20 15:39:36');
INSERT INTO `t_sys_dept` VALUES ('19', '二级渠道', '18', '0,1,18', '0', null, null, null, '2019-03-05 19:30:48', '2019-03-20 15:39:39');

-- ----------------------------
-- Table structure for `t_sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_menu`;
CREATE TABLE `t_sys_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `pid` int(11) DEFAULT '0' COMMENT '父菜单结点\n约定：最大3级',
  `type` varchar(2) DEFAULT 'M' COMMENT 'M:正常菜单\nD:目录 B:按钮',
  `path` varchar(128) DEFAULT NULL COMMENT '路径，请使用相对根路径',
  `component` varchar(45) DEFAULT NULL COMMENT 'vue组件地址，默认添加@/views/前缀',
  `icon` varchar(20) DEFAULT NULL COMMENT 'antd icon名',
  `state` int(2) DEFAULT '0' COMMENT '0:有效\n1:无效',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `sort` int(2) DEFAULT '0' COMMENT '菜单排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_menu
-- ----------------------------
INSERT INTO `t_sys_menu` VALUES ('1', '系统管理', '0', 'D', '/sys', null, 'setting', '0', '2019-01-26 22:04:32', '2019-02-28 17:43:16', '0');
INSERT INTO `t_sys_menu` VALUES ('2', '菜单管理', '1', 'M', '/sys/menu', 'sys/menu', 'menu', '0', '2019-02-02 22:21:55', '2019-03-05 17:26:31', '0');
INSERT INTO `t_sys_menu` VALUES ('3', '角色管理', '1', 'M', '/sys/role', 'sys/role', 'solution', '0', '2019-02-04 12:44:40', '2019-03-05 17:26:41', '1');
INSERT INTO `t_sys_menu` VALUES ('15', '菜单新增', '2', 'B', null, null, null, '0', '2019-02-19 17:56:53', '2019-03-04 15:58:48', '1');
INSERT INTO `t_sys_menu` VALUES ('16', '菜单修改', '2', 'B', null, null, null, '0', '2019-02-19 17:58:03', '2019-03-04 15:58:50', '2');
INSERT INTO `t_sys_menu` VALUES ('17', '菜单删除', '2', 'B', null, null, null, '0', '2019-02-19 17:58:28', '2019-03-04 15:58:53', '3');
INSERT INTO `t_sys_menu` VALUES ('31', '角色新增', '3', 'B', null, null, null, '0', '2019-02-25 14:44:21', '2019-03-04 15:58:55', '1');
INSERT INTO `t_sys_menu` VALUES ('32', '角色修改', '3', 'B', null, null, null, '0', '2019-02-25 14:44:42', '2019-03-04 15:58:57', '2');
INSERT INTO `t_sys_menu` VALUES ('34', '角色删除', '3', 'B', null, null, null, '0', '2019-02-26 15:16:17', '2019-03-04 15:58:59', '3');
INSERT INTO `t_sys_menu` VALUES ('37', '部门管理', '1', 'M', '/sys/dept', 'sys/dept', 'deployment-unit', '0', '2019-02-27 16:58:39', '2019-03-05 17:26:52', '2');
INSERT INTO `t_sys_menu` VALUES ('38', '部门查询', '37', 'B', null, null, null, '0', '2019-02-27 17:17:14', '2019-03-04 15:59:03', '0');
INSERT INTO `t_sys_menu` VALUES ('39', '部门新增', '37', 'B', null, null, null, '0', '2019-02-27 17:17:27', '2019-03-04 15:59:04', '1');
INSERT INTO `t_sys_menu` VALUES ('40', '部门修改', '37', 'B', null, null, null, '0', '2019-02-27 17:17:38', '2019-03-04 15:59:06', '2');
INSERT INTO `t_sys_menu` VALUES ('41', '部门删除', '37', 'B', null, null, null, '0', '2019-02-27 17:17:52', '2019-03-04 15:59:07', '3');
INSERT INTO `t_sys_menu` VALUES ('42', '角色查询', '3', 'B', null, null, null, '0', '2019-02-28 11:28:24', '2019-03-04 15:59:08', '0');
INSERT INTO `t_sys_menu` VALUES ('44', '菜单查询', '2', 'B', null, null, null, '0', '2019-03-05 14:50:09', '2019-03-08 20:24:49', '0');
INSERT INTO `t_sys_menu` VALUES ('46', '1', '1', 'M', '1', '1', null, '1', '2019-03-07 15:19:08', '2019-03-07 15:24:06', '0');

-- ----------------------------
-- Table structure for `t_sys_perm`
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_perm`;
CREATE TABLE `t_sys_perm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` timestamp NULL DEFAULT NULL,
  `resource_id` int(11) NOT NULL COMMENT '资源id，如菜单id、部门id',
  `perm_name` varchar(15) DEFAULT NULL COMMENT '权限标识名',
  `perm_type` varchar(10) NOT NULL COMMENT '权限类型，现有DEPT部门、MENU菜单',
  PRIMARY KEY (`id`),
  KEY `resource_id` (`resource_id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_perm
-- ----------------------------
INSERT INTO `t_sys_perm` VALUES ('32', null, '35', 'menu:list', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('33', null, '15', 'menu:add', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('34', null, '16', 'menu:edit', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('35', null, '17', 'menu:remove', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('36', null, '2', 'menu:view', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('37', null, '3', 'role:view', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('38', null, '42', 'role:list', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('39', null, '31', 'role:add', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('40', null, '32', 'role:edit', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('41', null, '34', 'role:remove', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('42', null, '37', 'dept:view', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('43', null, '38', 'dept:list', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('44', null, '39', 'dept:add', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('45', null, '40', 'dept:edit', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('46', null, '41', 'dept:remove', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('47', null, '1', null, 'MENU');
INSERT INTO `t_sys_perm` VALUES ('48', null, '1', null, 'DEPT');
INSERT INTO `t_sys_perm` VALUES ('49', null, '44', 'menu:list', 'MENU');
INSERT INTO `t_sys_perm` VALUES ('50', null, '45', null, 'MENU');
INSERT INTO `t_sys_perm` VALUES ('51', null, '16', null, 'DEPT');
INSERT INTO `t_sys_perm` VALUES ('52', null, '18', null, 'DEPT');
INSERT INTO `t_sys_perm` VALUES ('53', null, '17', null, 'DEPT');
INSERT INTO `t_sys_perm` VALUES ('54', null, '46', null, 'MENU');

-- ----------------------------
-- Table structure for `t_sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) DEFAULT NULL,
  `role_desc` varchar(45) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `state` int(2) DEFAULT '0' COMMENT '状态，0：正常，1：停用',
  `dept_perm_type` char(1) DEFAULT 'P' COMMENT '部门权限类型，A:所有 P:部分',
  PRIMARY KEY (`id`),
  UNIQUE KEY `role_name` (`role_name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------
INSERT INTO `t_sys_role` VALUES ('1', 'admin', '管理员', '2019-01-24 17:31:03', '0', 'P');
INSERT INTO `t_sys_role` VALUES ('3', 'guest', '访客', '2019-03-01 14:24:41', '0', 'P');

-- ----------------------------
-- Table structure for `t_sys_role_perm`
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role_perm`;
CREATE TABLE `t_sys_role_perm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `perm_id` int(11) NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_role_perm
-- ----------------------------
INSERT INTO `t_sys_role_perm` VALUES ('45', '1', '32', '2019-03-04 16:14:39');
INSERT INTO `t_sys_role_perm` VALUES ('46', '1', '33', '2019-03-04 16:22:14');
INSERT INTO `t_sys_role_perm` VALUES ('47', '1', '34', '2019-03-04 16:22:18');
INSERT INTO `t_sys_role_perm` VALUES ('48', '1', '35', '2019-03-04 16:22:22');
INSERT INTO `t_sys_role_perm` VALUES ('49', '1', '38', '2019-03-04 16:30:22');
INSERT INTO `t_sys_role_perm` VALUES ('50', '1', '39', '2019-03-04 16:30:25');
INSERT INTO `t_sys_role_perm` VALUES ('51', '1', '40', '2019-03-04 16:30:29');
INSERT INTO `t_sys_role_perm` VALUES ('52', '1', '41', '2019-03-04 16:30:33');
INSERT INTO `t_sys_role_perm` VALUES ('55', '1', '43', '2019-03-04 16:58:50');
INSERT INTO `t_sys_role_perm` VALUES ('61', '1', '36', '2019-03-04 17:23:15');
INSERT INTO `t_sys_role_perm` VALUES ('62', '1', '37', '2019-03-04 17:23:15');
INSERT INTO `t_sys_role_perm` VALUES ('63', '1', '42', '2019-03-04 17:23:15');
INSERT INTO `t_sys_role_perm` VALUES ('64', '1', '47', '2019-03-04 17:23:15');
INSERT INTO `t_sys_role_perm` VALUES ('66', '1', '49', '2019-03-05 14:54:44');
INSERT INTO `t_sys_role_perm` VALUES ('70', '1', '50', '2019-03-05 16:39:42');
INSERT INTO `t_sys_role_perm` VALUES ('73', '1', '53', '2019-03-07 11:38:29');
INSERT INTO `t_sys_role_perm` VALUES ('75', '1', '51', '2019-03-07 14:42:19');
INSERT INTO `t_sys_role_perm` VALUES ('76', '1', '52', '2019-03-07 14:42:19');
INSERT INTO `t_sys_role_perm` VALUES ('77', '1', '48', '2019-03-07 15:21:38');
INSERT INTO `t_sys_role_perm` VALUES ('80', '1', '44', '2019-03-07 15:27:35');
INSERT INTO `t_sys_role_perm` VALUES ('81', '1', '45', '2019-03-07 15:27:35');
INSERT INTO `t_sys_role_perm` VALUES ('82', '1', '46', '2019-03-07 15:27:35');

-- ----------------------------
-- Table structure for `t_sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `nick` varchar(20) DEFAULT NULL,
  `salt` varchar(10) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `state` int(2) DEFAULT '0' COMMENT '0：有效\n1：无效',
  `avatar` varchar(256) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES ('1', 'admin', 'd829b843a6550a947e82f2f38ed6b7a7', 'test', '123', '2019-01-24 17:30:51', '2019-02-27 16:26:34', '0', 'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3377302992,3361149372&fm=27&gp=0.jpg', '1');

-- ----------------------------
-- Table structure for `t_sys_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user_role`;
CREATE TABLE `t_sys_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_user_role
-- ----------------------------
INSERT INTO `t_sys_user_role` VALUES ('1', '1', '1', '2019-01-24 17:31:17');
