package ARRAYS.HARD.BINARYSEARCH;

import java.util.*;

public class SearchAnElement {

    public static void main(String[] args) {

        System.out.println("Enter the array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();

        System.out.println("The element is present at index: ");
        System.out.println(SearchAnElement(arr, target));
    }

    public static int SearchAnElement(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // when mid is equal to target so return (mid)
            if (arr[mid] == target) {
                return mid;
            }

            // when mid is less than target so (left = mid+1)
            else if (arr[mid] < target) {
                left = mid + 1;
            }

            // when mid is greater than target so (right = mid-1) or its default
            else {
                right = mid - 1;
            }
        }
        // when no element found
        return -1;
    }

}
