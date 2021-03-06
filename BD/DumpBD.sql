-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: appcar
-- ------------------------------------------------------
-- Server version	5.7.14

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
-- Table structure for table `carros`
--

DROP TABLE IF EXISTS `carros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carros` (
  `carCod` int(11) NOT NULL AUTO_INCREMENT,
  `carMarca` varchar(45) DEFAULT NULL,
  `carModelo` varchar(45) DEFAULT NULL,
  `carCor` varchar(45) DEFAULT NULL,
  `carAno` varchar(45) DEFAULT NULL,
  `carNumeroChassi` varchar(45) DEFAULT NULL,
  `carQuilometragem` varchar(45) DEFAULT NULL,
  `carPlaca` varchar(45) DEFAULT NULL,
  `carObs` text,
  `car_pesCod` int(11) DEFAULT NULL,
  PRIMARY KEY (`carCod`),
  UNIQUE KEY `carPlaca_UNIQUE` (`carPlaca`),
  UNIQUE KEY `carNumeroChassi_UNIQUE` (`carNumeroChassi`),
  KEY `fk_Carros_Pessoas1_idx` (`car_pesCod`),
  CONSTRAINT `fk_Carros_Pessoas1` FOREIGN KEY (`car_pesCod`) REFERENCES `pessoas` (`pesCod`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carros`
--

LOCK TABLES `carros` WRITE;
/*!40000 ALTER TABLE `carros` DISABLE KEYS */;
INSERT INTO `carros` VALUES (65,'FIAT','Uno','Branco ','1221','1221','21212','SAS-2132','dsasdasdagff',15);
/*!40000 ALTER TABLE `carros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enderecos`
--

DROP TABLE IF EXISTS `enderecos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `enderecos` (
  `endCod` int(11) NOT NULL AUTO_INCREMENT,
  `endNumero` varchar(45) DEFAULT NULL,
  `endRua` varchar(45) DEFAULT NULL,
  `endBairro` varchar(45) DEFAULT NULL,
  `endCidade` varchar(45) DEFAULT NULL,
  `endCep` varchar(45) DEFAULT NULL,
  `endComplemento` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`endCod`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enderecos`
--

LOCK TABLES `enderecos` WRITE;
/*!40000 ALTER TABLE `enderecos` DISABLE KEYS */;
INSERT INTO `enderecos` VALUES (21,'365','Rua Sete de Setembro','Centro','Apart B','35580-000','saasasAasassaas'),(34,'375','Sete de Setembro','Centro','Formiga','35570-000','A');
/*!40000 ALTER TABLE `enderecos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logins`
--

DROP TABLE IF EXISTS `logins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `logins` (
  `loginCod` int(11) NOT NULL AUTO_INCREMENT,
  `loginUsuario` varchar(45) DEFAULT NULL,
  `loginSenha` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`loginCod`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logins`
--

LOCK TABLES `logins` WRITE;
/*!40000 ALTER TABLE `logins` DISABLE KEYS */;
INSERT INTO `logins` VALUES (10,'administradorr','$2a$10$RAQs8cmtH6Ehp8OLoke81uTaKnvWRBkkH37ZylUDLa.aaMcTdVQp2'),(11,'administrador','$2a$10$5Uu99FlUhGem6zWc2SdPeOdSO5Y/ilD49gJj9RHspQT/nU/xBq1LC');
/*!40000 ALTER TABLE `logins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logs`
--

DROP TABLE IF EXISTS `logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `logs` (
  `logCod` int(11) NOT NULL AUTO_INCREMENT,
  `logDescricao` text,
  `logData` timestamp NULL DEFAULT NULL,
  `log_mecCod` int(11) NOT NULL,
  PRIMARY KEY (`logCod`),
  KEY `fk_Log_Mecanico1_idx` (`log_mecCod`),
  CONSTRAINT `fk_Log_Mecanico1` FOREIGN KEY (`log_mecCod`) REFERENCES `pessoas` (`pesCod`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logs`
--

LOCK TABLES `logs` WRITE;
/*!40000 ALTER TABLE `logs` DISABLE KEYS */;
/*!40000 ALTER TABLE `logs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marcas`
--

DROP TABLE IF EXISTS `marcas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `marcas` (
  `marCod` int(11) NOT NULL AUTO_INCREMENT,
  `marNome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`marCod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marcas`
--

LOCK TABLES `marcas` WRITE;
/*!40000 ALTER TABLE `marcas` DISABLE KEYS */;
/*!40000 ALTER TABLE `marcas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modelos`
--

DROP TABLE IF EXISTS `modelos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `modelos` (
  `modCod` int(11) NOT NULL AUTO_INCREMENT,
  `modNome` varchar(45) DEFAULT NULL,
  `Marcas_marCod` int(11) DEFAULT NULL,
  PRIMARY KEY (`modCod`),
  KEY `fk_Modelos_Marcas1_idx` (`Marcas_marCod`),
  CONSTRAINT `fk_Modelos_Marcas1` FOREIGN KEY (`Marcas_marCod`) REFERENCES `marcas` (`marCod`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modelos`
--

LOCK TABLES `modelos` WRITE;
/*!40000 ALTER TABLE `modelos` DISABLE KEYS */;
/*!40000 ALTER TABLE `modelos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordemservicos`
--

DROP TABLE IF EXISTS `ordemservicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordemservicos` (
  `osCod` int(11) NOT NULL AUTO_INCREMENT,
  `osTipo` varchar(45) DEFAULT NULL,
  `osData` timestamp NULL DEFAULT NULL,
  `osSituacao` int(11) DEFAULT NULL,
  `osDescricao` text,
  `os_carCod` int(11) NOT NULL,
  `os_cliCod` int(11) NOT NULL,
  PRIMARY KEY (`osCod`),
  KEY `fk_OrdemServicos_Pessoas1_idx` (`os_cliCod`),
  KEY `fk_OrdemServicos_Carros1_idx` (`os_carCod`),
  CONSTRAINT `fk_OrdemServicos_Carros1` FOREIGN KEY (`os_carCod`) REFERENCES `carros` (`carCod`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_OrdemServicos_Pessoas1` FOREIGN KEY (`os_cliCod`) REFERENCES `pessoas` (`pesCod`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordemservicos`
--

LOCK TABLES `ordemservicos` WRITE;
/*!40000 ALTER TABLE `ordemservicos` DISABLE KEYS */;
INSERT INTO `ordemservicos` VALUES (12,'Orçamento','2016-07-29 02:59:51',2,'Carro',65,15),(13,'Orçamento','2016-07-29 16:57:01',0,'Carro',65,15);
/*!40000 ALTER TABLE `ordemservicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoas`
--

DROP TABLE IF EXISTS `pessoas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pessoas` (
  `pesCod` int(11) NOT NULL AUTO_INCREMENT,
  `pesNome` varchar(45) DEFAULT NULL,
  `pesSexo` varchar(45) DEFAULT NULL,
  `pesEmail` varchar(45) DEFAULT NULL,
  `pesTelefoneM` varchar(45) DEFAULT NULL,
  `pesTelefoneF` varchar(45) DEFAULT NULL,
  `pesCpf` varchar(14) DEFAULT NULL,
  `pesRg` varchar(45) DEFAULT NULL,
  `pesTipo` int(11) DEFAULT NULL,
  `pes_endCod` int(11) NOT NULL,
  `pes_loginCod` int(11) DEFAULT NULL,
  PRIMARY KEY (`pesCod`),
  UNIQUE KEY `pesRg_UNIQUE` (`pesRg`),
  UNIQUE KEY `pesCpf_UNIQUE` (`pesCpf`),
  KEY `fk_Mecanico_Endereco1_idx` (`pes_endCod`),
  KEY `fk_Pessoas_Login1_idx` (`pes_loginCod`),
  CONSTRAINT `fk_Mecanico_Endereco1` FOREIGN KEY (`pes_endCod`) REFERENCES `enderecos` (`endCod`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Pessoas_Login1` FOREIGN KEY (`pes_loginCod`) REFERENCES `logins` (`loginCod`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoas`
--

LOCK TABLES `pessoas` WRITE;
/*!40000 ALTER TABLE `pessoas` DISABLE KEYS */;
INSERT INTO `pessoas` VALUES (15,'Guilherme Henrique Pinto','Masculino','guilhermehtk@hotmail.comssaas','(37)99996-3627','(92)4923-4843','094.139.356-96','MG187272828',2,21,NULL),(23,'Guilherme Henrique','Masculino','guilhermehtk@hotmail.com','(37)99988-1818','(38)8883-3333','094.139.344-46','MG19383888',3,34,11);
/*!40000 ALTER TABLE `pessoas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicos`
--

DROP TABLE IF EXISTS `servicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicos` (
  `svcCod` int(11) NOT NULL AUTO_INCREMENT,
  `svcDescricao` varchar(45) DEFAULT NULL,
  `svcValor` double DEFAULT NULL,
  PRIMARY KEY (`svcCod`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicos`
--

LOCK TABLES `servicos` WRITE;
/*!40000 ALTER TABLE `servicos` DISABLE KEYS */;
INSERT INTO `servicos` VALUES (1,'Oleo',22),(2,'Ventoinha',23),(3,'Manivela',233),(4,'Supressor',0);
/*!40000 ALTER TABLE `servicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicos_os`
--

DROP TABLE IF EXISTS `servicos_os`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicos_os` (
  `serCod` int(11) NOT NULL AUTO_INCREMENT,
  `ser_osCod` int(11) NOT NULL,
  `ser_svcCod` int(11) NOT NULL,
  `ser_mecCod` int(11) DEFAULT NULL,
  PRIMARY KEY (`serCod`),
  KEY `fk_Servico_Manutencao1_idx` (`ser_osCod`),
  KEY `fk_Servicos_Pessoas1_idx` (`ser_mecCod`),
  KEY `fk_Servicos/OS_Servicos1_idx` (`ser_svcCod`),
  CONSTRAINT `fk_Servico_Manutencao1` FOREIGN KEY (`ser_osCod`) REFERENCES `ordemservicos` (`osCod`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Servicos/OS_Servicos1` FOREIGN KEY (`ser_svcCod`) REFERENCES `servicos` (`svcCod`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Servicos_Pessoas1` FOREIGN KEY (`ser_mecCod`) REFERENCES `pessoas` (`pesCod`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicos_os`
--

LOCK TABLES `servicos_os` WRITE;
/*!40000 ALTER TABLE `servicos_os` DISABLE KEYS */;
INSERT INTO `servicos_os` VALUES (21,13,2,23),(22,13,4,23),(29,12,1,23),(30,12,2,23),(31,12,3,23),(32,12,4,23),(33,12,3,23);
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

-- Dump completed on 2016-10-09  1:04:13
