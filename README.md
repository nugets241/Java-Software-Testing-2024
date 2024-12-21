# Java Software Testing 2024

This repository contains a collection of Java programs and unit tests designed to demonstrate various software testing techniques. The project includes multiple exercises and a comprehensive library management system with utility classes.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- Apache Maven (optional, for dependency management)
- JUnit 4.13.2 (included in the project)
- Hamcrest Core 1.3 (included in the project)

### Compilation

To compile the application, navigate to the `project` directory and run the following command:

```sh
javac *.java
```

### Running Tests

This project uses JUnit for unit testing. To run all tests, you can use the provided test suite `TestSuiteAll`. First, compile the test suite with the following command:

```sh
javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar:takari-cpsuite-1.2.7.jar" TestSuiteAll.java
```

Then, run the test suite with the following command:

```sh
java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar:takari-cpsuite-1.2.7.jar" org.junit.runner.JUnitCore TestSuiteAll
```

To run a specific test class, first compile the test class with a command like this (replace `CalculatorTest` with the name of the test class you want to run):

```sh
javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" CalculatorTest.java
```

Then, run the test class with a command like this:

```sh
java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CalculatorTest
```

### Running the Main Program

To run the main program, compile the `Main.java` file and execute it:

```sh
javac Main.java
java Main
```

## Project Overview

### Basic Exercises

The `basic` directory contains various Java programs that demonstrate fundamental programming concepts and algorithms. Each subdirectory corresponds to a specific exercise.

### Documentation

The `doc` directory contains a report that documents the testing part of the book "Patton, R. 2006. Software Testing, 2nd Edition. Sams Publishing."

### Library Management System

The `project` directory contains a comprehensive library management system with the following classes:

- `Book`: Represents a book in the library.
- `User`: Represents a user of the library.
- `Library`: Manages the collection of books.
- `Transaction`: Represents a borrowing transaction.
- `LibraryManagement`: Manages users and transactions.
- `Calculator`: Provides basic arithmetic operations.
- `ArrayOperations`: Provides operations on arrays.
- `StringOperations`: Provides operations on strings.
- `DateOperations`: Provides operations on dates.
- `FileOperations`: Provides operations on files.

### Unit Tests

The project includes unit tests for each class, located in the `project` directory. The tests are implemented using JUnit and can be run using the provided test suite `TestSuiteAll`.

## Additional Information

This project was created as part of a software testing course. It demonstrates various testing techniques and best practices in Java. The exercises in the `basic` directory are solutions to programming exercises, while the `project` directory contains the main project with comprehensive functionality and testing.

Feel free to explore the code and run the tests to see how everything works. If you have any questions or suggestions, please feel free to reach out.