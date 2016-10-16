/**
 * find next permutation of a numeric series - [1 1 5 2 1] --> [1 2 1 1 5]
 */
public class NextPermutation {
	public void nextPermutation(int[] nums) {
		int l = nums.length - 1;
		int p = -1;
		for (int r = l; r > 0; r--) {
			if (nums[r - 1] < nums[r]) {
				p = r - 1;
				break;
			}
		}

		if (p == -1) {
			reverseArray(nums, 0, l);
			return;
		}

		int q = -1;
		for (int r = l; r >= 0; r--) {
			if (nums[r] > nums[p]) {
				q = r;
				break;
			}
		}

		int temp = nums[p];
		nums[p] = nums[q];
		nums[q] = temp;

		if (p < l)
			reverseArray(nums, p + 1, l);
	}

	private void reverseArray(int[] nums, int s, int e) {
		int temp;
		while (s < e) {
			temp = nums[s];
			nums[s] = nums[e];
			nums[e] = temp;
			s++;
			e--;
		}
	}

	public static void main(String[] args) {
		int[] nums = {1, 3, 2};
		new NextPermutation().nextPermutation(nums);

		for(int num: nums){
			System.out.print(num + " ");
		}
	}
}
