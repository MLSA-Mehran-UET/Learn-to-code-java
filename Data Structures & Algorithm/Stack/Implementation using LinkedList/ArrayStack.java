/*We can alse extend Stack class and by overriding its method we can implement Stack which is a best practice
but for learning we are making the interface or we can say it is a ADT of Stack*/

public class ArrayStack implements Stack{
    private Object []a;
    private int size;

    //In Constructor we will give initial capacity
    public ArrayStack(int capacity){    
        a = new Object[capacity];   
    }

    public Object peek(){
        if(size==0){
            throw new IllegalStateException("StackEmpty");
        }

        return a[size-1];   //returns the top(last in) element
    }

    public Object pop(){
        if(size==0){
            throw new IllegalStateException("StackEmpty");
        }

        Object obj = a[--size];   //returns the top element and size decreases by 1
        a[size]=null;   //makes the element null which is poped
        return obj;    //returns the element
    }

    public void push(Object object){
        if(size==a.length){
            resize();
        }

        a[size++]=object;   /*Suppose the size is 8 so last Object will be on 7 so when we will insert the new Object
                            it will be placed on 8 which is the size and then size will be increased therefore
                            we use post increement*/
    }

    public boolean isEmpty(){
        return (size==0);  //if size==0 it will return true, because stack is empty otherwise false
    }

    public int size(){
        return size;
    }

    public String toString(){
        String str="";
        for(int i=0;i<size;i++){
            if(i==size-1){
                str+=a[i];
            }
            else{
                str+=a[i]+",";
            }
        }
        return "["+str+"]";
    }

    private void resize(){
        Object []aa = a;
        a = new Object[2*aa.length];
        System.arraycopy(aa,0,a,0,size);
    }

}