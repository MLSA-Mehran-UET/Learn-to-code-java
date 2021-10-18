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
public class objects {
  
    public static void main(String[] args) {
        int b=0;
        Scanner sc=new Scanner(System.in);
        while (true){
        System.out.println("Enter 1 for object 2) for show object 3) for exit");
        int a=sc.nextInt();
        switch(a){
            case 1:{
                System.out.println("how many objects u want to create plz enter");
                b=sc.nextInt();
                for (int i=1; i<=b; i++){
                    objects o=new objects();
                }
            }
            break;  
            case 2:{
                for (int i=1; i<=b; i++){
                    objects o=new objects();
                    System.out.println(o);
                }
            }
                    break;
                    case 3:{
                    System.exit(0);
                    }
                        break;
                }
                
        }
    }
    
}
