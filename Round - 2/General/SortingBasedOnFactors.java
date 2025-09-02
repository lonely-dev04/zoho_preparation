public class SortingBasedOnFactors {
    public static int getCountOfFactors(int num) {
        int count = 1;
        for(int i=1;i<=num/2;i++) {
            if(num % i == 0) count++;
        }
        return count;
    }

    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 12, 16, 34, 28};
        for(int i=0;i<array.length-1;i++) {
            System.out.print(getCountOfFactors(array[i])+" ");
            for(int j=i+1;j<array.length;j++) {
                if(getCountOfFactors(array[i]) < getCountOfFactors(array[j])) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();
        printArray(array);
    }
}