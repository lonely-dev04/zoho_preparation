/* Problem 4
Given a sequence of integers as a string (where each digit is from 0 to 9), find the longest palindrome. Replace this palindrome with the sum of its digits. Repeat this process recursively until no palindromes are found in the string.

Example 1
Input: "1232145"
Output: "945"

Example 2
Input: "41221212"
Output: "465" */

import java.util.HashMap;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        String sum = "";
        int stId = -1;
        for(int i=0;i<str.length();i++) {
            if(stId == -1) stId = i;
            if(str.charAt(stId) == str.charAt(i)) {
                if(checkPalindrome(str.substring(stId, i+1))) map.put(stId, i+1);
            }
        }

        int i = 0;
        while (i < str.length()) {
            if(map.containsKey(i)) {
                sum += getSum(str.substring(i, map.get(i)));
                i = map.get(i);
            } else {
                sum += str.charAt(i);
                i++;
            }
        }

        System.out.print(sum);
    }

    public static int getSum(String str) {
        int val = Integer.parseInt(str);
        int sum = 0;
        while(val > 0) {
            int rem = val % 10;
            sum += rem;
            val /= 10;
        }
        return sum;
    }

    public static boolean checkPalindrome(String str) {
        int val = Integer.parseInt(str);
        int temp = val;
        int sum = 0;
        while(val > 0) {
            int rem = val % 10;
            sum = sum * 10 + rem;
            val /= 10;
        }
        if(sum == temp) return true;
        else return false;
    }
}