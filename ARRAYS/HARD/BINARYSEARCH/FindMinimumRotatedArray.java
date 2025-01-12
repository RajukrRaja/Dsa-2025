package ARRAYS.HARD.BINARYSEARCH;
import java.util.Scanner;

public class FindMinimumRotatedArray {

    public static void main(String[] args) {
        
        System.out.println("Enter the array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The minimum element in the rotated array is: ");
        int res =   FindMinimumRotatedArray(arr);
        System.out.println(res);
    }
    

    public static int FindMinimumRotatedArray(int[] arr){

        int left = 0 , right = arr.length-1;

        while(left<right){

            int mid = left + (right-left)/2;

            if(arr[mid]<=arr[right]){
                right = mid;
            } 
            else{
                left = mid+1;
            } //conditon end

        } //while end

        return arr[left];
    }
}
