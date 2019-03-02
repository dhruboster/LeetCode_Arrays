package com.leetcode.Arrays;

// given a sorted array find the first and last occurence of a number

public class findingFirstandLastOccurence {

	public static void main(String[] args) {

		int[] array = { 2,4,10,10,10,18,20 };
		int target = 10;

		int firstoccurence = findFirst(array, target);
		
		System.out.println(firstoccurence);
		int lastOccurence = findLast(array, target);

		int[] number = { firstoccurence, lastOccurence };
		System.out.println("First and last occurence of the target " + target + " are :");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}

	}

	private static int findFirst(int[] array, int target) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = array.length - 1;
		int result = -1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == target) {
				high = mid - 1;
				result = mid;
			} else if (target < array[mid]) {
				low = mid + 1;

			} else
				high = mid - 1;
		}

		return result-1;
	}

	private static int findLast(int[] array, int target) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = array.length - 1;
		int result = -1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == target) {
				low = mid + 1;
				result = mid;
			} else if (target > array[mid]) {
				low = mid + 1;

			} else
				high = mid - 1;
		}

		return result;
	}

}
