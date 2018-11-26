package Tree;

import java.util.*;

public class TreeProblems {

    List<Integer> path;

    public TreeProblems(){
        path = new ArrayList<>();
    }

    public void printPathRootToLeaf(BinaryTree binaryTree){
        Stack<BinaryTree> stack = new Stack<>();
        Stack<BinaryTree> tempS = new Stack<>();
        Set<Integer> isVisited = new HashSet<>();
        stack.push(binaryTree.root);

        while(!stack.isEmpty()){
            BinaryTree node = stack.peek();
            if(node.left!=null && !isVisited.contains(node.left.ele)){
                stack.push(node.left);
            }else if(node.right!=null && !isVisited.contains(node.right.ele) ){
                stack.push(node.right);
            }else if(node.right==null && node.left==null){
                int leafEle = stack.pop().ele;
                if(!isVisited.contains(leafEle)){
                    isVisited.add(leafEle);
                }
                while(!stack.isEmpty()){
                    tempS.push(stack.pop());
                }
                while(!tempS.isEmpty()){
                    BinaryTree popNode = tempS.pop();
                    System.out.print(popNode.ele+" ");
                    stack.push(popNode);
                }
                System.out.print(leafEle+"\n");
            }else if(isVisited.contains(node.left.ele) && isVisited.contains(node.right.ele)){
                isVisited.add(stack.pop().ele);
            }
        }
    }

    public void printPathRec(BinaryTree node){
        if(node == null){
            return;
        }
        path.add(node.ele);

        if (node.left==null && node.right == null) {
            printPath();
            int in = path.indexOf(node.ele);
            if(in>0)
            path.remove(in);
        }else{
            printPathRec(node.left);
            printPathRec(node.right);
        }
    }

    private void printPath() {
        for(int ele: path){
            System.out.print(ele+" ");
        }
        System.out.print("\n");
    }
}
