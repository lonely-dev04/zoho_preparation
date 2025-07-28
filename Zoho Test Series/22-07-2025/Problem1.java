import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        int i = 0, j = 0;
        int cnt = 1;

        while(i < n) {
            int k = i;
            while(j < n && k < n) {
                matrix[k][j] = cnt;
                cnt++;
                k++;
                j++;
            }
            i++;
            j=0;
        }

        for(int[] m: matrix) {
            for(int l: m) {
                if(l == 0) continue;
                System.out.print(l+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
