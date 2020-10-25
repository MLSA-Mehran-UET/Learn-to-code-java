import java.util.*;

public class JavaDate {

	public static void main(String[] args) {
		//Default constructor assigns current date and time
		GregorianCalendar now = new GregorianCalendar();
		
		//You can retrieve values using get() method with a Calendar-field as argument
		System.out.println	(now.get(Calendar.YEAR)+"-"+
							 now.get(Calendar.MONTH)+"-"+
							 now.get(Calendar.DAY_OF_MONTH)); //For me it printed 2020-9-25, because JAN is counted 0 and DEC is 11
		
		//Alternatively, you can create a GregorianCalendar object using one of the overloaded
		//constructors—for example: GregorianCalendar(year, month, dayofMonth)
		GregorianCalendar myGraduationDate = new GregorianCalendar(2023, 2, 1);
		System.out.println	(myGraduationDate.get(Calendar.YEAR)+"-"+
				 			 myGraduationDate.get(Calendar.MONTH)+"-"+
				 			 myGraduationDate.get(Calendar.DAY_OF_MONTH)); //prints 2023-2-1
		
		int dayOfMyGraduation = myGraduationDate.get(Calendar.DAY_OF_WEEK); //get() always returns an int value
		System.out.println("I graduated on "+dayOfMyGraduation+"th day of week."); //Where 1 for Mon and 7 for Sun
		
		int dayOfYear = myGraduationDate.get(Calendar.DAY_OF_YEAR);//60, because 2 is for March, so 31(Jan)+28(Feb)+1(Mar) equals 60
		System.out.println("I graduated on "+dayOfYear+"th day of the year.");
		
		int weekOfMyGraduation = myGraduationDate.get(Calendar.WEEK_OF_YEAR); //9
		System.out.println("My graduation week was "+weekOfMyGraduation+"th week of the year.");
		
		//Another Example
		//Using GregorianCalendar(year, month, day, hourOfDay, minute) constructor
		//Calendar.HOUR_OF_DAY represents 24 hours time and this constructor uses this field
		GregorianCalendar myAddmissionDate = new GregorianCalendar(2019, 9, 14, 11, 45);
		
		int hourOfAddmission = myAddmissionDate.get(Calendar.HOUR_OF_DAY); //11 AM
		int minuteOfAddmission = myAddmissionDate.get(Calendar.MINUTE); //45
		System.out.println("I got addmission at "+hourOfAddmission+":"+minuteOfAddmission+" AM");

	}

}

