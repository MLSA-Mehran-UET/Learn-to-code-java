# Java Class and Objects

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A ```Class``` is like an object constructor, or a "blueprint" for creating objects.

# Attributes and Behaviors

Every class contains ```attributes``` and ```behaviors```. Attributes are the characteristics of the class that help to distinguish it from other classes. Behaviors are the tasks that an object performs. A person's attributes, for example, include their age, name, and height, while their behaviors include the fact that a person can speak, run, walk, and eat.

To create a class, use the keyword ```class```:

Example:

```java
class Lamp {
    boolean isOn;

    void turnOn() {
        // initialize variable with value true
        isOn = true;
        System.out.println("Light on? " + isOn);

    }

    void turnOff() {
        // initialize variable with value false
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}


class Main {
    public static void main(String[] args) {
  
        // create objects l1 and l2
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();
  
        // call methods turnOn() and turnOff()
        l1.turnOn();
        l2.turnOff();
    }
 ```

In above example a class named Lamp is created, having one attribute and two behaviors.
