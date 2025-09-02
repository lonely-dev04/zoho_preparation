import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[] array = new int[n];
        int result = 0;
        for(int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<array.length;i++) {
            int num = 0;
            for(int j=0;j<array[i];j++) {
                num = (num*10) + sc.nextInt();
            }
            result += num;
        }
        System.out.println("Answer: "+result);
    }
}