package PREFIXSUM;

public class DivideTwoSubArrayEqualSum {

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 3, 1};

        if (divideArrayEqualSum(arr)) {
            System.out.println("The array can be divided into two subarrays with equal sum.");
        } else {
            System.out.println("The array cannot be divided into two subarrays with equal sum.");
        }
    }

    public static boolean divideArrayEqualSum(int[] arr) {
        int total_Sum = 0;
        int PrefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            total_Sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            PrefixSum += arr[i];

            int SuffixSum = total_Sum - PrefixSum;

            if (SuffixSum == PrefixSum) {
                System.out.println("Array: " + java.util.Arrays.toString(arr));
                System.out.println("Prefix sum at index " + i + ": " + PrefixSum);
                System.out.println("Suffix sum after index " + i + ": " + SuffixSum);
                return true;
            }
        }

        return false;
    }
}
