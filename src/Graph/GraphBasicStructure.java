package Graph;

import java.util.LinkedList;

public class GraphBasicStructure {
    int V;
    LinkedList<Integer> adjlist[];
    int adjMatrix[][];

    public enum GraphType {DIRECTED, UNDIRECTED} ;

    GraphType type;

    public GraphBasicStructure(Integer V, GraphType type){
        this.V = V;
        this.type = type;

        initAdjList();

        initAdjMatx();
    }


    private void initAdjList() {
        adjlist = new LinkedList[V];

        for(int i=0; i<V; i++){
            adjlist[i] = new LinkedList<>();
        }
    }

    private void initAdjMatx() {
        adjMatrix = new int[V][V];
    }

    public void addEdge(int src, int dest){
        addEdgeToList(src,dest);
        addEdgeToMatrix(src,dest);
    }


    private void addEdgeToList(int src, int dest) {
        adjlist[src].addLast(dest);
        if(type.equals(GraphType.UNDIRECTED))
            adjlist[dest].addLast(src);
    }

    private void addEdgeToMatrix(int src, int dest) {
        adjMatrix[src][dest] = 1;
        if(type.equals(GraphType.UNDIRECTED))
            adjMatrix[dest][src] = 1;
    }



    public void printGraph(){
        printAdjList();
        printAdjMatx();
    }

    private void printAdjList() {
        System.out.println("=========Adjacency list=====");
        for(int i=0; i < V; i++){
            System.out.println("vertex:: "+ i);
            for(Integer ele : adjlist[i]){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    private void printAdjMatx() {
        System.out.println("=========Adjacency Matrix=====");
        for(int i=0; i<V; i++){
            System.out.println("Vertex:: "+ i);
            for(int j=0; j<V; j++){
                if(adjMatrix[i][j] == 1){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

    }

    public int getV() {
        return V;
    }
}
