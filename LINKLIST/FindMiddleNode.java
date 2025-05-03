

public class FindMiddleNode {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Method to find the middle node
    public Node findMiddle() {
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Middle node
    }

    // Main method for testing
    public static void main(String[] args) {
        FindMiddleNode list = new FindMiddleNode();

        // Creating nodes
        Node first = list.new Node(10);
        Node second = list.new Node(20);
        Node third = list.new Node(30);
        Node fourth = list.new Node(40);
        Node fifth = list.new Node(50);

        // Link the nodes
        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node middle = list.findMiddle();
        if (middle != null) {
            System.out.println("Middle node value: " + middle.data);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
