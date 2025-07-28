import java.util.*;

class EqualNumberLR {
    public static void play(char[] arr) {
        int RLCheck = 0;
        int res = 0;
        for(char ch: arr) {
            if(ch == 'R') RLCheck++;
            if(ch == 'L') RLCheck--;
            if(RLCheck == 0) res++;
        }
        System.out.println("OP: "+res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        char[] arr = ip.toCharArray();
        play(arr);
        sc.close();
    }
}