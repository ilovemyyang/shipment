/*
 Navicat MySQL Data Transfer

 Source Server         : 139.196.64.88
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : 139.196.64.88:3306
 Source Schema         : micro_baseservice_v3

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 24/03/2020 19:07:04
*/
-- -------------------------------
-- notes
------------ Table abandon
-- enumvalue/province
------------ Others
-- pk使用varchar类型(使用long前端可能会由于过长导致错误)
-- -------------------------------
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for basesite
-- ----------------------------
DROP TABLE IF EXISTS `basesite`;
CREATE TABLE `basesite` (
  `id` varchar(36) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `site_code` varchar(100) DEFAULT NULL COMMENT '编码',
  `is_active` tinyint(1) DEFAULT NULL COMMENT '是否启用',
  `default_language` varchar(20) DEFAULT NULL COMMENT '默认语言',
  `default_currency` varchar(255) DEFAULT NULL COMMENT '默认货币',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
   `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
   `deleted` int(255) DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for channel
-- ----------------------------
DROP TABLE IF EXISTS `channel`;
CREATE TABLE `channel` (
  `id` varchar(36) unsigned NOT NULL COMMENT '主键',
  `code` varchar(45) NOT NULL COMMENT '渠道编码',
  `name` varchar(45) DEFAULT NULL COMMENT '渠道名称',
  `enabled` bit(1) NOT NULL DEFAULT b'0' COMMENT '状态',
  `platform_id` bigint(20) unsigned NOT NULL COMMENT '主键',
  `icon` varchar(255) DEFAULT NULL COMMENT '渠道图标',
  
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
   `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
   
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  
 `deleted` int(255) DEFAULT 0,
 
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `udx_code` (`code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of channel
-- ----------------------------
BEGIN;
INSERT INTO `channel` (id,code,name,enabled,platform_id)  VALUES (1, 'wmall', 'channelName', b'0', 1);
INSERT INTO `channel` (id,code,name,enabled,platform_id)  VALUES (2, 'app', 'channelName2', b'0', 2);
COMMIT;

-- ----------------------------
-- Table structure for channellp
-- ----------------------------
DROP TABLE IF EXISTS `channellp`;
CREATE TABLE `channellp` (
  `pk` varchar(36) NOT NULL COMMENT '主键',
  `channel_code` varchar(50) NOT NULL COMMENT '渠道编码',
  `lang_code` varchar(36) NOT NULL COMMENT '语言编码',
  `name` varchar(255) DEFAULT NULL COMMENT '渠道名称',
  
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(255) DEFAULT NULL COMMENT '更新人',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
   `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
   
   `deleted` int(255) DEFAULT 0,
   
  PRIMARY KEY (`pk`),
  UNIQUE KEY `unique_channel_code_lang` (`channel_code`,`lang_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

BEGIN;
INSERT INTO `channellp` (pk,channel_code,lang_code,name)  VALUES ('1', 'wmall','zh_CN' ,'wmall');
INSERT INTO `channellp` (pk,channel_code,lang_code,name)  VALUES ('2', 'wmall','en_US' ,'wmall');
INSERT INTO `channellp` (pk,channel_code,lang_code,name)  VALUES ('3', 'app', 'zh_CN','app');
INSERT INTO `channellp` (pk,channel_code,lang_code,name)  VALUES ('4', 'app', 'en_US','app');
COMMIT;
-- ----------------------------
-- Table structure for language
-- ----------------------------
DROP TABLE IF EXISTS `language`;
CREATE TABLE `language` (
  `pk` varchar(36) NOT NULL COMMENT '主键',
  `lang_code` varchar(36) NOT NULL COMMENT '语言编码',
  `name` varchar(255) DEFAULT NULL COMMENT '语言名称',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
   `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
   `deleted` int(255) DEFAULT 0,
  PRIMARY KEY (`pk`),
  UNIQUE KEY `unique_language_code_lang` (`lang_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of language
-- ----------------------------
BEGIN;
INSERT INTO `language` (pk,lang_code,name,create_time,create_user,update_time,update_user) VALUES ('1', 'zh_CN', '中文', '2020-03-23 21:06:34', NULL, '2020-03-23 21:06:42', NULL);
INSERT INTO `language` (pk,lang_code,name,create_time,create_user,update_time,update_user) VALUES ('2', 'en_US', '英文', '2020-03-23 21:07:04', NULL, '2020-03-23 21:07:04', NULL);
COMMIT;

-- ----------------------------
-- Table structure for platform
-- 自营/京东/天猫
-- ----------------------------
DROP TABLE IF EXISTS `platform`;
CREATE TABLE `platform` (
  `id` varchar(36) NOT NULL,
  `code` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
   `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
   `deleted` int(255) DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `udx_type` (`code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of platform
-- ----------------------------
BEGIN;
INSERT INTO `platform` (id,code,name)  VALUES (1, '1', 'platformID');
INSERT INTO `platform` (id,code,name) VALUES (2, '2', 'platform2');
COMMIT;

-- ----------------------------
-- Table structure for platformlp
-- ----------------------------
DROP TABLE IF EXISTS `platformlp`;
CREATE TABLE `platformlp` (
  `pk` varchar(36) NOT NULL COMMENT '主键',
  `platform_pk` varchar(50) NOT NULL COMMENT '平台主键',
  `name` varchar(255) DEFAULT NULL COMMENT '平台名称',
  `lang_code` varchar(50) NOT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
   `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
   `deleted` int(255) DEFAULT 0,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

BEGIN;
INSERT INTO `platformlp` (pk,platform_pk,lang_code,name)  VALUES (1, '1','zh_CN', 'platformID');
INSERT INTO `platformlp` (pk,platform_pk,lang_code,name)  VALUES (2, '1','en_US', 'platformID');
INSERT INTO `platformlp` (pk,platform_pk,lang_code,name) VALUES (3, '2', 'zh_CN','platform2');
INSERT INTO `platformlp` (pk,platform_pk,lang_code,name)  VALUES (4, '2','en_US', 'platform2');
COMMIT;
-- ----------------------------
-- Table structure for province
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province` (
  `id` char(6) NOT NULL,
  `name` varchar(45) NOT NULL,
  `area` varchar(45) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of province
-- ----------------------------
BEGIN;
INSERT INTO `province` VALUES ('110000', '北京市', '华北');
INSERT INTO `province` VALUES ('120000', '天津市', '华北');
INSERT INTO `province` VALUES ('130000', '河北省', '华北');
INSERT INTO `province` VALUES ('140000', '山西省', '华北');
INSERT INTO `province` VALUES ('150000', '内蒙古自治区', '华北');
INSERT INTO `province` VALUES ('210000', '辽宁省', '东北');
INSERT INTO `province` VALUES ('220000', '吉林省', '东北');
INSERT INTO `province` VALUES ('230000', '黑龙江省', '东北');
INSERT INTO `province` VALUES ('310000', '上海市', '华东');
INSERT INTO `province` VALUES ('320000', '江苏省', '华东');
INSERT INTO `province` VALUES ('330000', '浙江省', '华东');
INSERT INTO `province` VALUES ('340000', '安徽省', '华东');
INSERT INTO `province` VALUES ('350000', '福建省', '华南');
INSERT INTO `province` VALUES ('360000', '江西省', '华东');
INSERT INTO `province` VALUES ('370000', '山东省', '华北');
INSERT INTO `province` VALUES ('410000', '河南省', '华中');
INSERT INTO `province` VALUES ('420000', '湖北省', '华中');
INSERT INTO `province` VALUES ('430000', '湖南省', '华中');
INSERT INTO `province` VALUES ('440000', '广东省', '华南');
INSERT INTO `province` VALUES ('450000', '广西壮族自治区', '华南');
INSERT INTO `province` VALUES ('460000', '海南省', '华南');
INSERT INTO `province` VALUES ('500000', '重庆市', '西南');
INSERT INTO `province` VALUES ('510000', '四川省', '西南');
INSERT INTO `province` VALUES ('520000', '贵州省', '西南');
INSERT INTO `province` VALUES ('530000', '云南省', '西南');
INSERT INTO `province` VALUES ('540000', '西藏自治区', '西南');
INSERT INTO `province` VALUES ('610000', '陕西省', '西北');
INSERT INTO `province` VALUES ('620000', '甘肃省', '西北');
INSERT INTO `province` VALUES ('630000', '青海省', '西北');
INSERT INTO `province` VALUES ('640000', '宁夏回族自治区', '西北');
INSERT INTO `province` VALUES ('650000', '新疆维吾尔自治区', '西北');
INSERT INTO `province` VALUES ('710000', '台湾省', '港澳台');
INSERT INTO `province` VALUES ('810000', '香港特别行政区', '港澳台');
INSERT INTO `province` VALUES ('820000', '澳门特别行政区', '港澳台');
COMMIT;

-- ----------------------------
-- Table structure for warehouse
-- ----------------------------
DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse` (
  `id` bigint(20) NOT NULL,
  `warehouse_code` varchar(36) NOT NULL,
  `warehouse_name` varchar(36) NOT NULL,
  `enable` bit(1) NOT NULL,
  `contact` varchar(36) DEFAULT NULL,
  `contact_phone` varchar(11) DEFAULT NULL,
  `province` varchar(36) NOT NULL,
  `city` varchar(36) NOT NULL,
  `district` varchar(36) NOT NULL,
  `address` varchar(36) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `index_warehouseCode` (`warehouse_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of warehouse
-- ----------------------------
BEGIN;
INSERT INTO `warehouse` VALUES (199198111323176960, 'YCB', '云仓宝', b'1', 'jkk', '13322222222', '上海', '上海', '静安', '上海市静安区启迪大厦');
INSERT INTO `warehouse` VALUES (236543495322173440, 'TEST', '测试仓库', b'1', '联系人', '15233445566', '北京', '北京', '朝阳区', '大马路和嘉浜发射点1002号');
INSERT INTO `warehouse` VALUES (246276917217165312, '1212123', 'sigrid test', b'1', 'sigrid', '18710919191', '上海', '上海', '静安区', '启迪大厦');
COMMIT;

-- ----------------------------
-- Table structure for enumvalue
-- ----------------------------
DROP TABLE IF EXISTS `enumvalue`;
CREATE TABLE `enumvalue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `enum_type` varchar(36) NOT NULL COMMENT '枚举类型',
  `code` varchar(36) NOT NULL COMMENT '枚举编号',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `lang_code` varchar(36) NOT NULL COMMENT '语言编码',
  `disabled` bit(1) DEFAULT 0 COMMENT '是否禁用',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  	`create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
   `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_type_code_lang_code` (`enum_type`,`code`,`lang_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of enumvalue
-- ----------------------------
BEGIN;
INSERT INTO `enumvalue` VALUES ('1','PaymentStatus', 'NOTPAID', '未付款', 'zh_CN', b'0','2020-03-23 21:06:34',NULL,'2020-03-23 21:06:34',NULL );
INSERT INTO `enumvalue` VALUES ('2','PaymentStatus', 'PAID', '已付款', 'zh_CN', b'0','2020-03-23 21:06:34',NULL,'2020-03-23 21:06:34',NULL  );
INSERT INTO `enumvalue` VALUES ('3','PaymentStatus', 'REFUNDED', '退款完成','zh_CN', b'0', '2020-03-23 21:06:34',NULL,'2020-03-23 21:06:34',NULL  );
INSERT INTO `enumvalue` VALUES ('4','PaymentStatus', 'PARTPAID', '部分付款','zh_CN', b'0','2020-03-23 21:06:34',NULL,'2020-03-23 21:06:34',NULL  );
INSERT INTO `enumvalue` VALUES ('5','PaymentStatus', 'REFUNDEDING', '退款申请中', 'zh_CN', b'0','2020-03-23 21:06:34',NULL,'2020-03-23 21:06:34',NULL  );
INSERT INTO `enumvalue` VALUES ('6','PaymentStatus', 'NOTPAID', 'NOTPAID', 'en_US', b'0','2020-03-23 21:06:34',NULL,'2020-03-23 21:06:34',NULL  );
INSERT INTO `enumvalue` VALUES ('7','PaymentStatus', 'PAID', 'PAID', 'en_US', b'0','2020-03-23 21:06:34',NULL,'2020-03-23 21:06:34',NULL  );
INSERT INTO `enumvalue` VALUES ('8','PaymentStatus', 'REFUNDED', 'REFUNDED', 'en_US', b'0','2020-03-23 21:06:34',NULL,'2020-03-23 21:06:34',NULL  );
INSERT INTO `enumvalue` VALUES ('9','PaymentStatus', 'PARTPAID', 'PARTPAID', 'en_US', b'0','2020-03-23 21:06:34',NULL,'2020-03-23 21:06:34',NULL  );
INSERT INTO `enumvalue` VALUES ('10','PaymentStatus', 'REFUNDEDING', 'REFUNDEDING', 'en_US', b'0','2020-03-23 21:06:34',NULL,'2020-03-23 21:06:34',NULL  );
COMMIT;

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `pk` varchar(36) NOT NULL COMMENT '主键',
  `title` varchar(255) NOT NULL COMMENT '公告标题',
  `content` text NOT NULL COMMENT '公告内容',
  `enable` bit(1) DEFAULT 1 COMMENT '是否启用(1-启用默认,0-禁用)',
  `is_top` bit(1) DEFAULT 0 COMMENT '是否置顶(1-已置顶,0-未置顶默认)',
  `priority` int(11) COMMENT '优先级',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `update_by` varchar(255) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;
