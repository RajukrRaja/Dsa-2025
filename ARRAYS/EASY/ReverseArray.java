import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arr :");
        int n = sc.nextInt();
        int[] arr = new int[n]; 

        System.out.println("Enter the array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] res = ReverseArray(arr); 
        System.out.println("Your reversed array:");
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }

    public static int[] ReverseArray(int[] arr) {
        int left = 0, right = arr.length - 1, temp;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;


            left++;
            right--;
        }

        return arr; 
    }
}
