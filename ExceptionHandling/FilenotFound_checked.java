//Example of checked Exception (Compile-time Exception)
// the methods read() and close() of FileReader class throws IOException, you can observe that the compiler notifies to handle IOException, along with FileNotFoundException.

import java.io.File;
import java.io.FileReader;

public class FilenotFound_checked {

   public static void main(String args[]) {		
      File file = new File("E://file.txt");
      FileReader fr = new FileReader(file); 
   }
}