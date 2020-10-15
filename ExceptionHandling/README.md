#Exception

Exception:

An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time, that disrupts the normal flow of the program’s instructions.

There are two type of Exceptions

1)Checked exceptions :

A checked exception is an exception that is checked (notified) by the compiler at compilation-time, these are also called as compile time exceptions. These exceptions cannot simply be ignored, the programmer should take care of (handle) these exceptions.

2)Unchecked exceptions :

 An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.

 why we use exception handling:
 
The core advantage of exception handling is to maintain the normal flow of the application. An exception normally disrupts the normal flow of the application that is why we use exception handling.

 How do we tackel with Exceptions?

 We can use try/catch for that

 Try/Catch:

  A try/catch block is placed around the code that might generate an exception. Code within a try/catch block is referred to as protected code.

  

  The Finally Block:

  The finally block follows a try block or a catch block. A finally block of code always executes, irrespective of occurrence of an Exception.



