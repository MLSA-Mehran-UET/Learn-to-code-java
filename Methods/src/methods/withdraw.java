/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;

public class withdraw {
   void withdraw(int r){
  int i = 5000; 
 // Scanner sc=new Scanner (System.in);
  
       System.out.println("Enter amount to withdraw");
    //   int a=sc.nextInt();
    
        if (r>i)
        {
            System.out.println("your amount is unsufficiant");
        }
        else if (r<=i)
        {      
                     int b=r-i;
        System.out.println("After withdraw your amount is " + b);
        }
        else  
        {
           System.out.println("insufficent amount");
        }
   
}
}