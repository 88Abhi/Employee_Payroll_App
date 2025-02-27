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