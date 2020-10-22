/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CovarianceReturnType;

/**
 *
 * @author Saqib Ghouri
 */
public class SuperClass {
    SuperClass get(){return this;
}
    void message(){
        System.out.println("CovarianceReturnType.SuperClass.message()");}
}
class SubClass extends SuperClass{
    SubClass get(){
    return this;
    }
void message(){
    System.out.println("CovarianceReturnType.SubClass.message()");
}
public static void main(String args[]){
new SubClass().get().message();
new SuperClass().get().message();


}
}
