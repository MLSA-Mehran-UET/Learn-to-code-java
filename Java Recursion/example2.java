import java.util.Scanner;

public class example2 {

    // fibonacci series : 1 1 2 3 5 .. (fib(n-1) + fib(n-2)) .. fib(n)

    // return the value of n-th number of fibonacci
    static int fibonacci(int n) {
        // recursive base
        if (n <= 1) {
            return n;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter n-th series of fibonacci : ");
        int n = in.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.print(fibonacci(num) + " ");
        }
        in.close();
    }
}
