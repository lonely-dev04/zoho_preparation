import java.util.*;

class SubsetSumEqualsK {
	ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	ArrayList<Integer> subset = new ArrayList<>();
	int k = 4;

	public void dfs(int i, int[] nums,int sum) {
		if (i >= nums.length) {
			if(sum == k) res.add(new ArrayList<>(subset));  // clone the subset
			sum = 0;
			return;
		}

		// Include nums[i]
		subset.add(nums[i]);
		dfs(i + 1, nums, sum + nums[i]);

		// Exclude nums[i]
		subset.remove(subset.size() - 1);
		dfs(i + 1, nums, sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

		SubsetSumEqualsK obj = new SubsetSumEqualsK();
		obj.dfs(0, arr, 0);

		// Print all subsets
		for (ArrayList<Integer> array : obj.res) {
			for (int val : array) System.out.print(val + " ");
			System.out.println();
		}
		sc.close();
	}
}