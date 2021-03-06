-- MySQL Script generated by MySQL Workbench
-- Mon Sep 13 16:51:31 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuarios` (
  `idUsuarios` INT NOT NULL AUTO_INCREMENT,
  `tipoIdentificacion` VARCHAR(45) NOT NULL,
  `identificacion` INT NOT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `fechaExpedicionDocumento` DATE NOT NULL,
  `lugarExpedicionDocumento` VARCHAR(45) NOT NULL,
  `ciudadResidencia` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `telefono` INT NOT NULL,
  `usuario` VARCHAR(45) NOT NULL,
  `clave` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUsuarios`),
  UNIQUE INDEX `idUsuarios_UNIQUE` (`idUsuarios` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Vehiculos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Vehiculos` (
  `idVehiculo` INT NOT NULL AUTO_INCREMENT,
  `modelo` VARCHAR(45) NOT NULL,
  `fechaCompra` DATE NOT NULL,
  `fechaConsecionarioAdquisicion` DATE NOT NULL,
  `idUsuariosVehiculos` INT NOT NULL,
  PRIMARY KEY (`idVehiculo`),
  INDEX `idUsuario` (`idUsuariosVehiculos` ASC) INVISIBLE,
  UNIQUE INDEX `idVehiculo_UNIQUE` (`idVehiculo` ASC) VISIBLE,
  CONSTRAINT `idUsuarios`
    FOREIGN KEY (`idUsuariosVehiculos`)
    REFERENCES `mydb`.`Usuarios` (`idUsuarios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Campana`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Campana` (
  `idCampana` INT NOT NULL AUTO_INCREMENT,
  `inicioCampana` DATE NOT NULL,
  `fechaAlertaCampana` DATE NOT NULL,
  `fechaEjecucionCampa??a` DATE NOT NULL,
  `idVehiculoCampana` INT NOT NULL,
  PRIMARY KEY (`idCampana`),
  INDEX `idCampanaVehiculo` (`idVehiculoCampana` ASC) VISIBLE,
  UNIQUE INDEX `idCampana_UNIQUE` (`idCampana` ASC) VISIBLE,
  CONSTRAINT `idVehiculoCampana`
    FOREIGN KEY (`idVehiculoCampana`)
    REFERENCES `mydb`.`Vehiculos` (`idVehiculo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
