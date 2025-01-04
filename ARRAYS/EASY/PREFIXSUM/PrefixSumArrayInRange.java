package PREFIXSUM;
import java.util.Scanner;

public class PrefixSumArrayInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int arraySize = scanner.nextInt();

        // Display the dynamically entered array size
        System.out.println("The size of the array is: " + arraySize);

        System.out.println("Enter the elements of the array:");
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the range (start index and end index, 0-based):");
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        // Validate the range
        if (startIndex < 0 || endIndex >= arraySize || startIndex > endIndex) {
            System.out.println("Error: Invalid range. Please enter a valid range where 0 <= " + startIndex + " <= " + endIndex + " < " + arraySize + ".");
            return;
        }

        int[] prefixSumArray = calculatePrefixSum(array);
        int rangeSumResult = calculateRangeSum(prefixSumArray, startIndex, endIndex);

        System.out.println("The sum of the elements in the given range is: " + rangeSumResult);
    }

    public static int calculateRangeSum(int[] prefixSumArray, int startIndex, int endIndex) {
        return prefixSumArray[endIndex + 1] - prefixSumArray[startIndex];
    }

    public static int[] calculatePrefixSum(int[] array) {
        int[] prefixSumArray = new int[array.length + 1];
        for (int i = 1; i <= array.length; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + array[i - 1];
        }
        return prefixSumArray;
    }
}
