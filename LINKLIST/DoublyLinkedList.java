public class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void delete(int data) {
        Node temp = head;
        while (temp != null && temp.data != data) temp = temp.next;
        if (temp == null) return;
        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else {
            if (temp.prev != null) temp.prev.next = temp.next;
            if (temp.next != null) temp.next.prev = temp.prev;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertEnd(10);
        dll.insertEnd(20);
        dll.insertEnd(30);
        dll.display();
        dll.delete(20);
        dll.display();
    }
}
