package Tree.traversal.DifferentTreeView;

import Tree.BinarySearchTree;

import java.util.*;

public class DiagonalView {
    public void diagonal(BinarySearchTree root){
        Map<BinarySearchTree,Integer> nodeKey = new LinkedHashMap<>();
        Queue q = new LinkedList();
        Map<Integer,Queue<Integer>> viewMap = new LinkedHashMap<>();

        q.add(root);
        nodeKey.put(root,0);

        while(!q.isEmpty()){
            BinarySearchTree node = (BinarySearchTree) q.poll();
            int key = nodeKey.get(node);

            if(!viewMap.containsKey(key)){
                Queue<Integer> viewMapQueue1 = new LinkedList<>();
                viewMapQueue1.add(node.ele);
                viewMap.put(key,viewMapQueue1);
            }else{
                Queue<Integer> viewMapQueue2 = viewMap.get(key);
                viewMapQueue2.add(node.ele);
            }

            if(node.left!=null){
                q.add(node.left);
                nodeKey.put(node.left,key-1);
            }
            if(node.right!=null){
                q.add(node.right);
                nodeKey.put(node.right,key);
            }
        }



        for(Map.Entry<Integer,Queue<Integer>> mapEntry: viewMap.entrySet()){
            Queue<Integer> queue = mapEntry.getValue();
            while(!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }
            System.out.print("\n");
        }
    }
}
