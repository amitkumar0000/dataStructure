package Tree;

public class InorderSuccessorPredeccessor {

    public void InorderSuccessor(BinarySearchTree root, int ele){
       BinarySearchTree succ = null;
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

    BinarySearchTree minimum(BinarySearchTree root){
        if(root == null)
            return null;
        else if(root.left == null)
            return root;
        else
           return minimum(root.left);
    }

    BinarySearchTree max(BinarySearchTree root){
        if(root == null)
            return null;
        else if(root.right == null)
            return root;
        else
            return max(root.right);
    }

    public void InorderPredeccessor(BinarySearchTree root, int ele){
        BinarySearchTree pred = null;
        while(root!=null){
            if(root.ele>ele){
                root = root.left;
            }else if(root.ele < ele){
                pred = root;
                root = root.right;
            }else
                break;
        }

        if(root!=null && root.left!=null){
            System.out.print(max(root.left).ele);
        }else if(root!=null && root.left == null){
            if(pred!=null){
                System.out.print(pred.ele);
            }else{
                System.out.print("No Inorder predeccessor");
            }
        }else{
            System.out.print("No Inorder predeccessor");
        }
    }

}
