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
//Runtime Polymorphism using data set instead of methods
public class Food {
    int foodPrize=100;
    
}
class Apple extends Food
{
int applePrize=20;
int foodPrize=150;
    
}
class Banana extends Food{
 int bananaPrize=30;
}
class Cherry extends Food{
int cherryPrize=50;
}
class TestFood{
public static void main(String args[]){
Food f;
f=new Apple();
    System.out.println(" "+f.foodPrize); //Here it will show comppile time error because, unlike method data can not be overridden
//hence every time  a reference variable of parent class stores any object of child class, it will always call data from Parent class.
Apple a=new Apple();
    System.out.println(" "+a.applePrize);//here it will print data from child apple
}

}
