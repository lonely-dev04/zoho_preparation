import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // First array
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++) arr1[i] = sc.nextInt();

        // Second arrray
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++) arr2[i] = sc.nextInt();

        // Computation
        List<Integer> array = new ArrayList<>();
        for(int i: arr1) array.add(i);
        for(int i: arr2) if(array.contains(i)) System.out.print(i+" ");
        sc.close();
    }
}
