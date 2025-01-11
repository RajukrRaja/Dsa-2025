import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int array_size = sc.nextInt();

        int[] arr = new int[array_size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int res = FindMissingNumber(arr, array_size);
        System.out.println("The Missing Number is : " + res);

        

    }

    // funtion

    public static int FindMissingNumber(int[] arr, int n) {

        int Expected_Sum = n * (n + 1) / 2;
        int Actual_Sum = 0;

        for (int i = 0; i < arr.length; i++) {

            Actual_Sum += arr[i];
        }

        return Expected_Sum - Actual_Sum;

    }
}
