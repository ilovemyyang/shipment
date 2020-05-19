
DROP TABLE IF EXISTS `t_shipment_node`;
CREATE TABLE IF NOT EXISTS `t_shipment_node` (
  `id` varchar(36) NOT NULL COMMENT '主键',
  `topology_id` varchar(36) NOT NULL COMMENT '拓扑id',
  `node_name` varchar(100) DEFAULT NULL COMMENT '节点名称',
  `floor_number` INT UNSIGNED NOT NULL COMMENT '层编号',
  `node_status` varchar(100) NOT NULL COMMENT '状态，生效，有效等',
  `adjustment_status` varchar(100) NOT NULL COMMENT '调整状态，调整中，调整完成',
  `proportion` decimal(20,2) DEFAULT NULL COMMENT '占父节点数量比例，来自父分割则小于1，来自父合并则等于1',
  `quantity_formula` varchar(200) DEFAULT NULL COMMENT '扩展用,数量计算公式',
  `current_quantity` decimal(20,2) DEFAULT NULL COMMENT '当前数量',
  `tenant_code` VARCHAR(45) NOT NULL DEFAULT '1' COMMENT '租户ID',
  `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
  `update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
  `create_user` VARCHAR(45) DEFAULT NULL COMMENT '创建人',
  `update_user` VARCHAR(45) DEFAULT NULL COMMENT '修改人',
  `deleted` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否删除：0未删、1删除、2永久删除',
  `version` INT UNSIGNED NOT NULL DEFAULT 1 COMMENT '版本号',
  PRIMARY KEY (`id`)
  )
ENGINE = InnoDB
COMMENT = '出货节点';


DROP TABLE IF EXISTS `t_shipment_adjustment_task`;
CREATE TABLE IF NOT EXISTS `t_shipment_adjustment_task` (
  `id` varchar(36) NOT NULL COMMENT '主键',
  `topology_id` varchar(36) NOT NULL COMMENT '拓扑id',
  `task_status` varchar(100) NOT NULL COMMENT '状态，未处理，处理中，已完成等',
  `adjustment_quantity` decimal(20,2) DEFAULT NULL COMMENT '调整数量，正代表加，负代表减',
  `current_quantity` decimal(20,2) DEFAULT NULL COMMENT '当前数量',
  `tenant_code` VARCHAR(45) NOT NULL DEFAULT '1' COMMENT '租户ID',
  `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
  `update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
  `create_user` VARCHAR(45) DEFAULT NULL COMMENT '创建人',
  `update_user` VARCHAR(45) DEFAULT NULL COMMENT '修改人',
  `deleted` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否删除：0未删、1删除、2永久删除',
  `version` INT UNSIGNED NOT NULL DEFAULT 1 COMMENT '版本号',
  PRIMARY KEY (`id`)
  )
ENGINE = InnoDB
COMMENT = '出货调整任务';


DROP TABLE IF EXISTS `t_shipment_node_parent_line`;
CREATE TABLE IF NOT EXISTS `t_shipment_node_parent_line` (
  `id` varchar(36) NOT NULL COMMENT '主键',
  `topology_id` varchar(36) NOT NULL COMMENT '拓扑id',
  `node_id` varchar(36) NOT NULL COMMENT '节点id',
  `parent_node_id` varchar(36) NOT NULL COMMENT '父节点id',
  `parent_proportion` decimal(20,2) DEFAULT NULL COMMENT '扩展用，所占父节点数量比例',
  `tenant_code` VARCHAR(45) NOT NULL DEFAULT '1' COMMENT '租户ID',
  `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
  `update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
  `create_user` VARCHAR(45) DEFAULT NULL COMMENT '创建人',
  `update_user` VARCHAR(45) DEFAULT NULL COMMENT '修改人',
  `deleted` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否删除：0未删、1删除、2永久删除',
  `version` INT UNSIGNED NOT NULL DEFAULT 1 COMMENT '版本号',
  PRIMARY KEY (`id`)
  )
ENGINE = InnoDB
COMMENT = '节点父节点对应关系表';

DROP TABLE IF EXISTS `t_shipment_node_route_line`;
CREATE TABLE IF NOT EXISTS `t_shipment_node_route_line` (
  `id` varchar(36) NOT NULL COMMENT '主键',
  `topology_id` varchar(36) NOT NULL COMMENT '拓扑id',
  `node_id` varchar(36) NOT NULL COMMENT '节点id',
  `route_node_id` varchar(36) NOT NULL COMMENT '路由节点id',
  `route_floor_number` INT UNSIGNED NOT NULL COMMENT '路由层编号',
  `tenant_code` VARCHAR(45) NOT NULL DEFAULT '1' COMMENT '租户ID',
  `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
  `update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
  `create_user` VARCHAR(45) DEFAULT NULL COMMENT '创建人',
  `update_user` VARCHAR(45) DEFAULT NULL COMMENT '修改人',
  `deleted` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否删除：0未删、1删除、2永久删除',
  `version` INT UNSIGNED NOT NULL DEFAULT 1 COMMENT '版本号',
  PRIMARY KEY (`id`)
  )
ENGINE = InnoDB
COMMENT = '节点路由关系表--用于支持调整任意节点数量，如果出现跨层，就失效了';