public class Recursion{
    public static long fact(int n){
        if(n<2)
            return 1;    //base condition
        return n*fact(n-1);
    }
    public static int fibonaci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonaci(n-1)+fibonaci(n-2);
    }
    public static double pow(double x,int n){
        double factor = (n%2==0 ? 1.0:x);
        if(n<2)
            return factor;
        return factor*pow(x*x,n/2);
    }

    public static void TOH(int n,char x,char y,char z){
        if(n==1)
            System.out.println(x+"--->"+y);   //base
        else{
            TOH(n-1,x,z,y);
            System.out.println(x+"--->"+y);
            TOH(n-1,z,y,x);
        }
    }

    public static void main(String[]args)
    {
        System.out.println(fact(5));
        System.out.println(fibonaci(7));
        System.out.println(pow(3.0,3));
        int numOfTowers=3;
        TOH(numOfTowers,'A','B','C');
    }
}