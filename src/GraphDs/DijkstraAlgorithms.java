package GraphDs;

import BinaryHeap.MinBinaryHeap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DijkstraAlgorithms {
    class Vertex {
        char val;
        int weight;

        public Vertex(char src, int w) {
            this.val = src;
            this.weight = w;
        }

        @Override
        public boolean equals(Object obj) {
            Vertex v = (Vertex) obj;
            if (val == v.val)
                return true;
            else
                return false;
        }
    }

    List<Vertex> adjlist[];
    boolean isDirected;


    MinBinaryHeap minBinaryHeap;

    char src,cur;

    Map<Character,Character> pathMap;
    Map<Character,Integer> distanceMap;

    public DijkstraAlgorithms(int sz, boolean isDirected) {
        this.isDirected = isDirected;
        adjlist = new LinkedList[sz];

        for (int i = 0; i < sz; i++) {
            adjlist[i] = new LinkedList<>();
        }

        minBinaryHeap = new MinBinaryHeap();
        pathMap = new HashMap<>();
        distanceMap = new HashMap<>();

    }

    public void initBinaryHeap() {
        for(int i=0; i<adjlist.length; i++){
            Vertex vertex = adjlist[i].get(0);
            minBinaryHeap.insert(vertex.val,Integer.MAX_VALUE);
        }
    }

    public void add(char src, char dest, int weight) {
        List<Vertex> srclist = adjlist[src - 'A'];

        Vertex srcV = new Vertex(src, 0);
        if (!srclist.contains(srcV)) {
            srclist.add(srcV);
        }
        Vertex destV = new Vertex(dest, weight);
        if (!srclist.contains(destV))
            srclist.add(destV);
        if (!isDirected) {
            List<Vertex> dstList = adjlist[dest - 'A'];
            Vertex destV1 = new Vertex(dest, 0);
            if (!dstList.contains(destV1)) {
                dstList.add(destV1);
            }
            Vertex srcV1 = new Vertex(src, weight);
            if (!dstList.contains(srcV1))
                dstList.add(srcV1);
        }
    }

    public void shortestPath(char src){
        this.src = src;
        this.cur = src;

        pathMap.put(src,null);
        distanceMap.put(src,0);

        while(!minBinaryHeap.isEmpty()){
            MinBinaryHeap.BH bh =minBinaryHeap.getMinVertex();
            cur = bh.getVertex();
            List<Vertex> list = adjlist[cur-'A'];
            if(bh.getKey() == Integer.MAX_VALUE) {
                distanceMap.put(cur, 0);
            }else{
                distanceMap.put(cur, bh.getKey());
            }
            for(Vertex v: list){
                if(minBinaryHeap.contain(v.val)){
                    int pos = minBinaryHeap.getVertexPos(v.val);
                    if(minBinaryHeap.getVertex(pos).getKey() >
                            (distanceMap.get(cur) + v.weight)){

                        minBinaryHeap.decreaseKey(v.val,distanceMap.get(cur) + v.weight);
                        pathMap.put(v.val,cur);
                    }

                }
            }
            minBinaryHeap.deletekey(cur);
        }

        System.out.println("Distance from Source A to ");


        for(Map.Entry entry : distanceMap.entrySet()) {
            System.out.println(entry.getKey() + " is "+ entry.getValue());
        }

        System.out.println("Path from Source A to ");


        for(Map.Entry entry : pathMap.entrySet()) {
            System.out.println(entry.getKey() + " from "+ entry.getValue());
        }



        System.out.println("=== Shortest Paht Map ======");
    }

}
