import java.util.Scanner;

class InsertAtSpecific {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int array_size = sc.nextInt();

        int[] arr = new int[array_size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to insert: ");
        int num = sc.nextInt();

        System.out.println("Enter the position to insert (0-based index): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos > arr.length) {
            System.out.println("Invalid position! Position should be between 0 and " + arr.length);
        } else {
            int[] array_res = InsertAtSpecific(arr, num, pos);

            System.out.println("Array after insertion: ");
            for (int i = 0; i < array_res.length; i++) {
                System.out.print(array_res[i] + " ");
            }
        }

        sc.close();
    }

    public static int[] InsertAtSpecific(int[] arr, int num, int pos) {
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArray[i] = arr[i];
        }

        newArray[pos] = num;

        for (int i = pos; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }

        return newArray;
    }
}
