package category;
import java.util.Scanner;
public class Category {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please choose the category \n 1) fast Food \n 2) Mobiles \n 3) Vechiles \n 4) CLothes");
        int a=sc.nextInt ();
        switch (a){
            case 1:
                System.out.println("you want 1) pizza or 2) burger");
                String b=sc.next();
                switch (b){
                    case "pizza" :
               System.out.println(" 1- Pizza Large 1000k");
               System.out.println(" 2 - Pizza Medium  500 ");
               System.out.println("Pizza Small 300 ");
                        String s=sc.next();
               switch (s){
   
                    case "large":
                        System.out.println("large pizza =1k+tax=150");
                        System.out.println("Your Order Has Been Recived \n thanks"  );
                        break;
                        case"medium":
                         System.out.println("Medium pizza =850k+ tax=110");
                              System.out.println("Your Order Has Been Recived" );
                            break;
                        case "small":
                          System.out.println("Small pizza =1k+tax=60");
                            System.out.println("Your Order Has Been Recived" );
               } break;
                    case "burger" :
                        System.out.println("Zinger burger = 220");
                        System.out.println("Chese Zinger burger = 250");
                        System.out.println("Fish Zinger burger = 280");
                }break;
               
                 case 2 :
                     System.out.println("Select your desired Brand Apple or Samsung");
                     String c=sc.next();
                     switch(c){
                             case "apple":
               System.out.println("iphone x = 1 lac 55 thousand");
               System.out.println("iphone xs =  lac 90 thousand");
                          System.out.println("iphone 11 = 2 lac 5 thousand");
                break;
                             case "samsung":
                System.out.println("Samsung s10 plus = 1 lac 55 thousand");
                System.out.println("Samsung s10 =  90 thousand");
                System.out.println("Samsung s9 = 55 thousand");
                break;
           
                     }
                     break;
            case 3:
                System.out.println("Select your desired comapany suzuki or toyota");
                String d=sc.next();
                switch (d) {
                    case "toyota" :
                         System.out.println("toyota Corolla gli = 28 lacs");
                System.out.println("toyota Corolla altis automatic = 32 lacs");
                System.out.println("toyota Corolla grande 1.8 litre automatic = 38 lacs");
                break;
                    case "suzuki" :
                         System.out.println(" Suzuki Cultus = 18 lacs");
                System.out.println("Suzuki Cultus automatic = 22 lacs");
                System.out.println("Suzuki Mehran = 8 lacs");
                break;
                }
                break;
            case 4:
                 System.out.println("Outfitter shirt for man = 2200");
                System.out.println("Denizen shirt for man = 2500");
                System.out.println("Dinners shirt for man = 2000");
                break;
            default:
                System.out.println("Invalid number");
                break;
        
          
        }             
        
}
}