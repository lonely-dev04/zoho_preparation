import java.util.*;

class SubarraySumEqualsToK2 {
	public static void findSumEqualsToK(int[] arr, int k) {
        HashMap<Integer, ArrayList<Integer>> prefSums = new HashMap<>();
        prefSums.put(0, new ArrayList<>());
        prefSums.get(0).add(-1);  // base case for subarrays starting at index 0

        int curSum = 0;
        ArrayList<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            int diff = curSum - k;

            if (prefSums.containsKey(diff)) {
                for (int startIndex : prefSums.get(diff)) {
                    // Extract subarray and convert to List<Integer>
                    int[] subarray = Arrays.copyOfRange(arr, startIndex + 1, i + 1);
                    List<Integer> list = new ArrayList<>();
                    for (int num : subarray) list.add(num);
                    res.add(list);
                }
            }

            // Update prefix sum map
            prefSums.computeIfAbsent(curSum, key -> new ArrayList<>()).add(i);
        }

        System.out.println("Subarrays with sum = " + k + ":");
        for (List<Integer> subarray : res) {
            System.out.println(subarray);
        }
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