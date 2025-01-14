import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }



    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
