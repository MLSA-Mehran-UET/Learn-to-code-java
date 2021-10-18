package category;

import java.util.Scanner;

public class SecondCategory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        int t;
        int m;
        System.err.println("WELLCOME TO OUR RESTAURANT ");
        System.out.println("1) Pizzaa 2) Burger 3 Biryani");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("1) large 2) medium 3) small ");
                String i = sc.next();
                switch (i) {
                    case "large":
                        System.out.println("You Selected Large Pizza Prize=1000");
                        System.out.println("Enter your amount");
                        int k = sc.nextInt();
                        if (k == 1000) {
                            System.out.println("Order has been recived Wait 15 minutes \n Thanks :)");
                        } else if (k < 1000) {
                            int s = 1000 - k;
                            System.out.println(" Unsufficiant amount Add more Amount =" + s);
                        } else if (k > 1000) {
                            int s = k - 1000;
                            System.out.println(" Order has been recived Your remaining Amount is " + s + "\n Thanks");
                        }
                        break;
                    case "medium": {
                        System.out.println(" You Selected Medium Pizza Prize=800");
                        System.out.println("Enter your amount");
                        int r = sc.nextInt();
                        if (r == 800) {
                            System.out.println("Order has been recived Wait 15 minutes \n Thanks :)");
                        } else if (r < 800) {
                            m = 800 - r;

                            System.out.println(" Unsufficiant amount  " + "Add more Amount =" + m);
                        } else if (r > 800) {
                            m = r - 800;
                            System.out.println(" Order has been recived Your remaining Amount is " + m + "\n Thanks");
                        }
                    }
                    break;
                    case "small":
                        System.out.println(" You Selected Small Pizza Prize=450");
                        System.out.println("Enter your amount");
                        int b = sc.nextInt();
                        if (b == 450) {
                            System.out.println(" Order has been recived Wait 15 minutes \n Thanks :)");
                        } else if (b < 450) {
                             m = (450 - b);
                            System.out.println(" Unsufficiant amount  Add more Amount =" + m);
                        } else if (b > 450) {
                          t = b - 450;
                            System.out.println(" Order has been recived Your remaining Amount is " + t + "\n Thanks:) ");
                        }
                }
                break;
            case 2:
                System.out.println("Your Selected Burger");
                System.out.println("1) Zinger 2) Cheese zinger 3) jumbo zinger");
                String q = sc.next();
                switch (q) {
                    case "zinger":
                        System.out.println("You Selected Zinger Prize=250");
                        System.out.println("Enter your amount");
                        int g = sc.nextInt();
                        if (g == 250) {
                            System.out.println("Order Has Been Recived Wait 15 minutes \n Thanks :)");
                        } else if (g < 250) {
                            int z = 250 - g;
                            System.out.println(" Unsufficiant Amount Add more Amount =" + z);
                        } else if (g > 250) {
                            int z = g - 250;
                            System.out.println(" Order has been recived Your remaining Amount is " + z + "\n Thanks:)");
                        }
                        break;
                    case "cheese":
                        System.out.println("You Selected Chesse Zinger Prize=350");
                        System.out.println("Enter your amount");
                        int n = sc.nextInt();
                        if (n == 350) {
                            System.out.println("Order has been recived Wait 15 minutes \n Thanks :)");
                        } else if (n < 350) {
                            int s = 350 - n;
                            System.out.println(" Unsufficiant amount  " + "Add more Amount =" + s);
                        } else if (n > 350) {
                            int s = n - 350;
                            System.out.println(" Order has been recived Your remaining Amount is " + s + "\n Thanks :)");
                        }
                        break;
                    case "jumbo":
                        System.out.println("You Selected Jumbo Zinger Prize=600");
                        System.out.println("Enter your amount");
                        int x = sc.nextInt();
                        if (x == 600) {
                            System.out.println("Order has been recived Wait 15 minutes \n Thanks :)");
                        } else if (x < 600) {
                            int s = 600 - x;
                            System.out.println(" Unsufficiant amount  " + " Add more Amount =" + s);
                        } else if (x > 600) {
                            int s = x - 600;
                            System.out.println(" Order has been recived Your remaining Amount is " + s + "\n Thanks");
                        }
                }break;
                
            case 3: 
                System.out.println("You Seleted Biryani");
                System.out.println(" Please Select Chicken or Beef");
                String d=sc.next();
                switch(d){
                    case "chicken":
                System.out.println("1) Chicken Single Plate 2) Chicken Double Plate ");
                String u = sc.next();
                switch (u) {
                    case "single":
                        System.out.println("You Selected Single Plate Biryani Prize=150");
                        System.out.println("Enter your amount");
                        int k = sc.nextInt();
                        if (k == 150) {
                            System.out.println("Order has been recived Wait 15 minutes \n Thanks :)");
                        } else if (k < 150) {
                            int s = 150 - k;
                            System.out.println(" Unsufficiant amount Add more Amount =" + s);
                        } else if (k > 150) {
                            int s = k - 150;
                            System.out.println(" Order has been recived Your remaing Amount is " + s + "\n Thanks :)");
                        }
                        break;
                    case "double": {
                        System.out.println(" You Selected Double Plate Biryani Prize=250");
                        System.out.println("Enter your amount");
                        int r = sc.nextInt();
                        if (r == 250) {
                            System.out.println("Order has been recived Wait 15 minutes \n Thanks :)");
                        } else if (r < 250) {
                          m = 250 - r;

                            System.out.println(" Unsufficiant amount  " + "Add more Amount =" + m);
                        } else if (r > 250) {
                          m = r - 250;
                            System.out.println(" Order has been recived Your remaining Amount is " + m + "\n Thanks :)");
                        }
                    }}break;
                    case "beef":
                            System.out.println("Single Plate or Double plate");
                            String e=sc.next();
                        switch(e){
                        case "single":
                        System.out.println("You Selected Single Plate Beef Biryani Prize=180");
                        System.out.println("Enter your amount");
                        int k = sc.nextInt();
                        if (k == 180) {
                            System.out.println("Order has been recived Wait 15 minutes \n Thanks :)");
                        } else if (k < 180) {
                            int s = 180 - k;
                            System.out.println(" Unsufficiant amount Add more Amount =" + s);
                        } else if (k > 180) {
                            int s = k - 150;
                            System.out.println(" Order has been recived Your remaining Amount is " + s + "\n Thanks :)");
                        }
                        break;
                    case "double": {
                        System.out.println(" You Selected Double Plate beef Biryani Prize=280");
                        System.out.println("Enter your amount");
                        int r = sc.nextInt();
                        if (r == 280) {
                            System.out.println("Order has been recived Wait 15 minutes \n Thanks :)");
                        } else if (r < 280) {
                           m = 280 - r;

                            System.out.println(" Unsufficiant amount  " + "Add more Amount =" + m);
                        } else if (r > 280) {
                              m = r - 280;
                            System.out.println(" Order has been recived Your remaining Amount is " + m + "\n Thanks :)");}}
                         break;}
                        }}       
    }
}