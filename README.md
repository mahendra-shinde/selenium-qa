# Selenium QA

This repository contains multiple Java projects designed to teach and demonstrate various Java programming concepts, Selenium automation, and testing frameworks like JUnit. Each project focuses on specific topics and provides practical examples.

## Projects Overview

### 1. **demo1**
- **Purpose**: Introduces Java basics and object-oriented programming.
- **Key Concepts**:
  - Primitive data types and variables.
  - String manipulation.
  - Encapsulation, inheritance, and polymorphism.

### 2. **demo2**
- **Purpose**: Demonstrates object-oriented programming and date validation.
- **Key Concepts**:
  - Classes and inheritance (e.g., `Account`, `SavingAccount`).
  - Date validation logic.
  - Leap year calculation.

### 3. **demo3**
- **Purpose**: Demonstrates basic Java programming concepts.
- **Key Concepts**:
  - Command-line arguments.
  - Exception handling with `try-catch`.
  - Basic arithmetic operations.

### 4. **demo4**
- **Purpose**: Demonstrates Java collections and loops.
- **Key Concepts**:
  - Using `List`, `Set`, and `Map` collections.
  - Enhanced for-loops and traditional loops.
  - Object-oriented programming with custom classes like `Account`.

### 5. **demo5**
- **Purpose**: Placeholder project for Selenium and JUnit integration.
- **Key Concepts**:
  - Maven project setup for Selenium and JUnit dependencies.

### 6. **selenium-demo1**
- **Purpose**: Demonstrates Selenium WebDriver usage for browser automation.
- **Key Concepts**:
  - WebDriver setup and teardown.
  - Locating web elements using various strategies (e.g., `By`, `RelativeLocator`).
  - Automating browser interactions like form filling and button clicks.

### 7. **unit-test-demo**
- **Purpose**: Demonstrates unit testing using JUnit.
- **Key Concepts**:
  - Writing test cases with JUnit.
  - Assertions for validating test results.
  - Testing business logic (e.g., `InterestCalculator`).

### 8. **extdata-demo**
- **Purpose**: Demonstrates parameterized testing with external data sources.
- **Key Concepts**:
  - Reading test data from external files (e.g., CSV, Excel).
  - Parameterized tests using JUnit's `@MethodSource` and `@CsvFileSource`.
  - Utility methods for reading Excel files with Apache POI.

## Concepts Used in Source Code Files

### **demo1**
- **`Greeting.java`**: Introduces primitive data types and variables.
- **`Customer.java`**: Demonstrates encapsulation with getter and setter methods.
- **`OverseasCustomer.java`**: Extends `Customer` to demonstrate inheritance.
- **`Main1.java`**: Demonstrates polymorphism.
- **`StringDemo.java`**: Explores string manipulation methods.
- **`ClassDemo.java`**: Demonstrates object creation and method invocation.

### **demo2**
- **`Account.java`**: Represents a bank account with basic operations.
- **`SavingAccount.java`**: Extends `Account` to include interest rate.
- **`Date.java`**: Represents a date with day, month, and year.
- **`MainDate.java`**: Validates date objects and leap years.
- **`Main2.java`**: Checks leap years and demonstrates conditional statements.
- **`DemoOperators.java`**: Demonstrates arithmetic, relational, and logical operators.

### **demo3**
- **`CalcMain.java`**: Demonstrates command-line arguments and exception handling.

### **demo4**
- **`LoopDemo1.java`**: Demonstrates `while` and `do-while` loops.
- **`LoopDemo2.java`**: Demonstrates enhanced for-loops.
- **`LoopDemo3.java`**: Iterates over an array of `Account` objects.
- **`CollectionDemo1.java`**: Demonstrates `List` collections.
- **`CollectionDemo2.java`**: Compares `List` and `Set` collections.
- **`CollectionDemo3.java`**: Demonstrates `Map` collections.
- **`Account.java`**: Represents a bank account with fields and methods.

### **demo5**
- **Purpose**: Placeholder project for Selenium and JUnit integration.

### **selenium-demo1**
- **`TestLogin.java`**: Automates login functionality using Selenium.
- **`Test1.java`**: Demonstrates headless browser testing and element interactions.
- **`InputDemo.java`**: Automates form filling and submission.
- **`Basic4.java`**: Captures screenshots of web elements.
- **`Basic3.java`**: Extracts and prints table data from a webpage.
- **`Basic02.java`**: Validates webpage title and counts `h1` tags.
- **`Basic01.java`**: Demonstrates launching multiple browser instances.

### **unit-test-demo**
- **`InterestCalculatorTest.java`**: Demonstrates JUnit test cases for validating the `InterestCalculator` class.
- **`InterestCalculator.java`**: Implements business logic for calculating interest with validation.

### **extdata-demo**
- **`ExtDataTest2.java`**: Parameterized testing with external data sources.
- **`ExtDataTest.java`**: Iterates through credentials from an Excel file for login testing.
- **`ExcelUtil.java`**: Utility class for reading Excel files.

## How to Use
1. Clone the repository.
2. Import the desired project into your IDE (e.g., Eclipse, IntelliJ).
3. Build the project using Maven.
4. Run the Java files or test cases as needed.

## Prerequisites
- Java 11 or higher.
- Maven for dependency management.
- Selenium WebDriver for browser automation.
- Apache POI for Excel file handling (used in `extdata-demo`).

## Learning Outcomes
- Understand Java programming concepts.
- Learn Selenium automation for web testing.
- Explore JUnit for unit and parameterized testing.
- Gain hands-on experience with Maven project setup.