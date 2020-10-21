class ArrayCollection extends AbstractCollection{
    private final int INITIAL_LENGTH=16;
    private int size;
    private Object []a=new Object[INITIAL_LENGTH];
    public boolean add(Object obj){
        if(size==a.length)
            resize();
        a[size++]=obj;
        return true;
    }
    public int size(){
        return size;
    }
    public Iterator iterator(){
        return new Iterator(){
            private int i=0;
            private boolean okToRemove=false;
            public boolean hasNext() {
                return (i<size);
            }
            public Object next() {
                if(i==size)
                    throw new RuntimeException("No next object is present.");
                okToRemove=true;
                return a[i++];
            }
            public void remove() {
                if(!okToRemove)
                    throw new RuntimeException("No object is present");
                a[--i]=a[--size];
                a[size]=null;
                okToRemove=false;
            }
            
        };
    }
    public boolean contains(Object obj){
        return false;
    }
    private void resize(){
        Object []aa = a;
        a = new Object[2*aa.length];
        System.arraycopy(aa,0,a,0,size);
    }
}