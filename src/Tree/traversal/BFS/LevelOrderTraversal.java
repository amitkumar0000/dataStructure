package Tree.traversal.BFS;

import Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public void levelOrder(BinaryTree root){
        if(root == null)
            return;
        Queue queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTree binaryTree = (BinaryTree) queue.poll();
            System.out.print(binaryTree.ele+" ");
            if(binaryTree.left!=null){
                queue.add(binaryTree.left);
            }
            if(binaryTree.right!=null){
                queue.add(binaryTree.right);
            }
        }
        System.out.print("\n");
    }
    public void levelOrderInTreeManner(BinaryTree root){
        Queue q = new LinkedList();
        if(root!=null){
            q.add(root);
            q.add(null);
        }

        while(!q.isEmpty()){
            BinaryTree node = (BinaryTree) q.poll();
            if(node!=null){
                System.out.print(node.ele+" ");
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }else if(q.size()>1){
                System.out.print("\n");
                q.add(null);
            }
        }
    }
    public void levelOrderUsingCounter(BinaryTree root){
        Queue queue = new LinkedList();
        int levelCount = 1;
        int counter = 0;
        if(root!=null){
            queue.add(root);
        }

        while(!queue.isEmpty()){
            BinaryTree binaryTree = (BinaryTree) queue.poll();
            System.out.print(binaryTree.ele + " ");
            levelCount--;

            if(binaryTree.left!=null){
                queue.add(binaryTree.left);
                counter++;
            }

            if(binaryTree.right!=null){
                queue.add(binaryTree.right);
                counter++;
            }

            if(levelCount==0){
                levelCount = counter;
                counter = 0;
                System.out.print("\n");
            }

        }
    }
    public void printLevelOrder(BinaryTree root){
        int h = height(root);
        for(int i=1; i<=h; i++){
            printLevelOrder(root,i);
            System.out.print("\n");
        }
    }
    private void printLevelOrder(BinaryTree root, int level) {
        if(root==null){
            return;
        }
        if(level == 1){
            System.out.print(root.ele+" ");
        }else{
            printLevelOrder(root.left,level-1);
            printLevelOrder(root.right,level-1);
        }


    }
    int height(BinaryTree node){
        if(node==null)
            return 0;
        int l = height(node.left);
        int r = height(node.right);
        return max(l,r)+1;
    }
    int max(int a,int b){
        return a>b?a:b;
    }
}
