class Graph{
    int size;
    List[] a;   //adjacency list

    public Graph(String[] args){
        size = args.length;
        a = new List[size];
        for(int i=0;i<size;i++)
            a[i] = new List(args[i]);
    }

    public void add(String v,String w){
        a[index(v)].add(index(w));
        a[index(w)].add(index(v));
    }
    private int index(String s){
        for(int i=0;i<size;i++)
            if(a[i].vertex.equals(s))
                return i;
        return a.length;
    }

    public String toString(){
        if(size==0)
            return "{}";
        StringBuffer buffer = new StringBuffer("{"+a[0]);
        for(int i=1;i<size;i++)
            buffer.append(","+a[i]);
        return buffer+"}";
    }

    private class List{
        String vertex;
        Node edges;

        List(String vertex){
            this.vertex=vertex;
        }

        public void add(int j){
            edges = new Node(j,edges);
        }

        public String toString(){
            StringBuffer buffer = new StringBuffer(vertex);
            if(edges!=null)
                buffer.append(":");
            for(Node p=edges; p!=null; p=p.next)
                buffer.append(Graph.this.a[p.to].vertex);
            return buffer+"";
        }

        private class Node{
            int to;
            Node next;
            Node(int to,Node next){
                this.to=to;
                this.next=next;
            }
        }
    }
}