class LinkedStack implements Stack{
    private Node top;
    private int size;

    private static class Node{
        Object object;
        Node next;
        Node(Object object,Node next){
            this.object=object;
            this.next=next;
        }
    } //end of inner class

    public Object peek(){
        if(size==0)
            throw new IllegalStateException("Stack Empty");
        return top.object;
    }

    public Object pop(){
        if(size==0)
            throw new IllegalStateException("Stack Empty");
        Object oldtop = top.object;
        top = top.next;
        --size;
        return oldtop;
    }

    public void push(Object object){
        top = new Node(object,top);
        ++size;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public String toString(){
        String str="";
        Node n = top;
        while(n.next!=null){
            str=","+n.object+str;
            n=n.next;
        }
        str=n.object+str;   //For last Object
        return "["+str+"]"; 
    }

    public ArrayStack toArrayStack(){
        ArrayStack stack = new ArrayStack(size);
        Object []a = new Object[size];
        Node n = top;
        int i=size;
        while(n.next!=null){
            a[--i] = n.object;
            n=n.next;
        }
        a[--i]=n.object;
        for(int j=0;j<size;j++){
            stack.push(a[j]);
        }
        return stack;
    }
}