import java.util.Scanner;
public class guessingnumbergame{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int number = 35;
           
        boolean loop_val = true;
        while(loop_val){
            System.out.println("Enter a number between 1 to 50.");
            int guess = sc.nextInt();
            if (number == guess){ //if the guess matches the number
                System.out.println("Congratuation, You won!");
                loop_val = false;
            }else if (number < guess){ //if the guess is lowen than the number
                System.out.println("Too high, try again");
            }else if (number > guess){ //if the guess is greater than the number
                System.out.println("Too Low, try again");
            }else{ //in case of any invlaid entry
                System.out.println("Invalid entry, try again");
            }
        }  
    }
}
