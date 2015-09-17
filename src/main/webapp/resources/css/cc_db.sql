-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.26-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for comicscat
CREATE DATABASE IF NOT EXISTS `comicscat` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `comicscat`;


-- Dumping structure for table comicscat.comics
CREATE TABLE IF NOT EXISTS `comics` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `comics_date_added` datetime NOT NULL,
  `comics_parent` bigint(20) DEFAULT NULL,
  `comics_link` varchar(150) NOT NULL,
  `comics_status` varchar(20) NOT NULL,
  `comics_title` text NOT NULL,
  `comics_title_origin` text NOT NULL,
  `comics_cover_url` varchar(150) NOT NULL,
  `comics_writer` varchar(100) NOT NULL,
  `comics_painter` varchar(100) NOT NULL,
  `comics_colorist` varchar(100) DEFAULT NULL,
  `comics_description` longtext NOT NULL,
  `comics_screens` text NOT NULL,
  `comics_videos` text NOT NULL,
  `comics_type` varchar(20) NOT NULL,
  `comics_date_ru_pub` datetime NOT NULL,
  `comics_date_world_pub` datetime NOT NULL,
  `comics_publisher_origin` varchar(50) NOT NULL,
  `comics_publisher_ru` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table comicscat.comics: ~1 rows (approximately)
DELETE FROM `comics`;
/*!40000 ALTER TABLE `comics` DISABLE KEYS */;
INSERT INTO `comics` (`id`, `comics_date_added`, `comics_parent`, `comics_link`, `comics_status`, `comics_title`, `comics_title_origin`, `comics_cover_url`, `comics_writer`, `comics_painter`, `comics_colorist`, `comics_description`, `comics_screens`, `comics_videos`, `comics_type`, `comics_date_ru_pub`, `comics_date_world_pub`, `comics_publisher_origin`, `comics_publisher_ru`) VALUES
	(1, '2015-09-17 13:29:42', NULL, 'watchmen', 'pub', 'Хранители', 'Watchmen', 'https://paneldiscussions.files.wordpress.com/2011/11/watchmen-cover.jpg', 'Алан Мур', 'Дэйв Гиббонс', 'Джон Хиггинс', 'ограниченная серия комиксов из двенадцати выпусков, опубликованная компанией DC Comics в период с сентября 1986 по октябрь 1987 года, а позже переизданная в виде графического романа. Авторы серии — писатель Алан Мур, художник Дэйв Гиббонс и колорист Джон Хиггинс (англ.)русск. — использовали в качестве прототипов супергероев, права на использование которых незадолго до того были приобретены DC Comics у другой компании, издававшей комиксы, — Charlton Comics (англ.)русск.. Поскольку предложенная Муром история не оставляла возможности дальнейшего использования многих из героев, редактор Дик Джиордано (англ.)русск. убедил писателей создать новых персонажей[1].', 'https://paneldiscussions.files.wordpress.com/2011/11/watchmen-cover.jpg', '<iframe width="112" height="63" src="https://www.youtube.com/embed/joTphRPy6sg" frameborder="0" allowfullscreen></iframe>', 'сборник', '1987-09-17 13:31:29', '2014-09-17 13:31:52', 'Vertigo', 'Азбука'),
	(2, '2015-09-17 14:41:14', NULL, 'Pilgrim', 'pub', 'Скотт Пилигрим', 'Scott Pilgrim', 'http://www.comicsbeat.com/wp-content/uploads/2012/03/EMBARGOED-8PM-PST-03.30.2012-SPV1-COLOR-HC-COVER.jpg', 'Брайаном Ли О’Мэлли', 'Брайаном Ли О’Мэлли', NULL, 'шеститомная серия комиксов, созданная Брайаном Ли О’Мэлли и изданная Портлендским филиалом издательства «Oni Press» в период с августа 2004 года (первый том) по 20 июля 2010 года (шестой том). Серия повествует о жизни 23-летнего канадца Скотта Пилигрима: лентяя и любителя видеоигр, играющего в музыкальной группе на бас-гитаре и живущего на квартире у своего друга-гея в Торонто. Ему нравится недавно переехавшая в его город американка Рамона Флауэрс (Ramona Flowers), но для того, чтобы завоевать её сердце, ему нужно победить семерых «злых бывших» Рамоны.', 'http://www.comicsbeat.com/wp-content/uploads/2012/03/EMBARGOED-8PM-PST-03.30.2012-SPV1-COLOR-HC-COVER.jpg', 'http://www.comicsbeat.com/wp-content/uploads/2012/03/EMBARGOED-8PM-PST-03.30.2012-SPV1-COLOR-HC-COVER.jpg', 'сборник', '2010-09-17 14:43:59', '2015-07-17 14:44:03', 'Oni Press', 'Комильфо'),
	(3, '2015-09-17 15:00:19', NULL, 'sin_city', 'pub', 'Город Грехов: Трудное прощание', 'Sin City: The Hard Goodbye', 'http://i.imgur.com/X2yBvpg.jpg', 'Фрэнк Миллер', 'Фрэнк Миллер', NULL, 'Впервые сюжет был издан под названием «Город грехов» в апреле 1991 года в серии Dark Horse 5th Anniversary Special по частям и продолжен в мае 1991 — июне 1992 в номерах 51-62 антологии Dark Horse Presents. Перепечатан как «Город Грехов (Трудное прощание)» в январе 1993 году.', 'http://i.imgur.com/X2yBvpg.jpg', '<iframe width="112" height="63" src="https://www.youtube.com/embed/Dv8HPqF7aWo" frameborder="0" allowfullscreen></iframe>', 'сборник', '1992-05-17 15:13:28', '2013-09-17 15:13:38', 'Dark Horse', 'Амфора');
/*!40000 ALTER TABLE `comics` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
