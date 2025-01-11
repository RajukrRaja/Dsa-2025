import java.util.Scanner;    
import java.util.Arrays;                               

public class SecondLargestEleArray {

    public static void main(String[] args) {

        System.out.println("Enter the array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The second largest element in the array is: ");
        System.out.println(SecondLargestEleArray(arr));


    }


    public static int SecondLargestEleArray(int[] arr){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest= arr[i];
            } //condition ends

            else if(arr[i]>secondLargest  && arr[i]!=largest){
                secondLargest=arr[i];
            } //condition ends

        } //for loop ends


        return secondLargest;
    }
    
}
