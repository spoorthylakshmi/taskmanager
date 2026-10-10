# Task Manager REST API

A RESTful backend application built using **Java, Spring Boot, Spring Data JPA, and MySQL** to manage tasks through CRUD (Create, Read, Update, Delete) operations.

## Features

- Create a new task
- Retrieve all tasks
- Retrieve a task by its ID
- Update an existing task
- Delete a task
- Validate task input, including required titles
- Handle exceptions with appropriate HTTP status codes
- Persist task data in a MySQL database
- Test API endpoints using Postman

## Tech Stack

- **Language:** Java
- **Framework:** Spring Boot
- **Database:** MySQL
- **ORM:** Spring Data JPA / Hibernate
- **Build Tool:** Maven
- **API Testing:** Postman
- **Version Control:** Git and GitHub

## Project Structure

```text
taskmanager/
├── src/
│   ├── main/
│   │   ├── java/com/spoorthy/taskmanager/
│   │   │   ├── controller/
│   │   │   │   └── TaskController.java
│   │   │   ├── exception/
│   │   │   │   ├── GlobalExceptionHandler.java
│   │   │   │   └── TaskNotFoundException.java
│   │   │   ├── model/
│   │   │   │   └── Task.java
│   │   │   ├── repository/
│   │   │   │   └── TaskRepository.java
│   │   │   ├── service/
│   │   │   │   └── TaskService.java
│   │   │   └── TaskmanagerApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── application.properties.example
│   └── test/
├── Task Manager API.postman_collection.json
├── pom.xml
├── mvnw
├── mvnw.cmd
└── .gitignore
```

## Prerequisites

Before running the application, make sure you have:

- Java 17 or a compatible version required by the project
- MySQL Server
- Git (optional, for cloning the repository)
- Postman (optional, for API testing)

## Database Setup

1. Start your MySQL server.
2. Create the database:

```sql
CREATE DATABASE taskmanager_db;
```

3. Configure your database connection using `application.properties.example` as a template.
4. Set your database password using the `DB_PASSWORD` environment variable.

**Important:** Never commit your actual database password to GitHub.

## Run the Application

Clone the repository:

```bash
git clone https://github.com/spoorthylakshmi/taskmanager.git
cd taskmanager
```

Set the database password in Command Prompt on Windows:

```cmd
set DB_PASSWORD=YOUR_MYSQL_PASSWORD
```

Replace `YOUR_MYSQL_PASSWORD` with your local MySQL password.

Run the application using the Maven Wrapper:

```cmd
mvnw.cmd spring-boot:run
```

The API will be available at:

`http://localhost:8080`

Hibernate is configured to create or update database tables based on the entity classes.

## API Endpoints

Base URL: `http://localhost:8080/api/tasks`

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/tasks` | Retrieve all tasks |
| GET | `/api/tasks/{id}` | Retrieve a task by ID |
| POST | `/api/tasks` | Create a task |
| PUT | `/api/tasks/{id}` | Update a task |
| DELETE | `/api/tasks/{id}` | Delete a task |

## Example Request

### Create a Task

**POST** `/api/tasks`

Request body:

```json
{
  "title": "Learn Spring Boot",
  "description": "Build a Task Manager REST API",
  "completed": false
}
```

Example response:

```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Build a Task Manager REST API",
  "completed": false
}
```

The server generates the task ID.

## HTTP Status Codes

| Status | Meaning |
|---|---|
| 200 OK | Request successful |
| 201 Created | Task created successfully |
| 204 No Content | Task deleted successfully |
| 400 Bad Request | Invalid input, such as an empty title |
| 404 Not Found | Requested task does not exist |
| 500 Internal Server Error | Unexpected server error |

## Testing with Postman

Import `Task Manager API.postman_collection.json` into Postman to access the saved API requests.

Make sure the Spring Boot application and MySQL server are running before testing.

## Future Improvements

- Add task filtering and pagination
- Add automated unit and integration tests
- Implement user authentication and authorization
- Add API documentation using Swagger/OpenAPI

## Author

**Spoorthy Lakshmi G.**

GitHub: [spoorthylakshmi](https://github.com/spoorthylakshmi)
