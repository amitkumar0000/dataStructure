package GraphDs;

import DisjointSets.DisjointSets;

import java.util.*;

public class MinimumSpanningTree {

    class Vertex{
        char key;

        public Vertex(char key){
            this.key = key;
        }

        @Override
        public int hashCode() {
            return key*30;
        }

        @Override
        public boolean equals(Object obj) {
            Vertex vertex = (Vertex)obj;
            return vertex.key == key ? true : false;
        }
    }

    class Edge implements Comparable<Edge>{
        Vertex v1;
        Vertex v2;
        int wt;

        public Edge(Vertex v1, Vertex v2, int wt){
            this.v1 = v1;
            this.v2 = v2;
            this.wt = wt;
        }

        @Override
        public int hashCode() {
            return v1.key + v2.key + wt;
        }

        @Override
        public boolean equals(Object obj) {
            Edge edge = (Edge)obj;
            if(edge.v1.equals(v2) && edge.v2.equals(v1))
                return true;
            else
                return false;
        }


        @Override
        public int compareTo(Edge edge) {
            return wt - edge.wt;
        }
    }

    List<Character> adjlist[];
    List<Edge> edgelist;
    boolean isDirected;
    DisjointSets disjointSets;

    Set<Edge> resultSet;

    public MinimumSpanningTree(int numVtx, boolean isDirected){
        adjlist = new LinkedList[numVtx];
        edgelist = new LinkedList<>();
        this.isDirected = isDirected;
        disjointSets = new DisjointSets();
        resultSet = new HashSet<>();
        for(int i=0; i< adjlist.length; i++){
            adjlist[i] = new LinkedList<>();
        }
    }

    public void add(char src, char dest, int wt){
        Vertex vertex1 = new Vertex(src);
        Vertex vertex2 = new Vertex(dest);

        Edge edge = new Edge(vertex1,vertex2,wt);
        if(!edgelist.contains(edge)) {
            edgelist.add(edge);
        }

        List<Character> list = adjlist[src - 'A'];
        if(!list.contains(src)){
            list.add(src);
        }
        list.add(dest);
        if(!isDirected){
            List<Character> list1 = adjlist[dest - 'A'];
            if(!list1.contains(dest)){
                list1.add(dest);
            }
            list1.add(src);
        }
    }

    public Set<Edge> MST(){

        Collections.sort(edgelist);
        resultSet = new LinkedHashSet<>();

        DisjointSets disjointSets = new DisjointSets();
        for(int i=0; i<adjlist.length; i++){
            disjointSets.makeSet(adjlist[i].get(0));
        }

        for(int i=0; i<edgelist.size(); i++){
            Edge edge = edgelist.get(i);
            char v1 = edge.v1.key;
            char v2 = edge.v2.key;

            if(disjointSets.findSet(v1) != disjointSets.findSet(v2)){
                disjointSets.union(v1,v2);
                resultSet.add(edge);
            }
        }

        return resultSet;
    }


}
