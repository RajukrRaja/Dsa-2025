
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FirstUniqueChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String n = sc.nextLine();

        int res = FirstUniqueCharacter(n);
        System.out.println("Your first unique Character:" + res);
    }

    // function

    public static int FirstUniqueCharacter(String s) {

        Map<Character, Integer> CharCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            CharCount.put(c, CharCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {

            if (CharCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;

    }

}
