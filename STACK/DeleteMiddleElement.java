import java.util.Stack;

public class DeleteMiddleElement {

    public static void deleteMiddle(Stack<Integer> stack, int size, int current) {
        if (current == size / 2) {
            stack.pop();
            return;
        }
        int temp = stack.pop();
        deleteMiddle(stack, size, current + 1);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Stack before deletion: " + stack);
        deleteMiddle(stack, stack.size(), 0);
        System.out.println("Stack after deletion: " + stack);
    }
}
