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