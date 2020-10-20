public class ArraySizeEvenOrOdd{
    public static void main(String[]args)
    {
        int []arr = {3,5,6,3,4,8,6,7};
        if(arr.length%2==0){
            System.out.println("Array size is even.");
        }
        else{
            System.out.println("Array size is odd.");
        }
    }
}