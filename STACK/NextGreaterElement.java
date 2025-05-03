import java.util.Stack;

public class NextGreaterElement {

    public static void nextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                int index = stack.pop();
                System.out.println("Next Greater Element for " + arr[index] + " is " + arr[i]);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            System.out.println("Next Greater Element for " + arr[index] + " is not present");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        nextGreater(arr);
    }
}
