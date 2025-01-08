import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class InterSectionTwoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first array size:");
        int n = sc.nextInt();

        System.out.println("Enter the first array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the second array size:");
        int n1 = sc.nextInt();

        System.out.println("Enter the second array elements:");
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] result = FindInterSectionoftwoArray(arr, arr1);

        System.out.println("Intersection of two arrays:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] FindInterSectionoftwoArray(int[] arr, int[] arr1) {
        ArrayList<Integer> resuList = new ArrayList<>();
        HashSet<Integer> Set1 = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            Set1.add(arr[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            if (Set1.contains(arr1[i])) {
                resuList.add(arr1[i]);
                Set1.remove(arr1[i]); // To ensure each element appears only once
            }
        }

        int[] result = new int[resuList.size()];
        for (int i = 0; i < resuList.size(); i++) {
            result[i] = resuList.get(i);
        }

        return result;
    }
}
