package Lab8;

public class ListDemo {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.append(26);
        doublyLinkedList.append(40);
        doublyLinkedList.insert(30,1);

        doublyLinkedList.printList();
    }
}
