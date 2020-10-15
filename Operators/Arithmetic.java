public class Arithmetic /*The Class Name is Arithmetic Because in 
this program we will deal with the Arithmetic Operators*/{

  public static void main(String args[]) {
    //The Arithmetic Operators are used to perform basic/Common Mathematical Operations.
    //Arithmetic Operators
    //Addition " + "
    int apples = 20;
    int banana = 15;
    int totalFruits = apples + banana; //This operator will simply add the values of apples and banana.
    System.out.println("The Total Fruits are = " + totalFruits);
    //Subtraction " - "
    int sellPrice = 200;
    int originalPrice = 180;
    int profit = sellPrice - originalPrice; //This operator will simply subtract the originalPrice from sellPrice.
    System.out.println("The Profit is = " + profit);
    //Multiplication " * "
    int applePrice = 10;
    int quantity = 400;
    int totalAppleAmount = applePrice * quantity; //This will multiply the the applePrice with the quantity.
    System.out.println(
      "The total number of Apples will be = " + totalAppleAmount
    );
    //Division " / "
    float foodPlates = 200;
    float people = 150;
    float platePerEach = (foodPlates / people); //This will equally divide the plates to each person.
    System.out.println(
      "The food plates which each person will receive will  = " + platePerEach
    );
    //Modulus " % "
    int toys = 10;
    int kids = 3;
    int remainingToys = (toys % kids);
    System.out.println("The remaining Toys will be = " + remainingToys);
    //Increment " ++ "
    int beforeIncrement = 2;
    beforeIncrement++; //This will add 1 to the variable "beforeIncrement".
    System.out.println("After Increment = " + beforeIncrement);
    //Decrement " -- "
    int beforeDecrement = 2;
    beforeDecrement--; //This will subtract 1 from the variable "beforeDecrement".
    System.out.println("After Decrement = " + beforeDecrement);
    //There are two types of both Increment & Decrement which are Prefix and Postfix
    //Prefix
    ++beforeIncrement; //This will add 1 during the declaring Statement.
    //Postfix
    --beforeDecrement; //This will subtract 1 during the declaring Statement.
  }
}
