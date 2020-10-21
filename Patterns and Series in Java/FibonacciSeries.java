import java.util.Scanner;

class FibonacciSeries{

    static void printSeries(int n){
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; ++i){
            System.out.print(a + " ");

            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args){
        // Take no. of terms input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of terms: ");
        int n = sc.nextInt();

        printSeries(n);
    }
}