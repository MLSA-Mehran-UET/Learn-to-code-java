public class Simple { //This is the Simple Example of Methods with Parameters.

  public static void rollNumber(int rollNo)
   /*This Method takes an integer as a Parameter,
    Which can be used anywhere in the braces of this method.*/
   { 
    //Note : Keywords used : -
    //public : for the public access of method anywhere in this file or Another file.
    //static : It is used for a constant variable or a method that is same for every instance of a class.
    //void : returns nothing.
    System.out.println("My Roll number is 18SW" + rollNo);
  }

  public static void main(String[] args) {
    rollNumber(27);
  }
}
