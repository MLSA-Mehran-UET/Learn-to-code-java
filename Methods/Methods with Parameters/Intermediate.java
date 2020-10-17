import java.util.*; //Importing this library for taking Input.
public class Intermediate {

  //This is the example of little difficult level of program than Simple.java file.
  //Note : Keywords used : -
  //public : for the public access of method anywhere in this file or Another file.
  //static : It is used for a constant variable or a method that is same for every instance of a class.
  //void : returns nothing.
  public static void fullName(String firstName, String lastName) { //This methods takes 2 parameters as input.
    System.out.println("\nFull Name = " + firstName + " " + lastName + "\n");
    //Output : Full Name = Mubashir Ibrahim(Example)
  }
  public static void rollnum(int yearOfAdmission, String deptCode, int rollno) { //While this one takes 3.
    System.out.println(
      "My Roll Number is " + yearOfAdmission + deptCode + rollno
    );
    //Output : My Roll Number is 18SW27(Example)
  }
  //We can take any number of Parameters for a method but have to work carefully with them.
  public static void main(String[] args) {
    String fName, lName, deptCode;
    int yearOfAdmission, rollno;
    Scanner sc = new Scanner(System.in);
    System.out.print("What is your First name = ");
    fName = sc.nextLine();
    System.out.print("What is your Last name = ");
    lName = sc.nextLine();
    System.out.print("What is your Department code = ");
    deptCode = sc.nextLine();
    System.out.print("What is Year of Admission = 20");
    yearOfAdmission = sc.nextInt();
    System.out.print("What is your Roll number's last digit = ");
    rollno = sc.nextInt();
    System.out.println("\n\n********Student Details********");
    fullName(fName, lName); //As the values will be given by the user from here they will be passed to the methods.
    rollnum(yearOfAdmission, deptCode, rollno);
  }
}
