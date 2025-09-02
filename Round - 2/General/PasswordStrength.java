import java.util.Scanner;

public class PasswordStrength {
    public static int returnPasswordStrength(String password) {
        int level = 1;
        if(password.length() >= 8) {
            int[] arraySign = getArraySign(password);
            if(arraySign[1] > 0 && arraySign[0] > 0) {
                level++;
                if(arraySign[2] > 0) {
                    level++;
                    if(arraySign[3] > 0) return ++level;
                }
            }
        }
        return level;
    }

    public static int[] getArraySign(String password) {
        int[] arraySign = new int[4];
        char[] array = password.toCharArray();
        for(char ch: array) {
            if(ch >= 'A' && ch <= 'Z') arraySign[1]++;
            else if(ch >= 'a' && ch <= 'z') arraySign[0]++;
            else if(ch >= '0' && ch <= '9') arraySign[2]++;
            else arraySign[3]++;
        }
        return arraySign;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        int level = returnPasswordStrength(password);
        switch(level) {
            case 1 -> System.out.println("Weak");
            case 2 -> System.out.println("Medium");
            case 3 -> System.out.println("Good");
            case 4 -> System.out.println("Strong");
        }
        sc.close();
    }
}