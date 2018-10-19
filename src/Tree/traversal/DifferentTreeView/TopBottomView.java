package Tree.traversal.DifferentTreeView;

import Tree.BinaryTree;

import java.util.*;

public class TopBottomView {
    public void TopView(BinaryTree root){
        Map<BinaryTree,Integer> nodeKey = new LinkedHashMap<>();
        Queue q = new LinkedList();
        Map<Integer,Queue<Integer>> viewMap = new LinkedHashMap<>();

        q.add(root);
        nodeKey.put(root,0);

        while(!q.isEmpty()){
            BinaryTree node = (BinaryTree) q.poll();
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
                nodeKey.put(node.right,key+1);
            }
        }


        for(Map.Entry<Integer,Queue<Integer>> mapEntry: viewMap.entrySet()){
            Queue<Integer> queue = mapEntry.getValue();
            System.out.print(queue.poll()+" ");
        }

    }

    public void BottomView(BinaryTree root){
        Map<BinaryTree,Integer> nodeKey = new LinkedHashMap<>();
        Queue q = new LinkedList();
        Map<Integer, Stack<Integer>> viewMap = new LinkedHashMap<>();

        q.add(root);
        nodeKey.put(root,0);

        while(!q.isEmpty()){
            BinaryTree node = (BinaryTree) q.poll();
            int key = nodeKey.get(node);

            if(!viewMap.containsKey(key)){
                Stack<Integer> viewMapQueue1 = new Stack<>();
                viewMapQueue1.add(node.ele);
                viewMap.put(key,viewMapQueue1);
            }else{
                Stack<Integer> viewMapQueue2 = viewMap.get(key);
                viewMapQueue2.add(node.ele);
            }

            if(node.left!=null){
                q.add(node.left);
                nodeKey.put(node.left,key-1);
            }
            if(node.right!=null){
                q.add(node.right);
                nodeKey.put(node.right,key+1);
            }
        }


        for(Map.Entry<Integer,Stack<Integer>> mapEntry: viewMap.entrySet()){
            Stack<Integer> queue = mapEntry.getValue();
            System.out.print(queue.pop()+" ");
        }
    }
}
