package problems;

import java.util.HashMap;
/*
Lru Cache is implemented via DoubleLinkedList and HashMap
HashMap gives position of node in 0(1) times.
Insertion in tail takes 0(1) times.
Deletion from head takes 0(1) times.
In  Node Access
    HashMap give position in 0(1) times.
    Delete that node in 0(1) times.
    Insert that node in tail takes 0(1) times.
 */
public class LruCache {

    Node head, tail;
    HashMap<Integer, Node> hashMap;

    public LruCache() {
        hashMap = new HashMap<>();
    }

    public void insertion(int ele) {
        Node node = new Node(ele);
        hashMap.put(ele, node);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void delete() {
        Node node = head;
        if(head==null)
            return;

        hashMap.remove(node.ele);

        if (head != tail) {
            head = node.next;
            head.prev = null;
        } else {
            head = tail = null;
        }

        node.next = null;
    }

    public void access(int ele) {
        Node node = hashMap.get(ele);

        if (head == tail) {
            return;
        } else {
            node.prev.next = node.next;
            if (node.next != null)
                node.next.prev = node.prev;
            hashMap.remove(ele);

            insertion(ele);
        }


    }
}

class Node {
    int ele;
    Node prev;
    Node next;

    public Node(int ele) {
        this.ele = ele;
        prev = next = null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
