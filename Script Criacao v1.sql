SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';


-- -----------------------------------------------------
-- Table `AppCar`.`Carros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Carros` (
  `carCod` INT NOT NULL AUTO_INCREMENT,
  `carMarca` VARCHAR(45) NULL,
  `carModelo` VARCHAR(45) NULL,
  `carCor` VARCHAR(45) NULL,
  `carAno` VARCHAR(45) NULL,
  `carNumeroChassi` VARCHAR(45) NULL,
  `carQuilometragem` VARCHAR(45) NULL,
  `carPlaca` VARCHAR(45) NULL,
  PRIMARY KEY (`carCod`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Enderecos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Enderecos` (
  `endCod` INT NOT NULL,
  `endNumero` VARCHAR(45) NULL,
  `endRua` VARCHAR(45) NULL,
  `endBairro` VARCHAR(45) NULL,
  `endCidade` VARCHAR(45) NULL,
  `endCep` VARCHAR(45) NULL,
  `endComplemento` VARCHAR(45) NULL,
  PRIMARY KEY (`endCod`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Login` (
  `loginCod` INT NOT NULL AUTO_INCREMENT,
  `loginUsuario` VARCHAR(45) NULL,
  `loginSenha` VARCHAR(255) NULL,
  PRIMARY KEY (`loginCod`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Pessoas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Pessoas` (
  `pesCod` INT NOT NULL AUTO_INCREMENT,
  `pesNome` VARCHAR(45) NULL,
  `pesSexo` VARCHAR(45) NULL,
  `pesEmail` VARCHAR(45) NULL,
  `pesTelefoneM` VARCHAR(45) NULL,
  `pesTelefoneF` VARCHAR(45) NULL,
  `pesCpf` VARCHAR(14) NULL,
  `pesRg` VARCHAR(45) NULL,
  `pesTipo` INT NULL,
  `pes_endCod` INT NOT NULL,
  `pes_loginCod` INT NOT NULL,
  PRIMARY KEY (`pesCod`),
  INDEX `fk_Mecanico_Endereco1_idx` (`pes_endCod` ASC),
  INDEX `fk_Pessoas_Login1_idx` (`pes_loginCod` ASC),
  CONSTRAINT `fk_Mecanico_Endereco1`
    FOREIGN KEY (`pes_endCod`)
    REFERENCES `AppCar`.`Enderecos` (`endCod`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pessoas_Login1`
    FOREIGN KEY (`pes_loginCod`)
    REFERENCES `AppCar`.`Login` (`loginCod`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Carros_Pessoas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Carros_Pessoas` (
  `ccl_carCod` INT NOT NULL,
  `ccl_pesCod` INT NOT NULL,
  INDEX `fk_Carro_Usario_Carro1_idx` (`ccl_carCod` ASC),
  INDEX `fk_Carros_Clientes_Pessoas1_idx` (`ccl_pesCod` ASC),
  CONSTRAINT `fk_Carro_Usario_Carro1`
    FOREIGN KEY (`ccl_carCod`)
    REFERENCES `AppCar`.`Carros` (`carCod`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Carros_Clientes_Pessoas1`
    FOREIGN KEY (`ccl_pesCod`)
    REFERENCES `AppCar`.`Pessoas` (`pesCod`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Logs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Logs` (
  `logCod` INT NOT NULL AUTO_INCREMENT,
  `logDescricao` TEXT NULL,
  `logData` TIMESTAMP NULL,
  `log_mecCod` INT NOT NULL,
  PRIMARY KEY (`logCod`),
  INDEX `fk_Log_Mecanico1_idx` (`log_mecCod` ASC),
  CONSTRAINT `fk_Log_Mecanico1`
    FOREIGN KEY (`log_mecCod`)
    REFERENCES `AppCar`.`Pessoas` (`pesCod`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`OrdemServicos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`OrdemServicos` (
  `osCod` INT NOT NULL AUTO_INCREMENT,
  `osTipo` VARCHAR(45) NULL,
  `osData` TIMESTAMP NULL,
  `osValor` DOUBLE NULL,
  `os_cliCod` INT NOT NULL,
  `os_mecCod` INT NOT NULL,
  PRIMARY KEY (`osCod`),
  INDEX `fk_Manutencao_Mecanico1_idx` (`os_mecCod` ASC),
  INDEX `fk_OrdemServicos_Pessoas1_idx` (`os_cliCod` ASC),
  CONSTRAINT `fk_Manutencao_Mecanico1`
    FOREIGN KEY (`os_mecCod`)
    REFERENCES `AppCar`.`Pessoas` (`pesCod`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_OrdemServicos_Pessoas1`
    FOREIGN KEY (`os_cliCod`)
    REFERENCES `AppCar`.`Pessoas` (`pesCod`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `AppCar`.`Servicos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `AppCar`.`Servicos` (
  `serCod` INT NOT NULL AUTO_INCREMENT,
  `serDescricao` TEXT NULL,
  `ser_osCod` INT NOT NULL,
  PRIMARY KEY (`serCod`),
  INDEX `fk_Servico_Manutencao1_idx` (`ser_osCod` ASC),
  CONSTRAINT `fk_Servico_Manutencao1`
    FOREIGN KEY (`ser_osCod`)
    REFERENCES `AppCar`.`OrdemServicos` (`osCod`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
