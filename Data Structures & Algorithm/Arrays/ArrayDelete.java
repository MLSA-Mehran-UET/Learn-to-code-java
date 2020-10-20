import java.util.Scanner;
public class ArrayDelete{
    public static void main(String[]args){
        int size,i,pos;
        int []arr = new int[50];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        size = sc.nextInt();

        System.out.println("Enter Array Elements: ");
        for(i=0;i<size;i++){
            System.out.print("arr["+i+"]= ");
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter Position(Index Number): "); //position for the element which we will delete
        pos=sc.nextInt();

        /*if we take element from the user to delete instead of index then we first search that element in array
        and get its index then we will do the same procedure which we will do now*/

        for(i=pos;i<size;i++){
            arr[i]=arr[i+1];  
        }

        size-=1;

        System.out.println("Printing the array again after deletion");
        for(i=0;i<size;i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }        

    }
}