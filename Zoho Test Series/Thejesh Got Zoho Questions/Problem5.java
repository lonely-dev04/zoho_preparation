/* Problem 5
Given a number n, perform the following operations:
If n is even, the next number is n / 2.
If n is odd, the next number is n * 3 + 1.
Continue this process until you encounter a value that has already appeared in the sequence. Print the number of operations it took to reach this repeating value.

Example
Input: 5
Output: 6

Explanation: The sequence is 5 -> 16 -> 8 -> 4 -> 2 -> 1 -> 4. The value 4 is repeated after 6 steps. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        list.add(n);
        System.out.print(n+"->");
        while(true) {
            if(n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
            if(list.contains(n)) {
                System.out.print(n);
                break;
            } else {
                System.out.print(n+"->");
                list.add(n);
            }
        }
    }
}
