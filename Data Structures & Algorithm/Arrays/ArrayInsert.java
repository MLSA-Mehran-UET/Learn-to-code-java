import java.util.Scanner;
public class ArrayInsert{
    public static void main(String[]args){
        int size,insert,i,pos;
        int []arr = new int[50];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        size = sc.nextInt();

        System.out.println("Enter Array Elements: ");
        for(i=0;i<size;i++){
            System.out.print("arr["+i+"]= ");
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter element to be inserted: ");
        insert=sc.nextInt();

        System.out.print("Enter Position(Index Number): ");
        pos=sc.nextInt();

        //Now we will create a space for the element
        for(i=size;i>pos;i--){
            arr[i]=arr[i-1];  
        }

        arr[pos]=insert;
        size+=1;

        System.out.println("Printing the array again after insertion");
        for(i=0;i<size;i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }        

    }
}