# Enterprise Application Development 1 - Course Work

Welcome to the **Quiz7** project! This document provides a detailed guide on how to set up and run the project.

---

## Project Description

**Quiz7** is an enterprise application designed to provide an online quiz platform tailored for the education sector. It simplifies quiz creation, management, and reporting, offering distinct roles for administrators, lecturers, and students. 

### Key Features

#### **Admin**
- **User Management**: Add, update, delete, and manage user roles (Admin, Lecturer, Student).
- **Quiz Management**: Create and manage quizzes.
- **Dashboard**: Provides an overview of system activities.
- **Reporting**: Generate detailed reports on quiz results and user lists.

#### **Lecturer**
- **Quiz Creation**: Create quizzes for students.
- **Dashboard**: Access insights and manage quizzes.
- **Reporting**: Generate reports for quiz results of all students.

#### **Student**
- **Quiz Participation**: Enter a unique quiz code to attempt a quiz (only once per quiz).
- **Result Generation**: Generate a result sheet at the end of the quiz.

---

## Prerequisites

Before you begin, ensure you have the following installed on your system:

1. **XAMPP**
   - Used to run Apache and MySQL servers.
   - [Download XAMPP](https://www.apachefriends.org/download.html)
2. **NetBeans IDE**
   - Required to open and run the project.
   - [Download NetBeans](https://netbeans.apache.org/download/)

---

## Steps to Set Up and Run

### 1. Start XAMPP and Set Up the Database

1. Open **XAMPP** and start the following services:
   - **Apache**
   - **MySQL**

2. Open your browser and go to **phpMyAdmin** by navigating to:
   ```
   http://localhost/phpmyadmin
   ```

## Importing the `oes.sql` File into phpMyAdmin

Follow these steps to set up the database:

1. **Create a Database**:
   - Open phpMyAdmin.
   - Click on the **"Databases"** tab.
   - In the **"Create database"** field, enter `oes` as the database name.
   - Click **"Create"** to create the database.

2. **Import the SQL File**:
   - Select the `oes` database from the list on the left panel.
   - Click on the **"Import"** tab at the top.
   - Click **"Choose File"** and select the `oes.sql` file from your project directory.
   - Click **"Go"** to import the database structure and data into the `oes` database.

Your database is now ready to use.

### 2. Open the Project in NetBeans

1. Open **NetBeans IDE**.
2. Click on **File > Open Project**.
3. Navigate to the **Quizly** folder and select it.
4. Once the project is loaded, ensure all dependencies are properly resolved.

### 3. Clean, Build, and Run the Project

1. In NetBeans, right-click on the project in the **Projects** tab.
2. Select **"Clean and Build"** to clean and compile the project.
3. After building, right-click the project again and select **"Run"** to start the application.

---

### Login Credentials
Use the following credentials to log in based on the role:

**Admin Role**

Username: admin

Password: admin123

**Lecturer Role**

Username: lecturer1

Password: lecturer123

**Student Role**

Username: student1

Password: student123

---

## Usage

1. **Log In**:
   - Log in as a Lecturer or Admin to create or manage quizzes.

2. **Create or Share Quizzes**:
   - Create a new quiz or share the code of an existing quiz with students.
   - Example Quiz Codes: `QZ674571`, `QZ607513`.

3. **Student Participation**:
   - Students can enter the provided quiz code to start the quiz.

4. **Result Generation**:
   - At the end of the quiz, results are automatically generated.
   - To view detailed results:
     - Click on the **Back to Dashboard** button.
     - Navigate to the **Results** tab.
     - Select the quiz and click on **Generate Report**.

## Notes
- Each student can attempt a quiz only once.
- Ensure to share the correct quiz code with students to avoid errors.

## Dependencies
- **Jasper Reports**: Used for generating result sheets.

---

## Troubleshooting

- **Issue:** Unable to access phpMyAdmin.
  - **Solution:** Ensure XAMPP's Apache and MySQL services are running.

- **Issue:** Errors while importing the `oes.sql` file.
  - **Solution:** Check if the file is valid and the database is empty before importing.

- **Issue:** NetBeans shows build errors.
  - **Solution:** Ensure all dependencies and libraries are correctly configured in the project.
