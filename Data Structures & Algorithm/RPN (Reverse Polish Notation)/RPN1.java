public class RPN1{

    public RPN1(String []args){
        Stack stack = new ArrayStack(args.length);
        for(int i=0;i<args.length;i++){
            String input=args[i];
            if(isAnOperator(input)){
                double y = Double.parseDouble((String)stack.pop());
                double x = Double.parseDouble((String)stack.pop());
                double z = evaluate(x,y,input);
                stack.push(String.valueOf(z));
            }
            else{
                stack.push(input);
            }
        }
    }

    private boolean isAnOperator(String s){
        return (s.length()==1 && "+-*/".indexOf(s)>=0);
    }

    private double evaluate(double x,double y,String op){
        double z=0;
        if(op.equals("+"))
            z=x+y;
        else if(op.equals("-"))
            z=x-y;
        else if(op.equals("*"))
            z=x*y;
        else if(op.equals("/"))
            z=x/y;
        else
            System.out.println("Invalid Operator");
        System.out.println(z);
        return z;
    }

    public static void main(String[]args){
        new RPN1(args);
    }
}