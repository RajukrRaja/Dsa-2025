
public class reverselinklist {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while (curr.next != null) {

            curr = curr.next;

        }

        curr.next = newNode;
    }

    public void diplay() {

        Node curr = head;

        while (curr != null) {

            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");

    }

    public void reverse() {

        Node prev = null;
        Node curr = head;
        Node Next = null;

        while (curr != null) {

            // save the data in next
            Next = curr.next;

            // reverse
            curr.next = prev;

            // change the position
            prev = curr;

            // change the position
            curr = Next;

        }

        head = prev;
    }

    public static void main(String[] args) {

        reverselinklist list = new reverselinklist();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.diplay();

        list.reverse();

        list.diplay();
    }

}
