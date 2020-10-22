/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

public class getSetter {
    
    public static void main(String[] args) {
       test a = new test();
   Scanner sc =new Scanner (System.in);   
        System.out.println("Enter your name");
        String s=sc.next();
        System.out.println("enter your roll number");
        int g=sc.nextInt();
        System.out.println("insert value in decimal");
        double f=sc.nextDouble();
        System.out.println("enter your age");
        int d=sc.nextInt();
a.setI(g);
a.setS(s);
a.setF(f);
a.setD(d);
        System.out.println("your name is "+a.getS());
        System.out.println("your roll number is "+a.getI());
        System.out.println("your decimal value is "+a.getF());
        System.out.println("your age is " +a.getD());
    }
}

  