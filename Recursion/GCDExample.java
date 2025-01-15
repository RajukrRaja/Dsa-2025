import java.util.Scanner;

public class GCDExample {
    // Recursive method to calculate GCD

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }


    public static int findGCD(int num1, int num2){

        if(num2 == 0){
            return num1;
        }

        return findGCD(num2, num1 % num2);
    }



}
