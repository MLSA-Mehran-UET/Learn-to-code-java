//This will give an unchecked exception if you have declared an array of size 5 in your program, and trying to call the 6th //element of the array then an ArrayIndexOutOfBoundsExceptionexception occurs.
public class Unchecked_Demo {
   
   public static void main(String args[]) {
      int num[] = {1, 2, 3, 4};
      System.out.println(num[5]);
   }
}