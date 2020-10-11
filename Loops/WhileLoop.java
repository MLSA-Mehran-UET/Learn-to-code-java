class WhileLoop{
    public static void main(String[] args){
        // Print Numbers from 1 to 10 
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        // Find Even Numbers between 0 to 20
        int j=0;
        while(j<=20){
            if(j%2==0)
                System.out.println(j);
            j++;
        }
    }
}