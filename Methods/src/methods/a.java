/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

public class a extends deposit{
    public static void main(String[] args) {
       a c =new a();
    Scanner sc =new Scanner (System.in);
    System.out.println("select operation u want to perform");
    System.out.println("1) withdraw 2)deposit");
    int r=sc.nextInt();
    switch(r){
        case 1:
            int m= sc.nextInt();
    c.withdraw(m);
    break;
        case 2:
//            System.out.println("please  enter amount to deposit");
//            int i = sc.nextInt();
            System.out.println("please enter name");
            String name = sc.next();
                  //  System.out.println("please enter PIN");
                  //  int p = sc.nextInt();
 //   c.deposit(i,name,p);
                    c.accountdetails(0, name, 0);
    break;
        
    }}
}
