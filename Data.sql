-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: appcar
-- ------------------------------------------------------
-- Server version	5.6.17

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
-- Dumping data for table `carros`
--

LOCK TABLES `carros` WRITE;
/*!40000 ALTER TABLE `carros` DISABLE KEYS */;
INSERT INTO `carros` VALUES (65,'FIAT','Uno','Branco ','1221','1221','21212','SAS-2132','dsasdasdagff',15);
/*!40000 ALTER TABLE `carros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `enderecos`
--

LOCK TABLES `enderecos` WRITE;
/*!40000 ALTER TABLE `enderecos` DISABLE KEYS */;
INSERT INTO `enderecos` VALUES (1,'1212112','121212','121212','12121212','',''),(2,'1212','asas','sasas','assasa','121212','121221'),(3,'1','a','a','a','a',''),(4,'1','a','aa','1','a','a'),(5,'1','1','1','1','',''),(6,'1','11111','1','1','1',''),(7,'1','1','1','1','',''),(8,'1','1','11','1','1',''),(9,'1','1','1','1','',''),(10,'1','1','1','1','1','1'),(11,'1','1','1','1','1','1'),(12,'12','12','12','12','',''),(13,'11','aasassaas','1','1','1','1'),(14,'1212','asas','saas','asas','',''),(15,'122121','asasasas','assaas','sasasa','',''),(16,'1','guig','gui','gui','gui','gui'),(17,'1221','12211212','21122112','122121','',''),(18,'1221','12211212','21122112','122121','',''),(19,'3','12121','1212','12112','',''),(20,'121221','Rua Sete de Setembnnro','centro','formiga','35559-000','clmdslsdf'),(21,'365','Rua Sete de Setembro','Centro','Apart A','35580-000','saasasAasassaas'),(22,'386','Sete de Setembro','Centro','Formiga','35570-000','A'),(23,'386','Sete de Setembro','Centro','Formiga','35570-000','A'),(24,'3432','asdsd','3432','34423','34222-222','32434'),(25,'365','Rua Sete de Setembro','centro ','formiga','35579-000','apart A'),(26,'365','Rua Sete de Setembro','centro ','formiga','35579-000','apart A'),(27,'3756','Sete de Setembro','dsijsdijs','centro','35589-000','aoajaso'),(28,'3756','Sete de Setembro','dsijsdijs','centro','35589-000','aoajaso'),(29,'1','1','\'1','1','     -   ','1'),(30,'33','3','3','3','33333-333','3'),(31,'983272387','9128219','2847384974','8247482','88888-888','38272987'),(32,'93483920','924823940','2948923843','9340823982','34983-493','90438398'),(33,'3333','333333','33333','333','33333-333','assaas'),(34,'375','Sete de Setembro','Centro','Formiga','35570-000','A');
/*!40000 ALTER TABLE `enderecos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `logins`
--

LOCK TABLES `logins` WRITE;
/*!40000 ALTER TABLE `logins` DISABLE KEYS */;
INSERT INTO `logins` VALUES (10,'administradorr','$2a$10$RAQs8cmtH6Ehp8OLoke81uTaKnvWRBkkH37ZylUDLa.aaMcTdVQp2'),(11,'administrador','$2a$10$5Uu99FlUhGem6zWc2SdPeOdSO5Y/ilD49gJj9RHspQT/nU/xBq1LC');
/*!40000 ALTER TABLE `logins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `logs`
--

LOCK TABLES `logs` WRITE;
/*!40000 ALTER TABLE `logs` DISABLE KEYS */;
/*!40000 ALTER TABLE `logs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ordemservicos`
--

LOCK TABLES `ordemservicos` WRITE;
/*!40000 ALTER TABLE `ordemservicos` DISABLE KEYS */;
INSERT INTO `ordemservicos` VALUES (12,'Orçamento','2016-07-29 02:59:51',2,'Carro',65,15);
/*!40000 ALTER TABLE `ordemservicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `pessoas`
--

LOCK TABLES `pessoas` WRITE;
/*!40000 ALTER TABLE `pessoas` DISABLE KEYS */;
INSERT INTO `pessoas` VALUES (15,'Guilherme Henrique Pinto','Masculino','guilhermehtk@hotmail.comssaas','(37)99996-3627','(92)4923-4843','094.139.356-96','MG187272828',2,21,NULL),(22,'a','Masculino','a','(11)11111-1111','(13)2333-3333','222.222.222-22','A',3,33,10),(23,'Guilherme Henrique','Masculino','guilhermehtk@hotmail.com','(37)99988-1818','(38)8883-3333','094.139.344-46','MG19383888',3,34,11);
/*!40000 ALTER TABLE `pessoas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `servicos`
--

LOCK TABLES `servicos` WRITE;
/*!40000 ALTER TABLE `servicos` DISABLE KEYS */;
INSERT INTO `servicos` VALUES (1,'Oleo',22),(2,'Ventoinha',23),(3,'Manivela',233),(4,'Supressor',0);
/*!40000 ALTER TABLE `servicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `servicos_os`
--

LOCK TABLES `servicos_os` WRITE;
/*!40000 ALTER TABLE `servicos_os` DISABLE KEYS */;
INSERT INTO `servicos_os` VALUES (19,12,2,23),(20,12,3,23);
/*!40000 ALTER TABLE `servicos_os` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-29  0:10:12
