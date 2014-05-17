DROP TABLE IF EXISTS `SHOP_PIC`;
CREATE TABLE IF NOT EXISTS `SHOP_PIC` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `shop_id` BIGINT NULL,
  `pic_name` varchar(256) NULL,
  `created_by` varchar(150) NOT NULL,
  `modified_by` varchar(150) NOT NULL,
  `created_ts` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_ts` TIMESTAMP NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (shop_id)
    REFERENCES SHOP(id)
);

DELIMITER $$
CREATE PROCEDURE ADD_COLUMN()
BEGIN
    DECLARE _count INT;
    SET _count = (  SELECT COUNT(*)
                    FROM INFORMATION_SCHEMA.COLUMNS
                    WHERE   TABLE_NAME = 'SHOP' AND
                            COLUMN_NAME = 'balance');
    IF _count = 0 THEN
        ALTER TABLE SHOP
            ADD COLUMN `balance` DECIMAL(10,2) NOT NULL DEFAULT 0.00;
    END IF;

    SET _count = (  SELECT COUNT(*)
                    FROM INFORMATION_SCHEMA.COLUMNS
                    WHERE   TABLE_NAME = 'SHOP' AND
                            COLUMN_NAME = 'point');
    IF _count = 0 THEN
        ALTER TABLE SHOP
            ADD COLUMN `point` DECIMAL(10,2) NOT NULL DEFAULT 0.00;
    END IF;
END $$
DELIMITER ;

CALL ADD_COLUMN();
DROP PROCEDURE ADD_COLUMN;