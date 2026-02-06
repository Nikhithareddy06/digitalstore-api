# Digital Store REST API – Spring Boot

## Project Overview
This project is a Java Spring Boot RESTful API for managing products in a digital store.
It allows adding products, retrieving them by ID, and validating input. Data is stored in-memory using an ArrayList.

*Features*
- Add a new product
- Get product by ID
- Input validation
- In-memory storage

*Technologies Used*
- Java 21
- Spring Boot
- Maven
- REST API
- Postman (for testing)

*Project Architecture*
The project follows a layered architecture:

1.Model: 'Product.java'
  - Represents a product with fields like id, name, price, and description.

2.Service: 'ProductService.java'
  - Handles business logic such as adding products, retrieving products by id, and validating input.

3.Controller: 'ProductController.java'
  - Handles REST API endpoints, delegates requests to the service layer, and returns responses.

4.Application: 'DigitalstoreApplication.java'
  - Entry point to run the Spring Boot application.

*How to Run*
1. Open project in Eclipse or IntelliJ
2. Run DigitalstoreApplication.java
3. Server starts at http://localhost:8080
4. Use Postman to test APIs

API Endpoints

1. Add Product:
  - Method: POST
  - URL: /api/products
  - Request Body(JSON):

    {
      "name": "Laptop",
      "price": 45000,
      "description": "HP Pavilion Laptop"
    }
    
    Response Example:
      {
        "id": 1,
        "name": "Laptop",
        "price": 45000,
        "description": "HP Pavilion Laptop"
       }
       
2. Get Product by ID:
  - Method: GET
  - URL: /api/products/{id}
  - Example: GET /api/products/1
  - Response Example:

    {
      "id": 1,
      "name": "Laptop",
      "price": 45000,
      "description": "HP Pavilion Laptop"
    }
    
 *Error Response: 404 Not Found if the product ID does not exist
 