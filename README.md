# Project Calculator

Project Calculator is a simple project developed by me (_Alejandro Costa_) while studying Java in the end of 2021. The idea is to practice what has been studied in the last month by reading the book **Core Java Volume I - Fundamentals** (11th ed), written by _Cay S. Hortsmann_, and published in 2019.

The aim is to put into practice concepts related to the Object Oriented Programming paradigm, and to practice some fundamentals of the Java programming language, such as the creation of packages, classes, accessors and mutators methods, the structure and syntax of while loops, for loops, and so on.

If you wish to contribute with tips and reviews of the code, I will truly appreciate that. If you wish to read the code for curiosity or also for learning purposes, be welcome! Don't forget to send me a message so we can talk about learning java and other stuff.

## The structure of the Calculator

The Calculator project is structured with four classes: `Calculator`, `Operations`, `Messages`, and `mainApp`. Each of these classes are responsible for specific tasks, that together build up the calculator, as will be seen in the following sections.
Class `Messages`is defined within the package `messages`. Classes `Calculator` and `Operations` are defined within the package `calculator`.

### The `Calculator` class

The `Calculator` class is defined within the package `calculator`. An instance of `Calculator` is an object that stores result of computations, and performs computations of the four basic arithmetical operations: addition, subtraction, multiplication and division. Each of these basic operations are defined in the class `Operations`, which belong to the same package.

`Calculator` implements methods that increment the stored result of its instances. For example: the `Operations` class defines a method to perform addition of two numbers. The class `Calculator` implements a method that takes the current result of the `Calculator` object together with some other number, and passes both as inputs to the `Operations` method responsible to perform the addition. The result of this computation is stored in the private variable `result`.


### The `Operations` class

### The `Messages` class

### The `mainApp` class
