-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 28, 2023 at 03:07 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atlas`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `ID` int(11) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `mname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `AccountType` varchar(20) NOT NULL,
  `Age` int(3) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `Position` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`ID`, `Username`, `Password`, `fname`, `mname`, `lname`, `AccountType`, `Age`, `Address`, `Position`) VALUES
(1, 'karots', '2273', 'Sheik', 'Mohamed', 'Adhnan', 'Administrator', 21, 'No.50A,\r\nMain Street Kandakuliya,\r\nPuttalam,\r\nSri Lanka.', 'Manager'),
(2, 'adhnan', '1234', 'Sheik', 'Mohamed', 'Adhnan', 'User', 21, 'Puttalam', 'Cashier');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `ID` int(11) NOT NULL,
  `categoryname` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`ID`, `categoryname`) VALUES
(1, 'Softdrink'),
(2, 'Soap');

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `ID` int(20) NOT NULL,
  `ItemName` varchar(50) NOT NULL,
  `Description` varchar(100) NOT NULL,
  `Category` varchar(50) CHARACTER SET utf8mb4 NOT NULL,
  `Price` float NOT NULL,
  `Available_Stocks` int(11) NOT NULL,
  `RetailPrice` decimal(10,2) NOT NULL,
  `profits` decimal(10,2) NOT NULL,
  `damage` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`ID`, `ItemName`, `Description`, `Category`, `Price`, `Available_Stocks`, `RetailPrice`, `profits`, `damage`) VALUES
