import java.util.*;

class SumOfNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, curNum=0, sum=0;
		n = sc.nextInt();
		for(int i=0;i<=n;i++) {
			curNum = sc.nextInt();
			sum += curNum;
		}
		System.out.println("Output: "+sum);
	}
}