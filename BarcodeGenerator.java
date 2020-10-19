/*
 */
 
import java.util.Random;  // make sure to write the import for Random class

/**
 *
 * @author ahsan
 */
public class BarcodeGenerator 
{
     public String generateBarcode()
     {
         String barcode;
         String[] numbers={"0","1","2","3","4","5","6","7","8","9"};  
         String[] Alphabets ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
         Random random = new Random(); //creating instance of Random class
         int n1=random.nextInt(10); // generating a random number 
         int n2=random.nextInt(10);
         int n3=random.nextInt(10);
         int n4=random.nextInt(10);
             // now creating barcode using random numbers i-e n1, n2 
         barcode= numbers[n1]+numbers[n2]+numbers[n3]+numbers[n4];
         return barcode;
     }
}
 
