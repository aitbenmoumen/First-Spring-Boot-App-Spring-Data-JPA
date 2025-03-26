# First Spring Boot App with Spring Data JPA

## Overview
This project is a simple Spring Boot application that demonstrates how to use Spring Data JPA to interact with a MySQL database. It provides a basic setup and configuration for building a RESTful application.

## Table of Contents
- [Technologies](#technologies)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Configuration](#configuration)
- [License](#license)

## Technologies
- **Java**: Programming language used for the application.
- **Spring Boot**: Framework for building the application.
- **Spring Data JPA**: Simplifies database interactions.
- **MySQL**: Database management system.

## Features
- Basic CRUD operations
- RESTful API endpoints
- Easy configuration with Spring Data JPA

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/aitbenmoumen/First-Spring-Boot-App-Spring-Data-JPA.git
   ```
2. Navigate to the project directory:
   ```bash
   cd First-Spring-Boot-App-Spring-Data-JPA
   ```
3. Ensure you have Java and Maven installed on your machine.
4. Build the project:
   ```bash
   mvn clean install
   ```

## Usage
1. Start the MySQL server and create a database.
2. Update the `application.properties` file with your database credentials.
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the API at `http://localhost:8080`.

## Configuration
Make sure to configure your `application.properties` file as follows:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contributing
Feel free to submit issues or pull requests for improvements or bug fixes.
