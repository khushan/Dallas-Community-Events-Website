-- MySQL dump 10.13  Distrib 5.6.13, for Win64 (x86_64)
--
-- Host: localhost    Database: dfwevents
-- ------------------------------------------------------
-- Server version	5.5.11-log

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
-- Table structure for table `events`
--

DROP TABLE IF EXISTS `events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `events` (
  `event_id` int(10) NOT NULL DEFAULT '0',
  `event_name` varchar(15) DEFAULT NULL,
  `event_desc` varchar(50) DEFAULT NULL,
  `event_venue` varchar(20) DEFAULT NULL,
  `event_date` date DEFAULT NULL,
  `event_time` varchar(20) DEFAULT NULL,
  `Approved` varchar(5) DEFAULT '',
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `events`
--

LOCK TABLES `events` WRITE;
/*!40000 ALTER TABLE `events` DISABLE KEYS */;
INSERT INTO `events` VALUES (0,'Holi','Hosted by ISA','UTD','2014-06-06','7 PM','Y'),(1,'Ganpati','Ganesh Sthapna','DFW-Mitra Mandal','2014-05-05','5 PM','Y'),(2,'IWEEK','International Week','UTD Activity Center','2014-05-16','19:00','Y'),(3,'Career Week','Career growth','UTD','2014-04-26','09:00',''),(4,'Diwali','Diwali Fest','DFW Community Hall','2014-06-20','17:00','Y'),(5,'tp','tp','tp','2014-04-25','09:28',''),(6,'Activity Week','Sports','UTD','2014-06-21','09:00','N'),(7,'SpringActivity','Sports','UTD','2014-06-13','21:00','Y');
/*!40000 ALTER TABLE `events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `memberdetails`
--

DROP TABLE IF EXISTS `memberdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `memberdetails` (
  `name` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `contact` varchar(10) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `memberdetails`
--

LOCK TABLES `memberdetails` WRITE;
/*!40000 ALTER TABLE `memberdetails` DISABLE KEYS */;
INSERT INTO `memberdetails` VALUES ('Gandhali Atre','7815 McCallum Blvd Apt 11103','4096922706','gha130030@utdallas.edu','gandhaliatre','VeWl0egaBACExsSOTHVUSw=='),('Nishi Yeotikar','7815 McCallum Blvd Apt 11103','498689378','gha130030@utdallas.edu','nishi','qevSENZ19+h/Jse9JQURTQ=='),('Admin admin','UTD','4096922706','atregandhali88@gmail.com','admin','aliv/jZ2ur6kYXLP+CeJFQ==');
/*!40000 ALTER TABLE `memberdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pickup_service`
--

DROP TABLE IF EXISTS `pickup_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pickup_service` (
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `address1` varchar(50) NOT NULL,
  `address2` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `state` varchar(50) NOT NULL,
  `datetime` varchar(50) NOT NULL,
  `contact` varchar(15) NOT NULL,
  `message` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pickup_service`
--

