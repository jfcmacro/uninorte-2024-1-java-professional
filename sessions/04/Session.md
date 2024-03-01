# Session 23/02/2024

Agenda:

* Object-Oriented Thinking Project
* Design Patterns Task
* Test-Sorting
* Test-Quadratic-Equation
* Sorting App Project
* Test-Factorial
* Java Threads
* Synchronization Primitives

---

# Object-Oriented Thinking Project

Select from the following options the system for which the class hierarchy will be developed.

1. Table or Card Games simulations:
   - Chess
   - Checkers
   - Narde
   - Go
   - ...
2. Publicly available devices/services:
   - a public printer/copier at a university
   - a public coffee/vending machine at a
   - university/dormitory/hospital/street
   - a public phone booth on a street
   - ...

---

# Object-Oriented Thinking Project (2)

1. Scheduling/Management systems:
   - Dormitory accommodation management
   - Zoo animals' nutrition management
   - Robotized warehouse management
   - ...

---

# Object-Oriented Thinking Project (3)

*Please read carefully and do the following:*

1. Describe the requirements for the chosen system: functional and non-functional.
2. Design use cases for the system based on the requirements.
3. Identify objects, classes, and relationships in the system. Optionally, design CRC cards.
4. Design class diagrams picturing classes, their attributes, and relations in the system.
5. Optionally, convert diagrams into Java code.
6. Send the following results: requirements, use cases, CRCs (optional), class diagrams, Java code of the classes.


---

# Design Patterns Task

* Decorator
* Factory
* Iterator
* Observer
* Strategy

---

# Test-Sorting

This exercise is about getting familiar with unit testing and JUnit 4.12 in particular.

1. Design and code a simple sorting method in the [Sorting](src/main/java/com/epam/rd/autotasks/Sorting.java) class.
   Here are some details:

- the method sorts an integer array in ascending order
- an integer array is passed as a parameter to the method
- when given array is null, the method must throw an IllegalArgumentException.


2. Complete the test methods in [SortingTest](src/main/java/com/epam/rd/autotasks/SortingTest.java) class.
   Use assertions to check your sorting methods. Be sure to use @Test annotation parameters to catch expected exceptions.

To pass the exercise, your tests must correctly detect flaws of some other sorting method implementations.
There are special tests in [SortingTestsTest](src/test/java/com/epam/rd/autotasks/SortingTestsTest.java) class that apply your tests to your and some of such bad implementations.
Your sorting method must pass your tests, and others must fail in some cases.


---

# Test-Quadratic Equation

This exercise is about getting familiar with parametrized unit testing and JUnit 4.12 approach in particular.

1. Design and code a `solve` method in the [QuadraticEquation](src/main/java/com/epam/rd/autotasks/QuadraticEquation.java) class.
   Here are some details:

- the method must solve a quadratic equation specified by three coefficients given as parameters: a,b,c.
- first parameter `a` might not be zero. If it is the case, throw an IllegalArgumentException.
- the `solve` method returns a string in of three formats:
  - `x1 x2` (two roots in any order separated by space) if there are two roots,
  - `x1` (just the value of the root) if there is the only root,
  - `no roots` (just a string value "no roots") if there is no root.

2. Complete the test classes:

- [QuadraticEquationNoRootsCasesTesting](src/main/java/com/epam/rd/autotasks/QuadraticEquationNoRootsCasesTesting.java)
- [QuadraticEquationSingleRootCasesTesting](src/main/java/com/epam/rd/autotasks/QuadraticEquationSingleRootCasesTesting.java)
- [QuadraticEquationTwoRootsCasesTesting](src/main/java/com/epam/rd/autotasks/QuadraticEquationTwoRootsCasesTesting.java)
- [QuadraticEquationZeroACasesTesting](src/main/java/com/epam/rd/autotasks/QuadraticEquationZeroACasesTesting.java)

---

# Test-Quadratic Equation (2)

Please consider that these are parameterized test classes, so take that into account. You have to provide at least 4 test cases for each class.
You are not allowed to change signature of their constructors.

To pass the exercise, your tests must correctly detect flaws of some other sorting method implementations.
There are special tests in several classes that apply your tests to your and some of such ("bad") implementations:

- [DefaultQuadraticEquationTestingTest](src/test/java/com/epam/rd/autotasks/DefaultQuadraticEquationTestingTest.java)
- [ParamCarefulIncapableQuadraticEquationTestingTest](src/test/java/com/epam/rd/autotasks/ParamCarefulIncapableQuadraticEquationTestingTest.java)
- [ParamCarefulTwoRootsReversedOrderQuadraticEquationTestingTest](src/test/java/com/epam/rd/autotasks/ParamCarefulTwoRootsReversedOrderQuadraticEquationTestingTest.java)
- [ParamCarelessSingleRootOnlyQuadraticEquationTestingTest](src/test/java/com/epam/rd/autotasks/ParamCarelessSingleRootOnlyQuadraticEquationTestingTest.java)
- [ParamCarelessTwoRootsOnlyQuadraticEquationTestingTest](src/test/java/com/epam/rd/autotasks/ParamCarelessTwoRootsOnlyQuadraticEquationTestingTest.java)

Your solution method must pass your tests while other implementations must fail your test in some cases.

