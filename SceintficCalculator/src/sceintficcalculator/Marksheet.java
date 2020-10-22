package marksheet;

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter student name");
        String b=sc.next();
        System.err.println("Enter subject name");
        String s=sc.next();
         System.err.println("Enter Marks");
        int a=sc.nextInt();
        if (a>=85 && a<99)
            System.out.println("Grade is A+");
        else if ( a>=75 && a<85)
            System.out.println("Grade is A");
        else if (a>=65 && a<75)
            System.out.println("Grade is B+");
        else if (a>=60 && a<65)
            System.out.println("Grade is B");
        else if (a>=55 && a<60)
            System.out.println("Grade is C+");
        else if (a>=50 && a<55)
            System.out.println("Grade is C");
        else 
            System.out.println("Fail");
        System.out.println("Student name is " + b);
        System.out.println("subject name is " + s);  
    }
    
}
