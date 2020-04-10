public class SimpleNumber {
	public static int singleNumber(int[] nums) {
		int x = 0;
		for (int a: nums) {
			x ^= a;
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		int[] nums1 = {2,2,1};
		System.out.println(singleNumber(nums1));
		
		int[] nums2 = {4,1,2,1,2};
		System.out.println(singleNumber(nums2));
	}
}