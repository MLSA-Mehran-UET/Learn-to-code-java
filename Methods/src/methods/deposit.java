/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;

public class deposit extends withdraw{
/*    Scanner sc=new Scanner(System.in);
    void deposit(int r,String name, int pin){
     System.out.println("enter amount u want to deposit");
   //  int a=sc.nextInt();
 //   int e=a+5000;
 int i = 5000+r;
 
 if(name.equals("sameer")){
     System.out.println("welcome sameer");
 }
 
   System.out.println("your amount is "+ i);

}
*/
    
    public void accountdetails(int amount, String name ,int Pin){
    
        if(name.equals("Sameer")){
         System.out.println("welcome sameer");
        }
        else if(name.equals("Majd")){
            System.out.println("Welcome majd");
        }else {
            System.out.println("invalid account");
        }
        
    }
    
    
}