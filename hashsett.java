package arrayprog;
import java.util.Scanner;
import java.util.HashSet;
public class hashsett {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet <String> so = new HashSet <>();
        while(true){
           System.err.println("Select operation u want to perform \n 1) ADD \n 2) Remove \n 3) CONTAIN \n 4) SiZE \n 5) EMPTY \n 6) CLEAR \n 7) EXIT");
          int  a=sc.nextInt();
          switch(a){
              case 1:
        System.out.println("Enter Length");
       int b=sc.nextInt();
       System.out.println("Enter "+ b + "Names");
       for(int i=0; i<b; i++)
       {
           
           System.out.println("Enter  Name");
           String c=sc.next();
           so.add(c);
          }
              break;
              case 2:
             
                  System.out.println("Enter index u want to Remove");
                  String d=sc.next();
                  so.remove(d);
              case 3:
              {
                   for (String c: so)
                  System.out.println(" Elements of Set are "+ so.contains(c));
              }
              break;
              case 4:
              {
                  System.out.println("The Size of the set is "+ so.size());
              }
              break;
              case 5:
              { 
                  System.out.println(so.isEmpty());
              }
                  break;
              case 6:
              {
                  System.out.println("Hash set is"+so);
                  so.clear();
                  System.out.println("After Clear Hash set is"+so);
              }    
                  break;
              case 7: 
                  System.exit(7);
                  
          }
}
    }}
