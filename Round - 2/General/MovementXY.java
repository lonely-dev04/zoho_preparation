import java.util.Scanner;

public class MovementXY {
    public static void process(int x, int y, char[] command) {
        for(char ch: command) {
            switch(ch) {
                case 'U' -> y--;
                case 'D' -> y++;
                case 'R' -> x++;
                case 'L' -> x--;
            }
        }
        System.out.println(x+","+y);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        char[] command = new char[n];
        for(int i=0;i<n;i++) {
            command[i] = sc.next().charAt(0);
        }
        process(x, y, command);
    }
}