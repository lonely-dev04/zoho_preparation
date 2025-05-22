import java.util.Scanner;
class StringPermutation{
    static Scanner scn = new Scanner(System.in);

    static void permutate(char[] s, int start, int len){
        if(start == len-1){
            System.out.println(String.valueOf(s));
            return;
        }
        for(int i=start; i<len; i++){
            swap(s, start, i);
            permutate(s, start+1, len);
            swap(s, i, start);
        }
    }

    static void swap(char[] s, int x, int y){
        char temp = s[x];
        s[x] = s[y];
        s[y] = temp;
    }

    public static void main(String ags[]){
        System.out.println("Enter a string to permutate:");
        String s = scn.nextLine();
        permutate(s.toCharArray(), 0, s.length());
    }
}