package ARRAYS.MEDIUM.SLIDINGWPROTOCOL;
import java.util.Scanner;

public class MaxSumSubarrayK {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the window size:");
        int k = sc.nextInt();

        int res = MaxSumSubarrayK(arr, k);
        System.out.println("Your max window sum: " + res);
        
        printAllSubarrays(arr, k);
    }

    public static int MaxSumSubarrayK(int[] arr, int k) {

        int maxSum = 0, windowSum = 0, left = 0;

        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[left];
                left++;
            }
        }
        return maxSum;
    }

    public static void printAllSubarrays(int[] arr, int k) {
        System.out.println("All subarrays of size " + k + " with sums:");
        
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            System.out.print("[");
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
                System.out.print(arr[j]);
                if (j < i + k - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("] Sum: " + sum);
        }
    }
}
