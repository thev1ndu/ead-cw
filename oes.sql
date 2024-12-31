-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 31, 2024 at 08:12 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oes`
--

-- --------------------------------------------------------

--
-- Table structure for table `answers`
--

CREATE TABLE `answers` (
  `answer_id` int(11) NOT NULL,
  `question_id` int(11) DEFAULT NULL,
  `quiz_code` varchar(255) DEFAULT NULL,
  `correct_option` varchar(10) DEFAULT NULL,
  `answer` varchar(10) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `answers`
--

INSERT INTO `answers` (`answer_id`, `question_id`, `quiz_code`, `correct_option`, `answer`, `user_id`) VALUES
(68, 15, 'QZ876460', '1', '1', 2),
(69, 16, 'QZ876460', '1', '1', 2),
(70, 17, 'QZ876460', '1', '1', 2),
(71, 18, 'QZ876460', '1', '1', 2),
(72, 19, 'QZ876460', '1', '1', 2),
(73, 21, 'QZ876460', '1', '1', 2),
(74, 21, 'QZ876460', '1', '1', 2),
(75, 15, 'QZ876460', '1', '1', 2),
(76, 16, 'QZ876460', '1', '1', 2),
(77, 17, 'QZ876460', '1', '1', 2),
(78, 18, 'QZ876460', '1', '1', 2),
(79, 19, 'QZ876460', '1', '1', 2),
(80, 21, 'QZ876460', '1', '1', 2),
(81, 21, 'QZ876460', '1', '1', 2),
(82, 15, 'QZ876460', '1', '1', 2),
(83, 16, 'QZ876460', '1', '1', 2),
(84, 17, 'QZ876460', '1', '1', 2),
(85, 18, 'QZ876460', '1', '1', 2),
(86, 19, 'QZ876460', '1', '1', 2),
(87, 21, 'QZ876460', '1', '1', 2),
(88, 21, 'QZ876460', '1', '1', 2),
(89, 15, 'QZ876460', '1', '1', 13),
(90, 16, 'QZ876460', '1', '4', 13),
(91, 17, 'QZ876460', '1', '2', 13),
(92, 18, 'QZ876460', '1', '3', 13),
(93, 19, 'QZ876460', '1', '2', 13),
(94, 21, 'QZ876460', '1', '2', 13),
(95, 21, 'QZ876460', '1', '2', 13),
(96, 15, 'QZ876460', '1', '1', 14),
(97, 16, 'QZ876460', '1', '1', 14),
(98, 17, 'QZ876460', '1', '1', 14),
(99, 18, 'QZ876460', '1', '1', 14),
(100, 19, 'QZ876460', '1', '1', 14),
(101, 21, 'QZ876460', '1', '1', 14),
(102, 21, 'QZ876460', '1', '2', 14);

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `question_id` int(11) NOT NULL,
  `quiz_code` varchar(10) DEFAULT NULL,
  `question_text` text NOT NULL,
  `option_a` varchar(255) NOT NULL,
  `option_b` varchar(255) NOT NULL,
  `option_c` varchar(255) NOT NULL,
  `option_d` varchar(255) NOT NULL,
  `correct_option` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`question_id`, `quiz_code`, `question_text`, `option_a`, `option_b`, `option_c`, `option_d`, `correct_option`) VALUES
(14, 'QZ876460', 'A', 'A', 'A', 'A', 'A', '1'),
(15, 'QZ876460', 'A', 'A', 'A', 'A', 'A', '1'),
(16, 'QZ876460', 'A', 'A', 'A', 'A', 'A', '1'),
(17, 'QZ876460', 'A', 'A', 'A', 'A', 'A', '1'),
(18, 'QZ876460', 'A', 'A', 'A', 'A', 'A', '1'),
(19, 'QZ876460', 'A', 'A', 'A', 'A', 'A', '1'),
(21, 'QZ876460', 'A', 'A', 'A', 'A', 'A', '1');

-- --------------------------------------------------------

--
-- Table structure for table `quizzes`
--

CREATE TABLE `quizzes` (
  `quiz_id` int(11) NOT NULL,
  `quiz_code` varchar(10) NOT NULL,
  `quiz_name` varchar(100) NOT NULL,
  `quiz_desc` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `quizzes`
--

INSERT INTO `quizzes` (`quiz_id`, `quiz_code`, `quiz_name`, `quiz_desc`) VALUES
(10, 'QZ876460', 'Mathematics for Computing', 'cjhjhfj bkhgkjg kjbkjb jkbkjb jbbjlkb jlnlbl jbljkbk ljbljblj lknlkn lkkblkb ljblkjblk lknlkb');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `result_id` int(11) NOT NULL,
  `quiz_code` varchar(20) NOT NULL,
  `user_id` int(11) NOT NULL,
  `correct_answers` int(11) NOT NULL DEFAULT 0,
  `incorrect_answers` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`result_id`, `quiz_code`, `user_id`, `correct_answers`, `incorrect_answers`) VALUES
(36, 'QZ876460', 2, 7, 0),
(37, 'QZ876460', 13, 1, 6),
(38, 'QZ876460', 14, 6, 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` enum('Admin','Student','Lecturer') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `role`) VALUES
(1, 'admin', 'admin123', 'Admin'),
(2, 'student1', 'student123', 'Student'),
(3, 'lecturer1', 'lecturer123', 'Lecturer'),
(13, 'thevindu', '123', 'Student'),
(14, 'thevinduhas', '1234', 'Student');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `answers`
--
ALTER TABLE `answers`
  ADD PRIMARY KEY (`answer_id`);

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`question_id`),
  ADD KEY `quiz_code` (`quiz_code`);

--
-- Indexes for table `quizzes`
--
ALTER TABLE `quizzes`
  ADD PRIMARY KEY (`quiz_id`),
  ADD UNIQUE KEY `quiz_code` (`quiz_code`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD PRIMARY KEY (`result_id`),
  ADD KEY `quiz_code` (`quiz_code`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `answers`
--
ALTER TABLE `answers`
  MODIFY `answer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;

--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `question_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `quizzes`
--
ALTER TABLE `quizzes`
  MODIFY `quiz_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `result`
--
ALTER TABLE `result`
  MODIFY `result_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `questions`
--
ALTER TABLE `questions`
  ADD CONSTRAINT `questions_ibfk_1` FOREIGN KEY (`quiz_code`) REFERENCES `quizzes` (`quiz_code`) ON DELETE CASCADE;

--
-- Constraints for table `result`
--
ALTER TABLE `result`
  ADD CONSTRAINT `result_ibfk_1` FOREIGN KEY (`quiz_code`) REFERENCES `quizzes` (`quiz_code`) ON DELETE CASCADE,
  ADD CONSTRAINT `result_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
