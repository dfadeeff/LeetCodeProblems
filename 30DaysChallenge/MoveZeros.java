import java.util.Arrays;

public class MoveZeros {
	public static void moveZeros(int[] nums) {
		int n = nums.length;
		int nxt = 0; //second pointer
		
		for (int x: nums) {
			if (x!=0) {
				nums[nxt] = x;
				nxt++;
			}
		}
		for (int i = nxt; i < n; i++) {
			nums[i] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeros(nums);
	}
}