Hint: [Quadratic formula reference](https://en.wikipedia.org/wiki/Quadratic_formula)

---

# Sorting App Project

Complete the task to get a practical grasp of Apache Maven and its major features. You will need to create a Maven-based project – Sorting App. It is a small Java application that takes up to ten command-line arguments as integer values, sorts them in the ascending order, and then prints them into standard output.

It will take you about **3 hours** to complete the task.

Please be aware that this task status is **mandatory**.

*Please read carefully and do the following:*

1. Create a Maven project and specify its GAV settings, encoding, language level, etc.
2. Write the code implementing the app specification.
3. Configure the Maven project to build a runnable jar containing application and its dependencies.
4. Share the project using a public GitLab repository.
5. Submit a link to your repository.

---

# Test Factorial

This exercise is about getting familiar with unit testing and JUnit 5 approach in particular.


1. Design and code a `factorial` method in
   the [Factorial](src/main/java/com/epam/rd/autotasks/Factorial.java) class. Here are some details:

- the method takes a String as a parameter, transforms it to an integer value and counts its factorial.
- The method returns a result as a String.
- String parameter `n` must represent a non-negative integer number. If it does not, throw an IllegalArgumentException.

2. Complete the test classes:

- [FactorialBadInputTesting](src/main/java/com/epam/rd/autotasks/FactorialBadInputTesting.java)\
  There are four empty methods that you must complete:
    - `testNullInput` - test a null input cases
    - `testNegativeInput` - test a negative number input cases
    - `testFractionalInput` - test a fractional cases
    - `testNonDigitalInput` - test a non-digit cases
- [FactorialCsvParametrizedTesting](src/main/java/com/epam/rd/autotasks/FactorialCsvParametrizedTesting.java)\
  it is a parameterized test, that takes arguments from the [csvCases.csv](src/main/resources/csvCases.csv) file. Do
  not change the csv file, only implement the method.
- [FactorialMethodSourceParametrizedTesting](src/main/java/com/epam/rd/autotasks/FactorialMethodSourceParametrizedTesting.java)\
  it is a parameterized test, that takes arguments from the `testCases` method. You must complete the test method and
  introduce the `testCases` method, that provides following cases:
    - "1", "1"
    - "2", "2"
    - "5", "120"
- [FactorialRegularInputTesting](src/main/java/com/epam/rd/autotasks/FactorialRegularInputTesting.java)\
  it is a test class where you can add regular test cases. Consider covering cases that are not present in other test
  classes.

---

# Test Factorial (2)

To pass the exercise, your tests must correctly detect flaws of some other implementations. There are special
tests in several classes that apply your tests to your and other problematic("bad") implementations:

- [FactorialTestingsTest](src/test/java/com/epam/rd/autotasks/FactorialTestingsTest.java)
- [LazyFactorialTestingsTest](src/test/java/com/epam/rd/autotasks/LazyFactorialTestingsTest.java)
- [WrongOperationConcatIntFactorialTestingsTest](src/test/java/com/epam/rd/autotasks/WrongOperationConcatIntFactorialTestingsTest.java)
- [WrongOperationSumIntFactorialTestingsTest](src/test/java/com/epam/rd/autotasks/WrongOperationSumIntFactorialTestingsTest.java)

Your solution method must pass your tests while other implementation must fail your tests in some cases.

Also, there is one more secret test class that you do not have access to. It will be applied to your solution once you
submit it to Autocode. So, consider the variety of possible cases.

Hint: [Factorial reference](https://en.wikipedia.org/wiki/Factorial)

---

# Suffixing App

The purpose of this exercise is to train you to design and package Java Applications, basing only on functional requirements.

To complete the exercise you have to design an application and package it to a runnable jar archive.
The name of the application is Suffixing App, its purpose is to rename files, adding a suffix to their names.
Once you have designed it, place the jar into [`src/main/resources`](src/main/resources) directory.
The name of the archive has to `suffixing.jar`. The archive must be runnable - it has to contain manifest with specified `Main-Class`.

---

# Suffixing App (2)

## Suffixing App Specification

Pay attention to the specification of the app:

1. The application takes a one obligatory argument - the path to a config file.
2. Config file format is `properties` (you may benefit from using `java.util.Properties` class) and contains three fields:
   - `mode` - renaming mode. Valid values (*case-insensitive*):
     - `copy` - keep the source file
     - `move` - remove the source file 
   - `suffix` - the suffix, that mut be added to the file name (*before* file extension).
   - `files` - a list of files for suffixing. File paths are separated with column`:`.
3. The application must use a Logger (from `java.util.logging`) to log messages:
   - if mode from config is not recognized, log `Mode is not recognized: <mod_input_value>` at SEVERE level and stop the execution.\
     Example: `Mode is not recognized: copi`
   - if suffix is not set, log `No suffix is configured` at SEVERE level and stop the execution.
   - if files are not specified, log `No files are configured to be copied/moved` at WARNING level and stop the execution.
   - if one of the specified files does not exist, log `No such file: <file-path>` at SEVERE level, but do not stop the processing of other files. Note that a file path in the message must contain not backslashes but *forward slashes* ('/') to separate the path parts. 
     Example: `No such file: src/test/resources/no-such-file.txt`
   - When moving a file, log `<source-file> -> <destination-file>` at INFO level.\
     Note, that file path in the message must contain  not backslashes but *forward slashes* (`/`) to separate path parts, not backslashes.\
     Example: `src/test/resources/file.txt -> src/test/resources/file-suffix.txt`      
   - When moving a file, log `<source-file> => <destination-file>` at INFO level.\
     Note that file path in the message must contain  not backslashes but *forward slashes* (`/`) to separate path parts, not backslashes.\
     Example: `src/test/resources/file.txt => src/test/resources/file-suffix.txt`      

---

# Java Threads

* `Thread` class
* `Runnable`
* Implementation

---

# Java Synchronization Primitives

* `synchronized` methods
* `synchronized` blocks
* `wait` methods
* `notify` and `notifyAll` methos

