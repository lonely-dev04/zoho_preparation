import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int ln = str2.length();

        for(int i=0;i<str2.length();i++) {
            if(str1.charAt(i) == str2.charAt(ln-1)) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}
