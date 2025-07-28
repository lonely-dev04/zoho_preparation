/* Problem - 1
Given a string s and a repeat factor r, print the string r times. For the n-th repetition, if n is odd, print the reverse of the string; otherwise, print the normal string.

Example:
Input:
    s = "abc"
    r = 3
Output: cbaabccba

Explanation:
    1st time (odd): cba
    2nd time (even): abc
    3rd time (odd): cba */


import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) reversePrint(str);
            else System.out.print(str);
        }
        sc.close();
    }

    public static void reversePrint(String str) {
        for (int i = str.length() - 1; i >= 0; i--) System.out.print(str.charAt(i));
    }
}
