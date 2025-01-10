import java.util.Scanner;

public class RemoveDuplicateSorted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = RemoveDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] RemoveDuplicates(int[] arr) {
        int low = 0;
        int fast = 1;
        int k = 0;

        if (arr.length == 0 || arr.length == 1) {
            return arr;  // Return the array directly if it has 0 or 1 element
        }

        while (fast < arr.length) {
            if (arr[low] != arr[fast]) {
                low++;
                arr[low] = arr[fast];
                k++;
            }
            fast++;
        }

        // Create a result array to store unique elements
        int[] result = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}
