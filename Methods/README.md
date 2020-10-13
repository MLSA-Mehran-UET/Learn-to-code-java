# Java Methods

In Java, a function or a method must be defined before it is used anywhere in the program. The general form of a function/method is given below:

```java
[access-specifier] [modifier] return-type function-name (parameter list)
{
       body of the function/method;
}
```

# Access specifier

Access specifier is used to determining the type of access to the method. It can be either public or protected or private or default. It is optional to use an access specifier while defining a method.

# Modifier

It can be static, final, synchronized, transient, volatile. A static method means it is called through an instance or object of a class but rather through the class itself. A final method means that the functionality defined inside this method can never be changed. Using a modifier is not compulsory.

# Return-Type

It specifies the type of value that the return statement of the function returns. It may be any valid Java data type. If no value is being returned, we use the return type as void.

# Function-name

The name of the function should be a valid Java identifier. The naming conventions generally followed for method names are:

- It should be meaningful
- It should begin with a lowercase letter. For names having multiple names, we use the camelCase naming convention.

**For example:**

- printReportCard
- getMarks

The method name should generally begin with a verb followed by one or more nouns.

**For example:**

- readData
- findFile
- calculateInterestAmount

# Parameter list

The parameter list is a comma-separated list of variables of a function referred to as arguments or parameters. A function may be without any parameters and in this case, the parameter list is empty.

# Method Body

The body of the Java method should be enclosed within curly braces{}. All the code for a method is written in its body within braces. All the operations and tasks are performed inside a Java method.
