import java.util.*;

public class MinButMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        for(int i=0;i<n-1;i++) {
            int min = 0;
            
            // Max but min core logic
            for(int j=i+1;j<n;j++) {
                if(arr[j] >= arr[i]) {
                    if(min == 0) min = j;
                    if(arr[min] > arr[j]) min = j;
                }
            }

            if(min == 0) {
                arr[i] = -1;
                continue; //bounce check
            }

            // Swapping
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int i: arr) System.out.print(i+" ");
        System.out.print("-1");

        sc.close();
    }
}