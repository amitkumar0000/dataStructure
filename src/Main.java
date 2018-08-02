import Graph.Graph;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        createGraph();
    }

    private static void createGraph() {
        Graph graph = new Graph(5);

        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(1,2);
        graph.addEdge(3,4);

        graph.printGraph();
    }
}
