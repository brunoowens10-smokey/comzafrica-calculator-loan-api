# Calculator & Loan API (Spring Boot + MySQL)

A practice project built while learning Java and Spring Boot during my Software Development internship at ComzAfrica. It contains two small REST APIs that share a single Spring Boot application: a Calculator API and a Loan API, both backed by a MySQL database.

## Why this project exists

This repository documents my hands-on approach to learning Spring Boot during my internship — building real, working APIs instead of just following tutorials, including debugging real errors like `StaleObjectStateException` and database connection issues along the way.

## What it does

**Calculator API**
- Performs basic arithmetic operations (add, subtract, multiply, divide)
- Saves every calculation to the database, so there's a full history of past results

**Loan API**
- Full CRUD operations for loan applications
- Apply for a loan, retrieve all loans, approve a loan, delete a loan
- Custom error handling — returns a clean `404 Not Found` with a helpful message instead of crashing when a loan doesn't exist

## Tech stack

- Java 21
- Spring Boot
- Spring Data JPA / Hibernate
- MySQL
- Maven
- Lombok

## Project structure

The project follows the standard layered architecture:

```
Controller  → handles incoming HTTP requests
Service     → contains business logic
Repository  → talks to the database
Model       → represents database tables (JPA entities)
Exception   → custom exceptions and global error handling
```

## API endpoints

**Calculator**
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/calculator/calculate?a=10&b=5&operation=ADD` | Perform a calculation and save it |
| GET | `/calculator/history` | Get all past calculations |

**Loans**
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/loans` | Apply for a loan |
| GET | `/loans` | Get all loans |
| PUT | `/loans/{id}/approve` | Approve a loan by id |
| DELETE | `/loans/{id}` | Delete a loan by id |

## Running it locally

1. Create a MySQL database and update `src/main/resources/application.properties` with your own credentials
2. Run the app from `CalculatorApplication.java`
3. Test endpoints using the included `.http` request file, or any API client of your choice

## What's next

This project is a continuous work-in-progress as I keep learning. Planned additions include input validation, DTOs for request/response separation, and proper unit tests.

## Note

This is a personal learning project and is not affiliated with or representative of ComzAfrica's actual production codebase.
