

public class RemoveNthFromEnd {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveNthFromEnd list = new RemoveNthFromEnd();

        Node a1 = list.new Node(10);
        Node a2 = list.new Node(20);
        Node a3 = list.new Node(30);
        Node a4 = list.new Node(40);
        Node a5 = list.new Node(50);

        list.head = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        int n = 2;
        Node updatedHead = list.removeNthFromEnd(list.head, n);
        list.printList(updatedHead);
    }
}
