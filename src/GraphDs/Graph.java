package GraphDs;

import java.util.*;

public class Graph {
    List<Integer> adjList[];
    boolean isDirected;

    public Graph(int v, boolean isDirected) {
        this.isDirected = isDirected;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void add(int v1, int v2) {
        List<Integer> list = adjList[v1 - 1];
        if(!list.contains(v2)) {
            list.add(v2);
        }

        if (!isDirected) {
            List<Integer> list1 = adjList[v2 - 1];
            if(!list1.contains(v1)){
                list1.add(v1);
            }
        }
    }

    public void bfs() {
        Set isVisited = new HashSet();
        Queue<Integer> q = new LinkedList<>();


        for (int i = 0; i < adjList.length; i++) {
            List<Integer> list = adjList[i];

            if(!isVisited.contains(i+1)){
                q.add(i+1);
                isVisited.add(i+1);
            }

            for (int value : list) {
                if (!isVisited.contains(value)) {
                    q.add(value);
                    isVisited.add(value);
                }
            }
        }

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }

    public void dfs(){
        Stack<Integer> s = new Stack<>();
        Set isVisited = new HashSet();

        for(int i =0; i< adjList.length; i++){
            if(!isVisited.contains(i+1)){
                s.push(i+1);
                isVisited.add(i+1);
                System.out.println(i+1);
            }
            while(!s.empty()){
                int v = s.peek();
                List<Integer> list = adjList[v-1];
                boolean isAdded = false;
                for(int value: list){
                    if(!isVisited.contains(value)){
                        s.push(value);
                        isVisited.add(value);
                        System.out.println(value);
                        isAdded = true;
                        break;
                    }
                }
                if(!isAdded){
                    s.pop();
                }
            }
        }
    }

    public void dfsRecu(){
        Set isVisited = new HashSet();
        for(int i =0; i< adjList.length; i++){
            dfsUtils(i+1,isVisited);
        }
    }


    public void dfsUtils(int v, Set isVisited){
        if(!isVisited.contains(v))
            System.out.println(v);
        isVisited.add(v);

        List<Integer> list = adjList[v-1];
        for(int i: list){
            if(!isVisited.contains(i)){
                dfsUtils(i,isVisited);
            }
        }
    }

}
