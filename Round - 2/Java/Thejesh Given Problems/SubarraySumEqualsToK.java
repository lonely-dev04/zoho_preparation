import java.util.*;

class SubarraySumEqualsToK {
	public static void findSumEqualsToK(int[] arr, int k) {
		HashMap<Integer, Integer> prefSums = new HashMap<Integer, Integer>();
		prefSums.put(0, 1);
		int curSum = 0;
		int res = 0;
		for(int i: arr) {
			curSum += i;
			int diff = curSum - k;
			res += prefSums.getOrDefault(diff, 0);
			prefSums.put(curSum, 1 + prefSums.getOrDefault(curSum, 0));
		}
		System.out.println("Output: "+res);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int num = sc.nextInt();
		System.out.println("Enter the array elements by spaced: ");
		int[] arr = new int[num];
		for(int i=0;i<num;i++) arr[i] = sc.nextInt();
		System.out.println("Enter the sum to check: ");
		int k = sc.nextInt();
		//SubArraySumEqualToK
		findSumEqualsToK(arr, k);
	}
}