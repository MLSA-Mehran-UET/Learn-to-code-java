package sceintficcalculator;
import java.util.Scanner;

public class AdCalculator {
    public static void main(String[] args) {
        int num;
        char sign ;
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
     int num1=sc.nextInt();
        System.out.println("Enter second number");
     int num2=sc.nextInt();
    
     System.out.println("Select operation u want to perfrom +, - ,  / , *");
      sign=sc.next().charAt(0);
     if (sign == '+') {
                 num=num1+num2;
         System.out.println("you perform addition "+num);
     }
        else if (sign =='-'){
             num=num1-num2;
              
     System.out.println("you perform subtraction "+num);
        }
             else if ( sign == '/')
             {
             num=num1/num2;
        System.out.println("You perform division "+num);
              }
        else if(sign =='*'){
     num=num1*num2;
         System.out.println("You perform multiplication "+ num);
              } 
              else{
     System.out.println("insert ivalid operator or number ");
    }
    }
}
  