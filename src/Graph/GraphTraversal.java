package Graph;

import java.util.*;

public class GraphTraversal {

    Set<Integer> isBfsVisited;
    Set<Integer> isDfsVisited;

    public GraphTraversal(){
        isBfsVisited = new HashSet<>();
        isDfsVisited = new HashSet<>();
    }

    public void bfsTraversal(Graph graph){
        System.out.println("======BFS Traversal=====");
        /*
        Queue<LinkedList<Integer>> queue = new LinkedList<>();
        
        for(int i=0; i<graph.getV(); i++)
            queue.add(graph.adjlist[i]);

        while(!queue.isEmpty()){
            LinkedList<Integer>  vertex = queue.poll();
            for(int i=0; i < vertex.size(); i++) {
                if (!isBfsVisited.contains(vertex.get(i))) {
                    isBfsVisited.add(vertex.get(i));
                    System.out.print(vertex.get(i) + " ");
                }
            }
        }
        
        for(int i = 0; i<graph.getV(); i++){
            if (!isBfsVisited.contains(i)) {
                isBfsVisited.add(i);
                System.out.print(i + " ");
            }
        }*/

        Set<Long> visited =  new HashSet<>();
        Queue<Graph.Vertex> q = new LinkedList<>();
        for(Graph.Vertex vertex: graph.getAllVertex()){
            if(!visited.contains(vertex.getId())){
                q.add(vertex);
                while(!q.isEmpty()){
                    Graph.Vertex vq = q.poll();
                    if(!visited.contains(vq.getId())) {
                        visited.add(vq.getId());
                        System.out.print(vq.getId() + " ");
                    }
                    for(Graph.Vertex v : vq.getAdjacentVertex()){
                        if(!visited.contains(v.getId())){
                            q.add(v);
                        }
                    }
                }
            }
        }


    }

    public void dfsTraversal(GraphBasicStructure graphBasicStructure){
        System.out.println("\n======DFS Traversal=====");

    }
}
