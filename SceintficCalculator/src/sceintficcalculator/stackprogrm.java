import java.util.Scanner;
import java.util.Stack;
public class stackprogrm {
    public static void main(String[] args) {
        Stack<String> sam = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Chosse operation \n 0) Add \n 1) Remove \n 2) Search \n 3) Empty \n 4) Capacity \n 5)Contain \n 6) Clone \n 7)First Element \n 8) last Element \n 9) Remove all");
            int a = sc.nextInt();
            switch (a) {
                case 0:
                    System.out.println("Enter Length of stack");
                    int b = sc.nextInt();
                    System.out.println("Enter " + b + "Names");
                    for (int i = 0; i < b; i++) {

                        System.out.println("Enter  Names");
                        String c = sc.next();
                        sam.push(c);
                    }
                    break;
                    case 1:
                    System.out.println("enter index u want to Remove ");
                    int o = sc.nextInt();
                    System.out.println("Name deleted From Stack is " + sam.remove(o));
                    break;
                case 2:
                    System.out.println("enter index u want to search ");
                    int d = sc.nextInt();
                    System.out.println("you searched" + sam.search(d));
                    break;
                case 3:

                    System.out.println("your stack is " + sam.isEmpty());
                    break;
                case 4:
                    System.out.println("your stack Capacity is " + sam.capacity());
                    break;
                case 5:
                    System.out.println("Your stack Contain " + sam.containsAll(sam));
                    break;
                case 6:
                    System.out.println("Your stack Clone is " + sam.clone());
                    break;
                case 7:
                    System.out.println("Your  stack's first element is " + sam.firstElement());
                    break;
                case 8:
                    System.out.println("Your  stack's last element is " + sam.lastElement());
                    break;
                     case 9:
                    
                    sam.removeAllElements();
                System.out.println("You Remove All Elements"+sam );
                
                    break;
            } }
    }}