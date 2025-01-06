package ARRAYS.MEDIUM.SLIDINGWPROTOCOL;

import java.util.HashMap;

import java.util.Scanner;

public class LargestSubstringkDistinct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        System.out.println("Length of the largest substring with " + k + " distinct characters: " +
                lengthOfLongestSubstringKDistinct(s, k));

        sc.close();
    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0 || s == null || s.isEmpty()) return 0;

      HashMap<Character , Integer> map = new HashMap<>();

      int left =0, maxLen = 0; 

      for(int right =0; right<s.length() ; right++){
  
        map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);

        while (map.size()>k){
            char leftChar = s.charAt(left);
            map.put(leftChar , map.get(leftChar)-1);
            if(map.get(leftChar)==0){
                map.remove(leftChar);
            }
            left++;
        }
        
      maxLen = Math.max(maxLen , right-left+1);
      }

      return maxLen;
    }
}
