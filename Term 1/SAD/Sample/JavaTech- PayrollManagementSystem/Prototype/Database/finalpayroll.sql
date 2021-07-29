-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 02, 2020 at 11:31 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.1.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `finalpayroll`
--

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `department_name` varchar(255) NOT NULL,
  `department_basic_salary` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`department_name`, `department_basic_salary`) VALUES
('data development', 3000000),
('web application', 2000000);

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `feedback_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `feedback_title` varchar(255) DEFAULT NULL,
  `feedback_description` varchar(255) DEFAULT NULL,
  `feedback_content` varchar(5000) DEFAULT NULL,
  `feedback_status` varchar(50) DEFAULT NULL,
  `feedback_post_date` varchar(50) DEFAULT NULL,
  `feedback_process_date` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`feedback_id`, `user_id`, `feedback_title`, `feedback_description`, `feedback_content`, `feedback_status`, `feedback_post_date`, `feedback_process_date`) VALUES
(2, 4, 'ds', 'ád', 'sadas', 'approve', '2019-12-25', '2019-12-31');

-- --------------------------------------------------------

--
-- Table structure for table `leaveoff`
--

CREATE TABLE `leaveoff` (
  `leave_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `leave_title` varchar(255) DEFAULT NULL,
  `leave_description` varchar(255) DEFAULT NULL,
  `leave_content` varchar(5000) DEFAULT NULL,
  `leave_status` varchar(50) DEFAULT NULL,
  `leave_post_date` varchar(50) DEFAULT NULL,
  `leave_process_date` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `leaveoff`
--

INSERT INTO `leaveoff` (`leave_id`, `user_id`, `leave_title`, `leave_description`, `leave_content`, `leave_status`, `leave_post_date`, `leave_process_date`) VALUES
(1, 4, 'done', 'done', 'done', 'reject', '2019-12-22', '2019-12-31'),
(3, 4, 'hfgfhdghj', 'hjghg	h	hjgh	ghj', 'dfdfsdfdsf', 'processing', '2019-12-25', '2019-12-27');

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE `project` (
  `project_id` int(10) NOT NULL,
  `project_title` varchar(255) DEFAULT NULL,
  `project_description` varchar(255) DEFAULT NULL,
  `project_content` varchar(5000) DEFAULT NULL,
  `project_totalEarning` bigint(20) DEFAULT NULL,
  `project_startDate` varchar(50) DEFAULT NULL,
  `project_endDate` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`project_id`, `project_title`, `project_description`, `project_content`, `project_totalEarning`, `project_startDate`, `project_endDate`) VALUES
(1, 'Web application building up', 'This project: Web site book shop', 'This projetct is very important to our company', 500000, '2015-12-22', '2017-12-22'),
(2, 'DATA', 'data changing and build up for archero game', 'update get information after finish one chapter game ', 10000000, '2018-12-22', '2019-12-22'),
(3, 'android application', 'this project related to super project', 'This project contains 70,000,000 investigation', 2000000, '2018-12-22', '2019-12-22');

-- --------------------------------------------------------

--
-- Table structure for table `project_user`
--

CREATE TABLE `project_user` (
  `project_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `project_salary` bigint(20) DEFAULT NULL,
  `project_percentSalary` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `project_user`
--

INSERT INTO `project_user` (`project_id`, `user_id`, `project_salary`, `project_percentSalary`) VALUES
(1, 1, 50000, 10),
(1, 3, 250000, 50),
(1, 2, 50000, 10);

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `report_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `report_title` varchar(255) DEFAULT NULL,
  `report_description` varchar(255) DEFAULT NULL,
  `report_content` varchar(5000) DEFAULT NULL,
  `report_post_date` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `report`
--

INSERT INTO `report` (`report_id`, `user_id`, `report_title`, `report_description`, `report_content`, `report_post_date`) VALUES
(1, 1, 'done', 'done', 'done', '2019-12-23'),
(2, 1, 'quantorngtu', 'quantrongtu', 'quantrongtu', '2019-12-23'),
(3, 1, 'Hôm nay là hôm cuối cùng test hệ thống', 'Final Testing system', 'Tất cả các nhân viên xem lại lương để chốt danh sách', '2019-12-27');

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `role_name` varchar(255) NOT NULL,
  `role_basic_salary` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`role_name`, `role_basic_salary`) VALUES
('developer', 5000000),
('fresher', 1000000),
('tester', 3000000);

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `user_id` int(10) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `role_salary` bigint(20) DEFAULT NULL,
  `department_salary` bigint(20) DEFAULT NULL,
  `user_projectSalary` bigint(20) DEFAULT NULL,
  `user_absenceSalary` bigint(20) DEFAULT NULL,
  `user_overTimeSalary` bigint(20) DEFAULT NULL,
  `user_bonusSalary` bigint(20) DEFAULT NULL,
  `user_minusSalary` bigint(20) DEFAULT NULL,
  `user_totalSalary` bigint(20) DEFAULT NULL,
  `salary_month` varchar(50) DEFAULT NULL,
  `salary_year` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`user_id`, `user_name`, `role_salary`, `department_salary`, `user_projectSalary`, `user_absenceSalary`, `user_overTimeSalary`, `user_bonusSalary`, `user_minusSalary`, `user_totalSalary`, `salary_month`, `salary_year`) VALUES
