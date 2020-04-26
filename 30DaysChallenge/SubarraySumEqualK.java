import java.util.HashMap;

public class SubarraySumEqualK {

	public static int subarraySum(int[] array, int k) {

		int count = 0;
		int sum = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		int[] array = { 3, 4, 7, 2, -3, 1, 4, 2 };
		System.out.println(subarraySum(array, 7));
	}
}