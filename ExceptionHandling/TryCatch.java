//try and catch example
//The following is an array declared with 2 elements. Then the code tries to access the 3rd element of the array which //throws an exception.
import java.io.*;

public class TryCatch {

   public static void main(String args[]) {
      try {
         int a[] = new int[2];
         System.out.println("Access element three :" + a[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
   }
}