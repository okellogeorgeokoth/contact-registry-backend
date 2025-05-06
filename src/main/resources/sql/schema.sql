CREATE DATABASE IF NOT EXISTS contact_registry;
USE contact_registry;

CREATE TABLE contacts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    id_number VARCHAR(50) UNIQUE NOT NULL,
    date_of_birth DATE NOT NULL,
    gender ENUM('Male', 'Female', 'Other') NOT NULL,
    county VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Sample data
INSERT INTO contacts (full_name, phone_number, email, id_number, date_of_birth, gender, county)
VALUES 
    ('John Doe', '0712345678', 'john@example.com', '12345678', '1990-05-15', 'Male', 'Nairobi'),
    ('Jane Smith', '0723456789', 'jane@example.com', '23456789', '1985-08-22', 'Female', 'Mombasa');