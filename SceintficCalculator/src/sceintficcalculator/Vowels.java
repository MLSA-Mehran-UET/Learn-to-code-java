
package vowels;

import java.util.Scanner;

public class Vowels {

    
    public static void main(String[] args) {
        System.out.println("Enter Vowels ");
    Scanner sc=new Scanner(System.in);
    char b=sc.next().charAt(0);
        
    switch (b){
        case 'a' :
        case 'e':
        case 'i': 
        case 'o':
        case 'u':
        case 'A' :
        case 'E':
        case 'I': 
        case 'O':
        case 'U':
            System.out.println("This is Vowel");
            break;
               default:
                   System.out.println("This is consonent");
                   break;
    }
    }
}

