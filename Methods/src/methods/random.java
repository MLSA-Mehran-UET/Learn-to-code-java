/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;



/**
 *
 * @author khan
 */
public class random{
     public static void main(String[] args) {
    int max=1000;
    int min=1;
 System.out.println("your random values between " + min +" to " + max+" is " );
 int ran=(int)(Math.random()* max+min);
 System.out.println(ran);
 
     }
    
}
