-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2021 at 10:17 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `isAdmin` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`id`, `username`, `password`, `isAdmin`) VALUES
(1, 'admin', '123456789', 1),
(2, 'test', '123456789', 0),
(4, 'Raincute31', 'ABCDEFGH', 0);

-- --------------------------------------------------------

--
-- Table structure for table `accountinfo`
--

CREATE TABLE `accountinfo` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accountinfo`
--

INSERT INTO `accountinfo` (`id`, `name`, `address`) VALUES
(1, 'admin', 'admin addr'),
(2, 'test', 'test addr'),
(4, 'Nguy?n Th? Ng?c Ánh', 'hanu');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `userID` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `productIDList` varchar(200) DEFAULT NULL,
  `amountOfProductList` varchar(200) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `status` varchar(45) DEFAULT 'Dang ch?'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `userID`, `name`, `time`, `productIDList`, `amountOfProductList`, `total`, `status`) VALUES
(1, 2, 'test', '2020-11-26 12:29:31', '1', '2', 40000, 'Da xong'),
(2, 2, 'test', '2020-11-26 12:31:48', '1', '1', 20000, 'Da xong'),
(3, 3, 'Nguy?n Th? Ng?c Ánh', '2020-11-26 18:33:05', '2', '1', 0, 'Dang ch?'),
(4, 4, 'Nguy?n Th? Ng?c Ánh', '2020-12-21 23:48:50', '1', '1', 0, 'Dang ch?'),
(5, 5, 'Nguy?n ??ng B?c', '2020-12-22 00:50:13', '2,1', '4,1', 0, 'Dang ch?'),
(6, 4, 'Nguy?n Th? Ng?c Ánh', '2020-12-22 04:31:11', '3', '2', 13332, 'Dang ch?'),
(7, 4, 'Nguy?n Th? Ng?c Ánh', '2020-12-23 02:19:00', '4', '3', 168, 'Dang ch?'),
(8, 4, 'Nguy?n Th? Ng?c Ánh', '2020-12-23 02:37:11', '4,7', '1,3', 0, 'Dang ch?'),
(9, 4, 'Nguy?n Th? Ng?c Ánh', '2020-12-29 17:52:44', '3', '1', 0, 'Dang ch?'),
(10, 4, 'Nguy?n Th? Ng?c Ánh', '2020-12-30 01:21:58', '1', '1', 0, 'Dang ch?'),
(11, 4, 'Nguy?n Th? Ng?c Ánh', '2020-12-30 01:37:23', '6', '1', 0, 'Dang ch?'),
(12, 4, 'Nguy?n Th? Ng?c Ánh', '2021-01-07 04:13:31', '6,3', '1,1', 0, 'Dang ch?');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `ingredient` varchar(200) DEFAULT NULL,
  `recipe` varchar(200) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `description` longtext DEFAULT NULL,
  `imageURL` longtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `ingredient`, `recipe`, `price`, `description`, `imageURL`) VALUES
(1, 'Spicy noodle', 'noodle, eggs, kimchi, seaweed, soy sauce, chilli pepper paste, chilli pepper powder, beef, mushroom, seafood', 'Cook the noodles in boiling water with processing toppings following plough level', 200, 'Super spicy noodles 7 levels is too suitable to enjoy with cold weather.\r\nCame here and then feel spicy tongue burns. Must say you ate level 3 is found “sweating” then.\r\n', 'https://thewoksoflife.com/wp-content/uploads/2019/02/spicy-pork-noodles-16-500x500.jpg'),
(2, 'Beef Steak', 'fresh beef, peper, soy, olive oil, mustard, garlic, onion powder, balsamic, worcestershire', 'Pan fry or grill it, and marvel', 555, 'The steak marinade injects enough flavour into the steak such that you don’t need to serve this with a sauce. \r\nYou could also serve it with a Creamy Mushroom Sauce or Creamy Peppercorn Sauce, or even gravy.\r\n\r\nAs for sides, it’s pictured with buttered baby potatoes and a classic Rocket/Arugula Salad with Shaved Parmesan.', 'https://p7.hiclipart.com/preview/938/599/672/beefsteak-chophouse-restaurant-steak-sandwich-ribs-grill-steak.jpg'),
(3, 'Pizza', 'flour, yeast, water, salt, and olive oil, pepperoni, cheese, crumbled sausage, black olives, onions, mushrooms', 'Spread pizza sauce on the crustand and add toppings and cheese, then bake', 236, 'Fresh tomato basil pizza. This light, summery pizza topping combination is a great choice when you\'re looking for something simple. Make it with or without tomato sauce. If you\'re looking for the real Italian pizza craving, here\'s the recipe for what Italians call the margherita.', 'https://popmenucloud.com/bpwgoysv/e84c0f4a-9442-40c4-a58f-389187fb960b'),
(4, 'Spaghetti', 'olive oil, rashers smoked streaky bacon, medium onions, carrots, celery sticks, garlic cloves, rosemary, beef mince, bolognese sauce', 'When the bolognese is nearly finished, cook 400g spaghetti and rain the spaghetti and either stir into the bolognese sauce, or serve the sauce on top. Serve with more grated parmesan, the remaining ba', 56, 'Serve up a sensational spaghetti dish for dinner. Choose from classic Italian pasta recipes such as spaghetti Bolognese, carbonara, puttanesca and many more.Our best ever spaghetti bolognese is super easy and a true Italian classic with a meaty, chilli sauce. ', 'https://img.taste.com.au/kmT_aJW8/taste/2016/11/spaghetti-with-tuna-sauce-13068-1.jpeg'),
(5, 'Omurice', 'Chicken Rice, Egg Wrapper, Side Vegetables', 'Place the chicken rice onto the omelette and fold both sides over to wrap the rice. Slide the omurice toward the edge of the pan.\r\n\r\n', 65, 'Shape the omurice with a paper towel. Place the baby salad greens and parsley leaves next to the omurice. Finally, garnish with the tomato ketchup.\r\nThe combination of the yellow omelette, green baby salad and red tomato ketchup is visually appealing and these bright colors will increase your appetite!', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9OrlGmGnvV6Jld4jOT3naKKqc_JNbL2wKSw&usqp=CAU'),
(6, 'Gimbap', 'seaweed paper, cooked rice, beef skirt steak, carrots, yellow pickled radish, eggs, spinach, soy sauce, kosher salt, toasted sesame oil', 'place processed toppings on cooked rice over top of seaweed paper. Let’s roll gimbap!', 190, 'gimbap is a seaweed rice roll made of gim (a sheet of dried seaweed) and bap (rice).\r\nYou can put some toasted sesame oil on the finshed rolls and sprinkle some sesame seeds over top. ', 'https://www.maangchi.com/wp-content/uploads/2014/11/lobster-gimbap-closeup.jpg'),
(7, 'Onigiri', 'salted salmon, Japanese pickled plum, bonito flakes moistened with soy sauce, simmered kombu seaweed, canned tuna with Japanese mayonnaise, salted cod roe', 'Scoop out a handful of warm rice and press around the filling to gently form the rice into a triangle and then Wrap the onigiri with nori', 250, 'Onigiri, also known as Japanese rice ball is a great example of how inventive Japanese cuisine can be. It is also a Japanese comfort food made from steamed rice formed into the typical triangular, ball, or cylinder shapes and usually wrapped with nori (dried seaweed). Stuffed with a variety of fillings and flavors, these rice balls make an ideal quick snack and are a fun alternative to sandwiches for lunch. ', 'https://rasamalaysia.com/wp-content/uploads/2017/09/onigiri-japanese-rice-balls-thumb.jpg'),
(8, 'Sashimi', 'sushi grade tuna filet, sushi grade salmon filet, fresh coriander leaves, sesame seed oil', 'Slicing the Fish: salmon, tuna and arranging the garnish', 6566, 'If you want to create the perfect table centerpiece, you can’t go wrong with a decadent sashimi platter. Combining stunning, organic aesthetics with sumptuous, seared coriander tuna and salmon filet, Chef Devaux’s Sashimi Recipe is both a lesson in presentation, and a showcase of delicious sashimi – perfect for any occasion!', 'https://welovejapanesefood.com/101food/japan_tmpl/uploads/2016/06/sashimifood-foto.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `accountinfo`
--
ALTER TABLE `accountinfo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
