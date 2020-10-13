# Inheritance in Java

WHAT IS INHERITANCE
Inheritance can be defined as the process where one class inherits the properties(methods and fields) of another.
The class which inherits is known as Sub class(derived class,child class) and the class which is inherited is called super-class(base class,parent class)


TYPES OF INHERITANCE:

There are three kind of inheritence
Single Inheritance
Multilevel Inheritance
Heirarchical Inheritance

Single Inheritance : 
Single inheritance can be defined as a derived class to inherit the basic methods (data members and variables) and behavior from a superclass. It's a basic is-a relationship concept exists here. Basically, java only uses a single inheritance as a subclass cannot extend more superclass

Multiple Inheritance: 
The Java programming language supports multiple inheritance of type, which is the ability of a class to implement more than one interface. .As with multiple inheritance of implementation, a class can inherit different implementations of a method defined (as default or static) in the interfaces that it extends.

Heirarchical Inheritance: 
when a class has more than one child classes (sub classes) or in other words more than one child classes have the same parent class then this type of inheritance is known as hierarchical inheritance.

KEYWORD FOR USE:
extends is the keyword used to inherit the properties of a class

WHY WE USE INTERITANCE:
 Inheritance allows us to reuse of code, it improves reusability in your java application.
 For Method Overriding (so runtime polymorphism can be achieved).