import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicatesElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int array_size = sc.nextInt();

        int[] arr = new int[array_size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> duplicates = FindDuplicatesElements(arr);
        System.out.println("Duplicate elements: " + duplicates);
    }

    public static ArrayList<Integer> FindDuplicatesElements(int[] nums){

        HashSet<Integer> Seen = new HashSet<>();
        ArrayList<Integer> duplicate = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(Seen.contains(nums[i])){
                duplicate.add(nums[i]);
            }
            else {
                Seen.add(nums[i]);
            }
        }

        return duplicate;
    }
}
