import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class RemoveDuplicateBrute {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array after removing duplicates:");
        int[] result = RemoveDuplicateBrute(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    

    public static int[] RemoveDuplicateBrute(int[]arr){

        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(!res.contains(arr[i])){
                res.add(arr[i]);
            }
        }

        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }

        return result;

    }
}