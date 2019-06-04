-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 01, 2017 at 05:51 PM
-- Server version: 5.7.11
-- PHP Version: 7.0.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_data`
--

-- --------------------------------------------------------

--
-- Table structure for table `order_d`
--

CREATE TABLE `order_d` (
  `orderid` int(11) DEFAULT NULL,
  `adminid` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order_d`
--

INSERT INTO `order_d` (`orderid`, `adminid`) VALUES
(8, 15),
(9, 14);

-- --------------------------------------------------------

--
-- Table structure for table `tbladmin`
--

CREATE TABLE `tbladmin` (
  `AdminID` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `Username` varchar(30) DEFAULT NULL,
  `pword` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbladmin`
--

INSERT INTO `tbladmin` (`AdminID`, `user_id`, `Username`, `pword`) VALUES
(2, 1, 'usernam', 'pass');

-- --------------------------------------------------------

--
-- Table structure for table `tbldepartment`
--

CREATE TABLE `tbldepartment` (
  `deptID` int(11) NOT NULL,
  `Description` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbldepartment`
--

INSERT INTO `tbldepartment` (`deptID`, `Description`) VALUES
(1, 'Administration'),
(2, 'Lecturing Staff');

-- --------------------------------------------------------

--
-- Table structure for table `tbllecturer`
--

CREATE TABLE `tbllecturer` (
  `lectID` int(11) NOT NULL,
  `u_id` int(11) DEFAULT NULL,
  `Username` varchar(30) DEFAULT NULL,
  `pword` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tblorderandproduct`
--

CREATE TABLE `tblorderandproduct` (
  `orderAndProductId` int(11) NOT NULL,
  `orderId` int(11) NOT NULL,
  `productId` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tblorders`
--

CREATE TABLE `tblorders` (
  `orderID` int(11) NOT NULL,
  `date` varchar(40) DEFAULT NULL,
  `userId` int(50) NOT NULL,
  `productID` int(11) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblorders`
--

INSERT INTO `tblorders` (`orderID`, `date`, `userId`, `productID`, `quantity`) VALUES
(9, '2017-10-29 00:00:00', 16, 1, 15),
(10, '2017/10/30 12:57:50', 17, 2, 4);

-- --------------------------------------------------------

--
-- Table structure for table `tblproduct`
--

CREATE TABLE `tblproduct` (
  `productId` int(11) NOT NULL,
  `productName` varchar(50) NOT NULL,
  `productDescription` varchar(128) NOT NULL,
  `productNumber` int(11) NOT NULL,
  `productManufacturer` varchar(50) NOT NULL,
  `productQuantity` int(11) NOT NULL,
  `productPrice` decimal(10,0) NOT NULL,
  `category` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblproduct`
--

INSERT INTO `tblproduct` (`productId`, `productName`, `productDescription`, `productNumber`, `productManufacturer`, `productQuantity`, `productPrice`, `category`) VALUES
(1, 'Aproduct', 'A_Description', 1, 'BoardPeople', 999, '145', 'Pens and Pencils'),
(9, 'aaaaaa', 'aaaaaaa', 12354, 'aaaaaa', 30, '120', 'Whiteboards'),
(2, 'Whiteboard Eraser', 'Used to remove marker stains and residue from whiteboard.', 3, 'BoardPeople', 40, '145', 'Whiteboards'),
(7, 'Plastic Ruler', 'Used to draw straight lines.', 14409, 'Ruler People', 50, '120', 'Measuring'),
(8, 'Fine Point Black Pen', 'Used to write.', 21214, 'Bic', 55, '120', 'Pens and Pencils'),
(6, 'Metal Jacket Stapler', 'Used to staple paper.', 4, 'Stapler People', 30, '200', 'Stappeling'),
(10, 'cc', 'cc', 12, 'cc', 12, '12', 'Scissors');

-- --------------------------------------------------------

--
-- Table structure for table `tbluser`
--

CREATE TABLE `tbluser` (
  `U_ID` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `surname` varchar(40) DEFAULT NULL,
  `dept_id` varchar(50) DEFAULT NULL,
  `location` varchar(30) DEFAULT NULL,
  `contact` varchar(10) DEFAULT NULL,
  `isAdmin` bit(1) DEFAULT NULL,
  `password` varchar(50) NOT NULL,
  `birthDate` varchar(50) DEFAULT NULL,
  `username` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbluser`
--

INSERT INTO `tbluser` (`U_ID`, `name`, `surname`, `dept_id`, `location`, `contact`, `isAdmin`, `password`, `birthDate`, `username`) VALUES
(17, 'Tanya', 'Swart', 'Finance', 'Pretoria', '0763091677', b'0', '123', '1994/06/17', 'ts'),
(15, 'Ruan', 'Viviers', 'ThatOne', 'Pretoria', '0000000001', b'1', 'admin', '200BC', 'RJ'),
(16, 'Jannie', 'Janinski', 'Hardware', 'Pretoria', '82000000', b'0', '12345', '1992/12/12', 'TJ'),
(14, 'Bryan', 'Peens', 'admin', 'Pretoria', '0823214603', b'1', 'admin', '1992/01/16', 'brien'),
(20, 'user', 'user', 'user', 'Pretoria', '823213214', b'0', 'user', '1993/22/10', 'pompie');

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_accepted`
--
CREATE TABLE `v_accepted` (
`ID` int(11)
,`RequestedProduct` varchar(50)
,`quantity` int(11)
,`byWho` varchar(30)
,`acceptedBy` varchar(30)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_ordersd`
--
CREATE TABLE `v_ordersd` (
`OrderID` int(11)
,`Product` varchar(50)
,`Quantity` int(11)
,`RequestedBy` varchar(30)
);

-- --------------------------------------------------------

--
-- Structure for view `v_accepted`
--
DROP TABLE IF EXISTS `v_accepted`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_accepted`  AS  select `v_ordersd`.`OrderID` AS `ID`,`v_ordersd`.`Product` AS `RequestedProduct`,`v_ordersd`.`Quantity` AS `quantity`,`v_ordersd`.`RequestedBy` AS `byWho`,`tbluser`.`username` AS `acceptedBy` from ((`order_d` join `tbluser` on((`order_d`.`adminid` = `tbluser`.`U_ID`))) join `v_ordersd` on((`order_d`.`orderid` = `v_ordersd`.`OrderID`))) ;

-- --------------------------------------------------------

--
-- Structure for view `v_ordersd`
--
DROP TABLE IF EXISTS `v_ordersd`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_ordersd`  AS  select `tblorders`.`orderID` AS `OrderID`,`tblproduct`.`productName` AS `Product`,`tblorders`.`quantity` AS `Quantity`,`tbluser`.`name` AS `RequestedBy` from ((`tblorders` join `tbluser` on((`tbluser`.`U_ID` = `tblorders`.`userId`))) join `tblproduct` on((`tblproduct`.`productId` = `tblorders`.`productID`))) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `order_d`
--
ALTER TABLE `order_d`
  ADD KEY `orderid` (`orderid`),
  ADD KEY `adminid` (`adminid`);

--
-- Indexes for table `tbladmin`
--
ALTER TABLE `tbladmin`
  ADD PRIMARY KEY (`AdminID`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `tbldepartment`
--
ALTER TABLE `tbldepartment`
  ADD PRIMARY KEY (`deptID`);

--
-- Indexes for table `tbllecturer`
--
ALTER TABLE `tbllecturer`
  ADD PRIMARY KEY (`lectID`),
  ADD KEY `u_id` (`u_id`);

--
-- Indexes for table `tblorderandproduct`
--
ALTER TABLE `tblorderandproduct`
  ADD PRIMARY KEY (`orderAndProductId`);

--
-- Indexes for table `tblorders`
--
ALTER TABLE `tblorders`
  ADD PRIMARY KEY (`orderID`);

--
-- Indexes for table `tblproduct`
--
ALTER TABLE `tblproduct`
  ADD PRIMARY KEY (`productId`);

--
-- Indexes for table `tbluser`
--
ALTER TABLE `tbluser`
  ADD PRIMARY KEY (`U_ID`),
  ADD KEY `dept_id` (`dept_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbladmin`
--
ALTER TABLE `tbladmin`
  MODIFY `AdminID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tbldepartment`
--
ALTER TABLE `tbldepartment`
  MODIFY `deptID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tbllecturer`
--
ALTER TABLE `tbllecturer`
  MODIFY `lectID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tblorderandproduct`
--
ALTER TABLE `tblorderandproduct`
  MODIFY `orderAndProductId` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tblorders`
--
ALTER TABLE `tblorders`
  MODIFY `orderID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `tblproduct`
--
ALTER TABLE `tblproduct`
  MODIFY `productId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `tbluser`
--
ALTER TABLE `tbluser`
  MODIFY `U_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
