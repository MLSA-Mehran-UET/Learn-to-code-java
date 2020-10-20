abstract class AbstractCollection implements Collection{
    protected AbstractCollection(){}
    public boolean add(Object object){
        throw new UnsupportedOperationException();
    }
    public abstract boolean contains(Object object);
    public abstract int size();
    public abstract Iterator iterator();
    public void clear(){
        for(Iterator it=iterator();it.hasNext(); ){
            it.next();
            it.remove();
        }
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public boolean remove(Object object){
        Iterator it=iterator();
        if(object==null){
            while(it.hasNext()){
                if(it.next()==null){
                    it.remove();
                    return true;
                }
            }
        }
        else{
            while(it.hasNext()){
                if(object.equals(it.next())){
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }
    public String toString(){
        int i=0;    //variable used to help in setting last object
        String str="";
        Iterator it=iterator();
        while(it.hasNext()){
            if(i==size()-1)
                str+=it.next();
            else    
                str+=it.next()+",";
            i++;
        }
        return "["+str+"]";
    }
}