(1, 'Quan Trong Tu', 5000000, 5000000, 3000000, 123123, 123, 213123, 2, 10090121, '12', '2019'),
(5, 'Nguyen Huu Cam', 5000000, 5000000, 0, 45, 4545, 4545, 4545, 8004500, '12', '2019'),
(7, 'Pham Thi Ha', 1000000, 1000000, 0, 0, 0, 0, 0, 3000000, '12', '2019'),
(7, 'Pham Thi Ha', 1000000, 1000000, 0, 0, 0, 100000, 0, 3100000, '1', '2020');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(10) NOT NULL,
  `user_password` varchar(250) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `user_type` varchar(50) DEFAULT NULL,
  `user_gender` varchar(50) DEFAULT NULL,
  `user_email` varchar(50) DEFAULT NULL,
  `user_address` varchar(255) DEFAULT NULL,
  `user_dob` varchar(50) DEFAULT NULL,
  `user_phone` varchar(50) DEFAULT NULL,
  `user_role` varchar(255) DEFAULT NULL,
  `user_department` varchar(255) DEFAULT NULL,
  `user_salary` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `user_password`, `user_name`, `user_type`, `user_gender`, `user_email`, `user_address`, `user_dob`, `user_phone`, `user_role`, `user_department`, `user_salary`) VALUES
(1, '03370b164323d863578b3696ae7a3b72ce1b3f6962412879e6ba8fd6a3cbd95', 'Quan Trong Tu', 'administrator', 'male', 'tuquan@gmail.com', 'KTX', '1999-10-26', '0832677917', 'developer', 'web application', 10090121),
(2, 'd4c8d324dce680c80f4823ff2c60e7c6692549709379b5061c5cca5ae4c7b', 'Nguyen Khac Phuc', 'accountant', 'male', 'phucnguyen@123', 'LTV_cong sau', '1999-9-20', '11111111', 'developer', 'web application', 6293000),
(3, 'f81f36de235b2a8841dc8309c57b53b75ff3b7cf457b119516d231081e4d9dc', 'Ta Van Hiep', 'employee', 'male', 'tahiep@123', 'LTV', '1999-7-5', '53215452', 'developer', 'data development', 1000),
(4, 'e27f99379da59b31d1266cf60eac194db740bc6d833bf14e8aafcdae0e73c', 'Pham Duc Toan', 'employee', 'male', 'ductoan@123', 'LTV', '1999-1-1', '21315345', 'tester', 'web application', 5000000),
(5, 'c642bed08386ac9e377b84bfeed0ded47ecdb0176fd9e0e8096d6472eaed15a', 'Nguyen Huu Cam', 'administrator', 'male', 'huucam@123', 'Back Khoa', '1991-7-6', '2542123132', 'developer', 'data development', 8004500),
(7, 'e9b51e70f631fe05a6ba38de8275491af0831334900fd503f89b5f957b3ea', 'Pham Thi Ha', 'administrator', 'female', 'hapham.fis.hanu@gmail.com', 'KTX', '2013-12-07', '3215132132', 'fresher', 'web application', 3000000);

-- --------------------------------------------------------

--
-- Table structure for table `workingtime`
--

CREATE TABLE `workingtime` (
  `workingTime_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `workingTime_absence` int(10) DEFAULT NULL,
  `workingTime_overdate` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `workingtime`
--

INSERT INTO `workingtime` (`workingTime_id`, `user_id`, `workingTime_absence`, `workingTime_overdate`) VALUES
(1, 1, 2, 3),
(2, 2, 1, 2),
(3, 3, 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`department_name`);

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`feedback_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `leaveoff`
--
ALTER TABLE `leaveoff`
  ADD PRIMARY KEY (`leave_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`project_id`);

--
-- Indexes for table `project_user`
--
ALTER TABLE `project_user`
  ADD KEY `project_id` (`project_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`report_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`role_name`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`),
  ADD KEY `user_role` (`user_role`),
  ADD KEY `user_department` (`user_department`);

--
-- Indexes for table `workingtime`
--
ALTER TABLE `workingtime`
  ADD PRIMARY KEY (`workingTime_id`),
  ADD KEY `user_id` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `feedback_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `leaveoff`
--
ALTER TABLE `leaveoff`
  MODIFY `leave_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `project`
--
ALTER TABLE `project`
  MODIFY `project_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `report`
--
ALTER TABLE `report`
  MODIFY `report_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `workingtime`
--
ALTER TABLE `workingtime`
  MODIFY `workingTime_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `feedback`
--
ALTER TABLE `feedback`
  ADD CONSTRAINT `feedback_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `leaveoff`
--
ALTER TABLE `leaveoff`
  ADD CONSTRAINT `leaveoff_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `project_user`
--
ALTER TABLE `project_user`
  ADD CONSTRAINT `project_user_ibfk_1` FOREIGN KEY (`project_id`) REFERENCES `project` (`project_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `project_user_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `report`
--
ALTER TABLE `report`
  ADD CONSTRAINT `report_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`user_role`) REFERENCES `role` (`role_name`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `user_ibfk_2` FOREIGN KEY (`user_department`) REFERENCES `department` (`department_name`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `workingtime`
--
ALTER TABLE `workingtime`
  ADD CONSTRAINT `workingtime_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
