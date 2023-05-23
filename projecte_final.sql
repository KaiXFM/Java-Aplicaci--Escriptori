-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.10.2-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para filmflow
CREATE DATABASE IF NOT EXISTS `filmflow` /*!40100 DEFAULT CHARACTER SET utf16 COLLATE utf16_spanish_ci */;
USE `filmflow`;

-- Volcando estructura para tabla filmflow.actors
CREATE TABLE IF NOT EXISTS `actors` (
  `id_actor` int(11) NOT NULL AUTO_INCREMENT,
  `nom_actor` varchar(50) NOT NULL,
  `nacionalitat` varchar(30) NOT NULL,
  PRIMARY KEY (`id_actor`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.actors: ~34 rows (aproximadamente)
INSERT INTO `actors` (`id_actor`, `nom_actor`, `nacionalitat`) VALUES
	(1, 'Leonardo DiCaprio', 'Estados Unidos'),
	(2, 'Penélope Cruz', 'España'),
	(3, 'Tom Hanks', 'Estados Unidos'),
	(4, 'Gong Li', 'China'),
	(5, 'Julia Roberts', 'Estados Unidos'),
	(6, 'Ricardo Darín', 'Argentina'),
	(7, 'Meryl Streep', 'Estados Unidos'),
	(8, 'Aishwarya Rai Bachchan', 'India'),
	(9, 'Robert Downey Jr.', 'Estados Unidos'),
	(10, 'Marion Cotillard', 'Francia'),
	(11, 'Johnny Depp', 'Estados Unidos'),
	(12, 'Salma Hayek', 'México'),
	(13, 'Hugh Jackman', 'Australia'),
	(14, 'Sofia Vergara', 'Colombia'),
	(15, 'Brad Pitt', 'Estados Unidos'),
	(16, 'Catherine Zeta-Jones', 'Gales'),
	(17, 'Will Smith', 'Estados Unidos'),
	(18, 'Charlize Theron', 'Sudáfrica'),
	(19, 'George Clooney', 'Estados Unidos'),
	(20, 'Priyanka Chopra', 'India'),
	(21, 'John Travolta', 'Estados Unidos'),
	(22, 'Samuel L Jackson', 'Estados Unidos'),
	(23, 'Morgan Freeman', 'Estados Unidos'),
	(24, 'Tim Robbins', 'Estados Unidos'),
	(25, 'Christian Bale', 'Estados Unidos'),
	(26, 'Emilia Clarke', 'Reino Unido'),
	(27, 'Maisie Williams', 'Reino Unido'),
	(28, 'Keanu Reeves', 'El Líbano'),
	(29, 'Laurence Fishburn', 'Estados Unidos'),
	(30, 'Emma Stone', 'Estados Unidos'),
	(31, 'Ryan Gosling', 'Estados Unidos'),
	(32, 'Al Pacino', 'Estados Unidos'),
	(33, 'John Cazale', 'Estados Unidos'),
	(34, 'Ving Rhames', 'Estados Unidos');

-- Volcando estructura para tabla filmflow.actuen
CREATE TABLE IF NOT EXISTS `actuen` (
  `id_actor` int(11) NOT NULL,
  `id_produccio` int(11) NOT NULL,
  `protagonista` tinyint(1) NOT NULL,
  KEY `id_actor` (`id_actor`),
  KEY `id_produccio` (`id_produccio`),
  CONSTRAINT `actuen_ibfk_1` FOREIGN KEY (`id_actor`) REFERENCES `actors` (`id_actor`),
  CONSTRAINT `actuen_ibfk_2` FOREIGN KEY (`id_produccio`) REFERENCES `pelicules` (`id_produccio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.actuen: ~48 rows (aproximadamente)
INSERT INTO `actuen` (`id_actor`, `id_produccio`, `protagonista`) VALUES
	(1, 11, 1),
	(1, 18, 1),
	(10, 11, 0),
	(15, 9, 0),
	(21, 3, 1),
	(22, 3, 1),
	(23, 1, 1),
	(24, 1, 1),
	(25, 5, 1),
	(28, 15, 1),
	(29, 15, 0),
	(30, 20, 1),
	(31, 20, 1),
	(32, 13, 1),
	(33, 13, 0),
	(34, 3, 0),
	(1, 11, 1),
	(1, 18, 1),
	(10, 11, 0),
	(15, 9, 0),
	(21, 3, 1),
	(22, 3, 1),
	(23, 1, 1),
	(24, 1, 1),
	(25, 5, 1),
	(28, 15, 1),
	(29, 15, 0),
	(30, 20, 1),
	(31, 20, 1),
	(32, 13, 1),
	(33, 13, 0),
	(34, 3, 0),
	(1, 11, 1),
	(1, 18, 1),
	(10, 11, 0),
	(15, 9, 0),
	(21, 3, 1),
	(22, 3, 1),
	(23, 1, 1),
	(24, 1, 1),
	(25, 5, 1),
	(28, 15, 1),
	(29, 15, 0),
	(30, 20, 1),
	(31, 20, 1),
	(32, 13, 1),
	(33, 13, 0),
	(34, 3, 0);

-- Volcando estructura para tabla filmflow.clients
CREATE TABLE IF NOT EXISTS `clients` (
  `id_client` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(50) NOT NULL,
  `DNI` varchar(9) DEFAULT NULL,
  `edat_data_naixement` date NOT NULL,
  `adresa` varchar(50) DEFAULT NULL,
  `nacionalitat` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefon` varchar(15) DEFAULT NULL,
  `num_tarjeta` varchar(16) DEFAULT NULL,
  `num_compte_banc` varchar(24) DEFAULT NULL,
  PRIMARY KEY (`id_client`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf16 COLLATE=utf16_spanish_ci;

-- Volcando datos para la tabla filmflow.clients: ~23 rows (aproximadamente)
INSERT INTO `clients` (`id_client`, `Nom`, `DNI`, `edat_data_naixement`, `adresa`, `nacionalitat`, `email`, `telefon`, `num_tarjeta`, `num_compte_banc`) VALUES
	(1, 'María Rodríguez', '23456789L', '2003-02-18', 'Calle Principal 789', 'España', 'mariarodriguez@gmail.com', '987654321', '1234567812345678', 'ES0123456789012345678901'),
	(2, 'José García', '34567890M', '1988-07-26', 'Avenida Central 321', 'España', 'josegarcia@gmail.com', '123456789', '9876543210987654', 'ES0987654321098765432109'),
	(3, 'Laura Martínez', '45678901N', '1995-04-09', 'Calle Secundaria 654', 'España', 'lauramartinez@hotmail.com', '456789012', '4567890123456789', 'ES3456789012345678901234'),
	(4, 'Carlos López', '56789012O', '1991-11-22', 'Plaza Mayor 123', 'España', 'carloslopez@hotmail.com', '789012345', '7890123456789012', 'ES5678901234567890123456'),
	(5, 'Sara Fernández', '67890123P', '1987-06-15', 'Avenida del Sol 987', 'España', 'sarafernandez@gmail.com', '890123456', '8901234567890123', 'ES7890123456789012345678'),
	(6, 'Manuel Torres', '78901234Q', '2001-03-28', 'Calle Nueva 456', 'España', 'manueltorres@hotmail.com', '901234567', '9012345678901234', 'ES9012345678901234567890'),
	(7, 'Ana Ramírez', '89012345R', '1993-10-11', 'Avenida Principal 987', 'España', 'anaramirez@hotmail.com', '345678901', '3456789012345678', 'ES3456789012345678901234'),
	(8, 'Pedro Navarro', '90123456S', '1988-05-24', 'Calle Central 654', 'España', 'pedronavarro@gmail.com', '567890123', '5678901234567890', 'ES5678901234567890123456'),
	(9, 'Isabel Morales', '01234567T', '1996-02-07', 'Plaza del Sol 321', 'España', 'isabelmorales@gmail.com', '678901234', '6789012345678901', 'ES6789012345678901234567'),
	(10, 'Miguel Sánchez', '12345678U', '1997-09-13', 'Avenida Nueva 654', 'España', 'miguelsanchez@gmail.com', '890123456', '8901234567890123', 'ES8901234567890123456789'),
	(11, 'Pedro Rodríguez', '34567890C', '1992-03-10', 'Calle Secundaria 789', 'España', 'pedrorodriguez@gmail.com', '456789012', '4567890123456789', 'ES3456789012345678901234'),
	(12, 'Laura López', '45678901D', '1988-12-05', 'Plaza Mayor 987', 'España', 'lauralopez@gmail.com', '789012345', '7890123456789012', 'ES5678901234567890123456'),
	(13, 'Carlos García', '56789012E', '1995-07-18', 'Avenida del Sol 654', 'España', 'carlosgarcia@gmail.com', '890123456', '8901234567890123', 'ES7890123456789012345678'),
	(14, 'Ana Martínez', '67890123F', '1991-09-25', 'Calle Nueva 321', 'España', 'anamartinez@hotmail.com', '901234567', '9012345678901234', 'ES9012345678901234567890'),
	(15, 'Sergio Morales', '78901234G', '1993-06-14', 'Avenida Principal 654', 'España', 'sergiomorales@gmail.com', '345678901', '3456789012345678', 'ES3456789012345678901234'),
	(16, 'Elena Navarro', '89012345H', '1987-11-30', 'Calle Central 987', 'España', 'elenanavarro@example.com', '567890123', '5678901234567890', 'ES5678901234567890123456'),
	(17, 'Miguel Torres', '90123456I', '1994-04-02', 'Plaza del Sol 456', 'España', 'migueltorres@gmail.com', '678901234', '6789012345678901', 'ES6789012345678901234567'),
	(18, 'Isabel Ramírez', '01234567J', '1997-01-08', 'Avenida Nueva 789', 'España', 'isabelramirez@hotmail.com', '661123321', '8901234567890542', 'ES8901234567890123454517'),
	(19, 'Javier Sánchez', '12345678U', '1997-09-13', 'Avenida Nueva 654', 'España', 'miguelsanchez@hotmail.com', '890123456', '8901234567890123', 'ES8901234567890123456789'),
	(20, 'Javier Torres', '34567890W', '1998-01-21', 'Avenida Central 789', 'Español', 'javiertorres@hotmail.com', '456789012', '4567890123456789', 'ES4567890123456789012345'),
	(21, 'Elena García', '45678901X', '1990-09-04', 'Calle Secundaria 123', 'Español', 'elenagarcia@gmail.com', '567890123', '5678901234567890', 'ES5678901234567890123456'),
	(22, 'Xavi', NULL, '2004-01-28', NULL, NULL, 'xavi@gmail.com', '987654321', NULL, NULL),
	(23, 'Xavi2', NULL, '2004-01-28', NULL, NULL, 'xavi2@gmail.com', '987654321', NULL, NULL);

-- Volcando estructura para tabla filmflow.compte
CREATE TABLE IF NOT EXISTS `compte` (
  `id_compte` int(11) NOT NULL AUTO_INCREMENT,
  `usuari` varchar(50) NOT NULL,
  `contrassenya` varchar(50) NOT NULL,
  `data_alta` date NOT NULL,
  `id_client` int(11) DEFAULT NULL,
  `id_modalitat` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_compte`),
  KEY `id_client` (`id_client`),
  KEY `id_modalitat` (`id_modalitat`),
  CONSTRAINT `compte_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `clients` (`id_client`),
  CONSTRAINT `compte_ibfk_2` FOREIGN KEY (`id_modalitat`) REFERENCES `modalitat` (`id_modalitat`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf16 COLLATE=utf16_spanish_ci;

-- Volcando datos para la tabla filmflow.compte: ~22 rows (aproximadamente)
INSERT INTO `compte` (`id_compte`, `usuari`, `contrassenya`, `data_alta`, `id_client`, `id_modalitat`) VALUES
	(1, 'user123', '040173afc2e9520e65a1773779691d3e', '0000-00-00', 1, 1),
	(2, 'cooluser', 'securepassword', '0000-00-00', 2, 2),
	(3, 'webmaster', 'p@ssw0rd', '0000-00-00', 3, 1),
	(4, 'newuser', 'welc0me2023', '0000-00-00', 4, 3),
	(5, 'techguru', '1234abcd!', '0000-00-00', 5, 1),
	(6, 'gamer123', 'gamingFTW', '0000-00-00', 6, 2),
	(7, 'moviebuff', 'cinema21!', '0000-00-00', 7, 3),
	(8, 'sportsfan', 'goTeam2023', '0000-00-00', 8, 2),
	(9, 'musiclover', 'melodies123', '0000-00-00', 9, 1),
	(10, 'bookworm', 'reading2023', '0000-00-00', 10, 1),
	(11, 'traveler', 'wanderlust!', '0000-00-00', 11, 1),
	(12, 'fitnessguru', 'fitlife2023', '0000-00-00', 12, 2),
	(13, 'foodie123', 'tastyDishes', '0000-00-00', 13, 1),
	(14, 'artlover', 'creativity!', '0000-00-00', 14, 2),
	(15, 'naturelover', 'outdoorsy23', '0000-00-00', 15, 2),
	(16, 'adventure', 'exploreNow!', '0000-00-00', 16, 2),
	(17, 'techlover', 'geekTech2023', '0000-00-00', 17, 1),
	(18, 'fashionista', 'style1234', '0000-00-00', 18, 3),
	(19, 'businesspro', 'success2023', '0000-00-00', 19, 3),
	(20, 'creativemind', 'imagination!', '0000-00-00', 20, 3),
	(21, 'xavi', 'xavi', '2023-05-17', 22, 3),
	(22, 'xavi2', 'xavi2', '2023-05-19', 23, 2);

-- Volcando estructura para procedimiento filmflow.costAnual
DELIMITER //
CREATE PROCEDURE `costAnual`(
	IN `pClientId` INT,
	IN `pYear` DATE
)
BEGIN
	DECLARE clientNom VARCHAR(50);
    DECLARE totalCost DECIMAL(10, 2);
    
    SELECT Nom INTO @clientNom FROM Clients WHERE id_client = pClientId;
    
    SELECT SUM(Factura.preu_cost) INTO @totalCost
    FROM Factura
    JOIN Compte ON Factura.id_compte = Compte.id_compte
    JOIN Clients ON Compte.id_client = Clients.id_client
    WHERE Clients.id_client = pClientId
    AND YEAR(Factura.dates) = pYear;
    
    SELECT CONCAT(@clientNom) AS ClientFullName, @totalCost AS TotalCost;
END//
DELIMITER ;

-- Volcando estructura para tabla filmflow.director
CREATE TABLE IF NOT EXISTS `director` (
  `id_director` int(11) NOT NULL AUTO_INCREMENT,
  `nom_director` varchar(50) NOT NULL,
  `nacionalitat` varchar(30) NOT NULL,
  PRIMARY KEY (`id_director`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.director: ~25 rows (aproximadamente)
INSERT INTO `director` (`id_director`, `nom_director`, `nacionalitat`) VALUES
	(1, 'Christopher Nolan', 'Estados Unidos'),
	(2, 'Francis Ford Coppola', 'Estados Unidos'),
	(3, 'James Cameron', 'Canada'),
	(4, 'Frank Darabont', 'Francia'),
	(5, 'Quentin Tarantino', 'Estados Unidos'),
	(6, 'Martin Scorsese', 'Estados Unidos'),
	(7, 'Lana Wachowsky', 'Estados Unidos'),
	(8, 'Lilly Wachowsky', 'Estados Unidos'),
	(9, 'Marc Foster', 'Alemania'),
	(10, 'David Fincher', 'Estados Unidos'),
	(11, 'Damien Chazelle', 'Estados Unidos'),
	(12, 'Alex Graves', 'Estados Unidos'),
	(13, 'Mark Mylod', 'Reino Unido'),
	(14, 'Miguel Sapochnik', 'Argentina'),
	(15, 'Vince Gilligan', 'Estados Unidos'),
	(16, 'Adam Bernstein', 'Estados Unidos'),
	(17, 'Michelle MacLaren', 'Canada'),
	(18, 'James Burrows', 'Estados Unidos'),
	(19, 'José Padilha', 'Brasil'),
	(20, 'Steven Spielberg', 'Estados Unidos'),
	(21, 'Otto Bathurst', 'Reino Unido'),
	(22, 'Euros Lyn', 'Gales'),
	(23, 'John Krasinski', 'Estados Unidos'),
	(24, 'Steve Carrell', 'Estados Unidos'),
	(25, 'Greg Daniels', 'Estados Unidos');

-- Volcando estructura para tabla filmflow.dirigeix_episodi
CREATE TABLE IF NOT EXISTS `dirigeix_episodi` (
  `id_director` int(11) NOT NULL,
  `id_produccio` int(11) NOT NULL,
  `id_episodi` int(11) NOT NULL,
  `protagonista` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_director`,`id_produccio`,`id_episodi`),
  KEY `id_produccio` (`id_produccio`,`id_episodi`),
  CONSTRAINT `dirigeix_episodi_ibfk_1` FOREIGN KEY (`id_director`) REFERENCES `director` (`id_director`),
  CONSTRAINT `dirigeix_episodi_ibfk_2` FOREIGN KEY (`id_produccio`, `id_episodi`) REFERENCES `episodi` (`id_produccio`, `id_episodi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.dirigeix_episodi: ~18 rows (aproximadamente)
INSERT INTO `dirigeix_episodi` (`id_director`, `id_produccio`, `id_episodi`, `protagonista`) VALUES
	(12, 2, 24, NULL),
	(12, 2, 25, NULL),
	(12, 2, 33, NULL),
	(15, 4, 1, NULL),
	(16, 4, 2, NULL),
	(16, 4, 3, NULL),
	(16, 4, 4, NULL),
	(16, 4, 5, NULL),
	(17, 2, 28, NULL),
	(18, 6, 1, NULL),
	(18, 6, 2, NULL),
	(18, 6, 3, NULL),
	(18, 6, 4, NULL),
	(20, 8, 1, NULL),
	(20, 8, 2, NULL),
	(20, 8, 3, NULL),
	(20, 8, 4, NULL),
	(20, 8, 5, NULL);

-- Volcando estructura para tabla filmflow.dirigeix_pel·licula
CREATE TABLE IF NOT EXISTS `dirigeix_pel·licula` (
  `id_director` int(11) NOT NULL,
  `id_produccio` int(11) NOT NULL,
  KEY `id_director` (`id_director`),
  KEY `id_produccio` (`id_produccio`),
  CONSTRAINT `dirigeix_pel·licula_ibfk_1` FOREIGN KEY (`id_director`) REFERENCES `director` (`id_director`),
  CONSTRAINT `dirigeix_pel·licula_ibfk_2` FOREIGN KEY (`id_produccio`) REFERENCES `pelicules` (`id_produccio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.dirigeix_pel·licula: ~33 rows (aproximadamente)
INSERT INTO `dirigeix_pel·licula` (`id_director`, `id_produccio`) VALUES
	(1, 5),
	(1, 11),
	(2, 7),
	(4, 1),
	(5, 3),
	(6, 13),
	(6, 18),
	(7, 15),
	(8, 15),
	(10, 9),
	(11, 20),
	(1, 5),
	(1, 11),
	(2, 7),
	(4, 1),
	(5, 3),
	(6, 13),
	(6, 18),
	(7, 15),
	(8, 15),
	(10, 9),
	(11, 20),
	(1, 5),
	(1, 11),
	(2, 7),
	(4, 1),
	(5, 3),
	(6, 13),
	(6, 18),
	(7, 15),
	(8, 15),
	(10, 9),
	(11, 20);

-- Volcando estructura para tabla filmflow.episodi
CREATE TABLE IF NOT EXISTS `episodi` (
  `id_produccio` int(11) DEFAULT NULL,
  `id_episodi` int(11) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `durada` int(11) DEFAULT NULL,
  KEY `id_produccio` (`id_produccio`),
  CONSTRAINT `episodi_ibfk_1` FOREIGN KEY (`id_produccio`) REFERENCES `series` (`id_produccio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.episodi: ~57 rows (aproximadamente)
INSERT INTO `episodi` (`id_produccio`, `id_episodi`, `nom`, `durada`) VALUES
	(2, 24, 'And now his watch is ended', 45),
	(2, 25, 'Kissed by fire', 45),
	(2, 28, 'Second sons', 45),
	(2, 33, 'Breaker of chains', 45),
	(4, 1, 'Pilot', 57),
	(4, 2, 'Cat\'s in the bag...', 47),
	(4, 3, '...And the Bag\'s in the River', 47),
	(4, 4, 'Cancer Man', 47),
	(4, 5, 'Gray Matter', 47),
	(6, 1, 'The Pilot', 25),
	(6, 2, 'The one with the Sonogram at the End', 22),
	(6, 3, 'The one with the Thumb', 22),
	(6, 4, 'The one with George Stephanopoulos', 23),
	(8, 1, 'Mind Blown', 50),
	(8, 2, 'Mad for Max', 52),
	(8, 3, 'Unlikely Allies', 55),
	(8, 4, 'Truth in Hawkins', 53),
	(8, 5, 'The AV Club', 55),
	(8, 6, 'The New Class', 56),
	(2, 24, 'And now his watch is ended', 45),
	(2, 25, 'Kissed by fire', 45),
	(2, 28, 'Second sons', 45),
	(2, 33, 'Breaker of chains', 45),
	(4, 1, 'Pilot', 57),
	(4, 2, 'Cat\'s in the bag...', 47),
	(4, 3, '...And the Bag\'s in the River', 47),
	(4, 4, 'Cancer Man', 47),
	(4, 5, 'Gray Matter', 47),
	(6, 1, 'The Pilot', 25),
	(6, 2, 'The one with the Sonogram at the End', 22),
	(6, 3, 'The one with the Thumb', 22),
	(6, 4, 'The one with George Stephanopoulos', 23),
	(8, 1, 'Mind Blown', 50),
	(8, 2, 'Mad for Max', 52),
	(8, 3, 'Unlikely Allies', 55),
	(8, 4, 'Truth in Hawkins', 53),
	(8, 5, 'The AV Club', 55),
	(8, 6, 'The New Class', 56),
	(2, 24, 'And now his watch is ended', 45),
	(2, 25, 'Kissed by fire', 45),
	(2, 28, 'Second sons', 45),
	(2, 33, 'Breaker of chains', 45),
	(4, 1, 'Pilot', 57),
	(4, 2, 'Cat\'s in the bag...', 47),
	(4, 3, '...And the Bag\'s in the River', 47),
	(4, 4, 'Cancer Man', 47),
	(4, 5, 'Gray Matter', 47),
	(6, 1, 'The Pilot', 25),
	(6, 2, 'The one with the Sonogram at the End', 22),
	(6, 3, 'The one with the Thumb', 22),
	(6, 4, 'The one with George Stephanopoulos', 23),
	(8, 1, 'Mind Blown', 50),
	(8, 2, 'Mad for Max', 52),
	(8, 3, 'Unlikely Allies', 55),
	(8, 4, 'Truth in Hawkins', 53),
	(8, 5, 'The AV Club', 55),
	(8, 6, 'The New Class', 56);

-- Volcando estructura para tabla filmflow.factura
CREATE TABLE IF NOT EXISTS `factura` (
  `id_factura` int(11) NOT NULL AUTO_INCREMENT,
  `dates` date NOT NULL,
  `preu_cost` decimal(10,0) NOT NULL,
  `id_compte` int(11) NOT NULL,
  PRIMARY KEY (`id_factura`),
  KEY `id_compte` (`id_compte`),
  CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`id_compte`) REFERENCES `compte` (`id_compte`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.factura: ~40 rows (aproximadamente)
INSERT INTO `factura` (`id_factura`, `dates`, `preu_cost`, `id_compte`) VALUES
	(1, '2021-01-01', 15, 1),
	(2, '2021-02-01', 25, 2),
	(3, '2021-03-01', 15, 3),
	(4, '2021-04-01', 25, 4),
	(5, '2021-05-01', 15, 5),
	(6, '2021-06-01', 25, 6),
	(7, '2021-07-01', 15, 7),
	(8, '2021-08-01', 25, 8),
	(9, '2021-09-01', 15, 9),
	(10, '2021-10-01', 25, 10),
	(11, '2021-11-01', 15, 11),
	(12, '2021-12-01', 25, 12),
	(13, '2022-01-01', 15, 13),
	(14, '2022-02-01', 25, 14),
	(15, '2022-03-01', 15, 15),
	(16, '2022-04-01', 25, 16),
	(17, '2022-05-01', 15, 17),
	(18, '2022-06-01', 25, 18),
	(19, '2022-07-01', 15, 19),
	(20, '2022-08-01', 25, 20),
	(21, '2023-01-01', 15, 1),
	(22, '2023-02-01', 25, 2),
	(23, '2023-03-01', 15, 3),
	(24, '2023-04-01', 25, 4),
	(25, '2023-05-01', 15, 5),
	(26, '2023-06-01', 25, 6),
	(27, '2023-07-01', 15, 7),
	(28, '2023-08-01', 25, 8),
	(29, '2023-09-01', 15, 9),
	(30, '2023-10-01', 25, 10),
	(31, '2023-11-01', 15, 11),
	(32, '2023-12-01', 25, 12),
	(33, '2022-09-01', 15, 1),
	(34, '2022-10-01', 25, 2),
	(35, '2022-11-01', 15, 3),
	(36, '2022-12-01', 25, 4),
	(37, '2023-09-01', 15, 5),
	(38, '2023-10-01', 25, 6),
	(39, '2023-11-01', 15, 7),
	(40, '2023-12-01', 25, 8);

-- Volcando estructura para tabla filmflow.genere
CREATE TABLE IF NOT EXISTS `genere` (
  `id_categoria` int(11) NOT NULL,
  `nom` enum('Drama','Acció','Fantasía','Ciencia Ficció','Aventura','Comedia','Thriller','Terror','Suspens','Animació') DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.genere: ~9 rows (aproximadamente)
INSERT INTO `genere` (`id_categoria`, `nom`) VALUES
	(1, 'Acció'),
	(2, 'Aventura'),
	(3, 'Comedia'),
	(4, 'Drama'),
	(5, 'Suspens'),
	(6, 'Ciencia Ficció'),
	(7, 'Fantasía'),
	(8, 'Animació'),
	(9, 'Terror');

-- Volcando estructura para tabla filmflow.ha_consumit
CREATE TABLE IF NOT EXISTS `ha_consumit` (
  `id_compte` int(11) NOT NULL,
  `id_produccio` int(11) NOT NULL,
  `num_visualitzacio` int(11) NOT NULL,
  `preferit` tinyint(1) NOT NULL,
  KEY `id_compte` (`id_compte`),
  KEY `id_produccio` (`id_produccio`),
  CONSTRAINT `ha_consumit_ibfk_1` FOREIGN KEY (`id_compte`) REFERENCES `compte` (`id_compte`),
  CONSTRAINT `ha_consumit_ibfk_2` FOREIGN KEY (`id_produccio`) REFERENCES `produccions` (`id_produccio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.ha_consumit: ~99 rows (aproximadamente)
INSERT INTO `ha_consumit` (`id_compte`, `id_produccio`, `num_visualitzacio`, `preferit`) VALUES
	(2, 1, 4, 1),
	(2, 3, 1, 1),
	(2, 5, 1, 0),
	(3, 3, 3, 1),
	(3, 5, 2, 1),
	(3, 9, 3, 1),
	(4, 13, 3, 1),
	(4, 14, 2, 1),
	(4, 17, 1, 0),
	(6, 2, 2, 1),
	(6, 11, 2, 1),
	(6, 18, 3, 1),
	(7, 6, 3, 0),
	(7, 7, 2, 1),
	(7, 10, 2, 1),
	(10, 7, 4, 1),
	(10, 9, 2, 0),
	(10, 10, 2, 1),
	(14, 1, 2, 1),
	(14, 20, 5, 1),
	(17, 3, 3, 1),
	(17, 4, 2, 1),
	(17, 11, 4, 1),
	(17, 16, 1, 0),
	(20, 11, 2, 1),
	(21, 4, 1, 1),
	(21, 8, 4, 0),
	(21, 2, 1, 1),
	(21, 9, 1, 0),
	(21, 20, 1, 1),
	(21, 14, 1, 1),
	(21, 7, 1, 1),
	(21, 3, 1, 1),
	(2, 1, 4, 1),
	(2, 3, 1, 1),
	(2, 5, 1, 0),
	(3, 3, 3, 1),
	(3, 5, 2, 1),
	(3, 9, 3, 1),
	(4, 13, 3, 1),
	(4, 14, 2, 1),
	(4, 17, 1, 0),
	(6, 2, 2, 1),
	(6, 11, 2, 1),
	(6, 18, 3, 1),
	(7, 6, 3, 0),
	(7, 7, 2, 1),
	(7, 10, 2, 1),
	(10, 7, 4, 1),
	(10, 9, 2, 0),
	(10, 10, 2, 1),
	(14, 1, 2, 1),
	(14, 20, 5, 1),
	(17, 3, 3, 1),
	(17, 4, 2, 1),
	(17, 11, 4, 1),
	(17, 16, 1, 0),
	(20, 11, 2, 1),
	(21, 4, 1, 1),
	(21, 8, 4, 0),
	(21, 2, 1, 1),
	(21, 9, 1, 0),
	(21, 20, 1, 1),
	(21, 14, 1, 1),
	(21, 7, 1, 1),
	(21, 3, 1, 1),
	(2, 1, 4, 1),
	(2, 3, 1, 1),
	(2, 5, 1, 0),
	(3, 3, 3, 1),
	(3, 5, 2, 1),
	(3, 9, 3, 1),
	(4, 13, 3, 1),
	(4, 14, 2, 1),
	(4, 17, 1, 0),
	(6, 2, 2, 1),
	(6, 11, 2, 1),
	(6, 18, 3, 1),
	(7, 6, 3, 0),
	(7, 7, 2, 1),
	(7, 10, 2, 1),
	(10, 7, 4, 1),
	(10, 9, 2, 0),
	(10, 10, 2, 1),
	(14, 1, 2, 1),
	(14, 20, 5, 1),
	(17, 3, 3, 1),
	(17, 4, 2, 1),
	(17, 11, 4, 1),
	(17, 16, 1, 0),
	(20, 11, 2, 1),
	(21, 4, 1, 1),
	(21, 8, 4, 0),
	(21, 2, 1, 1),
	(21, 9, 1, 0),
	(21, 20, 1, 1),
	(21, 14, 1, 1),
	(21, 7, 1, 1),
	(21, 3, 1, 1);

-- Volcando estructura para tabla filmflow.ha_consumit_episodi
CREATE TABLE IF NOT EXISTS `ha_consumit_episodi` (
  `id_compte` int(11) DEFAULT NULL,
  `id_produccio` int(11) DEFAULT NULL,
  `id_episodi` int(11) DEFAULT NULL,
  `num_visualitzacio` int(11) DEFAULT NULL,
  KEY `id_compte` (`id_compte`),
  KEY `id_produccio` (`id_produccio`,`id_episodi`),
  CONSTRAINT `ha_consumit_episodi_ibfk_1` FOREIGN KEY (`id_compte`) REFERENCES `compte` (`id_compte`),
  CONSTRAINT `ha_consumit_episodi_ibfk_2` FOREIGN KEY (`id_produccio`, `id_episodi`) REFERENCES `episodi` (`id_produccio`, `id_episodi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.ha_consumit_episodi: ~0 rows (aproximadamente)

-- Volcando estructura para tabla filmflow.modalitat
CREATE TABLE IF NOT EXISTS `modalitat` (
  `id_modalitat` int(11) NOT NULL AUTO_INCREMENT,
  `tipus` varchar(50) NOT NULL,
  PRIMARY KEY (`id_modalitat`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.modalitat: ~3 rows (aproximadamente)
INSERT INTO `modalitat` (`id_modalitat`, `tipus`) VALUES
	(1, 'gratuit'),
	(2, 'basic'),
	(3, 'premium');

-- Volcando estructura para tabla filmflow.participen
CREATE TABLE IF NOT EXISTS `participen` (
  `id_actor` int(11) NOT NULL,
  `id_produccio` int(11) NOT NULL,
  `id_episodi` int(11) NOT NULL,
  `protagonista` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_actor`,`id_produccio`,`id_episodi`),
  KEY `id_produccio` (`id_produccio`,`id_episodi`),
  CONSTRAINT `participen_ibfk_1` FOREIGN KEY (`id_actor`) REFERENCES `actors` (`id_actor`),
  CONSTRAINT `participen_ibfk_2` FOREIGN KEY (`id_produccio`, `id_episodi`) REFERENCES `episodi` (`id_produccio`, `id_episodi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.participen: ~0 rows (aproximadamente)

-- Volcando estructura para tabla filmflow.pelicules
CREATE TABLE IF NOT EXISTS `pelicules` (
  `id_produccio` int(11) NOT NULL,
  `durada` int(11) NOT NULL,
  PRIMARY KEY (`id_produccio`),
  CONSTRAINT `pelicules_ibfk_1` FOREIGN KEY (`id_produccio`) REFERENCES `produccions` (`id_produccio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.pelicules: ~11 rows (aproximadamente)
INSERT INTO `pelicules` (`id_produccio`, `durada`) VALUES
	(1, 142),
	(3, 154),
	(5, 152),
	(7, 177),
	(9, 139),
	(11, 148),
	(13, 146),
	(15, 136),
	(16, 113),
	(18, 151),
	(20, 128);

-- Volcando estructura para tabla filmflow.pertany
CREATE TABLE IF NOT EXISTS `pertany` (
  `id_produccio` int(11) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  KEY `id_produccio` (`id_produccio`),
  KEY `id_categoria` (`id_categoria`),
  CONSTRAINT `pertany_ibfk_1` FOREIGN KEY (`id_produccio`) REFERENCES `produccions` (`id_produccio`),
  CONSTRAINT `pertany_ibfk_2` FOREIGN KEY (`id_categoria`) REFERENCES `genere` (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.pertany: ~92 rows (aproximadamente)
INSERT INTO `pertany` (`id_produccio`, `id_categoria`) VALUES
	(1, 4),
	(1, 6),
	(2, 2),
	(2, 8),
	(3, 1),
	(3, 3),
	(4, 3),
	(4, 4),
	(5, 1),
	(5, 4),
	(5, 12),
	(6, 3),
	(7, 1),
	(7, 4),
	(7, 12),
	(7, 13),
	(8, 2),
	(8, 7),
	(8, 11),
	(9, 3),
	(9, 6),
	(10, 6),
	(10, 7),
	(11, 1),
	(11, 7),
	(12, 3),
	(13, 6),
	(13, 12),
	(14, 1),
	(14, 10),
	(14, 12),
	(15, 1),
	(15, 7),
	(16, 3),
	(16, 4),
	(16, 8),
	(17, 4),
	(17, 10),
	(17, 13),
	(18, 4),
	(18, 6),
	(18, 12),
	(19, 4),
	(19, 6),
	(20, 3),
	(20, 5),
	(1, 4),
	(1, 6),
	(2, 2),
	(2, 8),
	(3, 1),
	(3, 3),
	(4, 3),
	(4, 4),
	(5, 1),
	(5, 4),
	(5, 12),
	(6, 3),
	(7, 1),
	(7, 4),
	(7, 12),
	(7, 13),
	(8, 2),
	(8, 7),
	(8, 11),
	(9, 3),
	(9, 6),
	(10, 6),
	(10, 7),
	(11, 1),
	(11, 7),
	(12, 3),
	(13, 6),
	(13, 12),
	(14, 1),
	(14, 10),
	(14, 12),
	(15, 1),
	(15, 7),
	(16, 3),
	(16, 4),
	(16, 8),
	(17, 4),
	(17, 10),
	(17, 13),
	(18, 4),
	(18, 6),
	(18, 12),
	(19, 4),
	(19, 6),
	(20, 3),
	(20, 5);

-- Volcando estructura para tabla filmflow.pot_visualitzar
CREATE TABLE IF NOT EXISTS `pot_visualitzar` (
  `id_modalitat` int(11) NOT NULL,
  `id_produccio` int(11) NOT NULL,
  KEY `id_modalitat` (`id_modalitat`),
  KEY `id_produccio` (`id_produccio`),
  CONSTRAINT `pot_visualitzar_ibfk_1` FOREIGN KEY (`id_modalitat`) REFERENCES `modalitat` (`id_modalitat`),
  CONSTRAINT `pot_visualitzar_ibfk_2` FOREIGN KEY (`id_produccio`) REFERENCES `produccions` (`id_produccio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.pot_visualitzar: ~0 rows (aproximadamente)

-- Volcando estructura para tabla filmflow.produccions
CREATE TABLE IF NOT EXISTS `produccions` (
  `id_produccio` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `nacionalitat` varchar(50) NOT NULL,
  `anys` int(11) NOT NULL,
  `preferit` tinyint(1) NOT NULL,
  `foto` text DEFAULT NULL,
  `tipus` bit(1) DEFAULT NULL,
  `disponibilitat` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_produccio`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.produccions: ~20 rows (aproximadamente)
INSERT INTO `produccions` (`id_produccio`, `nom`, `nacionalitat`, `anys`, `preferit`, `foto`, `tipus`, `disponibilitat`) VALUES
	(1, 'The Shawshank Redemption', 'Estados Unidos', 1994, 29, 'img/tsr.jpg', b'0', NULL),
	(2, 'Game of Thrones', 'Estados Unidos', 2011, 78, 'img/got.jpg', b'1', NULL),
	(3, 'Pulp Fiction', 'Estados Unidos', 1994, 6, 'img/pf.jpg', b'0', NULL),
	(4, 'Breaking Bad', 'Estados Unidos', 2008, 93, 'img/bb.jpg', b'1', NULL),
	(5, 'The Dark Knight', 'Estados Unidos', 2008, 50, 'img/tdk.jpg', b'0', NULL),
	(6, 'Friends', 'Estados Unidos', 1994, 68, 'img/f.jpg', b'1', NULL),
	(7, 'The Godfather', 'Estados Unidos', 1972, 91, 'img/tg.jpg', b'0', NULL),
	(8, 'Stranger Things', 'Estados Unidos', 2016, 51, 'img/st.jpg', b'1', NULL),
	(9, 'Fight Club', 'Estados Unidos', 1999, 83, 'img/fc.jpg', b'0', NULL),
	(10, 'Black Mirror', 'Reino Unido', 2011, 61, 'img/bm.jpg', b'1', NULL),
	(11, 'Inception', 'Estados Unidos', 2010, 57, 'img/i.jpg', b'0', NULL),
	(12, 'The Office', 'Estados Unidos', 2005, 3, 'img/to.jpg', b'1', NULL),
	(13, 'Goodfellas', 'Estados Unidos', 1990, 41, 'img/g.jpg', b'0', NULL),
	(14, 'Narcos', 'Estados Unidos', 2015, 99, 'img/n.jpg', b'1', NULL),
	(15, 'The Matrix', 'Estados Unidos', 1999, 70, 'img/tm.jpg', b'0', NULL),
	(16, 'Stranger Than Fiction', 'Estados Unidos', 2006, 54, 'img/stf.jpg', b'0', NULL),
	(17, 'The Crown', 'Reino Unido', 2016, 60, 'img/tc.jpg', b'1', NULL),
	(18, 'The Departed', 'Estados Unidos', 2006, 39, 'img/td.jpg', b'0', NULL),
	(19, 'House of Cards', 'Estados Unidos', 2013, 15, 'img/hoc.jpg', b'1', NULL),
	(20, 'La La Land', 'Estados Unidos', 2016, 58, 'img/lll.jpg', b'0', NULL);

-- Volcando estructura para tabla filmflow.series
CREATE TABLE IF NOT EXISTS `series` (
  `id_produccio` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_produccio`),
  CONSTRAINT `series_ibfk_1` FOREIGN KEY (`id_produccio`) REFERENCES `produccions` (`id_produccio`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla filmflow.series: ~10 rows (aproximadamente)
INSERT INTO `series` (`id_produccio`) VALUES
	(2),
	(4),
	(6),
	(8),
	(10),
	(12),
	(14),
	(16),
	(17),
	(19);

-- Volcando estructura para disparador filmflow.actualitzacioDisponibilitat
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';
DELIMITER //
CREATE TRIGGER `actualitzacioDisponibilitat` BEFORE INSERT ON `produccions` FOR EACH ROW BEGIN
	DECLARE totalEpisodis INT;
    DECLARE numVisualitzacions INT;
    DECLARE disponibilitat BOOLEAN;
    
    IF EXISTS (SELECT 1 FROM Pelicules WHERE id_produccio = NEW.id_produccio) THEN
        SELECT COUNT(*) INTO totalEpisodis FROM Episodi WHERE id_produccio = NEW.id_produccio;
        SELECT SUM(num_visualitzacio) INTO numVisualitzacions FROM Ha_consumit_episodi WHERE id_produccio = NEW.id_produccio;
        SET disponibilitat = (numVisualitzacions < totalEpisodis);
    ELSE
        SET disponibilitat = TRUE;
    END IF;
    
    SET NEW.disponibilitat = disponibilitat;
END//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
