public class LatinMatrix {
    public static void main(String[] args) {
        int n = 3;
        int sum = 1;
        for(int i=0;i<n;i++) {
            sum = i;
            for(int j=0;j<n;j++) {
                System.out.printf("%c ",((sum % n) + 65));
                sum++;
            }
            System.out.println();
        }
    }
}