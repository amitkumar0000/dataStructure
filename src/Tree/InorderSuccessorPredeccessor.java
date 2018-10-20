package Tree;

public class InorderSuccessorPredeccessor {

    public void InorderSuccessor(BinaryTree root,int ele){
       BinaryTree succ = null;
       while(root!=null){
           if(root.ele>ele){
               succ = root;
               root = root.left;
           }else if(root.ele < ele){
               root = root.right;
           }else
               break;
       }

       if(root!=null && root.right == null){
           if(succ!=null)
               System.out.print(succ.ele);
           else
               System.out.println("No Inorder Successor");
       }else if(root!=null && root.right!=null){
           System.out.print(minimum(root.right).ele);
       }else{
           System.out.println("No Inorder Successor");
       }
    }

    BinaryTree minimum(BinaryTree root){
        if(root == null)
            return null;
        else if(root.left == null)
            return root;
        else
           return minimum(root.left);
    }

}
