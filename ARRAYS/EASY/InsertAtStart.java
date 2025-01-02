import java.util.Scanner;

class InsertAtStart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int array_size = sc.nextInt();

        int[] arr = new int[array_size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to insert at the start: ");
        int num = sc.nextInt();

        int[] array_res = InsertAtStart(arr, num);

        System.out.println("Array after insertion: ");
        for (int i = 0; i < array_res.length; i++) {
            System.out.print(array_res[i] + " ");
        }

        sc.close();
    }

    public static int[] InsertAtStart(int[] arr, int num) {
        int[] newArray = new int[arr.length + 1];
        newArray[0] = num;
        for (int i = 0; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }
        return newArray;
    }
}
