/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findage;

import java.util.Scanner;
public class Findage {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);     
        int age = sc.nextInt();
        if (age<=14 )
            System.out.println("you are teenager");
        else if (age>=14 && age<=45)
            System.out.println("you are young");
        else if (age>=45 && age<=100)
            System.out.println("you are old");
        else 
            System.out.println("Please enter age 1 t0 100");       
    }
}