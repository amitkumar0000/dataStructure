package BinaryHeap;

import java.util.*;

public class MinBinaryHeap {



    public class BH{
        char vertex;
        int key;
        public BH(char v, int key){
            this.vertex = v;
            this.key = key;
        }
        @Override
        public boolean equals(Object obj) {
            BH bh = (BH)obj;
            return key>bh.key ? true : false;
        }

        public char getVertex() {
            return vertex;
        }

        public int getKey() {
            return key;
        }
    }

    List<BH> binaryHeap;
    Map<Character,Integer> nodeMap;


    public void insert(char vtx, int wt){
        if(binaryHeap == null){
            binaryHeap = new LinkedList<>();
            nodeMap = new HashMap<>();
        }
        BH node = new BH(vtx,wt);
        binaryHeap.add(node);
        int curPos = binaryHeap.size() - 1;
        nodeMap.put(vtx,curPos);
        swap(curPos);
    }


    int parent(int i){
        return (i-1)/2;
    }

    public void decreaseKey(char vtx, int newKey){
        int curPos = nodeMap.get(vtx);
        BH node = binaryHeap.get(curPos);
        node.key = newKey;
        swap(curPos);
    }

    public BH getMinVertex(){
        return binaryHeap.get(0);
    }

    public BH getVertex(int pos){
        return binaryHeap.get(pos);
    }

    public boolean contain(char vert){
        return nodeMap.containsKey(vert);
    }

    public void deletekey(char vtx){
        decreaseKey(vtx,Integer.MIN_VALUE);
        extractMin();
    }

    public BH extractMin(){
        BH root = binaryHeap.get(0);
        binaryHeap.set(0, binaryHeap.get(binaryHeap.size()-1));
        nodeMap.put(binaryHeap.get(binaryHeap.size()-1).vertex,0);

        binaryHeap.set(binaryHeap.size()-1,root);
        nodeMap.put(root.vertex,binaryHeap.size()-1);

        binaryHeap.remove(binaryHeap.size()-1);
        nodeMap.remove(root.vertex);
        heapify(0);
        return root;
    }

    public boolean isEmpty() {
        return binaryHeap.size()>0 ? false: true;
    }

    public int getVertexPos(char val) {
        return nodeMap.get(val);
    }

    private void swap(int curPos) {
        while(curPos!=0){
            int parentPos = parent(curPos);
            BH parentNode = binaryHeap.get(parentPos);
            BH curNode = binaryHeap.get(curPos);
            if(parentNode.key > curNode.key){
                binaryHeap.set(parentPos,curNode);
                binaryHeap.set(curPos,parentNode);
                nodeMap.put(parentNode.vertex,curPos);
                nodeMap.put(curNode.vertex,parentPos);
                curPos = parentPos;
            }else{
                break;
            }
        }
    }

    private void heapify(int pos) {
        int l = 2*pos + 1;
        int r = 2*pos + 2;
        if(binaryHeap.size() <= 0)
            return;
        int smallest = binaryHeap.get(pos).key;
        int postoSwap=pos;
        if(l < binaryHeap.size()-1 && binaryHeap.get(l).key < smallest){
            smallest = binaryHeap.get(l).key;
            postoSwap = l;
        }
        if(r < binaryHeap.size()-1 && binaryHeap.get(r).key < smallest){
            smallest = binaryHeap.get(r).key;
            postoSwap = r;
        }
        if(pos!= postoSwap){
            BH posNode = binaryHeap.get(pos);
            BH postToSwapNode = binaryHeap.get(postoSwap);
            binaryHeap.set(pos,postToSwapNode);
            binaryHeap.set(postoSwap,posNode);
            nodeMap.put(postToSwapNode.vertex, pos);
            nodeMap.put(posNode.vertex, postoSwap);
            heapify(postoSwap);
        }
    }
}
