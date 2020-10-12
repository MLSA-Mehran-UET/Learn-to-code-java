public class IfAllConditionsExample {
    public static void main(String[] args) {
        int day = 5;
        int month = 10;
        int year= 2020;
    
        if (year >= 2020) {
          System.out.println("The year is greater or equal to 2020");
        } else {
          System.out.println("The year is lower than 2020");
        }  
    
        if (month >= 11) {
          System.out.println("It's a winter month");
        } else {
          System.out.println("It's not a winter month");
        }  
    
        if (day == 1) {
          System.out.println("It's Sunday");
        } else if(day > 1 && day <= 6) {
          System.out.println("It's a work day");
        } else {
          System.out.println("It's Saturday");
        }  
    
      }
}
