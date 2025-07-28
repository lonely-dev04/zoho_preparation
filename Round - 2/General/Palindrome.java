import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while(num>0) {
            int rem = num % 10;
            sum = (sum * 10) + rem;
            num /= 10; 
        }
        if(temp == sum) System.out.print("Number is a Palindrome");
        else System.out.print("The Number is not a Palindrome");
        sc.close();
    }
}
