import java.util.Scanner;
class AllLoopExamples {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // for loop is mostly used when the number of iteration are exactly known
    // example of for loop

    System.out.println("________Example of For Loop______");
    
    for(int iteration = 0; iteration < 5; iteration++)
    {
        // this will print a statement showing number of iteration
        System.out.println("This is iteration no " + (iteration + 1) + " (For loop)");
    }

    System.out.println(); // for extra line break

    // while loop is used mostly when number of iterations are not exaclty known
    // example of while loop

    System.out.println("________Example of While Loop______");

    System.out.println("How many iterations do you want for the while loop");
    int user_choice = sc.nextInt();
    int iteration = 0;
    // ask user to enter the number of iterations
    while(iteration < user_choice)
    {
        // this will print a statement showing number of iteration
        System.out.println("This is iteration no " + (iteration + 1) + " (While loop)");
        iteration++;
    }

    System.out.println(); // for extra line break
    
    // in do while the iteration occurs at least once even if the condition is false at the first iteration.
    // example of do while loop

    System.out.println("________Example of Do While Loop______");
    iteration = 0;
    do
    {
        // this will print a statement showing number of iteration
        System.out.println("This is iteration no " + (iteration + 1) + " (Do While loop)");
        iteration++;
    }
    while(iteration > 5); // the condition is false
  }
}
