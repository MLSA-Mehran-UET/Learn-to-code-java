/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunTimePolymorphism;

/**
 *
 * @author Saqib Ghouri
 */
public class Animal {
    void eat(){
        System.out.println("animals eat food");
    }
    
}
class Dog extends Animal{
void eat(){
    System.out.println("Dog eats meat and serial");
}
}
class Cat extends Animal{
void eat(){
    System.out.println("Cat drinks milk");
}
}
class Cow extends Animal{
void eat(){
    System.out.println("Cow eats herbs");
}
}
class TestAnimal{
public static void main(String args[]){
Animal a;//reference  variable a of type class of parent (Animal Class)
a=new Animal();//reference variable a contains object of parent Animal
a.eat();
a=new Dog();//reference variable a contains object of child Dog
a.eat();
a=new Cat();//reference variable a contains object of child Cat
a.eat();
a=new Cow();//reference variable a contains object of child Cow
a.eat();
}
}
