import java.util.Scanner;

class InsertAtMiddle {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int array_size = sc.nextInt();

        int[] arr = new int[array_size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to insert in the middle: ");
        int num = sc.nextInt();

        int[] array_res = InsertAtMiddle(arr, num);

        System.out.println("Array after insertion: ");
        for (int i = 0; i < array_res.length; i++) {
            System.out.print(array_res[i] + " ");
        }

        sc.close();
    }

    public static int[] InsertAtMiddle(int[] arr, int num) {
        int[] newArray = new int[arr.length + 1];
        int middle = arr.length / 2;

        for (int i = 0; i < middle; i++) {
            newArray[i] = arr[i];
        }

        newArray[middle] = num;

        for (int i = middle; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }

        return newArray;
    }
}
