import java.util.Arrays;

public class MinimumPathSum {
	public static int minPathSum(int[][] grid) {

		int row = grid.length;
		int col = grid[0].length;

		int[][] dp = new int[row + 1][col + 1];
		int result = -1;

		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= col; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				} else if (i == 1) {
					dp[i][j] = dp[i][j - 1] + grid[i - 1][j - 1];
				} else if (j == 1) {
					dp[i][j] = dp[i - 1][j] + grid[i - 1][j - 1];
				}

				else {
					dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i - 1][j - 1];
				}
				result = dp[i][j];
			}

			// System.out.println(Arrays.toString(dp[i]));
		}

		// System.out.println(result);

		return result;
	}

	public static void main(String[] args) {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(minPathSum(grid));
	}
}