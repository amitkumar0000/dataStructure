package Tree.traversal.DifferentTreeView;

import Tree.BinaryTree;

public class LeftRightView {
    int leftMaxLevel =0;
    int rightMaxLevel = 0;

    public void leftView(BinaryTree root,int level){

        if(root==null)
            return;
        if(leftMaxLevel < level){
            leftMaxLevel = level;
            System.out.print(root.ele +" ");
        }
        leftView(root.left, level+1);
        leftView(root.right,level+1);
    }

    public void rightView(BinaryTree root,int level){
        if(root==null)
            return;
        if(rightMaxLevel < level){
            rightMaxLevel = level;
            System.out.print(root.ele+" ");
        }
        rightView(root.right, level+1);
        rightView(root.left,level+1);
    }
}
