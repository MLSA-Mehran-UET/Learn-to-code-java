# Variable and Data types

# Variable

Variable is name of reserved area allocated in memory. In other words, it is a name of memory location. It is a combination of "vary + able" that means its value can be changed.

```java
int data=50; //Here data is variable 
```

# Types of Variables

There are three types of variables in Java:

- Local Variable

A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
A local variable cannot be defined with "static" keyword.

- Instance Variable

A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.
It is called instance variable because its value is instance specific and is not shared among instances.

- Static variable

A variable which is declared as static is called static variable. It cannot be local. You can create a single copy of static variable and share among all the instances of the class. Memory allocation for static variable happens only once when the class is loaded in the memory.

```java
class A{  
int data=50;//instance variable  
static int m=100;//static variable  
void method(){  
int n=90;//local variable  
}  
}//end of class 
``` 

# Data Types

Java is a statically-typed language. This means that all variables must be declared before they can be used.

```java
int speed;
```

Here, speed is a variable, and the data type of the variable is int. The int data type determines that the speed variable can only contain integers.

In simple terms, a variable's data type determines the values a variable can store. There are 8 data types predefined in Java programming language, known as primitive data types.

- boolean

The boolean data type has two possible values, either true or false.
Default value: false.
They are usually used for true/false conditions.

```java
class BooleanExample {
    public static void main(String[] args) {
    	
        boolean flag = true;
        System.out.println(flag);
    }
}
```

- byte

The byte data type can have values from -128 to 127 (8-bit signed two's complement integer).
It's used instead of int or other integer data types to save memory if it's certain that the value of a variable will be within [-128, 127].
Default value: 0

```java
class ByteExample {
    public static void main(String[] args) {

        byte range;
        range = 124;
        System.out.println(range);
    }
}
```

- short

The short data type can have values from -32768 to 32767 (16-bit signed two's complement integer).
It's used instead of other integer data types to save memory if it's certain that the value of the variable will be within [-32768, 32767].
Default value: 0

```java
class ShortExample {
    public static void main(String[] args) {
    	
        short temperature;
        temperature = -200;
        System.out.println(temperature);
    }
}
```

- int

The int data type can have values from -231 to 231-1 (32-bit signed two's complement integer).
If you are using Java 8 or later, you can use unsigned 32-bit integer with a minimum value of 0 and a maximum value of 232-1. If you are interested in learning more about it, visit: How to use the unsigned integer in java 8?
Default value: 0

```java
class IntExample {
    public static void main(String[] args) {
    	
        int range = -4250000;
        System.out.println(range);
    }
}
```

- long

The long data type can have values from -263 to 263-1 (64-bit signed two's complement integer).
If you are using Java 8 or later, you can use unsigned 64-bit integer with a minimum value of 0 and a maximum value of 264-1.
Default value: 0

```java
class LongExample {
    public static void main(String[] args) {
    	
        long range = -42332200000L;
        System.out.println(range);
    }
}```

- double

The double data type is a double-precision 64-bit floating-point.
It should never be used for precise values such as currency.
Default value: 0.0 (0.0d)

```java
class DoubleExample {
    public static void main(String[] args) {
    	
        double number = -42.3;
        System.out.println(number);
    }
}
```

- float

The float data type is a single-precision 32-bit floating-point. Learn more about single-precision and double-precision floating-point if you are interested.
It should never be used for precise values such as currency.
Default value: 0.0 (0.0f)

```java
class FloatExample {
    public static void main(String[] args) {
    	
        float number = -42.3f;
        System.out.println(number);
    }
}
```

- char

It's a 16-bit Unicode character.
The minimum value of the char data type is '\u0000' (0). The maximum value of the char data type is '\uffff'.
Default value: '\u0000'

```java
class CharExample {
    public static void main(String[] args) {
    	
        char letter = '\u0051';
        System.out.println(letter);
    }
}
```

