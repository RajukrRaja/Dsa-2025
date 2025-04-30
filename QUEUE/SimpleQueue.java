package QUEUE;

public class SimpleQueue {
    int[] queue;
    int front, rear, n;

    public SimpleQueue(int size) {
        n = size;
        queue = new int[n];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == n - 1) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = value;
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + queue[front]);
        front++;
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();           // Output: Queue: 10 20 30
        q.dequeue();           // Output: Dequeued: 10
        q.display();           // Output: Queue: 20 30
    }
}
