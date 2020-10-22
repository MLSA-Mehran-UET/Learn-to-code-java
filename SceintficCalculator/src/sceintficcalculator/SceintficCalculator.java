/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sceintficcalculator;

import java.util.Scanner;

public class SceintficCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Operation you want to perform (1) sine (2) cos(3) tan ");
        int a=sc.nextInt();
        switch(a){
            case 1:
            System.out.println("Enter value for Sine");
            int b=sc.nextInt();
           System.out.println("Angle of Sine is " + Math.sin(b));
                break;
            case 2: 
            System.out.println("Enter value for Cosine");
            int c=sc.nextInt();
           System.out.println("Angle of cosine is " + Math.cos(c));
                break;
            case 3:
                System.out.println("Enter value for Tan");
            int d=sc.nextInt();
           System.out.println("Angle of tan is " + Math.tan(d));
                break;
            
        default:
        System.out.println(" Invalid Number");
        break;
        }
                
    }  
    }
    

