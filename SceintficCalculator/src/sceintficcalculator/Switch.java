/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Sameer
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your roll number");
        int roll=sc.nextInt();
        switch (roll){
                
            case 170:
        System.out.println("Your name is sameer");
        break;
            case 85:
                System.out.println("your name is majd");
                break;
            case 8 :
                System.out.println("Your name is saqib");
                break;
            default:
                System.out.println("not found");
                break;
    }
    
}
}