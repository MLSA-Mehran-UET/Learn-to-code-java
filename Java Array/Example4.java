 NewBranch
public class Example4{
    public static void main(String args[]){
     int arr1[][] = {{3,2,1},{2,4,6},{1,2,3}};
     int arr2[][] = {{1,3,5},{7,6,3},{5,4,7}};
     int ans[][] = new int[3][3];
     int i,j;
     
     for (i=0; i<3; i++){
         for (j=0; j<3; j++){
             ans[i][j] = arr1[i][j] + arr2[i][j];
         }
     }

     for (i=0; i<3; i++){
         for (j=0; j<3; j++){
             System.out.print(ans[i][j] + " ");
         }
         System.out.println();
     }

    }
}

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
 main
