package Graph;

import java.util.*;

public class Graph {

    class Vertex{
        private long id;
        private List<Vertex> adjacentVertex;
        private List<Edge> edges;

        public Vertex(long id){
            this.id = id;
            adjacentVertex = new ArrayList<>();
            edges = new ArrayList<>();
        }

        public void addAdjacentVertex(Edge edge , Vertex vertex){
            edges.add(edge);
            adjacentVertex.add(vertex);
        }

        public long getId() {
            return id;
        }

        public List<Vertex> getAdjacentVertex() {
            return adjacentVertex;
        }
    }

    class Edge{
        Vertex vertex1;
        Vertex vertex2;
        int weight;
        boolean isDirected;

        public Edge(Vertex vertex1, Vertex vertex2, boolean isDirected, int weight) {
            this.vertex1 = vertex1;
            this.vertex2 = vertex2;
            this.isDirected =isDirected;
            this.weight = weight;
        }
    }

    List<Edge> allEdges;
    Map<Long, Vertex> allVertex;
    boolean isDirected;

    public Graph(boolean isDirected){
        allEdges = new ArrayList<>();
        allVertex = new HashMap<>();
        this.isDirected = isDirected;
    }

    public void addEdge(long id1,long id2){
        addEdge(id1,id2,0);
    }

    private void addEdge(long id1,long id2, int weight){
        Vertex vertex1 = null;
        if(allVertex.containsKey(id1)){
            vertex1 = allVertex.get(id1);
        }else{
            vertex1 = new Vertex(id1);
            allVertex.put(id1,vertex1);
        }
        Vertex vertex2 = null;
        if(allVertex.containsKey(id2)){
            vertex2 = allVertex.get(id2);
        }else{
            vertex2 = new Vertex(id2);
            allVertex.put(id2,vertex2);
        }

        Edge edge = new Edge(vertex1,vertex2,isDirected,weight);

        vertex1.addAdjacentVertex(edge,vertex2);
        if(!isDirected){
            vertex2.addAdjacentVertex(edge,vertex1);
        }
    }

    public Collection<Vertex> getAllVertex() {
        return allVertex.values();
    }
}
