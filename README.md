# Contact Registry - Backend

Java Servlet-based backend for the Contact Registry application.

## Features
- RESTful API endpoints for CRUD operations
- MySQL database integration
- JSON response format

## Setup
1. Clone this repository
2. Create MySQL database using `src/main/resources/sql/schema.sql`
3. Update DB credentials in `DBConnection.java`
4. Build with Maven:
   ```bash
   mvn clean package