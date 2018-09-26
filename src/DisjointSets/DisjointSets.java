package DisjointSets;

import java.util.HashMap;
import java.util.Map;

public class DisjointSets {

    public class Node{
        int rank;
        char data;
        Node parent;
    }

    Map<Character,Node> map;

    public DisjointSets(){
        map = new HashMap<>();
    }

    public void makeSet(char data){
        Node node = new Node();
        node.rank = 0;
        node.data = data;
        node.parent = node;
        map.put(data,node);
    }

    public Node findSets(Node node){

        if(node.parent == node){
            return node.parent;
        }else{
           node.parent = findSets(node.parent);
        }
        return node.parent;
    }

    public Node findSet(char v1){
        return findSets(map.get(v1));
    }

    public void union(char data1, char data2){
        Node node1 = map.get(data1);
        Node node2 = map.get(data2);

        Node parent1 = findSets(node1);
        Node parent2 = findSets(node2);

        if(parent1.rank >= parent2.rank) {
            parent1.rank = parent1.rank==parent2.rank?parent1.rank+1:parent1.rank;
            parent2.parent = parent1;
        }else{
            parent1.parent = parent2;
        }

    }

}
