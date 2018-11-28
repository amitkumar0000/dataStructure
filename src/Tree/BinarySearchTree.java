package Tree;

public class BinarySearchTree {

    public BinarySearchTree left;
    public int ele;
    public BinarySearchTree right;

    public BinarySearchTree root;

    public BinarySearchTree(){}

    public BinarySearchTree(int ele) {
        this.ele = ele;
        left = right = null;
    }

    public void add(int ele){
        BinarySearchTree node = new BinarySearchTree(ele);
        BinarySearchTree temp = root;
        if(root == null){
            root = node;
        }else{
            BinarySearchTree parentNode = position(temp,ele);
            if(parentNode.ele>ele){
                parentNode.left = node;
            }else{
                parentNode.right = node;
            }
        }
    }

    public BinarySearchTree position(BinarySearchTree root, int ele){
        if(ele>root.ele && root.right!=null ){
               root =  position(root.right,ele);
        } else if(ele < root.ele && root.left!=null){
               root =  position(root.left,ele);
        }
        return root;
    }
}
