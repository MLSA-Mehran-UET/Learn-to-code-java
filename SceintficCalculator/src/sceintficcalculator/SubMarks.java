/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submarks;

import java.util.Scanner;
public class SubMarks {
    public static void main(String[] args) {
        // TODO code application logic here
         int total;
         int percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st subject marks");
        int subject1= sc.nextInt();
        System.out.println("Enter your 2nd subject marks");
        int subject2= sc.nextInt();
        System.out.println("Enter your 3rd subject marks");
        int subject3= sc.nextInt();
        System.out.println("Enter your 4th subject marks");
        int subject4= sc.nextInt();
        System.out.println("Enter your 5th subject marks");
        int subject5= sc.nextInt();
        total= subject1+ subject2 + subject3 + subject4 + subject5;
        percentage=total/500*100;
        System.out.println("Your Total Marks is "+ total);
        System.out.println("Your Percantage is "+ percentage+"%");
        
        
        
    }
    
}
