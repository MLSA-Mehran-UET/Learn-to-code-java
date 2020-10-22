/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabuna;

import java.util.Scanner;

public class Fabuna {
    public static void main(String[] args) { 
       int t=0;
       int s=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Series number");
       int  n=sc.nextInt(); 
       for (int i=0; i<n; i++){
           System.out.println(""+t);
           int sum=t+s;
           t=s;
           s=sum;
           
        }
        }}
        
    
    
