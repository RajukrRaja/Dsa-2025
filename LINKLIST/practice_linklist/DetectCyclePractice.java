package practice_linklist;

public class DetectCyclePractice {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public boolean haveCycle() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }

    public static void main(String[] args) {
        DetectCyclePractice list = new DetectCyclePractice();

        // Creating nodes
        Node first = list.new Node(1);
        Node second = list.new Node(2);
        Node third = list.new Node(3);
        Node fourth = list.new Node(4);

        // Linking nodes
        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        // Uncomment the next line to create a cycle: fourth -> second
        fourth.next = second;

        // Detect cycle
        if (list.haveCycle()) {
            System.out.println("Cycle detected!");
        } else {
            System.out.println("No cycle found.");
        }
    }
}
