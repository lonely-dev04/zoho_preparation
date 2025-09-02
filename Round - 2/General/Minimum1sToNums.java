public class Minimum1sToNums {
    public static void main(String[] args) {
        int num = 33;
        int max = 0;
        while(num > 0) {
            int rem = num % 10;
            max = Math.max(rem, max);
            num /= 10;
        }
        System.out.print(max);
    }
}