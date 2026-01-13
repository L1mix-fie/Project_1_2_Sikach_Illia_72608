
# Task 2 – Spring Boot REST API Application
## Task 1 Pinned like another branch

Product Management REST API A Spring Boot application developed as part of Task 2, showcasing backend development skills and CRUD operations.
Backend: Spring Boot / Java
Database: H2 (In-memory)
Testing: Verified via Postman

## Technologies Used

* IntelliJ IDEA
* Java
* Spring Boot
* H2 Database
* Spring Web
* Spring Data JPA
* Postman
* Maven

## We create a project with main java files:

* ProductRequest
* ProductResponse
* Product
* ProductRepository
* ProductService
* ProductMapper
* ErrorMessageResponse

## Our main tasks are to carete:
* PUT Method
* EXCEPTION HANDLING
* ADD GET ALL AND DELETE Method
* Adding Data Base

## API Endpoints
URL: http://localhost:8080/api/v1/products

## Step 1 Post
<img width="1919" height="1023" alt="image" src="https://github.com/user-attachments/assets/0c558227-63b1-4ac3-8ae5-a4b970f18717" />

Request body example: { "name": "1 Product" }

Result: Product is saved in database. HTTP Status: 201 Created

## Step 2
<img width="1919" height="1077" alt="image" src="https://github.com/user-attachments/assets/d2139262-ca93-4e20-b979-7cb4634d847a" />


Get Product by ID – GET

GET /api/v1/products/1

Result example: { "id": 1, "name": "1 Product" }

HTTP Status: 200 OK

## Step 3

Get All Products – GET
<img width="1597" height="857" alt="image" src="https://github.com/user-attachments/assets/7bec45be-57a7-4789-b90d-d49a766bcf4d" />


PUT /api/v1/products/1
<img width="1596" height="857" alt="image" src="https://github.com/user-attachments/assets/e20ba080-7bdb-408a-b106-2fb21fbb4db2" />
<img width="1593" height="851" alt="image" src="https://github.com/user-attachments/assets/ae002b52-e787-4457-ab4f-060cb2e25aa9" />



Request body: { "name": "first Product" }

Result example: { "id": 1, "name": "first Product" }

HTTP Status: 200 OK

## Step 4
Delete Product – DELETE
<img width="1595" height="862" alt="image" src="https://github.com/user-attachments/assets/61cf89f7-05df-4303-a85e-0466a5de2948" />
<img width="1595" height="854" alt="image" src="https://github.com/user-attachments/assets/5bf5e74e-2cbb-45db-aa04-0a0a5118c1b2" />



DELETE /api/v1/products/1

Result: Product removed from database. No content returned.

HTTP Status: 204 No Content


## Step 5
Testing Data Base
<img width="1674" height="851" alt="image" src="https://github.com/user-attachments/assets/e3e810a9-75d6-48b2-bd7e-fd8ed3e82c73" />


* POST – create product
* GET – get product by id
* PUT – update product
* DELETE – delete product

Results 
Complete CRUD functionality: Supports creating, reading, and updating products. The deletion logic is fully implemented, ensuring that removed products are no longer accessible in the system.




