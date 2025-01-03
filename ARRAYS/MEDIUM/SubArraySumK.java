package ARRAYS.MEDIUM;

import java.util.*;

public class SubArraySumK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n]; 

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        int result = SubArraySumK(arr, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }

    public static int SubArraySumK(int[] nums, int k) {
        HashMap<Integer, Integer> PrefixSumCount = new HashMap<>();
        PrefixSumCount.put(0, 1);
        int PrefixSum = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            PrefixSum += nums[i];

            if (PrefixSumCount.containsKey(PrefixSum - k)) {
                count += PrefixSumCount.get(PrefixSum - k);
            }

            PrefixSumCount.put(PrefixSum, PrefixSumCount.getOrDefault(PrefixSum, 0) + 1);
        }
        return count;
    }
}
