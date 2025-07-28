import java.util.*;

public class Top3Descending {
    public static void process(int[] arr) {
        for(int i=0;i<3;i++) {
            int maxId = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[maxId] == arr[j]) arr[j] = 0;
                if(arr[maxId] < arr[j] && arr[j] > 50) maxId = j;
            }
            System.out.print(arr[maxId]+" ");
            arr[maxId] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        process(arr);
        sc.close();
    }
}
