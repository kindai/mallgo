-- phpMyAdmin SQL Dump
-- http://www.phpmyadmin.net
--
-- 生成日期: 2013 年 04 月 07 日 17:52

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `LLjxCnnzONzxsZidbJXe`
--

-- --------------------------------------------------------

--
-- 表的结构 `ACCOUNT`
--

DROP TABLE IF EXISTS `ACCOUNT`;
CREATE TABLE IF NOT EXISTS `ACCOUNT` (
  `userid` varchar(80) NOT NULL,
  `email` varchar(80) NOT NULL,
  `firstname` varchar(80) NOT NULL,
  `lastname` varchar(80) NOT NULL,
  `status` varchar(2) DEFAULT NULL,
  `addr1` varchar(80) NOT NULL,
  `addr2` varchar(40) DEFAULT NULL,
  `city` varchar(80) NOT NULL,
  `state` varchar(80) NOT NULL,
  `zip` varchar(20) NOT NULL,
  `country` varchar(20) NOT NULL,
  `phone` varchar(80) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `ACCOUNT`
--

INSERT INTO `ACCOUNT` (`userid`, `email`, `firstname`, `lastname`, `status`, `addr1`, `addr2`, `city`, `state`, `zip`, `country`, `phone`) VALUES
('j2ee', 'yourname@yourdomain.com', 'ABC', 'XYX', 'OK', '901 San Antonio Road', 'MS UCUP02-206', 'Palo Alto', 'CA', '94303', 'USA', '555-555-5555'),
('ACID', 'acid@yourdomain.com', 'ABC', 'XYX', 'OK', '901 San Antonio Road', 'MS UCUP02-206', 'Palo Alto', 'CA', '94303', 'USA', '555-555-5555');

-- --------------------------------------------------------

--
-- 表的结构 `BANNERDATA`
--

DROP TABLE IF EXISTS `BANNERDATA`;
CREATE TABLE IF NOT EXISTS `BANNERDATA` (
  `favcategory` varchar(80) NOT NULL,
  `bannername` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`favcategory`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `BANNERDATA`
--

INSERT INTO `BANNERDATA` (`favcategory`, `bannername`) VALUES
('FISH', '<image src="../images/banner_fish.gif">'),
('CATS', '<image src="../images/banner_cats.gif">'),
('DOGS', '<image src="../images/banner_dogs.gif">'),
('REPTILES', '<image src="../images/banner_reptiles.gif">'),
('BIRDS', '<image src="../images/banner_birds.gif">');

-- --------------------------------------------------------

--
-- 表的结构 `CATEGORY`
--

DROP TABLE IF EXISTS `CATEGORY`;
CREATE TABLE IF NOT EXISTS `CATEGORY` (
  `catid` varchar(10) NOT NULL,
  `name` varchar(80) DEFAULT NULL,
  `descn` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`catid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `CATEGORY`
--

INSERT INTO `CATEGORY` (`catid`, `name`, `descn`) VALUES
('FISH', 'Fish', '<image src="../images/fish_icon.gif"><font size="5" color="blue"> Fish</font>'),
('DOGS', 'Dogs', '<image src="../images/dogs_icon.gif"><font size="5" color="blue"> Dogs</font>'),
('REPTILES', 'Reptiles', '<image src="../images/reptiles_icon.gif"><font size="5" color="blue"> Reptiles</font>'),
('CATS', 'Cats', '<image src="../images/cats_icon.gif"><font size="5" color="blue"> Cats</font>'),
('BIRDS', 'Birds', '<image src="../images/birds_icon.gif"><font size="5" color="blue"> Birds</font>');

-- --------------------------------------------------------

--
-- 表的结构 `INVENTORY`
--

DROP TABLE IF EXISTS `INVENTORY`;
CREATE TABLE IF NOT EXISTS `INVENTORY` (
  `itemid` varchar(10) NOT NULL,
  `qty` int(11) NOT NULL,
  PRIMARY KEY (`itemid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `INVENTORY`
--

INSERT INTO `INVENTORY` (`itemid`, `qty`) VALUES
('EST-1', 10000),
('EST-2', 10000),
('EST-3', 10000),
('EST-4', 10000),
('EST-5', 10000),
('EST-6', 10000),
('EST-7', 10000),
('EST-8', 10000),
('EST-9', 10000),
('EST-10', 10000),
('EST-11', 10000),
('EST-12', 10000),
('EST-13', 10000),
('EST-14', 10000),
('EST-15', 10000),
('EST-16', 10000),
('EST-17', 10000),
('EST-18', 10000),
('EST-19', 10000),
('EST-20', 10000),
('EST-21', 10000),
('EST-22', 10000),
('EST-23', 10000),
('EST-24', 10000),
('EST-25', 10000),
('EST-26', 10000),
('EST-27', 10000),
('EST-28', 10000);

-- --------------------------------------------------------

--
-- 表的结构 `ITEM`
--

DROP TABLE IF EXISTS `ITEM`;
CREATE TABLE IF NOT EXISTS `ITEM` (
  `itemid` varchar(10) NOT NULL,
  `productid` varchar(10) NOT NULL,
  `listprice` decimal(10,2) DEFAULT NULL,
  `unitcost` decimal(10,2) DEFAULT NULL,
  `supplier` int(11) DEFAULT NULL,
  `status` varchar(2) DEFAULT NULL,
  `attr1` varchar(80) DEFAULT NULL,
  `attr2` varchar(80) DEFAULT NULL,
  `attr3` varchar(80) DEFAULT NULL,
  `attr4` varchar(80) DEFAULT NULL,
  `attr5` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`itemid`),
  KEY `fk_item_2` (`supplier`),
  KEY `itemProd` (`productid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `ITEM`
--

INSERT INTO `ITEM` (`itemid`, `productid`, `listprice`, `unitcost`, `supplier`, `status`, `attr1`, `attr2`, `attr3`, `attr4`, `attr5`) VALUES
('EST-1', 'FI-SW-01', '16.50', '10.00', 1, 'P', 'Large', NULL, NULL, NULL, NULL),
('EST-2', 'FI-SW-01', '16.50', '10.00', 1, 'P', 'Small', NULL, NULL, NULL, NULL),
('EST-3', 'FI-SW-02', '18.50', '12.00', 1, 'P', 'Toothless', NULL, NULL, NULL, NULL),
('EST-4', 'FI-FW-01', '18.50', '12.00', 1, 'P', 'Spotted', NULL, NULL, NULL, NULL),
('EST-5', 'FI-FW-01', '18.50', '12.00', 1, 'P', 'Spotless', NULL, NULL, NULL, NULL),
('EST-6', 'K9-BD-01', '18.50', '12.00', 1, 'P', 'Male Adult', NULL, NULL, NULL, NULL),
('EST-7', 'K9-BD-01', '18.50', '12.00', 1, 'P', 'Female Puppy', NULL, NULL, NULL, NULL),
('EST-8', 'K9-PO-02', '18.50', '12.00', 1, 'P', 'Male Puppy', NULL, NULL, NULL, NULL),
('EST-9', 'K9-DL-01', '18.50', '12.00', 1, 'P', 'Spotless Male Puppy', NULL, NULL, NULL, NULL),
('EST-10', 'K9-DL-01', '18.50', '12.00', 1, 'P', 'Spotted Adult Female', NULL, NULL, NULL, NULL),
('EST-11', 'RP-SN-01', '18.50', '12.00', 1, 'P', 'Venomless', NULL, NULL, NULL, NULL),
('EST-12', 'RP-SN-01', '18.50', '12.00', 1, 'P', 'Rattleless', NULL, NULL, NULL, NULL),
('EST-13', 'RP-LI-02', '18.50', '12.00', 1, 'P', 'Green Adult', NULL, NULL, NULL, NULL),
('EST-14', 'FL-DSH-01', '58.50', '12.00', 1, 'P', 'Tailless', NULL, NULL, NULL, NULL),
('EST-15', 'FL-DSH-01', '23.50', '12.00', 1, 'P', 'With tail', NULL, NULL, NULL, NULL),
('EST-16', 'FL-DLH-02', '93.50', '12.00', 1, 'P', 'Adult Female', NULL, NULL, NULL, NULL),
('EST-17', 'FL-DLH-02', '93.50', '12.00', 1, 'P', 'Adult Male', NULL, NULL, NULL, NULL),
('EST-18', 'AV-CB-01', '193.50', '92.00', 1, 'P', 'Adult Male', NULL, NULL, NULL, NULL),
('EST-19', 'AV-SB-02', '15.50', '2.00', 1, 'P', 'Adult Male', NULL, NULL, NULL, NULL),
('EST-20', 'FI-FW-02', '5.50', '2.00', 1, 'P', 'Adult Male', NULL, NULL, NULL, NULL),
('EST-21', 'FI-FW-02', '5.29', '1.00', 1, 'P', 'Adult Female', NULL, NULL, NULL, NULL),
('EST-22', 'K9-RT-02', '135.50', '100.00', 1, 'P', 'Adult Male', NULL, NULL, NULL, NULL),
('EST-23', 'K9-RT-02', '145.49', '100.00', 1, 'P', 'Adult Female', NULL, NULL, NULL, NULL),
('EST-24', 'K9-RT-02', '255.50', '92.00', 1, 'P', 'Adult Male', NULL, NULL, NULL, NULL),
('EST-25', 'K9-RT-02', '325.29', '90.00', 1, 'P', 'Adult Female', NULL, NULL, NULL, NULL),
('EST-26', 'K9-CW-01', '125.50', '92.00', 1, 'P', 'Adult Male', NULL, NULL, NULL, NULL),
('EST-27', 'K9-CW-01', '155.29', '90.00', 1, 'P', 'Adult Female', NULL, NULL, NULL, NULL),
('EST-28', 'K9-RT-01', '155.29', '90.00', 1, 'P', 'Adult Female', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `LINEITEM`
--

DROP TABLE IF EXISTS `LINEITEM`;
CREATE TABLE IF NOT EXISTS `LINEITEM` (
  `orderid` int(11) NOT NULL,
  `linenum` int(11) NOT NULL,
  `itemid` varchar(10) NOT NULL,
  `quantity` int(11) NOT NULL,
  `unitprice` decimal(10,2) NOT NULL,
  PRIMARY KEY (`orderid`,`linenum`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `ORDERS`
--

DROP TABLE IF EXISTS `ORDERS`;
CREATE TABLE IF NOT EXISTS `ORDERS` (
  `orderid` int(11) NOT NULL,
  `userid` varchar(80) NOT NULL,
  `orderdate` date NOT NULL,
  `shipaddr1` varchar(80) NOT NULL,
  `shipaddr2` varchar(80) DEFAULT NULL,
  `shipcity` varchar(80) NOT NULL,
  `shipstate` varchar(80) NOT NULL,
  `shipzip` varchar(20) NOT NULL,
  `shipcountry` varchar(20) NOT NULL,
  `billaddr1` varchar(80) NOT NULL,
  `billaddr2` varchar(80) DEFAULT NULL,
  `billcity` varchar(80) NOT NULL,
  `billstate` varchar(80) NOT NULL,
  `billzip` varchar(20) NOT NULL,
  `billcountry` varchar(20) NOT NULL,
  `courier` varchar(80) NOT NULL,
  `totalprice` decimal(10,2) NOT NULL,
  `billtofirstname` varchar(80) NOT NULL,
  `billtolastname` varchar(80) NOT NULL,
  `shiptofirstname` varchar(80) NOT NULL,
  `shiptolastname` varchar(80) NOT NULL,
  `creditcard` varchar(80) NOT NULL,
  `exprdate` varchar(7) NOT NULL,
  `cardtype` varchar(80) NOT NULL,
  `locale` varchar(80) NOT NULL,
  PRIMARY KEY (`orderid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `ORDERSTATUS`
--

DROP TABLE IF EXISTS `ORDERSTATUS`;
CREATE TABLE IF NOT EXISTS `ORDERSTATUS` (
  `orderid` int(11) NOT NULL,
  `linenum` int(11) NOT NULL,
  `timestamp` date NOT NULL,
  `status` varchar(2) NOT NULL,
  PRIMARY KEY (`orderid`,`linenum`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `PRODUCT`
--

DROP TABLE IF EXISTS `PRODUCT`;
CREATE TABLE IF NOT EXISTS `PRODUCT` (
  `productid` varchar(10) NOT NULL,
  `category` varchar(10) NOT NULL,
  `name` varchar(80) DEFAULT NULL,
  `descn` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`productid`),
  KEY `productCat` (`category`),
  KEY `productName` (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `PRODUCT`
--

INSERT INTO `PRODUCT` (`productid`, `category`, `name`, `descn`) VALUES
('FI-SW-01', 'FISH', 'Angelfish', '<image src="../images/fish1.gif">Salt Water fish from Australia'),
('FI-SW-02', 'FISH', 'Tiger Shark', '<image src="../images/fish4.gif">Salt Water fish from Australia'),
('FI-FW-01', 'FISH', 'Koi', '<image src="../images/fish3.gif">Fresh Water fish from Japan'),
('FI-FW-02', 'FISH', 'Goldfish', '<image src="../images/fish2.gif">Fresh Water fish from China'),
('K9-BD-01', 'DOGS', 'Bulldog', '<image src="../images/dog2.gif">Friendly dog from England'),
('K9-PO-02', 'DOGS', 'Poodle', '<image src="../images/dog6.gif">Cute dog from France'),
('K9-DL-01', 'DOGS', 'Dalmation', '<image src="../images/dog5.gif">Great dog for a Fire Station'),
('K9-RT-01', 'DOGS', 'Golden Retriever', '<image src="../images/dog1.gif">Great family dog'),
('K9-RT-02', 'DOGS', 'Labrador Retriever', '<image src="../images/dog5.gif">Great hunting dog'),
('K9-CW-01', 'DOGS', 'Chihuahua', '<image src="../images/dog4.gif">Great companion dog'),
('RP-SN-01', 'REPTILES', 'Rattlesnake', '<image src="../images/snake1.gif">Doubles as a watch dog'),
('RP-LI-02', 'REPTILES', 'Iguana', '<image src="../images/lizard1.gif">Friendly green friend'),
('FL-DSH-01', 'CATS', 'Manx', '<image src="../images/cat2.gif">Great for reducing mouse populations'),
('FL-DLH-02', 'CATS', 'Persian', '<image src="../images/cat1.gif">Friendly house cat, doubles as a princess'),
('AV-CB-01', 'BIRDS', 'Amazon Parrot', '<image src="../images/bird2.gif">Great companion for up to 75 years'),
('AV-SB-02', 'BIRDS', 'Finch', '<image src="../images/bird1.gif">Great stress reliever');

-- --------------------------------------------------------

--
-- 表的结构 `PROFILE`
--

DROP TABLE IF EXISTS `PROFILE`;
CREATE TABLE IF NOT EXISTS `PROFILE` (
  `userid` varchar(80) NOT NULL,
  `langpref` varchar(80) NOT NULL,
  `favcategory` varchar(30) DEFAULT NULL,
  `mylistopt` int(11) DEFAULT NULL,
  `banneropt` int(11) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `PROFILE`
--

INSERT INTO `PROFILE` (`userid`, `langpref`, `favcategory`, `mylistopt`, `banneropt`) VALUES
('j2ee', 'english', 'DOGS', 1, 1),
('ACID', 'english', 'CATS', 1, 1);

-- --------------------------------------------------------

--
-- 表的结构 `SEQUENCE`
--

DROP TABLE IF EXISTS `SEQUENCE`;
CREATE TABLE IF NOT EXISTS `SEQUENCE` (
  `name` varchar(30) NOT NULL,
  `nextid` int(11) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `SEQUENCE`
--

INSERT INTO `SEQUENCE` (`name`, `nextid`) VALUES
('ordernum', 1000);

-- --------------------------------------------------------

--
-- 表的结构 `SIGNON`
--

DROP TABLE IF EXISTS `SIGNON`;
CREATE TABLE IF NOT EXISTS `SIGNON` (
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `SIGNON`
--

INSERT INTO `SIGNON` (`username`, `password`) VALUES
('j2ee', 'j2ee'),
('ACID', 'ACID');

-- --------------------------------------------------------

--
-- 表的结构 `SUPPLIER`
--

DROP TABLE IF EXISTS `SUPPLIER`;
CREATE TABLE IF NOT EXISTS `SUPPLIER` (
  `suppid` int(11) NOT NULL,
  `name` varchar(80) DEFAULT NULL,
  `status` varchar(2) NOT NULL,
  `addr1` varchar(80) DEFAULT NULL,
  `addr2` varchar(80) DEFAULT NULL,
  `city` varchar(80) DEFAULT NULL,
  `state` varchar(80) DEFAULT NULL,
  `zip` varchar(5) DEFAULT NULL,
  `phone` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`suppid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

INSERT INTO `SUPPLIER` (`suppid`, `name`, `status`, `addr1`, `addr2`, `city`, `state`, `zip`, `phone`) VALUES
(1, 'XYZ Pets', 'AC', '600 Avon Way', '', 'Los Angeles', 'CA', '94024', '212-947-0797'),
(2, 'ABC Pets', 'AC', '700 Abalone Way', '', 'San Francisco ', 'CA', '94024', '415-947-0797');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
