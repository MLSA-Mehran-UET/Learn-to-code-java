public class TestStack{
    public static void main(String[]args)
    {
        LinkedStack stack = new LinkedStack();   //initial capacity is 10

        try{
            stack.push("Apples");
            stack.push("Oranges");

            System.out.println("Peek Object: "+stack.peek());

            stack.push("Pomegranates");
            stack.push("Grapes");

            System.out.println(stack.toString());

            System.out.println("Peek Object: "+stack.peek());
            System.out.println("Size: "+stack.size());

            System.out.println("Value: "+stack.pop());  //gives top element and removes it
            System.out.println("Value: "+stack.pop());
            System.out.println("Empty: "+stack.isEmpty());
            System.out.println("Size: "+stack.size());

            stack.push("Bananas");

            ArrayStack convStack = stack.toArrayStack();
            System.out.println(convStack.toString());

            System.out.println("Value: "+stack.pop());
            System.out.println("Value: "+stack.pop());
            System.out.println("Value: "+stack.pop());

            System.out.println("Empty: "+stack.isEmpty());

            System.out.println("Peek Object: "+stack.peek());
        }
        catch(IllegalStateException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}