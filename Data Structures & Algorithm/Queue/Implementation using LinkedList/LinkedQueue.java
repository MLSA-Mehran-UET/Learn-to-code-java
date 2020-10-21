class LinkedQueue implements Queue{
    private Node head = new Node("null");
    private int size;

    private static class Node{
        Object object;
        Node prev=this;
        Node next=this;
        Node(Object object){
            this.object=object;
        }
        Node(Object object,Node prev,Node next){
            this.object=object;
            this.prev=prev;
            this.next=next;
        }
    }
    
    public void add(Object object){
        ++size;
        head.prev=head.prev.next=new Node(object,head.prev,head);
    }
    public Object first(){
        if(size==0)
            throw new IllegalStateException("Queue Empty");
        return head.next.object;
    }
    public Object remove(){
        if(size==0)
            throw new IllegalStateException("Queue Empty");
        Object obj = head.next.object;
        head.next = head.next.next;
        head.next.prev = head;
        --size;
        return obj;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public String toString(){
        String str="";
        Node n = head.next;
        while(n.next!=head){
            str+=n.object+",";
            n=n.next;
        }
        str+=n.object;
        return "["+str+"]";

    }
    public Object[] toArray(){
        Object []array = new Object[size];
        Node n = head.next;
        int count=0;
        while(n.next!=head){
            array[count++]=n.object;
            n=n.next;
        }
        array[count++]=n.object;
        return array;
    }
    public Object second(){
        if(size>1)
            return head.next.next.object;
        System.out.println("Second Object does not exist");
        return null;
    }
    public Object secondLast(){
        if(size>1)
            return head.prev.prev.object;
        System.out.println("SecondLast Object does not exist");
        return null;
    }
}