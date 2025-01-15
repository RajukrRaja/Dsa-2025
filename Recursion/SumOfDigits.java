import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        int result = sumOfDigits(n);
        System.out.println("The sum of digits is: " + result);
    }

    public static int sumOfDigits(int n) {
        // Base case: single-digit number
        if (n == 0) {
            return 0;
        }
       
        return (n % 10) + sumOfDigits(n / 10);
    }
}
