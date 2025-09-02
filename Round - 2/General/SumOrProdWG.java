public class SumOrProdWG {
    public static void main(String[] args) {
        int[] array = {120, 24, 71, 10, 59};
        // In place mame
        for(int i=0;i<array.length;i++) {
            // Process Mame
            int sum = 0;
            int prod = 1;
            int temp = array[i];
            while(temp > 0) {
                int rem = temp % 10;
                sum += rem;
                prod *= rem;
                temp /= 10;
            }
            if(sum > prod) {
                array[i] = sum;
            } else {
                array[i] = prod;
            }
        }

        for(int i: array) {
            System.out.print(i+" ");
        }
    }
}