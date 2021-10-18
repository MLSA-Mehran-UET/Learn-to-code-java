/**
 * This is the abstract class - Shape.
 * Shape class cannot be instantiated because :
 *  - It contains some methods (abstract ) without implementations.
 *  - No implementations means the behavior is undetermined if we make an object of this class
 * Although abstract, Shape class can hold concrete methods (i.e. getName) as well.
 */
abstract class Shape {
   String name = "";

   Shape(String shapeName) {
      name = shapeName;
   }

   // This is a concrete method (has its implementation)
   String getName() {
      return name;
   }

   
   /**
    * This is an abstract method (no implementation provided).
    * The reason for not providing an implementation here is, different shapes have different formulas to calculate area
    */
   abstract int getArea();
}

class Rectangle extends Shape {
   // Additional attributes of a Rectangle
   int length = 0;
   int width = 0;

   Rectangle(String shapeName, int length, int width) {
      super(shapeName);
      this.length = length;
      this.width = width;
   }

   // concrete implementation of getting Rectangle's area
   int getArea() {
      return length*width;
   }
}

class Circle extends Shape {
   // Additional attributes of a Circle
   int radius = 0;

   Circle(String shapeName, int radius) {
      super(shapeName);
      this.radius = radius;
   }

   // concrete implementation of getting Circle's area. pi = 3.14
   int getArea() {
      return (int) (3.14*radius*radius);
   }
}

public class ShapeAbstraction {
   public static void main(String args[]) {

      // Create an instance of Rectangle class with name: RectangleObject, length: 1 and width: 2
      Rectangle rectangle = new Rectangle("RectangleObject", 1, 2); 
      System.out.println("Shape name is " + rectangle.getName()); // Shape name is RectangleObject
      System.out.println("Shape area is " + rectangle.getArea()); // Shape area is 2

       // Create an instance of Circle class with name: CircleObject, radius: 2
      Circle circle = new Circle( "CircleObject", 2 ); 
      System.out.println("Shape name is " + circle.getName()); // Shape name is CircleObject
      System.out.println("Shape area is " + circle.getArea()); // Shape area is 12
      
   }
}

