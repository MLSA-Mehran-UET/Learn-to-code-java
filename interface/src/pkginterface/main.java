/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.util.Scanner;

/**
 *
 * @author Sameer
 */
public class main extends areaMathmain {
    public static void main(String[] args) {
        main z=new main();
    
    Scanner sc=new Scanner(System.in);
        System.out.println("1)for Area and Volume 2)for addition subtraction 3)exit");
        int x=sc.nextInt();
       // while(true){
switch(x){
    case 1:{
        System.out.println("Enter length");
        int length=sc.nextInt();
         System.out.println("Enter width");
        int width=sc.nextInt();
         System.out.println("Enter height");
        int height=sc.nextInt();
         z.area(length, width);
        z.vol(length, width, height);
}   break;
    case 2:{
         System.out.println("Enter number ");
        int a=sc.nextInt();
        System.out.println("Enter number ");
        int b=sc.nextInt();
        z.add(a, b);
        z.sub(a, b);
        z.multi(a, b);
        z.div(a, b);
    }
    break;
    
    case 3:
    
    System.exit(0);
        break;
    
    }}
}
