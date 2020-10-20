class ArrayQueue implements Queue{
    private Object []a;
    private int size;

    public ArrayQueue(int capacity){
        a=new Object[capacity];
    }
    public void add(Object object){
        a[size++]=object;
    }
    public Object first(){
        if(size==0)
            throw new IllegalStateException("Queue Empty");
        return a[0];
    }
    public Object remove(){
        if(size==0)
            throw new IllegalStateException("Queue Empty");
        --size;
        Object obj=a[0];
        System.arraycopy(a,1,a,0,size);
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
        for(int i=0;i<size;i++){
            if(i==size-1)
                str+=a[i];
            else
                str+=a[i]+",";
        }
        return "["+str+"]";
    }
    
}