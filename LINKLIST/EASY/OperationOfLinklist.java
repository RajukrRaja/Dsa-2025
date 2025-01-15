package LINKLIST.EASY;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class OperationOfLinklist {

    Node head;

    public void InsertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void InsertAtEnd(int data) {
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


 public void InsertAtMiddle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){

            slow= slow.next;
            fast = fast.next.next;
        }

        newNode.next = slow.next;
        slow.next = newNode;
    }




    public void display(){

        if(head==null){

            System.out.println("the list is empty");
            return;
        }

        Node curr  = head;

        while (curr!= null) {
            
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }


    // main function

    public static void main(String[] args) {
        
        OperationOfLinklist linklist = new OperationOfLinklist();

        linklist.InsertAtBeginning(10);
        linklist.InsertAtBeginning(20);
        linklist.InsertAtEnd(40);
        linklist.InsertAtMiddle(30);

        linklist.display();
    }

   
}
