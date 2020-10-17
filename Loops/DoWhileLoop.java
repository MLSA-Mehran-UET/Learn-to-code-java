class DoWhileLoop{
    public static void main(String[] args){
        // Print Numbers from 1 to 10 
        int i=1;
        do{
            System.out.println(i);
            i++;
        } while(i<11);

        // Find Even Numbers between 0 to 20
        int j=0;
        do{
            if(j%2==0)
                System.out.println(j);
            j++;
        } while(j<=20);
    }
}
