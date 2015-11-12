-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.26-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------
/* only for testing git */
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
  `comics_publisher_id` bigint(20) NOT NULL,
  `comics_localpublisher_id` bigint(20) NOT NULL,
  `comics_format` varchar(50) NOT NULL,
  `comics_num_pages` int(11) NOT NULL,
  `comics_binding` varchar(50) NOT NULL,
  `comics_isbn` varchar(50) NOT NULL,
  `comics_numCopies` bigint(20) NOT NULL,
  `comics_weight` bigint(20) NOT NULL,
  PRIMARY KEY (`comics_id`),
  UNIQUE KEY `comics_link` (`comics_link`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Dumping data for table comicscat.comics: ~7 rows (approximately)
DELETE FROM `comics`;
/*!40000 ALTER TABLE `comics` DISABLE KEYS */;
INSERT INTO `comics` (`comics_id`, `comics_date_added`, `comics_parent`, `comics_link`, `comics_status`, `comics_title`, `comics_title_origin`, `comics_cover_url`, `comics_painter`, `comics_colorist`, `comics_description`, `comics_screens`, `comics_videos`, `comics_type`, `comics_date_ru_pub`, `comics_date_world_pub`, `comics_publisher_id`, `comics_localpublisher_id`, `comics_format`, `comics_num_pages`, `comics_binding`, `comics_isbn`, `comics_numCopies`, `comics_weight`) VALUES
	(1, '2015-09-17 13:29:42', NULL, 'watchmen', 'pub', 'Хранители', 'Watchmen', 'https://paneldiscussions.files.wordpress.com/2011/11/watchmen-cover.jpg', 'Дэйв Гиббонс', 'Джон Хиггинс', 'ограниченная серия комиксов из двенадцати выпусков, опубликованная компанией DC Comics в период с сентября 1986 по октябрь 1987 года, а позже переизданная в виде графического романа. Авторы серии — писатель Алан Мур, художник Дэйв Гиббонс и колорист Джон Хиггинс (англ.)русск. — использовали в качестве прототипов супергероев, права на использование которых незадолго до того были приобретены DC Comics у другой компании, издававшей комиксы, — Charlton Comics (англ.)русск.. Поскольку предложенная Муром история не оставляла возможности дальнейшего использования многих из героев, редактор Дик Джиордано (англ.)русск. убедил писателей создать новых персонажей[1].', 'https://paneldiscussions.files.wordpress.com/2011/11/watchmen-cover.jpg', 'https://www.youtube.com/embed/joTphRPy6sg', 'сборник', '2014-09-18 13:34:52', '1987-09-17 13:31:29', 1, 1, '163х245', 208, 'ТПБ', '978-5-91339-324-1', 1450, 123),
	(2, '2015-09-17 14:41:14', NULL, 'Pilgrim', 'pub', 'Скотт Пилигрим', 'Scott Pilgrim', 'http://www.comicsbeat.com/wp-content/uploads/2012/03/EMBARGOED-8PM-PST-03.30.2012-SPV1-COLOR-HC-COVER.jpg', 'Брайаном Ли О’Мэлли', NULL, 'шеститомная серия комиксов, созданная Брайаном Ли О’Мэлли и изданная Портлендским филиалом издательства «Oni Press» в период с августа 2004 года (первый том) по 20 июля 2010 года (шестой том). Серия повествует о жизни 23-летнего канадца Скотта Пилигрима: лентяя и любителя видеоигр, играющего в музыкальной группе на бас-гитаре и живущего на квартире у своего друга-гея в Торонто. Ему нравится недавно переехавшая в его город американка Рамона Флауэрс (Ramona Flowers), но для того, чтобы завоевать её сердце, ему нужно победить семерых «злых бывших» Рамоны.', 'http://www.comicsbeat.com/wp-content/uploads/2012/03/EMBARGOED-8PM-PST-03.30.2012-SPV1-COLOR-HC-COVER.jpg', 'https://www.youtube.com/embed/MZbMiuNpoVw', 'сборник', '2015-09-18 13:35:04', '2010-09-17 14:43:59', 1, 1, '163х245', 208, 'ТПБ', '978-5-91339-324-1', 1450, 123),
	(3, '2015-09-17 15:00:19', NULL, 'sin_city', 'pub', 'Город Грехов: Трудное прощание', 'Sin City: The Hard Goodbye', 'http://i.imgur.com/X2yBvpg.jpg', 'Фрэнк Миллер', NULL, 'Впервые сюжет был издан под названием «Город грехов» в апреле 1991 года в серии Dark Horse 5th Anniversary Special по частям и продолжен в мае 1991 — июне 1992 в номерах 51-62 антологии Dark Horse Presents. Перепечатан как «Город Грехов (Трудное прощание)» в январе 1993 году.', 'http://i.imgur.com/X2yBvpg.jpg', 'https://www.youtube.com/embed/Dv8HPqF7aWo', 'сборник', '2013-09-18 13:34:42', '1992-05-17 15:13:28', 1, 1, '163х245', 208, 'ТПБ', '978-5-91339-324-1', 1450, 123),
	(4, '2015-09-18 10:57:42', NULL, 'sandman1', 'pub', 'Песочный человек: Прелюдии ноктюрны', 'Sandman 1', 'http://www.chitai-gorod.ru/upload/iblock/121/12135ced725c03d02354cdcbe3b6b5e7.jpg', 'Дэйв МакКин', 'Дэнни Воззо', 'Морфей, Повелитель Снов, в результате тайного ритуала оказывается пленен неким оккультистами. Спустя 70 лет с момента заточения, Сну удается сбежать из плена. Ему предстоят поиски трех утраченных магических инструментов: шлема, сумы с песком и рубина.', 'http://www.chitai-gorod.ru/upload/iblock/121/12135ced725c03d02354cdcbe3b6b5e7.jpg', 'https://www.youtube.com/embed/jJPnQtgomUY', 'сборник', '2014-09-18 13:34:30', '1989-08-18 11:01:33', 1, 1, '163х245', 208, 'ТПБ', '978-5-91339-324-1', 1450, 123),
	(5, '2015-09-18 11:53:18', NULL, '1602', 'pub', '1602', 'Marvel 1602', 'http://blog.rgub.ru/izotext/files/2014/09/Marvel_1602_pic-9.jpg', 'Энди Куберт', NULL, '"1602", захватывающий роман-триллер в жанре комикса, - это признанный шедевр от знаменитого английского писателя-фантаста Нила Геймана, автора популярных романов "Звездная пыль" и "Коралина в Стране Кошмаров". Лучшие супергерои настоящего - Человек-Паук, Фантастическая Четверка, Люди Икс, Ник Фьюри, Тор, Капитан Америка, Дардевил и другие - непостижимом образом оказываются в XVII веке, в эпоху инквизиции и великих географических открытий, правления королевы Елизаветы и придворных интриг. Но в далеком прошлом всей Вселенной Марвел грозит загадочная опасность…', 'http://blog.rgub.ru/izotext/files/2014/09/Marvel_1602_pic-9.jpg', 'https://www.youtube.com/embed/ezuqcFiIezE', 'сборник', '2012-07-16 13:34:06', '2004-09-18 11:50:56', 1, 1, '163х245', 208, 'ТПБ', '978-5-91339-324-1', 1450, 123),
	(6, '2015-09-18 13:33:56', NULL, 'seconds', 'pub', 'Шансы', 'Seconds', 'http://j.livelib.ru/boocover/1001113841/o/325e/Brajan_Li_OMelli__Shansy.jpeg', 'Брайан Ли О’Мэлли', NULL, 'Это история Кэти - молодого талантливого шеф-повара.', 'http://j.livelib.ru/boocover/1001113841/o/325e/Brajan_Li_OMelli__Shansy.jpeg', 'https://www.youtube.com/embed/znyIKNMvTlg', 'сборник', '2015-09-18 13:31:49', '2014-09-18 13:32:16', 1, 1, '163х245', 208, 'ТПБ', '978-5-91339-324-1', 1450, 123),
	(7, '2015-09-18 14:21:46', NULL, 'sin_city2', 'pub', 'Город Грехов: Женщина, за которую стоит убивать', 'Sin City: A Dame to Kill For', 'http://28oi.ru/uploads/assets/items/2/2505002a5619f6db25f671baf696e9063ed51bec.jpg', 'Фрэнк Миллер', NULL, 'Женщина, за которую стоит убивать (англ. A Dame to Kill For) — ограниченная серия комиксов издательства Dark Horse Comics. Вторая история в рамках цикла «Город грехов» и первая выпущенная в формате ограниченной серии. Позже переиздана несколько раз как графический роман.', 'http://28oi.ru/uploads/assets/items/2/2505002a5619f6db25f671baf696e9063ed51bec.jpg', 'https://www.youtube.com/embed/cYf4DIqbkXU', 'сборник', '2013-10-18 14:19:26', '1994-09-18 14:19:47', 1, 1, '163х245', 208, 'ТПБ', '978-5-91339-324-1', 1450, 123);
/*!40000 ALTER TABLE `comics` ENABLE KEYS */;


-- Dumping structure for table comicscat.comics_painter
CREATE TABLE IF NOT EXISTS `comics_painter` (
  `comics_id` bigint(20) NOT NULL,
  `painter_id` bigint(20) NOT NULL,
  KEY `comics_id` (`comics_id`),
  KEY `painter_id` (`painter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table comicscat.comics_painter: ~6 rows (approximately)
DELETE FROM `comics_painter`;
/*!40000 ALTER TABLE `comics_painter` DISABLE KEYS */;
INSERT INTO `comics_painter` (`comics_id`, `painter_id`) VALUES
	(1, 1),
	(2, 1),
	(3, 1),
	(4, 1),
	(5, 1),
	(6, 1),
	(7, 1);
/*!40000 ALTER TABLE `comics_painter` ENABLE KEYS */;


-- Dumping structure for table comicscat.comics_writer
CREATE TABLE IF NOT EXISTS `comics_writer` (
  `comics_id` bigint(20) NOT NULL,
  `writer_id` bigint(20) NOT NULL,
  KEY `comics_id` (`comics_id`),
  KEY `writer_id` (`writer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table comicscat.comics_writer: ~7 rows (approximately)
DELETE FROM `comics_writer`;
/*!40000 ALTER TABLE `comics_writer` DISABLE KEYS */;
INSERT INTO `comics_writer` (`comics_id`, `writer_id`) VALUES
	(1, 1),
	(2, 2),
	(3, 1),
	(4, 1),
	(5, 1),
	(6, 2),
	(7, 1),
	(7, 2);
/*!40000 ALTER TABLE `comics_writer` ENABLE KEYS */;


-- Dumping structure for table comicscat.localpublisher
CREATE TABLE IF NOT EXISTS `localpublisher` (
  `lpub_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `lpub_link` varchar(150) NOT NULL,
  `lpub_name` varchar(150) NOT NULL,
  `lpub_logo_url` varchar(150) NOT NULL,
  `lpub_desc` longtext NOT NULL,
  `lpub_status` varchar(150) NOT NULL,
  `lpub_founded` varchar(150) NOT NULL,
  `lpub_country` varchar(150) NOT NULL,
  `lpub_city` varchar(150) NOT NULL,
  `lpub_site` varchar(150) NOT NULL,
  `lpub_vk` varchar(150) NOT NULL,
  `lpub_mail_pr` varchar(150) NOT NULL,
  `lpub_mail_sales` varchar(150) NOT NULL,
  `lpub_address` varchar(150) NOT NULL,
  `lpub_phone` varchar(150) NOT NULL,
  PRIMARY KEY (`lpub_id`),
  UNIQUE KEY `lpub_link` (`lpub_link`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table comicscat.localpublisher: ~2 rows (approximately)
DELETE FROM `localpublisher`;
/*!40000 ALTER TABLE `localpublisher` DISABLE KEYS */;
INSERT INTO `localpublisher` (`lpub_id`, `lpub_link`, `lpub_name`, `lpub_logo_url`, `lpub_desc`, `lpub_status`, `lpub_founded`, `lpub_country`, `lpub_city`, `lpub_site`, `lpub_vk`, `lpub_mail_pr`, `lpub_mail_sales`, `lpub_address`, `lpub_phone`) VALUES
	(1, 'komilfo', 'Комильфо', 'http://img3.whoiswho.dp.ru/wiwpictures/0eb06536-ace5-45e2-b6e0-362e40b98d6b.jpg', 'Мы издаём необычные, веселые и красочные книги, делаем это профессионально и любим своё дело. Но к сожалению, финансовые возможности издательства ограничены и потому мы частенько издаём не менее качественные и красивые книги на средства авторов. При этом у нас довольно низкие расценки на все услуги. А ещё мы оказываем помощь в распространении тиражей. Наши книги продаются в магазинах Москвы и Петербурга, иногда в других регионах России, в интернет-магазинах, среди которых OZON, Лабиринт, Буквоед, Biblion и другие.', 'active', '2010', 'РФ', 'Санкт-Петербург', 'http://komilfobook.ru/', 'https://vk.com/komilfobook', 'komilfobook@mail.ru', 'komilfobook@mail.ru', '119334, г. Москва, 5-й Донской проезд, д. 15, стр. 4', '(495) 933-76-00'),
	(2, 'azbuka', 'Азбука', 'https://upload.wikimedia.org/wikipedia/ru/6/61/Azbooka_Publishers_logotype.gif', 'Комиксами в Азбуке занимаются… сотрудники Комикс-Арта. Того самого, который готовил «Сэндмена»,«Тетрадь смерти», «Наруто», «Блич» «One piece. Большой куш» и многое другое, к примеру, для «Эксмо». Но если с «Эксмо» мы сотрудничали как удаленный подрядчик, то в «Азбуку» мы влились на правах штатных сотрудников. ', 'active', '2009', 'РФ', 'Санкт-Петербург ', 'http://azbooka.ru/ ', 'https://vk.com/azbooka_graphic_novels', 'pr@atticus-group.ru', 'komilfobook@mail.ru', '119334, г. Москва, 5-й Донской проезд, д. 15, стр. 4', '(495) 933-76-00');
/*!40000 ALTER TABLE `localpublisher` ENABLE KEYS */;


-- Dumping structure for table comicscat.painter
CREATE TABLE IF NOT EXISTS `painter` (
  `painter_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `painter_link` varchar(150) NOT NULL,
  `painter_name` varchar(150) NOT NULL,
  `painter_bio` longtext NOT NULL,
  `painter_photo` varchar(150) NOT NULL,
  `painter_nationality` varchar(150) NOT NULL,
  PRIMARY KEY (`painter_id`),
  UNIQUE KEY `painter_link` (`painter_link`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table comicscat.painter: ~0 rows (approximately)
DELETE FROM `painter`;
/*!40000 ALTER TABLE `painter` DISABLE KEYS */;
INSERT INTO `painter` (`painter_id`, `painter_link`, `painter_name`, `painter_bio`, `painter_photo`, `painter_nationality`) VALUES
	(1, 'DaveGibbons', 'Дейв Гиббонс', 'Дейв Гиббонс (англ. Dave Gibbons, род. 14 апреля 1949 года) — британский художник комиксов, сценарист, иногда автор шрифтов и инкер. Наиболее известен благодаря сотрудничеству с Аланом Муром в графическом романе Хранители и в книге о Супермене For the Man Who Has Everything. Иллюстрировал антологию 2000 AD, в которую входит научно-фантастический стрип Rogue Trooper. Свою карьеру в комикс-индустрии, Гиббонс начал в 1973 году, работая над серией 2000 AD дя британского издательства IPC. В 1980 году он переехал в США и получил работу в DC Comics, где первое время занимался иллюстрированием текущей серии о Зелёном Фонаре. Первой работой Гиббонса в издательстве стал выпуск Green Lantern #161 (февраль 1983), который он подготовил совместно со сценаристом Тоддом Кейном, а также почти одновременно с этим сюжет «Creeper», который вышел в выпусках Flash #318-319[1] . С выпуска С Green Lantern # 172 (январь 1984), Гиббонс начал работать с Леном Уэйном. После выпуска «Tales of the Green Lantern Corps» и последующего за ним #186 (март 1985), Гиббонс оставил работу над серией, вернувшись к ней позже только один раз, вместе с Аланом Муром в сюжете «Mogo Doesn’t Socialize» в выпуске Green Lantern # 188. В 1986—1896 годах, работы Гиббонса появились на обложке Who’s Who in the DC Universe для DC Comics и The Official Handbook of the Marvel Universe Deluxe Edition для Marvel Comics. В декабре 1986 года, он участвовал в написании Brickman #1 для издательства Harrier Comics, вместе с Кевином О’Нилом. С мая по август 1998 года он занимался иллюстрированием мини-серии The Phantom вместе с Джо Орладно и Питером Дэвидом, а также в маей 1988 году нарисовал выпуски Action Comics #600-601[1]. ', 'https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/DaveGibbons.jpg/250px-DaveGibbons.jpg', 'Великобритания');
/*!40000 ALTER TABLE `painter` ENABLE KEYS */;


-- Dumping structure for table comicscat.publisher
CREATE TABLE IF NOT EXISTS `publisher` (
  `pub_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pub_link` varchar(150) NOT NULL,
  `pub_name` varchar(150) NOT NULL,
  `pub_logo_url` varchar(150) NOT NULL,
  `pub_desc` longtext NOT NULL,
  `pub_parent_company` varchar(150) NOT NULL,
  `pub_status` varchar(150) NOT NULL,
  `pub_founded` varchar(150) NOT NULL,
  `pub_country` varchar(150) NOT NULL,
  `pub_site` varchar(150) NOT NULL,
  PRIMARY KEY (`pub_id`),
  UNIQUE KEY `pub_link` (`pub_link`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table comicscat.publisher: ~1 rows (approximately)
DELETE FROM `publisher`;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
INSERT INTO `publisher` (`pub_id`, `pub_link`, `pub_name`, `pub_logo_url`, `pub_desc`, `pub_parent_company`, `pub_status`, `pub_founded`, `pub_country`, `pub_site`) VALUES
	(1, 'dc', 'DC', 'https://upload.wikimedia.org/wikipedia/en/thumb/3/3d/DC_Comics_logo.svg/1024px-DC_Comics_logo.svg.png', 'DC Comics (основано в 1934 как National Allied Publications)[1] — одно из крупнейших и наиболее популярных издательств комиксов. Издательство было куплено компанией Warner Bros. Entertainment в 1969.[2] DC Comics издают продукцию, характеризующуюся наличием большого количества широкоизвестных персонажей.[3]', 'Warner Bros. Entertainment', 'active', '1934', 'США', 'http://www.dccomics.com/');
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;


-- Dumping structure for table comicscat.writer
CREATE TABLE IF NOT EXISTS `writer` (
  `writer_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `writer_link` varchar(150) NOT NULL,
  `writer_name` varchar(150) NOT NULL,
  `writer_bio` longtext NOT NULL,
  `writer_photo` varchar(150) NOT NULL,
  `writer_nationality` varchar(150) NOT NULL,
  PRIMARY KEY (`writer_id`),
  UNIQUE KEY `writer_link` (`writer_link`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table comicscat.writer: ~2 rows (approximately)
DELETE FROM `writer`;
/*!40000 ALTER TABLE `writer` DISABLE KEYS */;
INSERT INTO `writer` (`writer_id`, `writer_link`, `writer_name`, `writer_bio`, `writer_photo`, `writer_nationality`) VALUES
	(1, 'neil_gaiman', 'Нил Гейман', 'Нил Ричард МакКи́ннон Ге́йман (англ. Neil Richard MacKinnon Gaiman; 10 ноября 1960, Портсмут, Великобритания) — известный английский писатель-фантаст, автор графических романов и комиксов, сценариев к фильмам. К самым знаменитым его работам относятся: «Звездная пыль», «Американские боги», «Коралина», «История с кладбищем», серия комиксов «Песочный человек». Гейману присуждены многие награды, включая премию «Хьюго», премию «Небьюла», премию Брэма Стокера, медаль Ньюбери.', 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Gaiman,_Neil_(2007).jpg/220px-Gaiman,_Neil_(2007).jpg', 'Великобритания'),
	(2, 'BryanLeeOMalley', 'Брайан Ли О\'Мэйли', 'Брайан Ли О’Мэлли (англ. Bryan Lee O\'Malley, родился 21 февраля 1979, Лондон (Онтарио), Канада) — канадский карикатурист. Наиболее известен своей серией комиксов Скотт Пилигрим, а также как музыкант под псевдонимом Kupek. До публикации собственного материала, О’Мэлли иллюстрировал минисерии комиксов Hopeless Savages: Ground Zero издательства Oni Press. Он также отвечал за шрифт во многих комиксах Oni Press, включая большинство работ Чайны Клагстон, в период между 2002 и 2005 годами.', 'https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Bryan_Lee_O%27Malley_by_Gage_Skidmore.jpg/800px-Bryan_Lee_O%27Malley_by_Gage_Skidmore.jpg', 'Канада');
/*!40000 ALTER TABLE `writer` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
