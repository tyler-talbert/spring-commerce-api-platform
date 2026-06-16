# Spring Commerce API Platform

A production-ready RESTful API built with Spring Boot 3.5 for e-commerce applications. This platform provides comprehensive user management, product catalog, and shopping cart functionality with a focus on clean architecture and maintainability.

## Architecture

This application follows a layered architecture pattern with clear separation of concerns:

- **Controllers**: RESTful endpoints with OpenAPI documentation
- **Services**: Business logic layer
- **Repositories**: Data access layer using Spring Data JPA
- **Entities**: JPA domain models
- **DTOs**: Data transfer objects for API contracts
- **Mappers**: MapStruct-based object mapping

## Core Features

### User Management
- User registration with validation
- Email uniqueness enforcement
- Password management
- User profile updates
- Sortable user listings

### Product Catalog
- Product CRUD operations
- Category-based organization
- Product filtering by category
- Wishlist functionality

### Shopping Cart
- Session-based cart management using UUID
- Add, update, and remove items
- Automatic quantity management
- Real-time price calculations
- Cart persistence

### Security
- Spring Security integration
- Stateless session management
- Public endpoints for registration and cart operations
- Protected endpoints for authenticated users

## Technology Stack

- **Framework**: Spring Boot 3.5.9
- **Java**: 21
- **Database**: MySQL 8.x
- **ORM**: Spring Data JPA with Hibernate
- **Migration**: Flyway
- **Mapping**: MapStruct 1.6
- **Validation**: Jakarta Bean Validation
- **Documentation**: SpringDoc OpenAPI 3
- **Build Tool**: Maven

## Prerequisites

- JDK 21 or higher
- MySQL 8.x
- Maven 3.6+

## Configuration

Set the following environment variables:

```bash
DB_USERNAME=your_database_username
DB_PASSWORD=your_database_password
```

For Flyway migrations:

```bash
flyway.user=your_database_username
flyway.password=your_database_password
```

## Database Setup

The application uses Flyway for database migrations. The database schema is automatically created on startup. The following tables are managed:

- users
- addresses
- products
- categories
- profiles
- wishlist
- carts
- cart_items

## Building the Project

```bash
mvn clean install
```

## Running the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Documentation

Once the application is running, access the interactive API documentation at:

```
http://localhost:8080/swagger-ui.html
```

## API Endpoints

### Users
- `POST /users` - Register a new user
- `GET /users` - List all users (supports sorting)
- `GET /users/{id}` - Get user by ID
- `PUT /users/{id}` - Update user
- `DELETE /users/{id}` - Delete user
- `POST /users/{id}/change-password` - Change user password

### Products
- `GET /products` - List all products (supports category filtering)
- `GET /products/{id}` - Get product by ID
- `POST /products` - Create a new product
- `PUT /products/{id}` - Update product
- `DELETE /products/{id}` - Delete product

### Carts
- `POST /carts` - Create a new cart
- `GET /carts/{cartId}` - Get cart details
- `POST /carts/{cartId}/items` - Add item to cart
- `PUT /carts/{cartId}/items/{productId}` - Update item quantity
- `DELETE /carts/{cartId}/items/{productId}` - Remove item from cart
- `DELETE /carts/{cartId}/items` - Clear cart

## Project Structure

```
src/main/java/com/codewithtyler/store/
├── config/              # Security and application configuration
├── controllers/         # REST controllers
├── dtos/               # Data transfer objects
├── entities/           # JPA entities
├── exceptions/         # Custom exceptions
├── mappers/            # MapStruct mappers
├── repositories/       # Spring Data repositories
├── services/           # Business logic
└── validation/         # Custom validators
```

## Data Models

### User
- Basic user information (name, email, password)
- One-to-many relationship with addresses
- Many-to-many wishlist relationship with products

### Product
- Product details (name, description, price)
- Many-to-one relationship with category

### Cart
- UUID-based identification
- One-to-many relationship with cart items
- Automatic total price calculation

### CartItem
- Links products to carts
- Quantity management
- Price calculation per item

## Validation

The application includes comprehensive validation:

- Email format validation
- Lowercase email enforcement (custom validator)
- Password length requirements (6-25 characters)
- Required field validation
- Unique email constraint

## Error Handling

Global exception handling provides consistent error responses:

- Validation errors return field-specific messages
- Not found errors return 404 status
- Bad request errors return 400 status
- Unauthorized errors return 401 status

## Development

### Running Tests

```bash
mvn test
```

### Database Migrations

To run Flyway migrations manually:

```bash
mvn flyway:migrate
```

To clean the database:

```bash
mvn flyway:clean
```

## License

This project is available for use under standard software licensing terms.
