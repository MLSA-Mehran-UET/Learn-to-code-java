import java.util.*;

public class AgeCalculator {

	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar(); //Today's date
		int nowYear;
		int birthYear;
		int yearsOld;
		
		//Getting input
		Scanner input = new Scanner(System.in);
		System.out.println("Plear enter your birth year: ");
		birthYear = input.nextInt();
		input.close();
		
		//Calculating difference
		nowYear = now.get(Calendar.YEAR);
		yearsOld = nowYear - birthYear;
		
		//Showing Result
		System.out.println("This year you become "+yearsOld+" years old.");

	}

}
