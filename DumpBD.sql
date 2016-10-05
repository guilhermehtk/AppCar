

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `AppCar` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `AppCar` ;

-- -----------------------------------------------------
-- Table `AppCar`.`Enderecos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Enderecos` (
	`endCod` INT NOT NULL AUTO_INCREMENT COMMENT '',
	`endNumero` VARCHAR(45) NULL COMMENT '',
	`endRua` VARCHAR(45) NULL COMMENT '',
	`endBairro` VARCHAR(45) NULL COMMENT '',
	`endCidade` VARCHAR(45) NULL COMMENT '',
	`endCep` VARCHAR(45) NULL COMMENT '',
	`endComplemento` VARCHAR(45) NULL COMMENT '',
	PRIMARY KEY (`endCod`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Logins`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Logins` (
	`loginCod` INT NOT NULL AUTO_INCREMENT COMMENT '',
	`loginUsuario` VARCHAR(45) NULL COMMENT '',
	`loginSenha` VARCHAR(255) NULL COMMENT '',
	PRIMARY KEY (`loginCod`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Pessoas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Pessoas` (
	`pesCod` INT NOT NULL AUTO_INCREMENT COMMENT '',
	`pesNome` VARCHAR(45) NULL COMMENT '',
	`pesSexo` VARCHAR(45) NULL COMMENT '',
	`pesEmail` VARCHAR(45) NULL COMMENT '',
	`pesTelefoneM` VARCHAR(45) NULL COMMENT '',
	`pesTelefoneF` VARCHAR(45) NULL COMMENT '',
	`pesCpf` VARCHAR(14) NULL COMMENT '',
	`pesRg` VARCHAR(45) NULL COMMENT '',
	`pesTipo` INT NULL COMMENT '',
	`pes_endCod` INT NOT NULL COMMENT '',
	`pes_loginCod` INT NULL COMMENT '',
	PRIMARY KEY (`pesCod`)  COMMENT '',
	INDEX `fk_Mecanico_Endereco1_idx` (`pes_endCod` ASC)  COMMENT '',
	INDEX `fk_Pessoas_Login1_idx` (`pes_loginCod` ASC)  COMMENT '',
	UNIQUE INDEX `pesRg_UNIQUE` (`pesRg` ASC)  COMMENT '',
	UNIQUE INDEX `pesCpf_UNIQUE` (`pesCpf` ASC)  COMMENT '',
	CONSTRAINT `fk_Mecanico_Endereco1`
	FOREIGN KEY (`pes_endCod`)
	REFERENCES `AppCar`.`Enderecos` (`endCod`)
	ON DELETE CASCADE
	ON UPDATE CASCADE,
	CONSTRAINT `fk_Pessoas_Login1`
	FOREIGN KEY (`pes_loginCod`)
	REFERENCES `AppCar`.`Logins` (`loginCod`)
	ON DELETE CASCADE
	ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Carros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Carros` (
	`carCod` INT NOT NULL AUTO_INCREMENT COMMENT '',
	`carMarca` VARCHAR(45) NULL COMMENT '',
	`carModelo` VARCHAR(45) NULL COMMENT '',
	`carCor` VARCHAR(45) NULL COMMENT '',
	`carAno` VARCHAR(45) NULL COMMENT '',
	`carNumeroChassi` VARCHAR(45) NULL COMMENT '',
	`carQuilometragem` VARCHAR(45) NULL COMMENT '',
	`carPlaca` VARCHAR(45) NULL COMMENT '',
	`carObs` TEXT NULL COMMENT '',
	`car_pesCod` INT NULL COMMENT '',
	PRIMARY KEY (`carCod`)  COMMENT '',
	INDEX `fk_Carros_Pessoas1_idx` (`car_pesCod` ASC)  COMMENT '',
	UNIQUE INDEX `carPlaca_UNIQUE` (`carPlaca` ASC)  COMMENT '',
	UNIQUE INDEX `carNumeroChassi_UNIQUE` (`carNumeroChassi` ASC)  COMMENT '',
	CONSTRAINT `fk_Carros_Pessoas1`
	FOREIGN KEY (`car_pesCod`)
	REFERENCES `AppCar`.`Pessoas` (`pesCod`)
	ON DELETE CASCADE
	ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Logs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Logs` (
	`logCod` INT NOT NULL AUTO_INCREMENT COMMENT '',
	`logDescricao` TEXT NULL COMMENT '',
	`logData` TIMESTAMP NULL COMMENT '',
	`log_mecCod` INT NOT NULL COMMENT '',
	PRIMARY KEY (`logCod`)  COMMENT '',
	INDEX `fk_Log_Mecanico1_idx` (`log_mecCod` ASC)  COMMENT '',
	CONSTRAINT `fk_Log_Mecanico1`
	FOREIGN KEY (`log_mecCod`)
	REFERENCES `AppCar`.`Pessoas` (`pesCod`)
	ON DELETE CASCADE
	ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`OrdemServicos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`OrdemServicos` (
	`osCod` INT NOT NULL AUTO_INCREMENT COMMENT '',
	`osTipo` VARCHAR(45) NULL COMMENT '',
	`osData` TIMESTAMP NULL COMMENT '',
	`osSituacao` INT NULL COMMENT '',
	`osDescricao` TEXT NULL COMMENT '',
	`os_carCod` INT NOT NULL COMMENT '',
	`os_cliCod` INT NOT NULL COMMENT '',
	PRIMARY KEY (`osCod`)  COMMENT '',
	INDEX `fk_OrdemServicos_Pessoas1_idx` (`os_cliCod` ASC)  COMMENT '',
	INDEX `fk_OrdemServicos_Carros1_idx` (`os_carCod` ASC)  COMMENT '',
	CONSTRAINT `fk_OrdemServicos_Pessoas1`
	FOREIGN KEY (`os_cliCod`)
	REFERENCES `AppCar`.`Pessoas` (`pesCod`)
	ON DELETE CASCADE
	ON UPDATE CASCADE,
	CONSTRAINT `fk_OrdemServicos_Carros1`
	FOREIGN KEY (`os_carCod`)
	REFERENCES `AppCar`.`Carros` (`carCod`)
	ON DELETE CASCADE
	ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Servicos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Servicos` (
	`svcCod` INT NOT NULL AUTO_INCREMENT COMMENT '',
	`svcDescricao` VARCHAR(45) NULL COMMENT '',
	`svcValor` DOUBLE NULL COMMENT '',
	PRIMARY KEY (`svcCod`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Servicos_OS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Servicos_OS` (
	`serCod` INT NOT NULL AUTO_INCREMENT COMMENT '',
	`ser_osCod` INT NOT NULL COMMENT '',
	`ser_svcCod` INT NOT NULL COMMENT '',
	`ser_mecCod` INT NULL COMMENT '',
	PRIMARY KEY (`serCod`)  COMMENT '',
	INDEX `fk_Servico_Manutencao1_idx` (`ser_osCod` ASC)  COMMENT '',
	INDEX `fk_Servicos_Pessoas1_idx` (`ser_mecCod` ASC)  COMMENT '',
	INDEX `fk_Servicos/OS_Servicos1_idx` (`ser_svcCod` ASC)  COMMENT '',
	CONSTRAINT `fk_Servico_Manutencao1`
	FOREIGN KEY (`ser_osCod`)
	REFERENCES `AppCar`.`OrdemServicos` (`osCod`)
	ON DELETE CASCADE
	ON UPDATE CASCADE,
	CONSTRAINT `fk_Servicos_Pessoas1`
	FOREIGN KEY (`ser_mecCod`)
	REFERENCES `AppCar`.`Pessoas` (`pesCod`)
	ON DELETE CASCADE
	ON UPDATE CASCADE,
	CONSTRAINT `fk_Servicos/OS_Servicos1`
	FOREIGN KEY (`ser_svcCod`)
	REFERENCES `AppCar`.`Servicos` (`svcCod`)
	ON DELETE CASCADE
	ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Marcas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Marcas` (
	`marCod` INT NOT NULL AUTO_INCREMENT COMMENT '',
	`marNome` VARCHAR(45) NULL COMMENT '',
	PRIMARY KEY (`marCod`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Modelos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Modelos` (
	`modCod` INT NOT NULL AUTO_INCREMENT COMMENT '',
	`modNome` VARCHAR(45) NULL COMMENT '',
	`Marcas_marCod` INT NULL COMMENT '',
	PRIMARY KEY (`modCod`)  COMMENT '',
	INDEX `fk_Modelos_Marcas1_idx` (`Marcas_marCod` ASC)  COMMENT '',
	CONSTRAINT `fk_Modelos_Marcas1`
	FOREIGN KEY (`Marcas_marCod`)
	REFERENCES `AppCar`.`Marcas` (`marCod`)
	ON DELETE NO ACTION
	ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


use AppCar;

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
INSERT INTO `enderecos` VALUES (21,'365','Rua Sete de Setembro','Centro','Apart B','35580-000','saasasAasassaas'),(34,'375','Sete de Setembro','Centro','Formiga','35570-000','A');
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
INSERT INTO `ordemservicos` VALUES (12,'Orçamento','2016-07-29 02:59:51',2,'Carro',65,15),(13,'Orçamento','2016-07-29 16:57:01',0,'',65,15);
/*!40000 ALTER TABLE `ordemservicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `pessoas`
--

LOCK TABLES `pessoas` WRITE;
/*!40000 ALTER TABLE `pessoas` DISABLE KEYS */;
INSERT INTO `pessoas` VALUES (15,'Guilherme Henrique Pinto','Masculino','guilhermehtk@hotmail.comssaas','(37)99996-3627','(92)4923-4843','094.139.356-96','MG187272828',2,21,NULL),(23,'Guilherme Henrique','Masculino','guilhermehtk@hotmail.com','(37)99988-1818','(38)8883-3333','094.139.344-46','MG19383888',3,34,11);
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
INSERT INTO `servicos_os` VALUES (19,12,2,23),(20,12,3,23),(21,13,2,23),(22,13,4,23);
/*!40000 ALTER TABLE `servicos_os` ENABLE KEYS */;
UNLOCK TABLES;
