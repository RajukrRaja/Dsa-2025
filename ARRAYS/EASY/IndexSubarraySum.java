import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IndexSubarraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        ArrayList<Integer> result = IndexSubarraySum(arr, sum);
        if (result.size() == 0) {
            System.out.println("No subarray found with the given sum.");
        } else {
            for (int i : result) {
                System.out.print(i + " ");
            }
        }
    }

    public static ArrayList<Integer> IndexSubarraySum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == target) {
                res.add(1);
                res.add(i + 1);
                return res;
            }
            if (map.containsKey(prefixSum - target)) {
                res.add(map.get(prefixSum - target) + 2);
                res.add(i + 1);
                return res;
            }
            map.put(prefixSum, i);
        }

        return res;
    }
}
