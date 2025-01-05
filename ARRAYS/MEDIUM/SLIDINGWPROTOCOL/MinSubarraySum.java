package ARRAYS.MEDIUM.SLIDINGWPROTOCOL;
import java.util.Scanner;

public class MinSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum:");
        int s = sc.nextInt();

        int res = findMinSubarraySum(arr, s);
        if (res == 0) {
            System.out.println("No subarray with sum >= " + s);
        } else {
            System.out.println("Length of smallest subarray with sum >= " + s + ": " + res);
        }

        System.out.println("All subarrays with sum >= " + s + ":");
        printAllSubarrays(arr, s);
    }

    // Function to find the minimum length subarray with sum >= S
    public static int findMinSubarraySum(int[] arr, int s) {
        int minLen = Integer.MAX_VALUE;
        int windowSum = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];

            while (windowSum >= s) {
                minLen = Math.min(minLen, right - left + 1);
                windowSum -= arr[left];
                left++;
            }
        }

        // Return 0 if no valid subarray is found
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    // Function to print all subarrays with sum >= S
    public static void printAllSubarrays(int[] arr, int s) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum >= s) {
                    // Print the subarray
                    System.out.print("[");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + (k < j ? ", " : ""));
                    }
                    System.out.println("]");
                }
            }
        }
    }
}
