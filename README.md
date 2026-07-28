# 📚 Book Store Management System

A Java-based **Book Store Management System** developed using the **Spring Framework**, **Hibernate ORM**, **JSP**, and **Servlets**. This project follows the MVC architecture and allows users to perform complete CRUD operations on book records with pagination support and email notifications.

---

## 🚀 Features

- 📖 Add New Books
- ✏️ Update Existing Books
- ❌ Delete Books
- 🔍 View Book Details
- 📃 List Books with Pagination
- 📧 Email Notification System
- 🗄️ Hibernate ORM Integration
- 🏗️ Spring MVC Architecture
- 🎨 JSP-based User Interface
- 🗃️ MySQL Database Integration

---

## 🛠️ Technologies Used

| Technology | Version |
|------------|----------|
| Java | 8+ |
| Spring Framework | 5.x |
| Hibernate ORM | 5.x |
| JSP | Java Server Pages |
| Servlets | Java EE |
| JSTL | 1.2 |
| HTML5 | Latest |
| CSS3 | Latest |
| Bootstrap | 5 |
| MySQL | 8.x |
| Apache Tomcat | 8.5+ |
| Eclipse IDE | 2024+ |


---

## 🏗️ Project Architecture

```
Presentation Layer (JSP)
          │
          ▼
Spring MVC Controller
          │
          ▼
Service Layer
          │
          ▼
DAO Layer
          │
          ▼
Hibernate ORM
          │
          ▼
MySQL Database
```

---

## 📂 Project Structure

```
BookStore/

├── src
│   ├── controller
│   ├── service
│   ├── dao
│   ├── model
│   ├── util
│   └── config
│
├── WebContent
│   ├──META-INF
│   ├
│   ├── 
│   ├── WEB-INF
│   │     
│   │    
│   └── index.jsp ,all jsp files
│
├── lib
│
├── Jar files
│
└── README.md
```

---

## 📚 CRUD Operations

### ➜ Add Book

- Add a new book
- Store book details in the database

### ➜ View Books

- Display all books
- Pagination support
- Search-friendly listing

### ➜ Update Book

- Modify existing book information

### ➜ Delete Book

- Remove selected books from the database

---

## 📧 Email Notification

The application uses the **Spring Mail API** for sending emails.

Example use cases:

- Book added successfully
- Book updated successfully
- Book deleted successfully

---

## 📑 Pagination

Implemented server-side pagination for displaying books efficiently.

Benefits:

- Faster page loading
- Better user experience
- Efficient database queries

---

## 💾 Database

Example Book Table

| Column |
|----------|
| id |
| title |
| author |
| category |
| publisher |
| edition |
| price |

---

## ⚙️ Prerequisites

Before running the project, install:

- Java JDK 8 or above
- Eclipse IDE (Enterprise Edition)
- Apache Tomcat 8.5+
- MySQL Server
- Maven
- Git

---

## ⚙️ Configuration

### Clone Repository

```bash
git clone https://github.com/yourusername/book-store-management.git
```

### Import Project

1. Open Eclipse
2. File → Import
3. Existing Maven Projects (or Dynamic Web Project)
4. Finish

### Configure Database

Update your Hibernate configuration:

```properties
Create one db with table as mybooks

create table mybooks(bid int primary key,bname char(15),
author char(15),price double,edition char(15),category char(15),
pub char(15));

Insert some records:

INSERT INTO mybooks (bid, bname, author, price, edition, category, pub) VALUES
(101, 'Java Basics', 'James', 450.00, '1st', 'Programming', 'Oracle'),

(102, 'Spring Core', 'Rod', 650.00, '2nd', 'Programming', 'Apress'),

(103, 'Hibernate', 'Gavin', 550.00, '3rd', 'Programming', 'Manning'),

(104, 'Python', 'Mark', 400.00, '2nd', 'Programming', 'OReilly'),

(105, 'SQL Guide', 'Allen', 350.00, '1st', 'Database', 'Pearson'),

(106, 'HTML CSS', 'John', 300.00, '4th', 'Web', 'McGraw'),

(107, 'JavaScript', 'David', 420.00, '3rd', 'Web', 'Packt'),

(108, 'React JS', 'Andrew', 700.00, '2nd', 'Frontend', 'Packt'),

(109, 'Spring Boot', 'Craig', 850.00, '1st', 'Programming', 'Apress'),

(110, 'Microserv', 'Sam', 900.00, '2nd', 'Architecture', 'Pearson');
```

### Run

1. Start MySQL
2. Start Apache Tomcat
3. Deploy the project
4. Open:

```
http://localhost:8080/BookStore

```


---

## 🎯 Learning Objectives

This project demonstrates:

- Spring MVC
- Hibernate ORM
- JSP & Servlets
- MVC Design Pattern
- CRUD Operations
- Pagination
- JavaMail Integration
- Form Validation
- Dependency Injection
- Database Connectivity
- Layered Architecture

---

## 📈 Future Enhancements

- User Authentication
- Spring Security
- REST APIs
- Spring Boot Migration
- Thymeleaf
- JWT Authentication
- Role-Based Access Control
- Book Search
- Image Upload
- Dashboard & Analytics

---

## 👨‍💻 IDE Used

- Eclipse IDE for Enterprise Java and Web Developers

Project Type:

- Dynamic Web Project

Server:

- Apache Tomcat 8.5

Database:

- MySQL



---

## 📄 License

This project is developed for educational purposes and learning Java Enterprise application development using Spring Framework and Hibernate.

---

## 🙏 Acknowledgements

- Spring Framework
- Hibernate ORM
- Apache Tomcat
- MySQL
- Eclipse IDE

---


## Author 
 N Gamani prasad 
## ⭐ If you like this project

If this project helped you learn Java Enterprise Development, consider giving it a ⭐ on GitHub.
