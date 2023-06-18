-- MySQL dump 10.13  Distrib 5.7.39, for Win64 (x86_64)
--
-- Host: localhost    Database: school_life
-- ------------------------------------------------------
-- Server version	5.7.39-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `rainy_shop_classify`
--

DROP TABLE IF EXISTS `rainy_shop_classify`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rainy_shop_classify` (
  `shop_type` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='店铺分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rainy_shop_classify`
--

LOCK TABLES `rainy_shop_classify` WRITE;
/*!40000 ALTER TABLE `rainy_shop_classify` DISABLE KEYS */;
/*!40000 ALTER TABLE `rainy_shop_classify` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rainy_shop_employee`
--

DROP TABLE IF EXISTS `rainy_shop_employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rainy_shop_employee` (
  `employee_name` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `isdroped` smallint(6) NOT NULL,
  `phone` varchar(11) COLLATE utf8mb4_bin NOT NULL,
  `email` varchar(20) COLLATE utf8mb4_bin NOT NULL,
  `gender` varchar(10) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='员工表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rainy_shop_employee`
--

LOCK TABLES `rainy_shop_employee` WRITE;
/*!40000 ALTER TABLE `rainy_shop_employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `rainy_shop_employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rainy_shop_good_comment`
--

DROP TABLE IF EXISTS `rainy_shop_good_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rainy_shop_good_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `content` varchar(1000) COLLATE utf8mb4_bin NOT NULL,
  `comment_time` datetime NOT NULL,
  `isdeleted` smallint(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='商品评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rainy_shop_good_comment`
--

LOCK TABLES `rainy_shop_good_comment` WRITE;
/*!40000 ALTER TABLE `rainy_shop_good_comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `rainy_shop_good_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rainy_shop_goods`
--

DROP TABLE IF EXISTS `rainy_shop_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rainy_shop_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `goods_price` double NOT NULL,
  `goods_image` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `good_description` varchar(1000) COLLATE utf8mb4_bin DEFAULT NULL,
  `goods_isdroped` smallint(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='商品表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rainy_shop_goods`
--

LOCK TABLES `rainy_shop_goods` WRITE;
/*!40000 ALTER TABLE `rainy_shop_goods` DISABLE KEYS */;
/*!40000 ALTER TABLE `rainy_shop_goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rainy_shop_history_orders`
--

DROP TABLE IF EXISTS `rainy_shop_history_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rainy_shop_history_orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `signature` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL,
  `user_phone` varchar(11) COLLATE utf8mb4_bin NOT NULL,
  `gender` varchar(10) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rainy_shop_history_orders`
--

LOCK TABLES `rainy_shop_history_orders` WRITE;
/*!40000 ALTER TABLE `rainy_shop_history_orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `rainy_shop_history_orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rainy_shop_info`
--

DROP TABLE IF EXISTS `rainy_shop_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rainy_shop_info` (
  `shop_name` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `shop_rank` int(11) DEFAULT NULL,
  `shop_type` varchar(10) COLLATE utf8mb4_bin NOT NULL,
  `shop_img` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `shop_address` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `shop_phone` varchar(11) COLLATE utf8mb4_bin NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `update_time` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='店铺信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rainy_shop_info`
--

LOCK TABLES `rainy_shop_info` WRITE;
/*!40000 ALTER TABLE `rainy_shop_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `rainy_shop_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rainy_shop_orders`
--

DROP TABLE IF EXISTS `rainy_shop_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rainy_shop_orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_time` datetime NOT NULL,
  `user_address` varchar(20) COLLATE utf8mb4_bin NOT NULL,
  `user_phone` varchar(11) COLLATE utf8mb4_bin NOT NULL,
  `all_money` double NOT NULL,
  `user_id` int(11) NOT NULL,
  `goods_name` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='商家订单表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rainy_shop_orders`
--

LOCK TABLES `rainy_shop_orders` WRITE;
/*!40000 ALTER TABLE `rainy_shop_orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `rainy_shop_orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rainy_user_history_orders`
--

DROP TABLE IF EXISTS `rainy_user_history_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rainy_user_history_orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `goods_name` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `all_money` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='历史订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rainy_user_history_orders`
--

LOCK TABLES `rainy_user_history_orders` WRITE;
/*!40000 ALTER TABLE `rainy_user_history_orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `rainy_user_history_orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `nick_name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `user_role` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-24  2:14:40
