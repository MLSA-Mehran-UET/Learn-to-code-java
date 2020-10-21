class HashTable implements Map{
    private Entry[] entries;
    private int size;
    private int used;
    private float loadFactor;
    private final Entry NIL = new Entry(null,null);   //dummy

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
        Object key;
        Object value;
        Entry(Object key,Object value){
            this.key=key;
            this.value=value;
        }
    }

    public Object get(Object key){
        int h = hash(key);
        for(int i=0;i<entries.length;i++){
            int j = nextProbe(h,i);
            Entry entry = entries[j];
            if(entry==null)
                break; 
            if(entry==NIL)
                continue;
            if(entry.key.equals(key))
                return entry.value;   //success
        }
        return null;   //failure: key not found
    }

    public Object put(Object key,Object value){
        if(used>loadFactor*entries.length)
            rehash();
        int h = hash(key);
        for(int i=0;i<entries.length;i++){
            int j = nextProbe(h,i);
            Entry entry = entries[j];
            if(entry==null){
                entries[j] = new Entry(key,value);
                ++size;
                ++used;
                return null;   //insertion success
            }
            if(entry==NIL)
                continue;
            if(entry.key.equals(key)){
                Object oldValue = entry.value;
                entries[j].value = value;
                return oldValue;    //update success
            }
        }
        return null;    // failure: table overflow
    }
    
    public Object remove(Object key){
        int h = hash(key);
        for(int i=0;i<entries.length;i++){
            int j = nextProbe(h,i);
            Entry entry = entries[j];
            if(entry==null)
                break; 
            if(entry==NIL)
                continue;
            if(key.equals(entry.key)){
                Object value = entry.value;
                --size;
                entries[j]=NIL;   //dummy value
                return value;    //success
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

    private int nextProbe(int h,int i){
        return (h+i)%entries.length;
    }

    private void rehash(){
        Entry[] oldEntries = entries;
        entries = new Entry[2*entries.length+1];
        for(int k=0;k<oldEntries.length;k++){
            Entry entry = oldEntries[k];
            if(entry==null || entry==NIL)
                continue;
            int h = hash(entry.key);
            for(int i=0;i<entries.length;i++){
                int j = nextProbe(h,i);
                if(entries[j]==null){
                    entries[j] = entry;
                    break;
                }
            }
        }
        used=size;
    }
}