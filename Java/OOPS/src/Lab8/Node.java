package Lab8;

public class Node {
    int val;
    Node prev;
    Node next;

    Node(){

    }

    Node(int val){
        this.val = val;
        prev = null;
        next = null;
    }

    Node(int val, Node next, Node prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
