-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 01, 2025 at 06:01 PM
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
(103, 23, 'QZ674571', '1', '1', 2),
(104, 24, 'QZ674571', '1', '1', 2),
(105, 25, 'QZ674571', '2', '3', 2),
(106, 26, 'QZ674571', '1', '3', 2),
(107, 26, 'QZ674571', '1', '3', 2),
(108, 29, 'QZ607513', '1', '3', 2),
(109, 30, 'QZ607513', '3', '3', 2),
(110, 31, 'QZ607513', '2', '3', 2),
(111, 32, 'QZ607513', '3', '3', 2),
(112, 32, 'QZ607513', '3', '3', 2),
(113, 29, 'QZ607513', '1', '2', 13),
(114, 30, 'QZ607513', '3', '2', 13),
(115, 31, 'QZ607513', '2', '2', 13),
(116, 32, 'QZ607513', '3', '2', 13),
(117, 32, 'QZ607513', '3', '2', 13),
(118, 29, 'QZ607513', '1', '1', 13),
(119, 30, 'QZ607513', '3', '1', 13),
(120, 31, 'QZ607513', '2', '1', 13),
(121, 32, 'QZ607513', '3', '1', 13),
(122, 32, 'QZ607513', '3', '1', 13);

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
(22, 'QZ674571', 'Which of the following is a valid Java data type?', 'integer', 'float', 'character', 'boolean', '2'),
(23, 'QZ674571', 'What is the default value of an int variable in Java?', '0', 'null', 'undefined', '0.0', '1'),
(24, 'QZ674571', 'What does the static keyword indicate in Java?', 'A method or variable belongs to the class rather than an instance', 'The variable is unchangeable', 'The method can only be accessed in the same class', 'The method cannot be overridden', '1'),
(25, 'QZ674571', 'Which of the following is a valid way to declare a Java array?', 'int arr = new int[5];', 'int[] arr = new int[5];', 'arr int[5] = new int[];', 'int arr[5] = new int[];', '2'),
(26, 'QZ674571', 'What is the size of the boolean data type in Java?', '1 bit', '1 byte', '4 bytes', '8 bytes', '1'),
(28, 'QZ607513', 'What is 5 + 7?', '10', '12', '13', '15', '2'),
(29, 'QZ607513', 'What is 15 - 9?', '6', '7', '8', '9', '1'),
(30, 'QZ607513', 'What is 8 x 3?', '8', '16', '24', '32', '3'),
(31, 'QZ607513', 'What is 36/6?', '5', '6', '7', '8', '2'),
(32, 'QZ607513', 'What is the square of 5?', '15', '20', '25', '30', '3');

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
(11, 'QZ674571', 'Java Basics Quiz', 'A quick quiz to test your basic Java knowledge, covering data types, arrays, exceptions, and key concepts. Perfect for beginners!'),
(12, 'QZ607513', 'Basic Math Skills Quiz', 'Test your basic math skills with this quick and fun quiz!');

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
(40, 'QZ607513', 2, 3, 2),
(42, 'QZ607513', 13, 1, 4);

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
(14, 'kamal', '1234', 'Student'),
(15, 'kasun', '1v3ZUwlR', 'Lecturer');

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
  MODIFY `answer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=123;

--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `question_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `quizzes`
--
ALTER TABLE `quizzes`
  MODIFY `quiz_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `result`
--
ALTER TABLE `result`
  MODIFY `result_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

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
