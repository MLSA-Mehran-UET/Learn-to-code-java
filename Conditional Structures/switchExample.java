import java.util.Scanner;
class switchExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of your shirt in inches : ");
    float inches = sc.nextFloat();
    int number = (int)inches/10;
    String size;
    switch (number) {

      case 3:
        size = "Small";
        break;

      case 4:
        size = "Medium";
        break;

      case 5:
        size = "Large";
        break;

      case 6:
        size = "Extra Large";
        break;
      
      default:
        size = "Unknown";
        break;
    }
    System.out.println("You will get a " + size + " shirt");
  }
}