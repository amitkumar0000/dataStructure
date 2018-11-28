package Tree.traversal.DifferentTreeView;

import Tree.BinarySearchTree;

import java.util.Stack;

public class SpiralView {

    public void spiral(BinarySearchTree root){
        Stack<BinarySearchTree> s1 = new Stack();
        Stack<BinarySearchTree> s2 = new Stack();

        s1.add(root);
        while(!s1.isEmpty()){
            BinarySearchTree node1 =  s1.pop();
            System.out.print(node1.ele+ " ");
            if(node1.right!=null){
                s2.add(node1.right);
            }
            if(node1.left!=null){
                s2.add(node1.left);
            }

            while(!s2.isEmpty()){
                BinarySearchTree node2 = s2.pop();
                System.out.print(node2.ele+" ");
                if(node2.left!=null){
                    s1.add(node2.left);
                }
                if(node2.right!=null){
                    s1.add(node2.right);
                }
            }
        }
    }
}
