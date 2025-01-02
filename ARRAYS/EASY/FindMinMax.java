import java.util.Scanner;

public class FindMinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = FindMax(arr);
        int min = FindMin(arr);

        System.out.println("Maximum value in the array is: " + max);
        System.out.println("Minimum value in the array is: " + min);

        sc.close();
    }

    public static int FindMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int FindMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
