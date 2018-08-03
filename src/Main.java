import Graph.GraphTraversal;
import Graph.Graph;

public class Main {

    static Graph graph;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        createGraph();

        graphTraversal();
    }

    private static void createGraph() {
        graph = new Graph(true);
        addEdges();
    }


    private static void addEdges(){
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(4,6);
        graph.addEdge(5,3);
        graph.addEdge(6,5);
    }

    private static void graphTraversal() {
        GraphTraversal traversal = new GraphTraversal();

        traversal.bfsTraversal(graph);
        traversal.dfsTraversal(graph);
    }




}
