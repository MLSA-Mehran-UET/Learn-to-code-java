/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sceintficcalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter first number");

        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println("Enter second number");  
        int b=sc.nextInt();
        int c=i+b;
        System.err.println(c);
        int d=i-b;
        System.err.println(d);
        float e=i/b;
        System.err.println(e);
        int f=i*b;
        System.err.println(f);
    
 
    
    }
    
}
