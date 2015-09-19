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
  `comics_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `comics_date_added` datetime NOT NULL,
  `comics_parent` bigint(20) DEFAULT NULL,
  `comics_link` varchar(150) NOT NULL,
  `comics_status` varchar(20) NOT NULL,
  `comics_title` text NOT NULL,
  `comics_title_origin` text NOT NULL,
  `comics_cover_url` varchar(150) NOT NULL,
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
  PRIMARY KEY (`comics_id`),
  UNIQUE KEY `comics_link` (`comics_link`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Dumping data for table comicscat.comics: ~7 rows (approximately)
DELETE FROM `comics`;
/*!40000 ALTER TABLE `comics` DISABLE KEYS */;
INSERT INTO `comics` (`comics_id`, `comics_date_added`, `comics_parent`, `comics_link`, `comics_status`, `comics_title`, `comics_title_origin`, `comics_cover_url`, `comics_painter`, `comics_colorist`, `comics_description`, `comics_screens`, `comics_videos`, `comics_type`, `comics_date_ru_pub`, `comics_date_world_pub`, `comics_publisher_origin`, `comics_publisher_ru`) VALUES
	(1, '2015-09-17 13:29:42', NULL, 'watchmen', 'pub', 'Хранители', 'Watchmen', 'https://paneldiscussions.files.wordpress.com/2011/11/watchmen-cover.jpg', 'Дэйв Гиббонс', 'Джон Хиггинс', 'ограниченная серия комиксов из двенадцати выпусков, опубликованная компанией DC Comics в период с сентября 1986 по октябрь 1987 года, а позже переизданная в виде графического романа. Авторы серии — писатель Алан Мур, художник Дэйв Гиббонс и колорист Джон Хиггинс (англ.)русск. — использовали в качестве прототипов супергероев, права на использование которых незадолго до того были приобретены DC Comics у другой компании, издававшей комиксы, — Charlton Comics (англ.)русск.. Поскольку предложенная Муром история не оставляла возможности дальнейшего использования многих из героев, редактор Дик Джиордано (англ.)русск. убедил писателей создать новых персонажей[1].', 'https://paneldiscussions.files.wordpress.com/2011/11/watchmen-cover.jpg', 'https://www.youtube.com/embed/joTphRPy6sg', 'сборник', '2014-09-18 13:34:52', '1987-09-17 13:31:29', 'Vertigo', 'Азбука'),
	(2, '2015-09-17 14:41:14', NULL, 'Pilgrim', 'pub', 'Скотт Пилигрим', 'Scott Pilgrim', 'http://www.comicsbeat.com/wp-content/uploads/2012/03/EMBARGOED-8PM-PST-03.30.2012-SPV1-COLOR-HC-COVER.jpg', 'Брайаном Ли О’Мэлли', NULL, 'шеститомная серия комиксов, созданная Брайаном Ли О’Мэлли и изданная Портлендским филиалом издательства «Oni Press» в период с августа 2004 года (первый том) по 20 июля 2010 года (шестой том). Серия повествует о жизни 23-летнего канадца Скотта Пилигрима: лентяя и любителя видеоигр, играющего в музыкальной группе на бас-гитаре и живущего на квартире у своего друга-гея в Торонто. Ему нравится недавно переехавшая в его город американка Рамона Флауэрс (Ramona Flowers), но для того, чтобы завоевать её сердце, ему нужно победить семерых «злых бывших» Рамоны.', 'http://www.comicsbeat.com/wp-content/uploads/2012/03/EMBARGOED-8PM-PST-03.30.2012-SPV1-COLOR-HC-COVER.jpg', 'https://www.youtube.com/embed/MZbMiuNpoVw', 'сборник', '2015-09-18 13:35:04', '2010-09-17 14:43:59', 'Oni Press', 'Комильфо'),
	(3, '2015-09-17 15:00:19', NULL, 'sin_city', 'pub', 'Город Грехов: Трудное прощание', 'Sin City: The Hard Goodbye', 'http://i.imgur.com/X2yBvpg.jpg', 'Фрэнк Миллер', NULL, 'Впервые сюжет был издан под названием «Город грехов» в апреле 1991 года в серии Dark Horse 5th Anniversary Special по частям и продолжен в мае 1991 — июне 1992 в номерах 51-62 антологии Dark Horse Presents. Перепечатан как «Город Грехов (Трудное прощание)» в январе 1993 году.', 'http://i.imgur.com/X2yBvpg.jpg', 'https://www.youtube.com/embed/Dv8HPqF7aWo', 'сборник', '2013-09-18 13:34:42', '1992-05-17 15:13:28', 'Dark Horse', 'Амфора'),
	(4, '2015-09-18 10:57:42', NULL, 'sandman1', 'pub', 'Песочный человек: Прелюдии ноктюрны', 'Sandman 1', 'http://www.chitai-gorod.ru/upload/iblock/121/12135ced725c03d02354cdcbe3b6b5e7.jpg', 'Дэйв МакКин', 'Дэнни Воззо', 'Морфей, Повелитель Снов, в результате тайного ритуала оказывается пленен неким оккультистами. Спустя 70 лет с момента заточения, Сну удается сбежать из плена. Ему предстоят поиски трех утраченных магических инструментов: шлема, сумы с песком и рубина.', 'http://www.chitai-gorod.ru/upload/iblock/121/12135ced725c03d02354cdcbe3b6b5e7.jpg', 'https://www.youtube.com/embed/jJPnQtgomUY', 'сборник', '2014-09-18 13:34:30', '1989-08-18 11:01:33', 'Vertigo', 'Азбука'),
	(5, '2015-09-18 11:53:18', NULL, '1602', 'pub', '1602', 'Marvel 1602', 'http://blog.rgub.ru/izotext/files/2014/09/Marvel_1602_pic-9.jpg', 'Энди Куберт', NULL, '"1602", захватывающий роман-триллер в жанре комикса, - это признанный шедевр от знаменитого английского писателя-фантаста Нила Геймана, автора популярных романов "Звездная пыль" и "Коралина в Стране Кошмаров". Лучшие супергерои настоящего - Человек-Паук, Фантастическая Четверка, Люди Икс, Ник Фьюри, Тор, Капитан Америка, Дардевил и другие - непостижимом образом оказываются в XVII веке, в эпоху инквизиции и великих географических открытий, правления королевы Елизаветы и придворных интриг. Но в далеком прошлом всей Вселенной Марвел грозит загадочная опасность…', 'http://blog.rgub.ru/izotext/files/2014/09/Marvel_1602_pic-9.jpg', 'https://www.youtube.com/embed/ezuqcFiIezE', 'сборник', '2012-07-16 13:34:06', '2004-09-18 11:50:56', 'Marvel', 'Комикс'),
	(6, '2015-09-18 13:33:56', NULL, 'seconds', 'pub', 'Шансы', 'Seconds', 'http://j.livelib.ru/boocover/1001113841/o/325e/Brajan_Li_OMelli__Shansy.jpeg', 'Брайан Ли О’Мэлли', NULL, 'Это история Кэти - молодого талантливого шеф-повара.', 'http://j.livelib.ru/boocover/1001113841/o/325e/Brajan_Li_OMelli__Shansy.jpeg', 'https://www.youtube.com/embed/znyIKNMvTlg', 'сборник', '2015-09-18 13:31:49', '2014-09-18 13:32:16', 'Oni Press', 'Комильфо'),
	(7, '2015-09-18 14:21:46', NULL, 'sin_city2', 'pub', 'Город Грехов: Женщина, за которую стоит убивать', 'Sin City: A Dame to Kill For', 'http://28oi.ru/uploads/assets/items/2/2505002a5619f6db25f671baf696e9063ed51bec.jpg', 'Фрэнк Миллер', NULL, 'Женщина, за которую стоит убивать (англ. A Dame to Kill For) — ограниченная серия комиксов издательства Dark Horse Comics. Вторая история в рамках цикла «Город грехов» и первая выпущенная в формате ограниченной серии. Позже переиздана несколько раз как графический роман.', 'http://28oi.ru/uploads/assets/items/2/2505002a5619f6db25f671baf696e9063ed51bec.jpg', 'https://www.youtube.com/embed/cYf4DIqbkXU', 'сборник', '2013-10-18 14:19:26', '1994-09-18 14:19:47', 'Dark Horse', 'Амфора');
/*!40000 ALTER TABLE `comics` ENABLE KEYS */;


-- Dumping structure for table comicscat.comics_writer
CREATE TABLE IF NOT EXISTS `comics_writer` (
  `comics_id` bigint(20) NOT NULL,
  `writer_id` bigint(20) NOT NULL,
  KEY `comics_id` (`comics_id`),
  KEY `writer_id` (`writer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table comicscat.comics_writer: ~0 rows (approximately)
