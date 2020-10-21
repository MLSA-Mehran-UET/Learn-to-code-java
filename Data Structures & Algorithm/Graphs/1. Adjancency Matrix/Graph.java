class Graph{
    int size;
    String[] vertices;
    boolean[][] a;

    public Graph(String[]args){
        size = args.length;
        vertices = new String[size];
        System.arraycopy(args, 0, vertices, 0, size);
        a = new boolean[size][size];
    }

    public void add(String v,String w){
        int i = index(v);
        int j = index(w);
        a[i][j]=a[j][i]=true;
    }
    private int index(String s){
        for(int i=0;i<size;i++)
            if(vertices[i].equals(s))
                return i;
        return a.length;
    }

    public String toString(){
        if(size==0)
            return "{}";
        StringBuffer buffer = new StringBuffer("{"+vertex(0));
        for(int i=1;i<size;i++)
            buffer.append(","+vertex(i));
        return buffer+"}";
    }
    private String vertex(int i){
        StringBuffer buffer = new StringBuffer(vertices[i]+":");
        for(int j=0;j<size;j++)
            if(a[i][j])
                buffer.append(vertices[j]);
        return buffer+"";
    }
}