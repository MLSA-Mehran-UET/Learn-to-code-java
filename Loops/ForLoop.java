class ForLoop{
    public static void main(String[] args){
        // Print Numbers from 1 to 10 
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        // Find Odd Numbers between 0 to 20
        for(int i=0; i<=20; i++){
            if(i%2==0)
                continue;
            System.out.println(i);
        }
    }
}