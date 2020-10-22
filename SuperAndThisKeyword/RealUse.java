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
public class RealUse {
String name;
String rollno;
String price;
RealUse(String name,String rollno,String price){
    this.name=name;
    this.rollno=rollno;
    this.price=price;
}
}
class ChildRealUse extends RealUse{
 public ChildRealUse(String name, String rollno, String price) {
        
        super(name, rollno, price);
        
        
    }
 void display(){
     System.out.println(name+" "+rollno+" "+price+" ");
 }

}
class PrintDis{
public static void main(String args[]){
ChildRealUse c=new ChildRealUse("Saqib","f16cs08", "600");
c.display();
}
}
