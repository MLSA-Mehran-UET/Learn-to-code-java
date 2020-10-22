/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcalculator;

import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose operation u want to perform  1)Additon 2) Subtraction 3) Multiply 4) division ");
        int sign=sc.nextInt();
        switch(sign){
            case 1:
                System.out.println("Enter first number");
                int num=sc.nextInt();
                
                System.out.println("Enter second Number");
                 int num1=sc.nextInt();
                 int num3=num+num1;
                 System.out.println("addition is "+num3);
                break;
                case 2:
                System.out.println("Enter first number");
                 num=sc.nextInt();
                
                System.out.println("Enter second Number");
                 num1=sc.nextInt();
                 int num4=num-num1;
                    System.out.println("subtraction is "+num4);
                break;
                    case 3:
                System.out.println("Enter first number");
                 num=sc.nextInt();
                System.out.println("Enter second Number");
                  num1=sc.nextInt();
                  num4=num*num1;
                        System.out.println("multiplication is"+ num4);
                  System.out.println();
                break;
                        case 4:
                System.out.println("Enter first number");
                 num=sc.nextInt();
                System.out.println("Enter second Number");
                 num1=sc.nextInt();
                 int num5=num/num1;
                 System.out.println("divison is "+num5);
               
                break;
                        default:
                            System.out.println("invalid");
                            break;
        }
    }
}
