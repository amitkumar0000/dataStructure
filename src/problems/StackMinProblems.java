package problems;

import java.util.Stack;

public class StackMinProblems {

    /*
    Design a stack that supports getMin() in O(1) time and O(1) extra space
     */
    Stack<Integer> stack;
    int minEle;

    public StackMinProblems(){
        stack = new Stack<>();
        minEle = Integer.MAX_VALUE;
    }

    public void push(int ele){
        if(ele >= minEle) {
            stack.push(ele);
        }
        else {
            if(minEle!=Integer.MAX_VALUE) {
                stack.push(2*ele-minEle);
            }else{
                stack.push(ele);
            }
            minEle = ele;
        }
    }

    public void pop(){
        int popEle = stack.pop();
        if(popEle > minEle)
            System.out.println("pop :: "+popEle);
        else {
            System.out.println("pop:: "+minEle);
            minEle = 2*minEle - popEle;
        }
    }

    public void peek(){
        System.out.print(stack.peek());
    }

    public void getMin(){
        System.out.println("min:: "+minEle);
    }
}
