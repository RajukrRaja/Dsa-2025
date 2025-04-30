public class StackUsingArray {
    private int[] stack;
    private int top;
    private int n;

   
    public StackUsingArray(int size) {
        n = size;
        stack = new int[n];
        top = -1;
    }

    public void push(int value) {
        if (top == n - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

  
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }


    public int size() {
        return top + 1;
    }


    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); 

        System.out.println("Top: " + stack.peek()); 
        System.out.println("Popped: " + stack.pop()); 
        stack.printStack(); 

        System.out.println("Size: " + stack.size()); 
        System.out.println("Is empty: " + stack.isEmpty()); 

        stack.pop();
        stack.pop();
        stack.pop(); 
    }
}
