# Library Management and Utilities

This is a simple library management system implemented in Java. It includes classes for books, users, transactions, and the library itself, as well as a suite of utility classes and a suite of unit tests for each class.

## Compilation

To compile the application, navigate to the directory containing the source files and run the following command:

javac *.java

This will compile all the .java files in the current directory.

## Running Tests

This project uses JUnit for unit testing. To run all tests, you can use the provided test suite TestSuiteAll. First, compile the test suite with the following command:

javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar:takari-cpsuite-1.2.7.jar" TestSuiteAll.java

Then, run the test suite with the following command:

java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar:takari-cpsuite-1.2.7.jar" org.junit.runner.JUnitCore TestSuiteAll

To run a specific test class, first compile the test class with a command like this (replace CalculatorTest with the name of the test class you want to run):

javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" CalculatorTest.java

Then, run the test class with a command like this:

java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CalculatorTest

## Note

Please make sure to replace the classpath in the commands with the actual path to the JUnit and Hamcrest jars on your system.
