
import java.util.Scanner;

public class Truck {

    public static void main(String args[]) {
        int earn = 3000;
        int expen = 1000;
        int diesel = 500;
        int pay = 1000;
        int tax = 100;
        int profit = 400;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of trucks u want to calculate");
        int a = sc.nextInt();
         //System.out.println("Earning of "+ a + " truck is" + earn*a);
        System.out.println("Fuel of "+ a + " truck is" + diesel*a);
        System.out.println("Profit of  " + a + " truck is" + profit * a);
        System.out.println("Expense of  " + a + " truck is" + expen*a);
        System.out.println("Driver's pay of  "+ a + " truck is" + pay*a);

        System.out.println("tax of  "+ a + " truck is" + tax*a);
        int total = earn * a + diesel * a + profit * a + tax * a + expen * a;
        System.out.println("Total Earning is" + total);
    }
}
