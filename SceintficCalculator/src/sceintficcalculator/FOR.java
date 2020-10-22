/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FOR;

public class FOR {
    public static void main (String args[]){
        
    for (int i=1; i<=5;i++){
              
               for(int j=5; j>=i; j--){
                   System.out.print(" ");}
       for (int s=1; s<=i; s++){
           System.out.println("*");}
           for (int k=2; k<=i; k++){
               System.out.println("*");
           }
           System.out.println(" ");
    }
      
    }}