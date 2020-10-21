class HashTable implements Map{
    private Entry[] entries;
    private int size;
    private float loadFactor;

    public HashTable(int capacity,float loadFactor){
        entries = new Entry[capacity];
        this.loadFactor = loadFactor;
    }
    public HashTable(int capacity){
        this(capacity,0.75F);
    }
    public HashTable(){
        this(101);
    }

    private class Entry{
        Object key,value;
        Entry next;
        Entry(Object key,Object value,Entry next){
            this.key=key;
            this.value=value;
            this.next=next;
        }
    }

    public Object get(Object key){
        int h = hash(key);
        for(Entry e=entries[h];e!=null;e=e.next){
            if(e.key.equals(key))
                return e.value;   //success
        }
        return null;    // failure: key not found
    }

    public Object put(Object key,Object value){
        int h = hash(key);
        for(Entry e=entries[h];e!=null;e=e.next){
            if(e.key.equals(key)){
                Object oldValue = e.value;
                e.value = value;
                return oldValue;    //successful update
            }
        }
        entries[h] = new Entry(key,value,entries[h]);
        ++size;
        if(size>loadFactor*entries.length)
            rehash();
        return null;    // Successfull insertion
    }
    
    public Object remove(Object key){
        int h = hash(key);
        for(Entry e=entries[h],prev=null ; e!=null; prev=e,e=e.next){
            if(e.key.equals(key)){
                Object oldValue = e.value;
                if(prev==null)
                    entries[h] = e.next;
                else
                    prev.next = e.next;
                --size;
                return oldValue;    //successful update
            }
        }
        return null;    //failure: key not found
    }

    public int size(){
        return size;
    }

    private int hash(Object key){
        if(key==null)
            throw new IllegalArgumentException();
        return (key.hashCode() & 0x7FFFFFFF)%entries.length;
    }

    private void rehash(){
        Entry[] oldEntries = entries;
        entries = new Entry[2*entries.length+1];
        for(int k=0;k<oldEntries.length;k++){
            for(Entry old=oldEntries[k] ; old!=null ; ){
                Entry e = old;
                old = old.next;
                int h = hash(e.key);
                e.next = entries[h];
                entries[h]=e;
            }
        }
    }
}