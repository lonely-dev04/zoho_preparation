public class PanagramChecking {
    public static void main(String[] args) {
        String str = "abc defGhi JklmnOP QRStuv wxyz";
        char[] array = str.toCharArray();
        int[] checkMap = new int[26];

        for(char ch: array) {
            if(ch >= 'a' && ch <= 'z') {
                checkMap[ch - 97] = 1;
            } else if(ch >= 'A' && ch <= 'Z') {
                checkMap[ch - 65] = 1;
            }
        }
        boolean flag = true;
        for(int i: checkMap) {
            if(i == 0) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("It is a panagram");
        } else {
            System.out.println("It is not a panagram");
        }
    }
}