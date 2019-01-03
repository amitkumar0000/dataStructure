package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LinkedListClass {
    class Node{
        int ele;
        Node next;
        Node random;
        Node(int ele){
            this.ele = ele;
            next = null;
            random = null;
        }
    }

    Node head;
    Node cloneHead ;

    Map<Integer,Node> nodeMap;

    public LinkedListClass(){
        nodeMap = new HashMap<>();
    }

    public void add(int ele){
        Node node = new Node(ele);
        nodeMap.put(ele,node);
        if(head == null){
            head = node;
        }else{
            Node ptr = head;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            ptr.next = node;
        }
    }

    public void attachRandomPointer(int nodePos,int ele){
        Node node = nodeMap.get(ele);
        Node ptr = head;
        while(--nodePos>0){
            ptr = ptr.next;
        }
        ptr.random  = node;
    }

    public void printlinkedlist(){
        Node ptr = head;
        System.out.println("Linked list ele:-");
        while(ptr!=null){
            System.out.print(ptr.ele+" ");
            System.out.println("Random Pointer Ele::- "+ ptr.random.ele);
            ptr  = ptr.next;
        }
    }

    public void printClonelinkedlist(){
        Node ptr = cloneHead;
        System.out.println("Linked list ele:-");
        while(ptr!=null){
            System.out.print(ptr.ele+" ");
            System.out.println("Random Pointer Ele::- "+ ptr.random.ele);
            ptr  = ptr.next;
        }
    }

    private void cloneList(int ele){
        Node node = new Node(ele);
        if(cloneHead == null){
            cloneHead = node;
        }else{
            Node ptr = cloneHead;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            ptr.next = node;
        }
    }

    public void cloneLinkedListWithRandomPointer(){
        Node ptr = head;
        // Create a Copy Linked List
        while(ptr!=null){
            cloneList(ptr.ele);
            ptr = ptr.next;
        }

        //Point Original Node next node to clonePtr
        ptr = head;
        Node clonePtr = cloneHead;
        Node np;
        while(ptr!=null){
            np = ptr.next;
            ptr.next = clonePtr;
            clonePtr.random = ptr;
            ptr = np;
            clonePtr = clonePtr.next;
        }

        //point CloneHead random to correct node
        clonePtr = cloneHead;
        while(clonePtr!=null){
            clonePtr.random =clonePtr.random.random.next;
            clonePtr = clonePtr.next;
        }

        System.out.println("Clone Linked List:-");
        printClonelinkedlist();
    }


}
