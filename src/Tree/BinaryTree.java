package Tree;

public class BinaryTree {

    public BinaryTree left;
    public int ele;
    public BinaryTree right;

    public BinaryTree root;

    public BinaryTree(){}

    public BinaryTree(int ele) {
        this.ele = ele;
        left = right = null;
    }

    public void add(int ele){
        BinaryTree node = new BinaryTree(ele);
        BinaryTree temp = root;
        if(root == null){
            root = node;
        }else{
            BinaryTree parentNode = position(temp,ele);
            if(parentNode.ele>ele){
                parentNode.left = node;
            }else{
                parentNode.right = node;
            }
        }
    }

    public BinaryTree position(BinaryTree root,int ele){
        if(ele>root.ele && root.right!=null ){
               root =  position(root.right,ele);
        } else if(ele < root.ele && root.left!=null){
               root =  position(root.left,ele);
        }
        return root;
    }
}