LOCK TABLES `pickup_service` WRITE;
/*!40000 ALTER TABLE `pickup_service` DISABLE KEYS */;
INSERT INTO `pickup_service` VALUES ('Khushan','Adatiya','7825 McCullum Blvd, Apt # 1303','','Dallas','TX','2014-04-19T23:58','7035011247','byf '),('Khushan','Adatiya','7825 McCullum Blvd, Apt # 1303','','Dallas','TX','2014-04-08T11:58','7035011247',' fv'),('Khushan','Adatiya','7825 McCullum Blvd, Apt # 1303','','Dallas','TX','2014-04-12T11:58','7035011247','fghghn '),('Khushan','Adatiya','7825 McCullum Blvd, Apt # 1303','','Dallas','TX','2014-04-12T11:58','7035011247','fghghn '),('Khushan','Adatiya','7825 McCullum Blvd, Apt # 1303','','Dallas','TX','2014-04-12T11:58','7035011247','fghghn '),('Khushan','Adatiya','7825 McCullum Blvd, Apt # 1303','','Dallas','TX','2014-04-01T11:58','7035011247','xyz '),('Khushan','Adatiya','7825 McCullum Blvd, Apt # 1303','','Dallas','TX','2012-11-30T12:59','7035011221','ABCD '),('Gandhali','Atre','7815 McCallum Blvd Apt 11103','Dallas','Dallas','Texas','0001-09-12T21:00','4096922706',' ');
/*!40000 ALTER TABLE `pickup_service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registration` (
  `User` varchar(20) DEFAULT NULL,
  `Password` varchar(15) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Contact` varchar(20) DEFAULT NULL,
  `EventName` varchar(30) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Note` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registration`
--

LOCK TABLES `registration` WRITE;
/*!40000 ALTER TABLE `registration` DISABLE KEYS */;
INSERT INTO `registration` VALUES ('Madhu','Gandhali Atre','madhumita9dange@gmail.com','4096922706','Holi','2014-05-05','7815 McCallum Blvd Apt 11103 Dallas Dallas Texas 75252USA','Non veg'),('Madhu','Gandhali Atre','madhumita9dange@gmail.com','4096922706','IWEEK','2014-05-05','7815 McCallum Blvd Apt 11103 Dallas Dallas Texas 75252USA','Non veg');
/*!40000 ALTER TABLE `registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoppingcart`
--

DROP TABLE IF EXISTS `shoppingcart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoppingcart` (
  `TransID` varchar(50) NOT NULL,
  `prod1` varchar(20) NOT NULL,
  `quan1` int(11) NOT NULL,
  `subTotal1` float NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `country` varchar(20) NOT NULL,
  `state` varchar(20) NOT NULL,
  `city` varchar(20) NOT NULL,
  `address1` varchar(50) NOT NULL,
  `address2` varchar(50) NOT NULL,
  `cardtype` varchar(20) NOT NULL,
  `cardno` varchar(20) NOT NULL,
  `securityno` int(11) NOT NULL,
  `expirymonth` int(11) NOT NULL,
  `expiryyear` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoppingcart`
--

LOCK TABLES `shoppingcart` WRITE;
/*!40000 ALTER TABLE `shoppingcart` DISABLE KEYS */;
INSERT INTO `shoppingcart` VALUES ('3004201411','1',1,1,'1','1','1','1','1','1','1','1','1',1,1,1),('3004201411','1',1,1,'1','1','1','1','1','1','1','1','1',1,1,1),('3004201411','1',1,1,'1','1','1','1','1','1','1','1','1',1,1,1),('3004201411','1',1,1,'1','1','1','1','1','1','1','1','1',1,1,1),('3004201411','1',1,1,'1','1','1','1','1','1','1','1','1',1,1,1),('3004201411','1',1,1,'1','1','1','1','1','1','1','1','1',1,1,1),('30042014jhjhb','1',1,15.99,'jhj','hb','India','3','n','hbh','bfd','Visa Card','2',-2,-2,1),('01052014KhushanAdatiya','3',2,99.98,'Khushan','Adatiya','India','0','Richardson','2600 WATERVIEW PKWY','3517','Visa Card','1234567890123456',123,12,2016),('01052014GandhaliAtre','2',2,11.98,'Gandhali','Atre','India','1','Dallas','xyz','abc','Master Card','1234567980123456',123,3,2015),('01052014GandhaliAtre','1',1,15.99,'Gandhali','Atre','US','Select State','Dallas','7815 McCallum Blvd Apt 11103','Dallas','Visa Card','1234567891234567',987,7,2014);
/*!40000 ALTER TABLE `shoppingcart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `statelist`
--

DROP TABLE IF EXISTS `statelist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `statelist` (
  `country` varchar(30) NOT NULL,
  `state` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statelist`
--

LOCK TABLES `statelist` WRITE;
/*!40000 ALTER TABLE `statelist` DISABLE KEYS */;
INSERT INTO `statelist` VALUES ('India','New Delhi'),('India','Mumbai'),('India','Pune'),('India','kalkata'),('India','Chennai'),('US','Dallas'),('US','New York'),('US','Washington'),('US','Florida'),('US','California');
/*!40000 ALTER TABLE `statelist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscription_details`
--

DROP TABLE IF EXISTS `subscription_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subscription_details` (
  `username` varchar(50) NOT NULL,
  `TransID` varchar(50) NOT NULL,
  `prod1` varchar(50) NOT NULL,
  `quan1` double NOT NULL,
  `subTotal1` double NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `country` varchar(50) NOT NULL,
  `state` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `address1` varchar(50) NOT NULL,
  `address2` varchar(50) NOT NULL,
  `cardtype` varchar(50) NOT NULL,
  `cardno` varchar(50) NOT NULL,
  `securityno` int(11) NOT NULL,
  `expirymonth` int(11) NOT NULL,
  `expiryyear` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscription_details`
--

LOCK TABLES `subscription_details` WRITE;
/*!40000 ALTER TABLE `subscription_details` DISABLE KEYS */;
INSERT INTO `subscription_details` VALUES ('khushan@gmail.com','01052014khushanAdatiya','yearly',4,400,'khushan','Adatiya','US','1','Dallas','7825 McCullum Blvd, Apt # 1303','11103','Master Card','1234567890123456',123,12,2036),('khushan@gmail.com','01052014GandhaliATRE','yearly',1,100,'Gandhali','ATRE','US','1','sfdv','fv','sdfv','Visa Card','1234567890123456',123,12,2014);
/*!40000 ALTER TABLE `subscription_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `user_name` varchar(30) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('Gandhali','atre'),('gha','atre'),('gha','atre'),('gha','atre'),('gha','atre'),('khushan','adatiya'),('sam','dave'),('john','wright'),('nishi','yeo'),('hu','bhj'),('tanvi','patil'),('Tanvi','Patil'),('Roger','Clark'),('admin','admin');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-05-01 14:56:54
