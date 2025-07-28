import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // int count = 0;
        int flag = 1;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == '(') {
                if(str.charAt(i+1) == '(') {
                    flag = 1;
                    i++;
                }
                else flag = 0;
            }

            if(str.charAt(i) == ')') {
                if(i + 1 < str.length() && str.charAt(i+1) == ')' && flag == 1) {
                    System.out.println("True");
                    return;
                } else flag = 0;
            }
        }
        System.out.print("False");
        sc.close();
    }
}
