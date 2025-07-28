/* Problem 3
Given a floating-point number as a string, perform a custom rounding operation based on the first two decimal places. Let d1 be the first digit after the decimal point and d2 be the second digit.
If d2 < 3, round d1 down.
If d2 > 5, round d1 up.
If d2 == 5:
If d1 is odd, round d1 up.
If d1 is even, do nothing.

Example
Input: "23.578"
Output: 23.6 */

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();

        int dotIndex = val.indexOf('.');
        int d1 = 0, d2 = 0;

        if(dotIndex != -1 && dotIndex + 2 < val.length()) {
            d1 = Character.getNumericValue(val.charAt(dotIndex + 1));
            d2 = Character.getNumericValue(val.charAt(dotIndex + 2));
        }

        int intPart = Integer.parseInt(val.substring(0, dotIndex));
        int finalDecimal = d1; // default

        if (d2 < 3) {
            finalDecimal = d1 - 1;
        } else if (d2 > 5) {
            finalDecimal = d1 + 1;
        } else { // d2 == 5
            if (d1 % 2 != 0) {
                finalDecimal = d1 + 1;
            }
        }

        System.out.printf("%d.%d\n", intPart, finalDecimal);
    }
}
