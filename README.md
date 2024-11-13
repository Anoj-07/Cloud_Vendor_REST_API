# Cloud Vendor Management System

A RESTful API for managing cloud vendors, built with Spring Boot, Spring Data JPA, MySQL, and tested using Postman.

## Project Overview

This project allows you to manage cloud vendors with operations like creating, reading, updating, and deleting vendor information. It provides a REST API to interact with cloud vendors, with the ability to add, view, update, and delete cloud vendor data in the system.

### Key Features:
- **Create Vendor**: Allows creation of new cloud vendor records.
- **Read Vendor Details**: Fetch vendor details by ID or list all vendors.
- **Update Vendor**: Update vendor details.
- **Delete Vendor**: Remove a vendor from the system.

## Technologies Used:
- **Spring Boot**: For building the RESTful backend API.
- **Spring Data JPA**: For database interaction and entity management.
- **MySQL**: As the relational database.
- **Postman**: For testing the RESTful APIs.

## Database Schema

The `CloudVendor` entity has the following fields:
- **vendorId** (String): Unique identifier for the vendor.
- **vendorName** (String): Name of the vendor.
- **vendorAddress** (String): Address of the vendor.
- **vendorPhoneNumber** (String): Vendor's contact phone number.

## API Endpoints

### 1. **Get Cloud Vendor by ID**
- **Endpoint**: `/cloudVendor/{vendorId}`
- **Method**: `GET`
- **Description**: Fetches details of a cloud vendor by the provided vendor ID.
- **Response**: Returns the `CloudVendor` details for the specified `vendorId`.

### 2. **Get All Cloud Vendors**
- **Endpoint**: `/cloudVendor`
- **Method**: `GET`
- **Description**: Fetches a list of all cloud vendors.
- **Response**: Returns a list of all `CloudVendor` details.

### 3. **Create Cloud Vendor**
- **Endpoint**: `/cloudVendor`
- **Method**: `POST`
- **Description**: Creates a new cloud vendor.
- **Request Body**: JSON object containing `vendorId`, `vendorName`, `vendorAddress`, and `vendorPhoneNumber`.
- **Response**: Returns a success message: "Cloud Vendor Created Successfully".

### 4. **Update Cloud Vendor**
- **Endpoint**: `/cloudVendor`
- **Method**: `PUT`
- **Description**: Updates the details of an existing cloud vendor.
- **Request Body**: JSON object containing the updated `vendorId`, `vendorName`, `vendorAddress`, and `vendorPhoneNumber`.
- **Response**: Returns a success message: "Cloud Vendor Update Successfully".

### 5. **Delete Cloud Vendor**
- **Endpoint**: `/cloudVendor/{vendorId}`
- **Method**: `DELETE`
- **Description**: Deletes a cloud vendor based on the `vendorId`.
- **Response**: Returns the success message of deletion from the `CloudVendorService`.

## Installation & Setup

1. Clone this repository:
```
   git clone https://github.com/your-username/cloud-vendor-management.git
```
2. Navigate to the project directory:
```
    cd cloud-vendor-management
```

3. Install Dependencies
```
   ./mvnw clean install
```
4. Configure your MySQL database:
```
spring.datasource.url=jdbc:mysql://localhost:3306/cloud_vendor_db
spring.datasource.username=root
spring.datasource.password=password
```

5.Run the application:
```
./mvnw spring-boot:run
```
## License

You can replace the placeholder URLs and customize the instructions if needed. This `README.md` provides a clear description of your project, the technologies used, API endpoints, and installation steps.
