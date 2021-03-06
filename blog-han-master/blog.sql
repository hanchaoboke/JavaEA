-- MySQL dump 10.13  Distrib 8.0.18, for osx10.15 (x86_64)
--
-- Host: localhost    Database: banyuan
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `banyuan`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `banyuan` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `banyuan`;

--
-- Table structure for table `blog`
--

DROP TABLE IF EXISTS `blog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blog` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(128) COLLATE utf8mb4_general_ci NOT NULL,
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_blog_user` (`user_id`),
  CONSTRAINT `fk_blog_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=204 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog`
--

LOCK TABLES `blog` WRITE;
/*!40000 ALTER TABLE `blog` DISABLE KEYS */;
INSERT INTO `blog` VALUES (1,'标题1','内容1111111111111','2020-01-01 09:03:35',1),(11,'修改后的标题10','aaaaaaaa','2020-01-01 15:13:35',2),(12,'标题11','内容11 11 11 11 11 11 11 11 11 11 ','2020-01-01 15:14:36',2),(13,'标题12','内容12 12 12 12 12 12 12 12 12 12 ','2020-01-01 15:14:36',2),(14,'标题13','内容13 13 13 13 13 13 13 13 13 13 ','2020-01-01 15:14:36',2),(15,'标题14','内容14 14 14 14 14 14 14 14 14 14 ','2020-01-01 15:14:36',2),(16,'标题15','内容15 15 15 15 15 15 15 15 15 15 ','2020-01-01 15:14:36',2),(17,'标题16','内容16 16 16 16 16 16 16 16 16 16 ','2020-01-01 15:14:36',2),(18,'标题17','内容17 17 17 17 17 17 17 17 17 17 ','2020-01-01 15:14:36',2),(19,'标题18','内容18 18 18 18 18 18 18 18 18 18 ','2020-01-01 15:14:36',2),(20,'标题19','内容19 19 19 19 19 19 19 19 19 19 ','2020-01-01 15:14:36',2),(21,'标题20','内容20 20 20 20 20 20 20 20 20 20 ','2020-01-01 15:14:36',2),(22,'标题21','内容21 21 21 21 21 21 21 21 21 21 ','2020-01-01 15:14:36',2),(23,'标题22','内容22 22 22 22 22 22 22 22 22 22 ','2020-01-01 15:14:36',2),(24,'标题23','内容23 23 23 23 23 23 23 23 23 23 ','2020-01-01 15:14:36',2),(25,'标题24','内容24 24 24 24 24 24 24 24 24 24 ','2020-01-01 15:14:36',2),(26,'标题25','内容25 25 25 25 25 25 25 25 25 25 ','2020-01-01 15:14:36',2),(27,'标题26','内容26 26 26 26 26 26 26 26 26 26 ','2020-01-01 15:14:36',2),(28,'标题27','内容27 27 27 27 27 27 27 27 27 27 ','2020-01-01 15:14:36',2),(29,'标题28','内容28 28 28 28 28 28 28 28 28 28 ','2020-01-01 15:14:36',2),(30,'标题29','内容29 29 29 29 29 29 29 29 29 29 ','2020-01-01 15:14:36',2),(31,'标题30','内容30 30 30 30 30 30 30 30 30 30 ','2020-01-01 15:14:36',2),(32,'标题31','内容31 31 31 31 31 31 31 31 31 31 ','2020-01-01 15:14:36',2),(33,'标题32','内容32 32 32 32 32 32 32 32 32 32 ','2020-01-01 15:14:36',2),(34,'标题33','内容33 33 33 33 33 33 33 33 33 33 ','2020-01-01 15:14:36',2),(35,'标题34','内容34 34 34 34 34 34 34 34 34 34 ','2020-01-01 15:14:36',2),(36,'标题35','内容35 35 35 35 35 35 35 35 35 35 ','2020-01-01 15:14:36',2),(37,'标题36','内容36 36 36 36 36 36 36 36 36 36 ','2020-01-01 15:14:36',2),(38,'标题37','内容37 37 37 37 37 37 37 37 37 37 ','2020-01-01 15:14:36',2),(39,'标题38','内容38 38 38 38 38 38 38 38 38 38 ','2020-01-01 15:14:36',2),(40,'标题39','内容39 39 39 39 39 39 39 39 39 39 ','2020-01-01 15:14:36',2),(41,'标题40','内容40 40 40 40 40 40 40 40 40 40 ','2020-01-01 15:14:36',2),(42,'标题41','内容41 41 41 41 41 41 41 41 41 41 ','2020-01-01 15:14:36',2),(43,'标题42','内容42 42 42 42 42 42 42 42 42 42 ','2020-01-01 15:14:36',2),(44,'标题43','内容43 43 43 43 43 43 43 43 43 43 ','2020-01-01 15:14:36',2),(45,'标题44','内容44 44 44 44 44 44 44 44 44 44 ','2020-01-01 15:14:36',2),(46,'标题45','内容45 45 45 45 45 45 45 45 45 45 ','2020-01-01 15:14:36',2),(47,'标题46','内容46 46 46 46 46 46 46 46 46 46 ','2020-01-01 15:14:36',2),(48,'标题47','内容47 47 47 47 47 47 47 47 47 47 ','2020-01-01 15:14:36',2),(49,'标题48','内容48 48 48 48 48 48 48 48 48 48 ','2020-01-01 15:14:36',2),(50,'标题49','内容49 49 49 49 49 49 49 49 49 49 ','2020-01-01 15:14:36',2),(51,'标题50','内容50 50 50 50 50 50 50 50 50 50 ','2020-01-01 15:14:36',2),(52,'标题51','内容51 51 51 51 51 51 51 51 51 51 ','2020-01-01 15:14:36',2),(53,'标题52','内容52 52 52 52 52 52 52 52 52 52 ','2020-01-01 15:14:36',2),(54,'标题53','内容53 53 53 53 53 53 53 53 53 53 ','2020-01-01 15:14:36',2),(55,'标题54','内容54 54 54 54 54 54 54 54 54 54 ','2020-01-01 15:14:36',2),(56,'标题55','内容55 55 55 55 55 55 55 55 55 55 ','2020-01-01 15:14:36',2),(57,'标题56','内容56 56 56 56 56 56 56 56 56 56 ','2020-01-01 15:14:36',2),(58,'标题57','内容57 57 57 57 57 57 57 57 57 57 ','2020-01-01 15:14:36',2),(59,'标题58','内容58 58 58 58 58 58 58 58 58 58 ','2020-01-01 15:14:36',2),(60,'标题59','内容59 59 59 59 59 59 59 59 59 59 ','2020-01-01 15:14:36',2),(61,'标题60','内容60 60 60 60 60 60 60 60 60 60 ','2020-01-01 15:14:36',2),(62,'标题61','内容61 61 61 61 61 61 61 61 61 61 ','2020-01-01 15:14:36',2),(63,'标题62','内容62 62 62 62 62 62 62 62 62 62 ','2020-01-01 15:14:36',2),(64,'标题63','内容63 63 63 63 63 63 63 63 63 63 ','2020-01-01 15:14:36',2),(65,'标题64','内容64 64 64 64 64 64 64 64 64 64 ','2020-01-01 15:14:36',2),(66,'标题65','内容65 65 65 65 65 65 65 65 65 65 ','2020-01-01 15:14:36',2),(67,'标题66','内容66 66 66 66 66 66 66 66 66 66 ','2020-01-01 15:14:36',2),(68,'标题67','内容67 67 67 67 67 67 67 67 67 67 ','2020-01-01 15:14:36',2),(69,'标题68','内容68 68 68 68 68 68 68 68 68 68 ','2020-01-01 15:14:36',2),(70,'标题69','内容69 69 69 69 69 69 69 69 69 69 ','2020-01-01 15:14:36',2),(71,'标题70','内容70 70 70 70 70 70 70 70 70 70 ','2020-01-01 15:14:36',2),(72,'标题71','内容71 71 71 71 71 71 71 71 71 71 ','2020-01-01 15:14:36',2),(73,'标题72','内容72 72 72 72 72 72 72 72 72 72 ','2020-01-01 15:14:36',2),(74,'标题73','内容73 73 73 73 73 73 73 73 73 73 ','2020-01-01 15:14:36',2),(75,'标题74','内容74 74 74 74 74 74 74 74 74 74 ','2020-01-01 15:14:36',2),(76,'标题75','内容75 75 75 75 75 75 75 75 75 75 ','2020-01-01 15:14:37',2),(77,'标题76','内容76 76 76 76 76 76 76 76 76 76 ','2020-01-01 15:14:37',2),(78,'标题77','内容77 77 77 77 77 77 77 77 77 77 ','2020-01-01 15:14:37',2),(79,'标题78','内容78 78 78 78 78 78 78 78 78 78 ','2020-01-01 15:14:37',2),(80,'标题79','内容79 79 79 79 79 79 79 79 79 79 ','2020-01-01 15:14:37',2),(81,'标题80','内容80 80 80 80 80 80 80 80 80 80 ','2020-01-01 15:14:37',2),(82,'标题81','内容81 81 81 81 81 81 81 81 81 81 ','2020-01-01 15:14:37',2),(83,'标题82','内容82 82 82 82 82 82 82 82 82 82 ','2020-01-01 15:14:37',2),(84,'标题83','内容83 83 83 83 83 83 83 83 83 83 ','2020-01-01 15:14:37',2),(85,'标题84','内容84 84 84 84 84 84 84 84 84 84 ','2020-01-01 15:14:37',2),(86,'标题85','内容85 85 85 85 85 85 85 85 85 85 ','2020-01-01 15:14:37',2),(87,'标题86','内容86 86 86 86 86 86 86 86 86 86 ','2020-01-01 15:14:37',2),(88,'标题87','内容87 87 87 87 87 87 87 87 87 87 ','2020-01-01 15:14:37',2),(89,'标题88','内容88 88 88 88 88 88 88 88 88 88 ','2020-01-01 15:14:37',2),(90,'标题89','内容89 89 89 89 89 89 89 89 89 89 ','2020-01-01 15:14:37',2),(91,'标题90','内容90 90 90 90 90 90 90 90 90 90 ','2020-01-01 15:14:37',2),(92,'标题91','内容91 91 91 91 91 91 91 91 91 91 ','2020-01-01 15:14:37',2),(93,'标题92','内容92 92 92 92 92 92 92 92 92 92 ','2020-01-01 15:14:37',2),(94,'标题93','内容93 93 93 93 93 93 93 93 93 93 ','2020-01-01 15:14:37',2),(95,'标题94','内容94 94 94 94 94 94 94 94 94 94 ','2020-01-01 15:14:37',2),(96,'标题95','内容95 95 95 95 95 95 95 95 95 95 ','2020-01-01 15:14:37',2),(97,'标题96','内容96 96 96 96 96 96 96 96 96 96 ','2020-01-01 15:14:37',2),(98,'标题97','内容97 97 97 97 97 97 97 97 97 97 ','2020-01-01 15:14:37',2),(99,'标题98','内容98 98 98 98 98 98 98 98 98 98 ','2020-01-01 15:14:37',2),(100,'标题99','内容99 99 99 99 99 99 99 99 99 99 ','2020-01-01 15:14:37',2),(101,'标题100','内容100 100 100 100 100 100 100 100 100 100 ','2020-01-01 15:14:37',2),(192,'titlexxx','contentxxx','2020-01-15 02:37:58',1),(193,'titlexxx','contentxxx','2020-01-15 02:40:29',1),(194,'titlexxx','contentxxx','2020-01-15 02:40:45',1),(195,'TTTTT','CCCCCC','2020-01-15 02:46:08',1),(196,'titlezzzz','contentzzzz','2020-01-15 02:50:31',1),(197,'aaaaaa','aaaaaaadffffffffff','2020-01-15 03:09:03',1),(198,'zzzzzzz','zzzzzzzzzzzzzzzzzzzzzzz','2020-01-15 03:09:55',1),(199,'a','a','2020-01-15 03:23:43',1),(200,'aa','1234','2020-01-15 04:55:41',1),(201,'aaaaa','dsafsadfsadfadsf','2020-01-16 05:04:36',1),(202,'aaaaaaa','aaaaaaaaaaa','2020-01-16 05:07:09',1),(203,'这是一个新的博客','今天是2月26号','2020-01-26 03:52:44',2);
/*!40000 ALTER TABLE `blog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `content` text COLLATE utf8mb4_general_ci NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `blog_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_comment_user` (`user_id`),
  KEY `fk_comment_blog` (`blog_id`),
  CONSTRAINT `fk_comment_blog` FOREIGN KEY (`blog_id`) REFERENCES `blog` (`id`) ON DELETE CASCADE,
  CONSTRAINT `fk_comment_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (1,'2020-01-01 09:06:32','评论1',2,1),(2,'2020-01-06 05:46:59','comment2',2,1),(3,'2020-01-13 10:19:51','comment 3',2,1),(4,'2020-01-13 10:20:07','comment 4',2,1),(5,'2020-01-15 01:16:22','用户2对应第一个blog的第一条评论',2,1),(6,'2020-01-15 01:16:22','用户1对于第一个blog的第一条评论',1,1),(7,'2020-01-15 02:44:03','用户2对应第一个blog的第一条评论',2,1),(8,'2020-01-15 02:44:03','用户1对于第一个blog的第一条评论',1,1),(9,'2020-01-16 05:03:29','aaaaaaaaaaa',1,1),(10,'2020-01-16 05:04:10','ccccccccc',1,1),(12,'2020-01-16 07:38:06','xxxxxxxxxxx',2,1),(13,'2020-01-17 05:11:16','aaaaaaaaa',2,1),(14,'2020-01-17 05:33:28','bbbbbbbbbbb',1,1);
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(128) COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(128) COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(128) COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`name`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'王二','地球','er@er.com'),(2,'aa','1234','a@a.com');
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

-- Dump completed on 2020-03-30 19:58:51

