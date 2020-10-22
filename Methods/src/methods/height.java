/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author Sameer
 */
public class height {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
 System.out.println("Enter lentgh"); 
 int a=sc.nextInt();
 System.out.println("Enter height"); 
 int b=sc.nextInt();
 System.out.println("Enter width"); 
 int c=sc.nextInt();
 width w=new width();
 w.height(c);
 w.lengthh(a);
 w.widthh(b);
 w.abc(a, b, c);
            
}
}