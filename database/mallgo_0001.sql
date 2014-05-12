DROP TABLE IF EXISTS `SHOP`;
CREATE TABLE IF NOT EXISTS `SHOP` (
  `id` int(11) NOT NULL,
  `name` varchar(80) DEFAULT NULL,
  `status` varchar(2) NOT NULL,
  `long` float ,
  `lat` float ,
  `address` varchar(256) DEFAULT NULL,
  `city` varchar(80) DEFAULT NULL,
  `state` varchar(80) DEFAULT NULL,
  `zip` varchar(5) DEFAULT NULL,
  `phone` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;