(11111111, 'lux', 'red', 'Soap', 45, 54, '60.00', '15.00', 20);

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `ID` int(11) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Action` varchar(100) NOT NULL,
  `AccountType` varchar(20) NOT NULL,
  `Username` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`ID`, `Date`, `Action`, `AccountType`, `Username`) VALUES
(1, '2023-21-08 05:29 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(2, '2023-21-08 05:29 PM', ' Logged in ', 'Administrator', 'Sheik Adhnan'),
(3, '2023-21-08 05:29 PM', ' Logged Out ', 'Administrator', 'Sheik Adhnan'),
(4, '2023-21-08 05:35 PM', ' Logged in ', 'Administrator', 'Sheik Adhnan'),
(5, '2023-21-08 05:36 PM', ' Logged Out ', 'Administrator', 'Sheik Adhnan'),
(6, '2023-21-08 05:45 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(7, '2023-21-08 05:46 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(8, '2023-21-08 05:46 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(9, '2023-21-08 05:53 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(10, '2023-21-08 06:00 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(11, '2023-21-08 06:03 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(12, '2023-21-08 06:08 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(13, '2023-21-08 06:14 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(14, '2023-21-08 06:26 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(15, '2023-21-08 06:30 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(16, '2023-21-08 06:33 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(17, '2023-21-08 06:34 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(18, '2023-21-08 06:37 PM', ' Logged Out ', 'Guest', 'Username Lname'),
(19, '2023-21-08 06:39 PM', ' Logged Out ', 'Guest', 'Username Lname'),
(20, '2023-21-08 06:39 PM', ' Logged in ', 'Administrator', 'Sheik Adhnan'),
(21, '2023-21-08 06:39 PM', ' Logged Out ', 'Administrator', 'Sheik Adhnan'),
(22, '2023-21-08 07:01 PM', ' Logged Out ', 'Guest', 'Username Lname'),
(23, '2023-21-08 07:02 PM', ' Logged Out ', 'Guest', 'Username Lname'),
(24, '2023-21-08 07:04 PM', ' Logged Out ', 'Guest', 'Username Lname'),
(25, '2023-21-08 07:07 PM', ' Logged Out ', 'Guest', 'Username Lname'),
(26, '2023-21-08 07:07 PM', ' Logged in ', 'Administrator', 'Sheik Adhnan'),
(27, '2023-21-08 07:07 PM', ' Logged Out ', 'Administrator', 'Sheik Adhnan'),
(28, '2023-21-08 07:17 PM', ' Logged in ', 'Administrator', 'Sheik Adhnan'),
(29, '2023-21-08 07:24 PM', ' Logged Out ', 'Administrator', 'Sheik Adhnan'),
(30, '2023-21-08 07:24 PM', ' Logged in ', 'Administrator', 'Sheik Adhnan'),
(31, '2023-21-08 07:25 PM', ' Logged Out ', 'Administrator', 'Sheik Adhnan'),
(32, '2023-21-08 07:25 PM', ' Logged in ', 'Guest', 'Sheik Adhnan'),
(33, '2023-21-08 07:33 PM', ' Logged Out ', 'Guest', 'Username Lname'),
(34, '2023-21-08 07:33 PM', ' Logged in ', 'Administrator', 'Sheik Adhnan'),
(35, '2023-21-08 07:35 PM', ' Logged Out ', 'Administrator', 'Sheik Adhnan'),
(36, '2023-21-08 07:35 PM', ' Logged Out ', 'Guest', 'Username Lname'),
(37, '2023-21-08 07:35 PM', ' Logged Out ', 'Guest', 'Sheik Adhnan'),
(38, '2023-21-08 07:39 PM', ' Logged Out ', 'Administrator', 'Username Lname'),
(39, '2023-21-08 07:40 PM', ' Logged in ', 'Guest', 'Sheik Adhnan'),
(40, '2023-21-08 07:41 PM', ' Logged Out ', 'Guest', 'Sheik Adhnan'),
(41, '2023-21-08 07:41 PM', ' Logged in ', 'Administrator', 'Sheik Adhnan'),
(42, '2023-21-08 07:42 PM', ' Logged Out ', 'Administrator', 'Sheik Adhnan'),
(43, '2023-21-08 07:51 PM', ' Logged Out ', 'Guest', 'Username Lname'),
(44, '2023-21-08 07:51 PM', ' Logged in ', 'Administrator', 'Sheik Adhnan'),
(45, '2023-21-08 07:56 PM', ' Logged Out ', 'Administrator', 'Sheik Adhnan');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `TransactionNo` int(11) NOT NULL,
  `Date` date NOT NULL,
  `ItemCode` int(20) NOT NULL,
  `ItemName` varchar(50) NOT NULL,
  `Quantity` int(10) NOT NULL,
  `Price` float NOT NULL,
  `Total` decimal(10,2) NOT NULL,
  `Profit` decimal(10,2) NOT NULL,
  `Month` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `stockout`
--

CREATE TABLE `stockout` (
  `ItemCode` int(20) NOT NULL,
  `ItenName` varchar(50) NOT NULL,
  `Stockout` int(50) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stockout`
--

INSERT INTO `stockout` (`ItemCode`, `ItenName`, `Stockout`, `Date`, `Name`) VALUES
(11111111, 'lux', 5, '2023-21-08 07:26 PM', 'Sheik Adhnan'),
(11111111, 'lux', 5, '2023-21-08 07:33 PM', 'Username Lname'),
(11111111, 'lux', 1, '2023-21-08 07:41 PM', 'Sheik Adhnan'),
(11111111, 'lux', 10, '2023-21-08 07:51 PM', 'Username Lname');

-- --------------------------------------------------------

--
-- Table structure for table `stocks`
--

CREATE TABLE `stocks` (
  `Item Code` int(20) NOT NULL,
  `Item Name` varchar(50) NOT NULL,
  `Stock In` int(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stocks`
--

INSERT INTO `stocks` (`Item Code`, `Item Name`, `Stock In`, `Date`, `Name`) VALUES
(11111111, 'lux', 100, '2023-21-08 07:23 PM', 'Sheik Adhnan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`TransactionNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `accounts`
--
ALTER TABLE `accounts`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11111112;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `TransactionNo` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
