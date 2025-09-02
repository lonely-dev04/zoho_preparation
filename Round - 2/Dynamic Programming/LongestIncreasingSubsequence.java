public class LongestIncreasingSubsequence {
    public static int getLis(int[] array) {
        int[] lenArray = new int[array.length];
        for(int i=0;i<array.length;i++) {
            int max = 0;
            for(int k=0;k<i;k++) {
                if(array[k] < array[i]) {
                    max = Math.max(lenArray[k],max);
                }
            }
            lenArray[i] = max + 1;
        }
        // Getting Maximum
        int max = 0;
        for(int i: lenArray) {
            max = Math.max(max, i);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 6, 3, 6, 9, 5};
        int max = getLis(array);
        System.out.println("The Longest Subsequence Length is: "+max);
    }
}