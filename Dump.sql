CREATE DATABASE  IF NOT EXISTS `appcar` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `appcar`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: appcar
-- ------------------------------------------------------
-- Server version	5.6.16

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
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carros`
--

LOCK TABLES `carros` WRITE;
/*!40000 ALTER TABLE `carros` DISABLE KEYS */;
INSERT INTO `carros` VALUES (65,'FIAT','Uno','Branco ','1221','1221','21212','SAS-2132','dsasdasdagff',15),(66,'Ford','KA','Preto  ','2016','120000','120000','PXW-2165','',25),(67,'JEEP','Outros','Vermelho ','1990','2500999','2500999','MKV-7842','REBAIXADO',26),(68,'FIAT','Uno','Marrom/Bege ','2001','12547800','12547800','JUT-3524','',27),(69,'Ford','KA','Prata ','2006','177000','177000','PPJ-6566','',28),(70,'FIAT','Palio','Prata ','2013','2013','200000','OMH-0974','',29),(71,'Ford','Escort Hobby','Vermelho ','1995','450000','450000','GPP-2733','',30),(72,'GM - Chevrolet','Onix','Branco ','2013','50000','50000','PHM-9999','Este é o carro do Pedro',31),(73,'FIAT','Mobi','Prata ','2012','12587000','12587000','KJU-2520','Carro do Gorazil\n',32),(74,'Honda','Outros','Azul ','1990','152000','152000','JUJ-6523','',33);
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
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enderecos`
--

LOCK TABLES `enderecos` WRITE;
/*!40000 ALTER TABLE `enderecos` DISABLE KEYS */;
INSERT INTO `enderecos` VALUES (21,'365','Rua Sete de Setembro','Centro','Formiga','35580-000','Apart. A'),(36,'19','Prof. Francis','Nra. Lourdes','Formiga','35570-000','E'),(37,'84','Antonio Jorge Rezende','Sao Lourenço','Formiga','35570-000','A'),(38,'41','do Ifmg','Centro','Formiga','35570-000','A'),(39,'656','do Saae','SAAE','Formiga','35570-000','A'),(40,'255','Uruguai ','Ouro Negro','Formiga','35570-000','Casa'),(41,'97','José do Couto','Lagoa','Formiga','35570-000','Casa'),(42,'24','Perdigão','Cidade Nova','Formiga','35570-000','Casa'),(43,'55','Deoliinda Nogueira da Costa','Bela Vista','Formiga','35570-000','Casa'),(44,'55','Anildo gontijo ','Rosário','Formiga','35570-000','A');
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
INSERT INTO `logins` VALUES (11,'administrador','$2a$10$5Uu99FlUhGem6zWc2SdPeOdSO5Y/ilD49gJj9RHspQT/nU/xBq1LC');
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
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordemservicos`
--

LOCK TABLES `ordemservicos` WRITE;
/*!40000 ALTER TABLE `ordemservicos` DISABLE KEYS */;
INSERT INTO `ordemservicos` VALUES (12,'Orçamento','2016-07-29 02:59:51',3,'Carro',65,15),(14,'Revisão','2016-11-18 11:24:53',3,'Ordem de serviço',70,29),(15,'Concerto','2016-11-18 11:28:19',0,'',71,25),(16,'Trocas','2016-11-18 11:29:51',0,'',66,26),(17,'Lanternagem','2016-11-18 11:32:17',0,'Lanternagem no carro',71,32),(18,'Pintura','2016-11-18 11:33:50',0,'Pintura',74,32),(19,'Manutenção','2016-11-18 11:35:18',0,'Manutenção do carro',72,33),(20,'Lanternagem','2016-11-18 11:36:11',0,'Troca de óleo',73,26),(21,'Revisão','2016-11-18 11:36:54',0,'Revisão ',74,15),(23,'Manutenção','2016-11-18 11:39:05',0,'23412',66,29);
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
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoas`
--

