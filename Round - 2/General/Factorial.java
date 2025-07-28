import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int n) {
        if(n == 0 || n == 1) return 1;
        return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = findFactorial(n);
        System.out.print("The factorial of "+n+" is "+res);
        sc.close();
    }
}
