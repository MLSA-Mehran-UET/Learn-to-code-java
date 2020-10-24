import java.util.Scanner;
class NestedLoop {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of Rows you wants to build : ");
    int row = sc.nextInt();
    System.out.print("Enter the number of Columns you wants to build : ");
    int column = sc.nextInt();
    System.out.print("Enter the character you want to print : ");
    char character = sc.next().charAt(0);

    myFunction(row, column, character);

  }


  public static void myFunction(int row, int column, char character){

    for(int a = 0; a < row;a++){
       for(int b = 0; b < column;b++){
          System.out.print(character + " ");
       }  
       System.out.println();
    }

  }

}