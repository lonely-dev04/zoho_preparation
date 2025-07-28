import java.util.*;

public class SpaceDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int stars = n/2+1;
        int space = 0;

        for(int i=1;i<=n;i++) {
            for(int j=0;j<stars;j++) System.out.print("*");
            for(int j=0;j<space;j++) System.out.print(" ");
            for(int j=0;j<stars;j++) System.out.print("*");
            System.out.println();

            if(i < n/2+1) {
                stars-=1;
                space+=2;
            }

            if(i == n/2+1) {
                stars=2;
                space=n-3;
            } 
        
            if(i > n/2+1) {
                stars+=1;
                space-=2;
            }
        }
    }
}