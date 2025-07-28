import java.util.*;

class Subset {
	ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	ArrayList<Integer> subset = new ArrayList<>();

	public void dfs(int i, int[] nums) {
		if (i >= nums.length) {
			res.add(new ArrayList<>(subset));  // clone the subset
			return;
		}

		// Include nums[i]
		subset.add(nums[i]);
		dfs(i + 1, nums);

		// Exclude nums[i]
		subset.remove(subset.size() - 1);
		dfs(i + 1, nums);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

		Subset obj = new Subset();
		obj.dfs(0, arr);

		// Print all subsets
		for (ArrayList<Integer> array : obj.res) {
			for (int val : array) System.out.print(val + " ");
			System.out.println();
		}
		sc.close();
	}
}