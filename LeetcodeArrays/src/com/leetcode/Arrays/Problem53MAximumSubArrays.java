package com.leetcode.Arrays;

public class Problem53MAximumSubArrays {

	public static void main(String[] args) {

		int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int maxSubArray = maxSubArray(array);
		System.out.println(maxSubArray);
	}

	private static int maxSubArray(int[] array) {
		// TODO Auto-generated method stub

		int ans = 0, sum = 0;

		for (int i = 0; i < array.length; i++) {
			if ((sum + array[i]) > 0) {
				sum = sum + array[i];
			} else
				sum = 0;

			ans = Math.max(ans, sum);
		}

		return ans;
	}

}
