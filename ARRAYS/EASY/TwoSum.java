import java.util.HashMap;
import java.util.Scanner;
public class TwoSum {
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arr :");
        int n = sc.nextInt();
        int[] arr = new int[n]; 

        System.out.println("Enter the array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target sum :");
        int target = sc.nextInt();

        int[] res = TwoSum(arr, target);
        System.out.println("The indices of the two numbers such that they add up to a specific target are :");
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }   
        

     }

        public static int[] TwoSum(int[] arr, int target) {

            HashMap<Integer, Integer> map = new HashMap<>();


            for (int i = 0; i < arr.length; i++) {
                int diff = target - arr[i];
                if (map.containsKey(diff)) {
                    return new int[] { map.get(diff), i };
                }
                map.put(arr[i], i);
            }
            
         return new int[] {-1,-1};  
}
}