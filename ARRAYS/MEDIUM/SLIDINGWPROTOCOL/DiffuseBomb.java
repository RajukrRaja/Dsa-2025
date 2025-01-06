import java.util.Scanner;

public class DiffuseBomb {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the code array: ");
        int n = scanner.nextInt();
        int[] code = new int[n];
        System.out.print("Enter the elements of the code array: ");
        for (int i = 0; i < n; i++) {
            code[i] = scanner.nextInt();
        }

        System.out.print("Enter the key (k): ");
        int k = scanner.nextInt();

        Solution solution = new DiffuseBomb().new Solution();
        int[] result = solution.decrypt(code, k);

        System.out.print("Decrypted code: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    public class Solution {
        public int[] decrypt(int[] code, int k) {
            int n = code.length, sum = 0;
            int[] result = new int[n];

            if (k == 0) return result;

            int start = k > 0 ? 1 : n + k, end = k > 0 ? k : n - 1;

            for (int i = start; i <= end; i++) sum += code[i % n];

            for (int i = 0; i < n; i++) {
                result[i] = sum;
                sum += code[(end + 1) % n] - code[start % n];
                start++;
                end++;
            }

            return result;
        }
    }
}
