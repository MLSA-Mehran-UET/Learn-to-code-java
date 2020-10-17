/*Polymorphism means "many forms", and it occurs when we have many 
classes that are related to each other by inheritance.*/
public class Animal {

  public static void main(String[] args) {
    Pets pets = new Pets(); //Creates an object of Pets class.
    Cat cat = new Cat(); //Creates an object of Cat class.
    Dog dog = new Dog(); //Creates an object of Dog class.
    pets.name(); //Will print the name method of Pets.java class.
    cat.name(); //Will print the name method of Cat.java class.
    dog.name(); //Will print the name method of Dog.java class.
  }
}
