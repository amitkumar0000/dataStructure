package Graph;

import java.util.*;

public class GraphTraversal {

    public void bfsTraversal(Graph graph){
        System.out.println("======BFS Traversal=====");
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

    public void dfsTraversal(Graph graph){
        System.out.println("\n======DFS Traversal=====");
        Set<Long> visited = new HashSet<>();
        Stack<Graph.Vertex> s = new Stack<>();

        for(Graph.Vertex vertex : graph.getAllVertex()){
            if(!visited.contains(vertex.getId())){
                s.push(vertex);
                while(!s.isEmpty()){
                    boolean isAllVisited = false;
                    Graph.Vertex vs = s.peek();
                    if(!visited.contains(vs.getId())){
                        visited.add(vs.getId());
                        System.out.print(vs.getId()+ " ");
                    }
                    for(Graph.Vertex v: vs.getAdjacentVertex()){
                        if(!visited.contains(v.getId())){
                            s.push(v);
                            isAllVisited = true;
                        }
                    }
                    if(!isAllVisited){
                        s.pop();
                    }
                }
            }
        }

    }
}