DELETE FROM `comics_writer`;
/*!40000 ALTER TABLE `comics_writer` DISABLE KEYS */;
INSERT INTO `comics_writer` (`comics_id`, `writer_id`) VALUES
	(1, 1),
	(2, 1),
	(3, 1),
	(4, 1),
	(5, 1),
	(6, 1),
	(7, 1);
/*!40000 ALTER TABLE `comics_writer` ENABLE KEYS */;


-- Dumping structure for table comicscat.writer
CREATE TABLE IF NOT EXISTS `writer` (
  `writer_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `writer_link` varchar(150) NOT NULL,
  `writer_name` varchar(150) NOT NULL,
  `writer_bio` longtext NOT NULL,
  `writer_nationality` varchar(150) NOT NULL,
  PRIMARY KEY (`writer_id`),
  UNIQUE KEY `writer_link` (`writer_link`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table comicscat.writer: ~1 rows (approximately)
DELETE FROM `writer`;
/*!40000 ALTER TABLE `writer` DISABLE KEYS */;
INSERT INTO `writer` (`writer_id`, `writer_link`, `writer_name`, `writer_bio`, `writer_nationality`) VALUES
	(1, 'alanMoore', 'Алан Мур', 'Нил Ричард МакКи́ннон Ге́йман (англ. Neil Richard MacKinnon Gaiman; 10 ноября 1960, Портсмут, Великобритания) — известный английский писатель-фантаст, автор графических романов и комиксов, сценариев к фильмам. К самым знаменитым его работам относятся: «Звездная пыль», «Американские боги», «Коралина», «История с кладбищем», серия комиксов «Песочный человек». Гейману присуждены многие награды, включая премию «Хьюго», премию «Небьюла», премию Брэма Стокера, медаль Ньюбери.', 'Великобритания');
/*!40000 ALTER TABLE `writer` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
