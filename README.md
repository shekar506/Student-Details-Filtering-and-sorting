**Student filtering and sorting** - README

**Project Overview**
The Student Management System allows users to manage student data, including adding, deleting, filtering, and sorting students based on their marks in various subjects. This system is built using Spring Boot for the backend and HTML, CSS, and JavaScript for the front end.

**Features**
Add Student: Add student records, including marks in different subjects.
Delete Student: Remove student records from the database.
Filter Students: Filter students based on marks in English, Maths, Science, and Social Science.
Sort Students: Sort students based on their marks in any subject.
Frontend Interface: Interactive UI to add, filter, and display student data.

**Technologies Used**

Backend: Spring Boot
Frontend: HTML, CSS, JavaScript
Database: MySQL
API: RESTful API endpoints to handle student operations

How to Run the Application Locally

1. Clone the Repository

2. Setup the Backend (Spring Boot)
Install MySQL: Ensure you have MySQL installed on your system. You can download it from MySQL's Official Website.

Create a Database: Create a MySQL database for the application. You can do this by running the following command in your MySQL terminal:

SQL

Copy code
CREATE DATABASE student_management;
Configure Database Connection: Open the src/main/resources/application.properties file and configure your MySQL database connection. Replace the placeholder values with your database details:

API Endpoints :

GET /api/students: Retrieve all students.
POST /api/students: Add a new student.
DELETE /api/students/{id}: Delete a student by ID.
GET /api/students/filter: Filter students based on marks.
GET /api/students/sort: Sort students based on marks.
Database Configuration
This application uses MySQL as the database. Ensure you have MySQL installed and a database created for the application (student_management).
You can customize the database name, username, and password in the application.properties file as per your setup.
Development Notes
The frontend is built using plain HTML, CSS, and JavaScript to interact with the backend RESTful APIs.
The backend uses Spring Boot with RESTful services for handling student data.
Make sure your backend server is running before using the frontend.
