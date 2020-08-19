-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-08-2020 a las 00:22:48
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empresa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aprendiz`
--

CREATE TABLE `aprendiz` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telefono` int(11) NOT NULL,
  `create_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `aprendiz`
--

INSERT INTO `aprendiz` (`id`, `nombre`, `apellido`, `email`, `telefono`, `create_at`) VALUES
(1, 'Roberto', 'Jimenez', 'roberto@gmail', 47726, '2012-10-24 00:00:00'),
(2, 'Camilo', 'Alvarez', 'cmailo@gmail', 364583, '2005-04-12 00:00:00'),
(3, 'Adriana', 'Remirez', 'adriana@gmail', 34672, '2007-12-21 00:00:00'),
(4, 'Jorge', 'Correa', 'jorge@gmail', 466288, '2018-11-04 00:00:00'),
(5, 'Marta', 'Benitez', 'marta@gmail', 364663, '2015-10-24 00:00:00'),
(6, 'Julio', 'Garcia', 'julio@gmail', 66534, '2010-11-13 00:00:00'),
(7, 'Juan', 'Marin', 'Juan@gmail', 377829, '2009-10-12 00:00:00'),
(8, 'Luis', 'Zuluaga', 'luis@gmail', 366882, '2008-05-03 00:00:00'),
(9, 'ramiro', 'zapata', 'elramirito@gmail', 34442, '2020-08-18 00:00:00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `aprendiz`
--
ALTER TABLE `aprendiz`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `aprendiz`
--
ALTER TABLE `aprendiz`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
