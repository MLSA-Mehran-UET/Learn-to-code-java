public class Comparison { //These types of Operators are used to compare values.

  public static void main(String[] args) {
    //Equal to "=="
    int a = 3;
    if (a == 3) { //The Operator will check the condition that "a" is equals to 3 or not.
      System.out.println("True \t a = " + a);
      a = 4; //Giving "a" another value so we can check next operator
    }
    //Not Equals to "!="
    if (a != 3) { //This operator will check that a is not equals to 3 or equals to 3.
      System.out.println("True \t a = " + a);
    }
    //Greater than ">"
    if (a > 2) { //This operator will check that a is greater than 2 or not
      System.out.println("True \t a = " + a);
    }
    //Less than "<"
    if (a < 4) { //This operator will check that a is lesser than 4 or not
      System.out.println("True \t a = " + a);
    }
    //Greater than or Equals to ">="
    if (a >= 3) { //This operator will check that a is greater than or equals to 3 or not.
      System.out.println("True \t a = " + a);
    }
    //Lesser than or Equals to "<="
    if (a <= 4) { //This operator will check that a is greater than or equals to 3 or not.
      System.out.println("True \t a = " + a);
    }
  }
}
