package Tree.traversal.DifferentTreeView;

import Tree.BinaryTree;

import java.util.Stack;

public class SpiralView {

    public void spiral(BinaryTree root){
        Stack<BinaryTree> s1 = new Stack();
        Stack<BinaryTree> s2 = new Stack();

        s1.add(root);
        while(!s1.isEmpty()){
            BinaryTree node1 =  s1.pop();
            System.out.print(node1.ele+ " ");
            if(node1.right!=null){
                s2.add(node1.right);
            }
            if(node1.left!=null){
                s2.add(node1.left);
            }

            while(!s2.isEmpty()){
                BinaryTree node2 = s2.pop();
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
