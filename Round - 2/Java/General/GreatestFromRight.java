import java.util.Scanner;

public class GreatestFromRight {
    public static void process(int[] arr) {
        int n = arr.length;
        int max = -1;  // Initialize with -1 for the last element

        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = max;      // Replace with the max so far
            if (current > max)
                max = current; // Update max if current is greater
        }

        for (int i : arr)
            System.out.print(i + " ");
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
