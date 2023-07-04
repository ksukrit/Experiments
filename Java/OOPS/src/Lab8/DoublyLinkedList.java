package Lab8;

public class DoublyLinkedList {
    int size;
    Node head;

    DoublyLinkedList(){
        size = 0;
    }

    void append(int val){
        if(head == null){
            head = new Node(val);
        }else{
            head.next = new Node(val,null,head);
        }
        size++;
    }

    void insert(int val,int index){
        if(index > size){
            return;
        }
        Node temp = head;
        while(index != 1){
            temp = temp.next;
            index--;
        }

        Node next = temp.next;
        temp.next = new Node(val,next,temp);
        System.out.println("Added at " + temp.val);
    }

    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
