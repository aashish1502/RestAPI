# Employee and Order Management REST API

This project is a REST API built with Java and Spring Boot. It provides functionality for managing employees and orders, and implements HATEOAS (Hypermedia as the Engine of Application State) principles for navigation and resource discovery. The API supports CRUD operations (Create, Read, Update, Delete) for both employees and orders.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- HATEOAS
- MySQL (or any other supported database)
- Maven (for dependency management)

## Prerequisites

Before running the application, make sure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- Maven
- MySQL (or any other supported database)

## Setup

1. Clone the repository:

```
git clone https://github.com/aashish1502/RestAPI.git
```

2. Navigate to the project directory:

```
cd RestAPI
```

3. Open the `application.properties` file and update the database configuration according to your environment:

```
spring.datasource.url=jdbc:mysql://localhost:3306/your-database-name
spring.datasource.username=your-username
spring.datasource.password=your-password
```

4. Build the project using Maven:

```
mvn clean install
```

## Running the Application

1. Once the project is built successfully, run the following command:

```
mvn spring-boot:run
```

2. The application will start, and you can access the API endpoints using a REST client such as Postman or cURL.

## API Endpoints

The following endpoints are available for the Employee and Order resources:

### Employee Endpoints

- **GET** /employees - Get all employees
- **GET** /employees/{id} - Get an employee by ID
- **POST** /employees - Create a new employee
- **PUT** /employees/{id} - Update an existing employee
- **DELETE** /employees/{id} - Delete an employee

### Order Endpoints

- **GET** /orders - Get all orders
- **GET** /orders/{id} - Get an order by ID
- **POST** /orders - Create a new order
- **PUT** /orders/{id} - Update an existing order
- **DELETE** /orders/{id} - Delete an order

## HATEOAS

This project implements HATEOAS principles to provide hypermedia-driven navigation and resource discovery. Each response will contain links to related resources, allowing clients to discover and navigate the API dynamically.

## Contribution

Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please create an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
