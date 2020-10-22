/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sceintficcalculator;

import java.util.Scanner;

/**
 *
 * @author Sameer
 */
public class DoubletoInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Enter any value which u want to convert");
        Scanner sc=new Scanner(System.in);
        
        
        double d= sc.nextDouble();
        int s= (int) d;
        System.out.println(""+s);
    }
    
}
