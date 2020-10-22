
package methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter first number");
        int e=sc.nextInt();
        System.out.println("Enter Second number");
        int s=sc.nextInt();
        calcu a=new calcu();
        System.out.println(a);
          
        a.add(e,s);
        
        a.sub(e,s);
        
       a.mult(e,s);
     
        a.divide(e,s);
    }
    
}
