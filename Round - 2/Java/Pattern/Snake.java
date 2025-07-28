import java.util.*;

class Snake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;

		for(int i=0;i<n;i++) {
			if(i % 2 == 0) for(int j=0;j<n;j++) System.out.printf("%2d ",++count);

			else {
				int tempCount = count;
				for(int j=n;j>0;j--) {
					System.out.printf("%2d ",tempCount + j);
					count++;
				}
			}
			System.out.println("");
		}
	}
}