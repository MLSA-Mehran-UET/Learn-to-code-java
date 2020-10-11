# Hello World

<p align="center">
  <img src="https://miro.medium.com/max/512/1*jB76MLZjiNhGSQQvxm7LSQ.gif">
</p>

Often the very first program written by someone who is learning to code, HelloWorld.java is a simple Java program that displays the message ```Hello World``` on the screen.

In Java, every line of code that can actually run needs to be inside a class.

The line:
```java 
public class Helloworld{
...
}
``` 
declares that a new class with the name ```Helloworld``` is being defined that is **public**, meaning that any other class can access it.

The next line
```java 
public static void main(String[] args){
...
}
```
declares the main method and every application in Java must contain a main method.

This line of code:
```java
System.out.println("Hello World");
```

 which occurs inside the main method, uses the built-in println() method to print the string ```Hello World``` that is inside quotation marks on the screen.
