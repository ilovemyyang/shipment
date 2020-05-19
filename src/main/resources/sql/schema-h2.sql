SET MODE MYSQL;


DROP TABLE IF EXISTS t_shipment_node;
CREATE TABLE IF NOT EXISTS t_shipment_node (
  id varchar(36) NOT NULL ,
  topology_id varchar(36) NOT NULL ,
  node_name varchar(100) DEFAULT NULL ,
  floor_number INT UNSIGNED NOT NULL ,
  node_status varchar(100) NOT NULL ,
  adjustment_status varchar(100) NOT NULL ,
  proportion decimal(20,2) DEFAULT NULL ,
  quantity_formula varchar(200) DEFAULT NULL ,
  current_quantity decimal(20,2) DEFAULT NULL ,
  tenant_code VARCHAR(45) NOT NULL DEFAULT '1' ,
  create_time DATETIME DEFAULT NULL ,
  update_time DATETIME DEFAULT NULL ,
  create_user VARCHAR(45) DEFAULT NULL ,
  update_user VARCHAR(45) DEFAULT NULL ,
  deleted INT UNSIGNED NOT NULL DEFAULT 0 ,
  version INT UNSIGNED NOT NULL DEFAULT 1 ,
  PRIMARY KEY (id)
  )
;


DROP TABLE IF EXISTS t_shipment_adjustment_task;
CREATE TABLE IF NOT EXISTS t_shipment_adjustment_task (
  id varchar(36) NOT NULL ,
  topology_id varchar(36) NOT NULL ,
  task_status varchar(100) NOT NULL ,
  adjustment_quantity decimal(20,2) DEFAULT NULL ,
  current_quantity decimal(20,2) DEFAULT NULL ,
  tenant_code VARCHAR(45) NOT NULL DEFAULT '1' ,
  create_time DATETIME DEFAULT NULL ,
  update_time DATETIME DEFAULT NULL ,
  create_user VARCHAR(45) DEFAULT NULL ,
  update_user VARCHAR(45) DEFAULT NULL ,
  deleted INT UNSIGNED NOT NULL DEFAULT 0 ,
  version INT UNSIGNED NOT NULL DEFAULT 1 ,
  PRIMARY KEY (id)
  )
;


DROP TABLE IF EXISTS t_shipment_node_parent_line;
CREATE TABLE IF NOT EXISTS t_shipment_node_parent_line (
  id varchar(36) NOT NULL ,
  topology_id varchar(36) NOT NULL ,
  node_id varchar(36) NOT NULL ,
  parent_node_id varchar(36) NOT NULL ,
  parent_proportion decimal(20,2) DEFAULT NULL ,
  tenant_code VARCHAR(45) NOT NULL DEFAULT '1' ,
  create_time DATETIME DEFAULT NULL ,
  update_time DATETIME DEFAULT NULL ,
  create_user VARCHAR(45) DEFAULT NULL ,
  update_user VARCHAR(45) DEFAULT NULL ,
  deleted INT UNSIGNED NOT NULL DEFAULT 0 ,
  version INT UNSIGNED NOT NULL DEFAULT 1 ,
  PRIMARY KEY (id)
  )
;

DROP TABLE IF EXISTS t_shipment_node_route_line;
CREATE TABLE IF NOT EXISTS t_shipment_node_route_line (
  id varchar(36) NOT NULL ,
  topology_id varchar(36) NOT NULL ,
  node_id varchar(36) NOT NULL ,
  route_node_id varchar(36) NOT NULL ,
  route_floor_number INT UNSIGNED NOT NULL ,
  tenant_code VARCHAR(45) NOT NULL DEFAULT '1' ,
  create_time DATETIME DEFAULT NULL ,
  update_time DATETIME DEFAULT NULL ,
  create_user VARCHAR(45) DEFAULT NULL ,
  update_user VARCHAR(45) DEFAULT NULL ,
  deleted INT UNSIGNED NOT NULL DEFAULT 0 ,
  version INT UNSIGNED NOT NULL DEFAULT 1 ,
  PRIMARY KEY (id)
  )
  ;
