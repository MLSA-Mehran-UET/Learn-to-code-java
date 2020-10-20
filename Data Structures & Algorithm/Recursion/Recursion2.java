import java.util.Scanner;
public class Recursion2{
    
    public static int fibonaci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonaci(n-1)+fibonaci(n-2);
    }

    public static void even(int value, int n){
        if(value==n){     //base condition
            System.out.print(value+"  ");
            return;
        }
        System.out.print(value+" ");
        even(value+2, n);
    }

    public static int prime(int num, int i){    //i is half of a number
        if(i==1)
            return 1;
        if(num%i==0)
            return 0;
        return prime(num,i-1);
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.println("*****Fibonacci Series*****");
        System.out.print("Enter value in even: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibonaci(i)+"  ");
        }

        System.out.println("\n");   //To cange two lines

        System.out.println("*****Even Series*****");
        System.out.print("Enter the number of terms: ");
        n=sc.nextInt();
        if(n%2==0)
            even(0, n);
        else
            System.out.println("Pleaae enter even value.");

        System.out.println();

        System.out.println("*****Prime Number*****");
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        if(prime(n, n/2)==1)
            System.out.println(n+" is prime.");
        else
        System.out.println(n+" is not prime.");
    }
}