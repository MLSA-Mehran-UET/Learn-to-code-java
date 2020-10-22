package sceintficcalculator;

import java.util.Scanner;

public class Opp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test2 c = new test2();
        System.out.println("Select 1) Simple Calculator 2) Scientific Calculator 3) Exit");
        int k = sc.nextInt();
        switch (k) {
            case 1:
                System.out.println("Enter 1 Number");
                int a = sc.nextInt();
                System.out.println("Enter 2nd Number");
                int b = sc.nextInt();
                System.out.println("Enter Operator u want to perform");
                char s = sc.next().charAt(0);
                switch (s) {
                    case '+':
                        c.add(a, b);
                        break;
                    case '-':
                        c.sub(a, b);
                        break;
                    case '*':
                        c.Multiply(a, b);
                        break;
                    case '/':
                        c.Divide(a, b);
                        break;
                    case 4:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid Selection");
                        break;
                }
            case 2:
                System.out.println("1) Sin 2) Cosine 3) Tan 4)Squre Root 5) Exit");
                int h = sc.nextInt();
                
                switch (h) {
                    case 1:
                        System.out.println("Enter value fo Sine");
                        int f = sc.nextInt();
                        c.sin(f);
                        break;
                    case 2:
                        System.out.println("Enter value fo Cosine");
                        int t = sc.nextInt();
                        c.cos(t);
                        break;
                    case 3:
                        System.out.println("Enter value fo Tangent");
                        int z = sc.nextInt();
                        c.tan(z);
                        break;
                    case 4:
                        System.out.println("Enter value fo Square Root");
                        int x = sc.nextInt();
                        c.sqrt(x);
                        break;
                    
                    case 5:
                        System.exit(4);
                        break;
                    default :
                        System.out.println("Invalid Selection");
                        break;
                        
                }

        }
    }


}
