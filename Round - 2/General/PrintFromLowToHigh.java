public class PrintFromLowToHigh {
    public static int[] getMinMaxIndex(String str1, String str2) {
        int max = 0;
        int min = str1.length();
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        for(char ch1: array2) {
            for(int i=0;i<array1.length;i++) {
                if(array1[i] == ch1) {
                    min = Math.min(i, min);
                    max = Math.max(i, max);
                    break;
                }
            }
        }
        return new int[]{min, max};
    }

    public static void printStringStartToEnd(String str, int start, int end) {
        char[] array = str.toCharArray();
        for(int i=start;i<=end;i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        String str1 = "ZOHOCORPORATION";
        String str2 = "PORT";
        int[] minMax = getMinMaxIndex(str1, str2);
        printStringStartToEnd(str1, minMax[0], minMax[1]);
    }
}