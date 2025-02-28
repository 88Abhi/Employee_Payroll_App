# Employee Payroll Application

## UC-1: Employee Payroll Setup
- **Adding Dependencies**
- **Keeping Confidential and Unnecessary Files in `.gitignore`**
    - **`application.properties`** (Configuration file)

## UC-2: Create Controller and Demonstrate REST Requests
- **Created Different REST Requests:** `GET`, `POST`, `PUT`, `DELETE`
- **Configured MySQL Connection**
- **Ensure the Following Steps to Run the Application** *(Since `application.properties` is not mentioned in the repository)*
- **Path to Create `application.properties`**:

- **Adding Details in `application.properties`**

```properties
# Database Configuration
spring.datasource.url=your_mysql_URL/Dbname
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA Configuration
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
``` 

## Section-2 UC-1
- **Introducing DTO for request and Response**
- **Introducing the Model(Entity) to save data in database**
- **DTO add  extra abstraction layer to the user interaction**

## Section-2 UC-2
- **Introducing Service Layer for Business Logic**
- **Adding Abstraction Layer for User request**
- **Now Controller Interact with Service Layer then service layer Respond the user request**

## Section-2 UC-3
- **Temporally Storing Data in List**
- **Adding Employee to the List**
- **Getting Employee from the List**
- **Updating Employee in the List**
- **Deleting Employee from the List** 