-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: crud
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `comentario`
--

DROP TABLE IF EXISTS `comentario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comentario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `comentario` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentario`
--

LOCK TABLES `comentario` WRITE;
/*!40000 ALTER TABLE `comentario` DISABLE KEYS */;
INSERT INTO `comentario` VALUES (1,'Que buen juego el resident evil y lo enconte en la mejor tienda theGameZone','Manuel'),(2,'buenos precios y el envio de super rapido 10/10','Juliana'),(3,'1123123123123','Rainer'),(4,'Excelente servicio y gran variedad de juegos en TheGameZone.','Juan Pérez'),(5,'Encontré los últimos lanzamientos a muy buen precio. ¡Recomendado!','María Gómez'),(6,'El personal es muy amable y me ayudaron a elegir el mejor juego.','Carlos Rodríguez'),(7,'Me encanta la sección de juegos retro que tienen en TheGameZone.','Ana López'),(8,'Buena tienda, pero a veces se quedan sin stock de los juegos más populares.','Luis Fernández'),(9,'Las ofertas de fin de semana son increíbles. Siempre encuentro algo bueno.','Elena Martínez'),(10,'La tienda está bien organizada y es fácil encontrar lo que busco.','José García'),(11,'Compré una consola y llegó en perfecto estado y muy rápido.','Laura Sánchez'),(12,'Gran variedad de accesorios para consolas y PC.','David Torres'),(13,'Las recomendaciones del staff de TheGameZone siempre son acertadas.','Marta Ramírez');
/*!40000 ALTER TABLE `comentario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `game`
--

DROP TABLE IF EXISTS `game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `game` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `consola` varchar(255) NOT NULL,
  `creador` varchar(255) NOT NULL,
  `genero` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game`
--

LOCK TABLES `game` WRITE;
/*!40000 ALTER TABLE `game` DISABLE KEYS */;
INSERT INTO `game` VALUES (1,'Nintendo Switch','Nintendo','Aventura','The Legend of Zelda: Breath of the Wild'),(2,'PlayStation 4','Santa Monica Studio','Acción','God of War'),(3,'Xbox Series X','343 Industries','FPS','Halo: Infinite'),(4,'Nintendo Switch','Nintendo','Plataforma','Super Mario Odyssey'),(5,'PC','CD Projekt Red','RPG','The Witcher 3: Wild Hunt'),(6,'PlayStation 4','Rockstar Games','Aventura','Red Dead Redemption 2'),(7,'PC','Mojang Studios','Sandbox','Minecraft'),(8,'Xbox One','Epic Games','Battle Royale','Fortnite'),(9,'PC','InnerSloth','Party','Among Us'),(10,'Nintendo Switch','Nintendo','Simulación','Animal Crossing: New Horizons');
/*!40000 ALTER TABLE `game` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) NOT NULL,
  `edad` int NOT NULL,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (2,'Gómez',34,'maria.gomez@example.com','Julieta'),(3,'Rodríguez',45,'carlos.rodriguez@example.com','Carlos'),(4,'López',22,'ana.lopez@example.com','Ana'),(5,'Fernández',39,'luis.fernandez@example.com','Luis'),(6,'Martínez',31,'elena.martinez@example.com','Elena'),(7,'García',27,'jose.garcia@example.com','José'),(8,'Sánchez',36,'laura.sanchez@example.com','Laura'),(9,'Torres',42,'david.torres@example.com','David'),(10,'Ramírez',25,'marta.ramirez@example.com','Marta'),(11,'Díaz',33,'javier.diaz@example.com','Javier'),(12,'Ruiz',29,'paula.ruiz@example.com','Paula'),(13,'Hernández',40,'sergio.hernandez@example.com','Sergio'),(14,'Moreno',24,'clara.moreno@example.com','Clara'),(15,'Jiménez',37,'andres.jimenez@example.com','Andrés'),(16,'Romero',26,'natalia.romero@example.com','Natalia'),(17,'Vázquez',43,'francisco.vazquez@example.com','Francisco'),(18,'Molina',30,'silvia.molina@example.com','Silvia'),(19,'Castro',35,'alejandro.castro@example.com','Alejandro'),(20,'Ortiz',38,'patricia.ortiz@example.com','Patricia');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-18 21:29:16
