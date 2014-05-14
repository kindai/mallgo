DROP TABLE IF EXISTS `DOMAIN`;
CREATE TABLE IF NOT EXISTS `DOMAIN` (
  `id`  BIGINT NOT NULL,
  `name` varchar(32) NOT NULL,
  `usage` varchar(256) NOT NULL,
  `alias` varchar(256) NOT NULL,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `DOMAIN_VALUE`;
CREATE TABLE IF NOT EXISTS `DOMAIN_VALUE` (
  `id`  BIGINT NOT NULL,
  `domain_id`  BIGINT NOT NULL,
  `low_value`  BIGINT NOT NULL,
  `hight_value`  BIGINT NOT NULL,
  `value` varchar(256) NOT NULL,
  `alias` varchar(256) NOT NULL,
  `sort_order` INT NOT NULL,
  `is_active` BIT(1) NOT NULL,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (domain_id) 
    REFERENCES DOMAIN(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
DROP TABLE IF EXISTS `USER`;
CREATE TABLE IF NOT EXISTS `USER` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `username` varchar(300) NOT NULL,
  `password` BINARY(32) NOT NULL,
  `email` varchar(256) NOT NULL,
  `status` BIGINT NOT NULL,
  `city` BIGINT,
  `state` BIGINT,
  `country` BIGINT,
  `zip` varchar(256),
  `phone` varchar(256),
  `languagePreference` BIGINT,
  `balance` DECIMAL(10,2) NOT NULL DEFAULT 0.00,
  `point` DECIMAL(10,2) NOT NULL DEFAULT 0.00,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE USER AUTO_INCREMENT=10000000000;

DROP TABLE IF EXISTS `ADDRESS`;
CREATE TABLE IF NOT EXISTS `ADDRESS` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT,
  `shop_id` BIGINT,
  `city` BIGINT NOT NULL,
  `state` BIGINT NOT NULL,
  `country` BIGINT NOT NULL,
  `detail` varchar(512) NOT NULL,
  `zip` varchar(80) NOT NULL,
  `phone_number` varchar(80),
  `reciver_name` varchar(80),
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE ADDRESS AUTO_INCREMENT=20000000000;

DROP TABLE IF EXISTS `SHOP`;
CREATE TABLE IF NOT EXISTS `SHOP` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT NOT NULL,
  `address_id` BIGINT NOT NULL,
  `name` varchar(256) NOT NULL,
  `status` BIGINT NOT NULL,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (user_id) 
    REFERENCES USER(id),
  FOREIGN KEY (address_id) 
    REFERENCES ADDRESS(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE SHOP AUTO_INCREMENT=30000000000;

DROP TABLE IF EXISTS `CATEGORY`;
CREATE TABLE IF NOT EXISTS `CATEGORY` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` varchar(256) NOT NULL,
  `description` varchar(5000),
  `parent_id` BIGINT,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (parent_id) 
    REFERENCES CATEGORY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE CATEGORY AUTO_INCREMENT=40000000000;

DROP TABLE IF EXISTS `TAG`;
CREATE TABLE IF NOT EXISTS `TAG` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` varchar(256) NOT NULL,
  `description` varchar(5000),
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE TAG AUTO_INCREMENT=50000000000;

DROP TABLE IF EXISTS `PRODUCT`;
CREATE TABLE IF NOT EXISTS `PRODUCT` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `category_id` BIGINT NOT NULL,
  `shop_id` BIGINT NOT NULL,
  `product_type` BIGINT NOT NULL,
  `name` varchar(256) NOT NULL,
  `description` varchar(5000),
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (category_id) 
    REFERENCES CATEGORY(id),
  FOREIGN KEY (shop_id) 
    REFERENCES SHOP(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE PRODUCT AUTO_INCREMENT=60000000000;

DROP TABLE IF EXISTS `RECOMMENDATION`;
CREATE TABLE IF NOT EXISTS `RECOMMENDATION` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `from_product_id` BIGINT NOT NULL,
  `to_product_id` BIGINT NOT NULL,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (from_product_id) 
    REFERENCES RECOMMENDATION(id),
  FOREIGN KEY (to_product_id) 
    REFERENCES RECOMMENDATION(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE RECOMMENDATION AUTO_INCREMENT=70000000000;

DROP TABLE IF EXISTS `ITEM`;
CREATE TABLE IF NOT EXISTS `ITEM` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `product_id` BIGINT NOT NULL,
  `list_price` DECIMAL(10,2) NOT NULL,
  `origin_price` DECIMAL(10,2) NOT NULL,
  `status` BIGINT NOT NULL,
  `in_stock_quantity` INT NOT NULL,
  `attribute1` varchar(256) NOT NULL,
  `attribute2` varchar(256) NOT NULL,
  `attribute3` varchar(256) NOT NULL,
  `attribute4` varchar(256) NOT NULL,
  `attribute5` varchar(256) NOT NULL,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (product_id) 
    REFERENCES PRODUCT(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE ITEM AUTO_INCREMENT=80000000000;

DROP TABLE IF EXISTS `CART`;
CREATE TABLE IF NOT EXISTS `CART` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT NOT NULL,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (user_id) 
    REFERENCES USER(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE CART AUTO_INCREMENT=90000000000;

DROP TABLE IF EXISTS `CART_ITEM`;
CREATE TABLE IF NOT EXISTS `CART_ITEM` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `item_id` BIGINT NOT NULL,
  `cart_id` BIGINT NOT NULL,
  `quantity` INT NOT NULL,
  `in_stock` BIT(1) NOT NULL,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (cart_id) 
    REFERENCES CART(id),
  FOREIGN KEY (item_id) 
    REFERENCES ITEM(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE CART_ITEM AUTO_INCREMENT=100000000000;

DROP TABLE IF EXISTS `COURIER`;
CREATE TABLE IF NOT EXISTS `COURIER` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` varchar(256) NOT NULL,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE COURIER AUTO_INCREMENT=150000000000;

DROP TABLE IF EXISTS `PAYMENT`;
CREATE TABLE IF NOT EXISTS `PAYMENT` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` varchar(256) NOT NULL,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE PAYMENT AUTO_INCREMENT=160000000000;

DROP TABLE IF EXISTS `ORDERS`;
CREATE TABLE IF NOT EXISTS `ORDERS` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT NOT NULL,
  `ship_address_id` BIGINT NOT NULL,
  `courier_id` BIGINT NOT NULL,
  `payment_id` BIGINT NOT NULL,
  `total_price` DECIMAL(10,2) NOT NULL,
  `order_date`  DATE NOT NULL,
  `status` BIGINT NOT NULL,
  `type` BIGINT NOT NULL,
  `code` varchar(200),
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (user_id) 
    REFERENCES USER(id),
  FOREIGN KEY (ship_address_id) 
    REFERENCES ADDRESS(id),
  FOREIGN KEY (courier_id) 
    REFERENCES COURIER(id),
  FOREIGN KEY (payment_id) 
    REFERENCES PAYMENT(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE ORDERS AUTO_INCREMENT=130000000000;

DROP TABLE IF EXISTS `COMMENT`;
CREATE TABLE IF NOT EXISTS `COMMENT` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `product_id` BIGINT NOT NULL,
  `user_id` BIGINT NOT NULL,
  `parent_id` BIGINT,
  `order_id` BIGINT NOT NULL,
  `content` varchar(5000),
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (product_id) 
    REFERENCES PRODUCT(id),
  FOREIGN KEY (user_id) 
    REFERENCES USER(id),
  FOREIGN KEY (parent_id) 
    REFERENCES COMMENT(id),
  FOREIGN KEY (order_id) 
    REFERENCES ORDERS(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE COMMENT AUTO_INCREMENT=110000000000;

DROP TABLE IF EXISTS `LINE_ITEM`;
CREATE TABLE IF NOT EXISTS `LINE_ITEM` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `order_id` BIGINT NOT NULL,
  `item_id` BIGINT NOT NULL,
  `quantity` INT NOT NULL,
  `unitPrice` DECIMAL(10,2) NOT NULL,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (order_id) 
    REFERENCES ORDERS(id),
  FOREIGN KEY (item_id) 
    REFERENCES ITEM(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE LINE_ITEM AUTO_INCREMENT=120000000000;

DROP TABLE IF EXISTS `ORDER_AUDIT_LOG`;
CREATE TABLE IF NOT EXISTS `ORDER_AUDIT_LOG` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `order_id` BIGINT NOT NULL,
  `action_type` BIGINT NOT NULL,
  `action_date` DATE NOT NULL,
  `comment` varchar(1000),
  `modifier` varchar(300) NOT NULL,
  `created_by` varchar(300) NOT NULL,
  `modified_by` varchar(300) NOT NULL,
  `created_ts` DATE NOT NULL,
  `modified_ts` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (order_id) 
    REFERENCES ORDERS(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE ORDER_AUDIT_LOG AUTO_INCREMENT=140000000000;