LOCK TABLES `pessoas` WRITE;
/*!40000 ALTER TABLE `pessoas` DISABLE KEYS */;
INSERT INTO `pessoas` VALUES (15,'Guilherme Henrique Pinto','Masculino','guilhermehtk@hotmail.com','(37)99996-3627','(92)4923-4843','094.139.356-96','MG187272828',2,21,NULL),(23,'Guilherme Henrique','Masculino','guilhermehtk@hotmail.com','(37)99988-1818','(38)8883-3333','094.139.344-46','MG19383888',3,21,11),(25,'Leandro Souza Pinheiro','Masculino','lelepinheiro@hotmail.com','(37)98545-4544','(37)6565-6121','125.987.988-32','MG12366998',2,36,NULL),(26,'Danillo Remaclo dos Santos','Masculino','danillo@hotmail.com','(37)56565-3621','(37)6545-6432','032.216.565-65','MG654232454',2,37,NULL),(27,' Thomas do Vale','Masculino','thomas@thomas.com.br','(37)65652-1545','(37)6564-1362','036.546.546-54','MG36232323256',2,38,NULL),(28,'Marcelo Geovane Silva Sá','Masculino','leitao@arape.com.br','(37)65652-1545','(37)6526-5332','312.241.545-45','MG65621212',2,39,NULL),(29,'Igor Ribeiro da Silva','Feminino','igorribeiro@gmail.com','(37)99925-7421','(37)3321-2505','121.975.456-07','MG1974321758',2,40,NULL),(30,'Hernane Marcos de Faria Junior','Masculino','tiaocarreiro99@hotmail.com','(37)99825-4509','(37)3322-5588','194.723.465-02','MG98414355',2,41,NULL),(31,'Pedro Henrique Meneses','Masculino','pedrohenrique@hotmail.com','(37)99925-5252','(37)3321-2578','242.424.240-24','MG242424242424',2,42,NULL),(32,'Gorazil Emerson Garcia Junior','Masculino','gorazilgarcia@hotmail.com','(67)99925-5252','(37)3321-5588','136.152.981-54','MG24936551',2,43,NULL),(33,'Vinmicius Pedro Damasceno Lima','Masculino','viniciuslima96@gmail.com','(37)99958-9536','(37)3325-2521','152.357.951-25','MG245866522423',2,44,NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicos`
--

LOCK TABLES `servicos` WRITE;
/*!40000 ALTER TABLE `servicos` DISABLE KEYS */;
INSERT INTO `servicos` VALUES (5,'Troca de amortecedores e molas ',200),(6,'Troca da bandeja ',312),(12,'Troca do braço axial ',155),(14,'Luzes acessas no painel',123),(18,'Controle de tração',155),(20,'Reprogramação de Centrais Eletrônicas ',124),(21,'Troca da barra de direção ',341),(22,'Reparos em módulos de: injeção',55),(23,'Conversor de torque',950),(24,'Troca de óleo de câmbio',85),(25,'Pintura',200);
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
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicos_os`
--

LOCK TABLES `servicos_os` WRITE;
/*!40000 ALTER TABLE `servicos_os` DISABLE KEYS */;
INSERT INTO `servicos_os` VALUES (43,12,5,23),(44,12,6,23),(45,12,12,23),(46,12,14,23),(47,12,18,23),(48,12,20,23),(49,12,21,23),(50,12,22,23),(51,12,23,23),(57,14,5,23),(58,14,14,23),(59,14,20,23),(60,14,22,23),(61,14,23,23),(62,15,5,23),(63,15,18,23),(64,15,20,23),(65,15,23,23),(66,15,24,23),(67,16,5,23),(68,16,12,23),(69,16,21,23),(70,16,22,23),(71,17,18,23),(72,17,21,23),(73,17,23,23),(74,17,24,23),(75,18,25,23),(76,19,6,23),(77,19,12,23),(78,19,14,23),(79,20,21,23),(80,20,22,23),(81,20,24,23),(82,21,12,23),(83,21,14,23),(84,21,20,23),(85,21,23,23),(91,23,14,23),(92,23,18,23),(93,23,20,23),(94,23,21,23),(95,23,23,23),(96,23,25,23);
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

-- Dump completed on 2016-11-18  9:41:37
