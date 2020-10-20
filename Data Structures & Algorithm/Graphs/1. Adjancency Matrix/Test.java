public class Test{
    public static void main(String[]args)
    {
        String[] vertices={"A","B","C","D","E"};
        Graph graph = new Graph(vertices);

        System.out.println(graph);

        graph.add("A","B");
        graph.add("A","C");
        graph.add("B","C");
        graph.add("B","D");
        graph.add("C","D");        
        graph.add("D","E");

        System.out.println(graph);
    }
}