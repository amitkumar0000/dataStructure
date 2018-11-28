package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public BinaryTree left,right;
    public int ele;

    public BinaryTree root;


    public void insert(int ele){
        BinaryTree node = new BinaryTree();
        node.left = node.right = null;
        node.ele = ele;
        BinaryTree curPtr  = root;

        Queue<BinaryTree> queue = new LinkedList();
        queue.add(curPtr);


        if(root == null){
            root = node;
        }else{
            while(curPtr.left!=null && curPtr.right!=null){

                BinaryTree bt = queue.poll();

                curPtr = bt;

                if(bt.left!=null && bt.right!=null){
                    queue.add(bt.left);
                    queue.add(bt.right);
                }

            }
            if(curPtr.left == null)
                curPtr.left = node;
            else
                curPtr.right = node;
        }
    }



}
