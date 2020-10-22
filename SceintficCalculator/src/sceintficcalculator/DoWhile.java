/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in); 
                
 do{
              System.out.println( "Enter which u want 1) food 2) Mobile 3)cloths 4) exit");
             int i=sc.nextInt();
    
 switch( i ){
    case 1:
 System.out.println(" 1)pizza or 2)burger");
 int b=sc.nextInt();
        System.out.println("");
 switch(b)
 {
 }
 break;
 case 2: 
 System.out.println(" Iphone x ");
  System.out.println(" Iphone xs ");
  System.out.println(" Iphone 11 ");
 break;
 case 3:
 System.out.println("Outfitters ");  
 System.out.println(" Levis "); 
   break;
 case 4:
     System.exit( 4);
 }  
 }while (true);
 }}