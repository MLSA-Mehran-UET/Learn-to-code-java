import java.util.Random;
import java.util.Scanner;
public class ArrayBinarySearch{
    private static int count;   //To count the no. of steps of binarySearch method
    static{
        count=0;
    }

    public static void sort(int []a){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }  
    }

    public static int binarySearch(int []a,int key){
        int p=0;
        int q=a.length-1;
        int i=-1;   //initially initializing with negative value
        while(p<=q){
            i=(p+q)/2;
            if(a[i]==key){
                count++;   //becuase it is not counting the final step in which we found the element becuase
                return i;   //of return statement it will not reaching the counter so when we increase it by 1 
                //for final step
            }
            if(a[i]<key){    //We will search from the right side
                p=i+1;       //Now p has the index 1 greater from middle index
            }
            else{
                q=i-1;    //To search from left q has index one less from middle index
            }

            count++;  //To count the number of steps
        }
        
        return -i;
    }
    public static void main(String[]args){
        int key; //element to search
        Scanner sc = new Scanner(System.in);

        Random rd = new Random();
        int []arr=new int[100];
        for(int i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(1000);    //where 1000 is the range
        }

        //Printing the original array
        System.out.println("Unsorted Array");
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }

        //It is necessary to sort the array for the binary search
        ArrayBinarySearch.sort(arr);

        //printing the sorted array
        System.out.println("Sorted Array");
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }

        System.out.print("Enter Element to search: ");
        key=sc.nextInt();

        int index=ArrayBinarySearch.binarySearch(arr, key);
        if(index>=0){
            System.out.println("Element found, position is "+index);
            System.out.println("No. of steps taken: "+ArrayBinarySearch.count);
        }
        else{
            System.out.println("Element not found");
        }

    }
}
