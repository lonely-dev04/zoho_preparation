import java.util.Scanner;

public class Problem1ThejOp {
    static void printPattern(int n) {
        int rowStart = 1;
        for(int i=0; i<n; i++) {
            int val = rowStart;
            for(int j=0; j<n; j++) {
                System.out.printf("%2d  ", val);
                val -= n-i+j;
                if(i == j) break;
            }
            rowStart += n-i;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
