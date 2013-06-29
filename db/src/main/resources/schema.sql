DROP TABLE IF EXISTS `permission_mst`;
DROP TABLE IF EXISTS `role_mst`;
DROP TABLE IF EXISTS `user_mst`;
DROP TABLE IF EXISTS `tenant_mst`;

CREATE  TABLE IF NOT EXISTS permission_mst (
id CHAR(36) NOT NULL ,
version INT(10) NOT NULL ,
created_date DATETIME NULL,
created_by VARCHAR(36) NULL,
last_modified_date DATETIME NULL,
last_modified_by VARCHAR(36) NULL,
status VARCHAR(20) NOT NULL,
name VARCHAR(36) NOT NULL ,
key_data VARCHAR(36) NOT NULL UNIQUE,
description varchar(255) NOT NULL,
PRIMARY KEY (id) );

CREATE  TABLE IF NOT EXISTS role_mst (
id CHAR(36) NOT NULL ,
version INT(10) NOT NULL ,
created_date DATETIME NULL,
created_by VARCHAR(36) NULL,
last_modified_date DATETIME NULL,
last_modified_by VARCHAR(36) NULL,
status VARCHAR(20) NOT NULL,
name VARCHAR(36) NOT NULL ,
key_data VARCHAR(36) NOT NULL UNIQUE,
description varchar(255) NOT NULL,
PRIMARY KEY (id) );

CREATE  TABLE IF NOT EXISTS user_mst (
id CHAR(36) NOT NULL ,
version INT(10) NOT NULL ,
created_date DATETIME NULL,
created_by VARCHAR(36) NULL,
last_modified_date DATETIME NULL,
last_modified_by VARCHAR(36) NULL,
status VARCHAR(20) NOT NULL,
user_name VARCHAR(36) NOT NULL ,
password VARCHAR(36) NOT NULL UNIQUE,
last_login DATETIME NULL,
PRIMARY KEY (id) );

CREATE  TABLE IF NOT EXISTS tenant_mst (
id CHAR(36) NOT NULL ,
version INT(10) NOT NULL ,
created_date DATETIME NULL,
created_by VARCHAR(36) NULL,
last_modified_date DATETIME NULL,
last_modified_by VARCHAR(36) NULL,
status VARCHAR(20) NOT NULL,
name VARCHAR(36) NOT NULL ,
description varchar(255) NOT NULL,
PRIMARY KEY (id) );