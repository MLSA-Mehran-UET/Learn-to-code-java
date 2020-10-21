class LinkedCollection extends AbstractCollection{
    private Node head = new Node(null);
    private int size;

    private static class Node{
        Object object;
        Node next;
        Node prev;
        Node(){
            next=this;
            prev=this;
        }
        Node(Object object){
            this.object=object;
        }
        Node(Object object,Node prev,Node next){
            this.object=object;
            this.next=next;
            this.prev=prev;
        }
    }

    public boolean add(Object obj){
        head.prev = head.prev.next = new Node(obj, head.prev, head);
        ++size;
        return true;
    }
    public Iterator iterator(){
        return new Iterator() {
            private Node cursor=head.next;
            private boolean okToRemove=false;
            public boolean hasNext(){
                return cursor!=head;
            }
            public Object next(){
                if(cursor==head)
                    throw new RuntimeException();
                okToRemove=true;
                Object obj=cursor.object;
                cursor = cursor.next;
                return obj;
            }
            public void remove(){
                if(!okToRemove)
                    throw new RuntimeException();
                cursor.prev = cursor.prev.prev;
                cursor.prev.next = cursor;
                --size;
                okToRemove=false;
            }
        };
    }
}
