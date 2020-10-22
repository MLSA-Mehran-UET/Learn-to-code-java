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
public class SuperClass {
    public void eat(){
        System.out.println("let eat as parent");
    }
    
}
class ChildClass extends SuperClass
{
public void eat(){
    System.out.println("Let's eat as child");
    super.eat();
}

}
class Test{
public static void main(String args[]){
ChildClass cl=new ChildClass();
cl.eat();


}
}