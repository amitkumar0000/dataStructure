import Graph.GraphBasicStructure;
import Graph.GraphTraversal;
import Graph.Graph;

public class Main {

    static GraphBasicStructure graphBasicStructure;
    static Graph graph;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        createGraph();

        graphTraversal();
    }

    private static void createGraph() {
//        graphBasicStructure = new GraphBasicStructure(5, GraphBasicStructure.GraphType.DIRECTED);
//        addEdges();
//        graphBasicStructure.printGraph();

        graph = new Graph(true);
        addEdges();


    }


    private static void addEdges(){
//        graphBasicStructure.addEdge(0,1);
//        graphBasicStructure.addEdge(0,4);
//        graphBasicStructure.addEdge(1,3);
//        graphBasicStructure.addEdge(1,4);
//        graphBasicStructure.addEdge(1,2);
//        graphBasicStructure.addEdge(3,4);

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
//        traversal.dfsTraversal(graphBasicStructure);
    }




}
