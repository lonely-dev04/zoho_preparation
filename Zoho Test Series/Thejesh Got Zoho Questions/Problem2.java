/* Problem 2
Given two inputs, n and r, print a square pattern where r is the starting number, and it is "rounded" by r+1, until n.

Example
Input:
    n = 5
    r = 3
Output:
    5 5 5 5 5
    5 4 4 4 5
    5 4 3 4 5
    5 4 4 4 5
    5 5 5 5 5 */

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] arr = new int[n][n];

        int rowSt = 0;
        int colSt = 0;
        int rowEn = n;
        int colEn = n;

        //row and column count
        while(n >= r) {

            // Top Row (left - right)
            for(int i=colSt;i<colEn;i++) arr[rowSt][i] = n;

            // Right Column (Top - Bottom)
            for(int i=rowSt;i<rowEn;i++) arr[i][colEn-1] = n;

            // Bottom Row (Right - Left)
            for(int i=colEn-1;i>=colSt;i--) arr[rowEn-1][i] = n;

            // Left Row
            for(int i=rowEn-1;i>=rowSt;i--) arr[i][colSt] = n;

            colSt++;
            rowSt++;
            colEn--;
            rowEn--;
            n--;
        }

        for (int[] inner : arr) {
            for (int j : inner) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
