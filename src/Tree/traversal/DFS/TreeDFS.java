package Tree.traversal.DFS;

import Tree.BinarySearchTree;

public class TreeDFS {

    public void Inorder(BinarySearchTree root){
        if(root == null)
            return;
        else{
            Inorder(root.left);
            System.out.print(root.ele+" ");
            Inorder(root.right);
        }
    }

    public void Preorder(BinarySearchTree root){
        if(root == null)
            return;
        else{
            System.out.print(root.ele+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }

    public void Postorder(BinarySearchTree root){
        if(root == null)
            return;
        else{
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.ele+" ");
        }
    }

}
