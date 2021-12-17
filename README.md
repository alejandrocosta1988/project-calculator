# Project Calculator

Project Calculator is a simple project developed by me (_Alejandro Costa_) while studying Java in the end of 2021. The idea is to practice what has been studied in the last month by reading the book **Core Java Volume I - Fundamentals** (11th ed), written by _Cay S. Hortsmann_, and published in 2019.

The aim is to put into practice concepts related to the Object Oriented Programming paradigm, and to practice some fundamentals of the Java programming language, such as the creation of packages, classes, accessors and mutators methods, the structure and syntax of while loops, for loops, and so on.

If you wish to contribute with tips and reviews of the code, I will truly appreciate that. If you wish to read the code for curiosity or also for learning purposes, be welcome! Don't forget to send me a message so we can talk about learning java and other stuff.

## The structure of the Calculator

The Calculator project is structured with five classes: `Calculator`, `Operations`, `Messages`, `CaptureUserInputs`, and `mainApp`. Each of these classes are responsible for specific tasks, that together build up the calculator, as will be seen in the following sections.
Class `Messages` is defined within the package `messages`. Classes `Calculator`, `Operations`, and `CaptureUserInputs` are defined within the package `calculator`.

### The `Calculator` class

The `Calculator` class is defined within the package `calculator`. An instance of `Calculator` is an object that stores result of computations, and performs computations of the four basic arithmetical operations: addition, subtraction, multiplication and division. Each of these basic operations are defined in the class `Operations`, which belong to the same package.

`Calculator` implements methods that increment the stored result of its instances. For example: the `Operations` class defines a method to perform addition of two numbers. The class `Calculator` implements a method that takes the current result of the `Calculator` object together with some other number, and passes both as inputs to the `Operations` method responsible to perform the addition. The result of this computation is stored in the private variable `result`.

#### Variables in the class

##### `result`
A `double` that stores the results of computations. This value is updated after each operation performed by the `Calculator`, but is not visible to the user. To access its value, method `getResult()` should be used. To erase its value, method `eraseResults()` should be used.

#### Methods

##### `getResult()`
An accessor method which returns the current value of `result`.

##### `eraseResults()`
A modifier method which sets the current value of `result` to zero.

##### `add(double x)`
A modifier method which adds `x` to `result`.

##### `subtract(double x)`
A modifier method which subtracts `x` from `result`.

##### `multiply(double x)`
A modifier method which multiplies `result` by `x`.

##### `divide(double x)`
A modifier method which divides `result` by `x`.

### The `Operations` class

The `Operations` class is defined within the package `calculator`. It defines four public methods to be used to perform the basic arithmetical operations: addition, subtraction, multiplication and division. There are no variables defined in the class.

#### Methods

##### `add(double x, double y)`
Returns `x` + `y`.

##### `subtract(double x, double y)`
Returns `x` - `y`.

##### `multiply(double x, double y)`
Returns `x` * `y`.

##### `divide(double x, double y)`
Returns `x` / `y`.

### The `CaptureUserInputs` class

The `CaptureUserInputs` class is defined within the package `calculator`. It defines four public methods devoted to capture inputs from the user.

#### Methods

##### `captureIfUserWantsToQuit(Scanner input)`
Method to capture a string from the user. This method is used in the `mainApp` to check if the input is 'q'. If that is the case, it means that the user wants to quit the program.

##### `captureUserNumber(Scanner input)`
Method to capture a number from the user. This number is used by the `mainApp` to perform a computation.

### The `Messages` class

### The `mainApp` class
