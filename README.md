# Bookstore Management System

This is a Spring Boot application for managing books in a bookstore. It includes functionalities such as adding new books, viewing available books, managing a personal book list, and editing/deleting books.

## Technologies Used

- Java
- Spring Boot
- Thymeleaf (for front-end)
- Bootstrap (for styling)
- MySQL (as the database)

## Project Structure

- **src/main/java/com/bookstore/controller:** Contains the controllers for handling web requests.
- **src/main/java/com/bookstore/entity:** Defines the entities (Book and MyBookList) used in the application.
- **src/main/java/com/bookstore/repository:** Includes the repositories for database operations.
- **src/main/java/com/bookstore/service:** Contains the service classes for business logic.
- **src/main/resources/templates:** Stores Thymeleaf HTML templates for rendering views.
- **src/main/resources/application.properties:** Configuration file for application properties.

## How to Run

1. Ensure you have Java and MySQL installed on your system.
2. Create a MySQL database named 'book' with the appropriate user and password (as configured in `application.properties`).
3. Run the application using your preferred IDE or by using the command `./mvnw spring-boot:run` in the project directory.
4. Access the application at `http://localhost:8080/` in your web browser.

## Functionality

- **Home (/):** Navigate to the home page.
- **Book Registration (/book_register):** Register new books.
- **Available Books (/available_books):** View and manage available books.
- **My Books (/my_books):** View and manage your personal book list.
- **Delete My List Item (/deleteMyList/{id}):** Delete a book from your personal list.

## Contributing

If you'd like to contribute to this project, please fork the repository, make your changes, and submit a pull request.

## Author

harshal wasnik

Feel free to contact me at [iharshalwasnik@gmail.com].

