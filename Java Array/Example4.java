// in this program we are passing an array to a method to calculate the sum of elements of Array
class Arrays 
{     
    public static void main(String args[])  
    { 
        int arr[] = {3, 1, 2, 5, 4}; 
        // method to which an array is being passed
        sum(arr); 
      
    } 
    public static void sum(int[] arr)  
    { 
        //initializing a variable to sum up all the elements or array
        int sum = 0; 
        // for loop to calculate the sum of elements
            for (int i = 0; i < arr.length; i++) 
            sum+=arr[i]; 
        System.out.println("sum of array values : " + sum); 
    } 
} 