public class ArrayElementEvenOrOdd{
    public static void main(String[]args)
    {
        int []arr = {3,5,6,3,4,8,6,7};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("a["+i+"] element is even.");
            }
            else{
                System.out.println("a["+i+"] element is odd.");
            }
        }
    }
}