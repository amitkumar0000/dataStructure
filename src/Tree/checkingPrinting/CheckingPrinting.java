package Tree.checkingPrinting;

import Tree.BinaryTree;

public class CheckingPrinting {

    public boolean isChildSum(BinaryTree bt){

        int leftV=0; int rightV = 0;
        if(bt == null)
            return true;
        if(bt.left!=null){
            leftV = bt.left.ele;
        }
        if(bt.right!=null){
            rightV = bt.right.ele;
        }

        if(leftV+rightV == bt.ele ){
            return isChildSum(bt.left) && isChildSum(bt.right);
        }else if(bt.right==null && bt.left== null)
            return true;
        else
            return false;
    }

    public boolean isBST(BinaryTree bt){
        if(bt == null)
            return true;
        if(bt.left==null && bt.right == null)
            return true;
        if((bt.right!=null && bt.right.ele < bt.ele) || (bt.left!=null && bt.left.ele>bt.ele))
            return false;
        else
            return isBST(bt.left) && isBST(bt.right);
    }

}
