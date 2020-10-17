import java.util.Scanner;

class example3 {

    // assume amoeba divides in half every 1 hour
    // calculate amount of amoeba in a container, after n hour

    /*
     * Example : if n = 3 then amoeba divides in half 3 times when n = 1, n =2 and n
     * = 3
     */
    static double amoeba(double n, double initial_amoeba) {
        // base recursive
        if (n == 0) {
            return initial_amoeba;
        } else {
            // recursive call
            return (2 * amoeba(n - 1, initial_amoeba));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of initial amoeba : ");
        double initial = input.nextDouble();
        System.out.print("Input time in hour : ");
        double ntime = input.nextDouble();

        System.out.print("Amount of amoeba : ");
        System.out.print(amoeba(ntime, initial));

        input.close();
    }
}