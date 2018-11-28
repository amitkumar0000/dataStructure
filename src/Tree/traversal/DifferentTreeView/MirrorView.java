package Tree.traversal.DifferentTreeView;

import Tree.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorView {

    public void Mirror(BinarySearchTree root){
        Queue q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()){
            BinarySearchTree node = (BinarySearchTree) q.poll();
            System.out.print(node.ele+" ");

            if(node.right!=null)
                q.add(node.right);
            if(node.left!=null)
                q.add(node.left);

        }
        System.out.print("\n");
    }
}
