package Tree.traversal;

import Tree.BinaryTree;

public class LCA {

    public void lowestCommonAncestor(BinaryTree root,int ele1,int ele2){

        if(root==null) {
            System.out.println("No Common Ancestor");
            return;
        }else if(root.ele == ele1 || root.ele == ele2){
            System.out.println(root.ele);
        } else{
            if((ele1 > root.ele && ele2 < root.ele)||(ele1 < root.ele && ele2 > root.ele)){
                System.out.println(root.ele);
            }else if(ele1 > root.ele && ele2 > root.ele){
                if(root.right!=null && (root.right.ele == ele1 || root.right.ele == ele2))
                    System.out.println(root.ele);
                else
                    lowestCommonAncestor(root.right,ele1,ele2);
            }else if(ele1 < root.ele && ele2 < root.ele){
                if(root.left!=null && (root.left.ele==ele1 || root.left.ele == ele2))
                    System.out.println(root.ele);
                else
                    lowestCommonAncestor(root.left,ele1,ele2);
            }
        }
    }
}
