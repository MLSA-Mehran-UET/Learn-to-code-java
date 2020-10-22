/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperAndThisKeyword;

/**
 *
 * @author Saqib Ghouri
 */
public class Animal {
    String color="white";
    
}
class Dog extends Animal{
String color="Black";
public void printColor(){
    String color="transparent";
    System.out.println(this.color+"\n "+color+"\n"+super.color);
}
}
class PrintColor{
public static void main(String args[]){
Dog d=new Dog();
d.printColor();
}
}

