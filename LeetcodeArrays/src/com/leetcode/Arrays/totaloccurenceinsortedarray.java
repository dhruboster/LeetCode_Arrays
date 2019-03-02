package com.leetcode.Arrays;

// find the count of total occurences of a number in sorted array

public class totaloccurenceinsortedarray {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 3, 5, 5, 5, 5, 5, 7, 8, 9 };
		int target = 3;

		int ocuurence = findOccurence(array, target);
		System.out.println(ocuurence);

	}

	private static int findOccurence(int[] array, int target) {
		// TODO Auto-generated method stub

		int firstOccurence = binarySearchfirst(array, target);
		System.out.println(firstOccurence);

		int lastoccurence = binarySearchLast(array, target);

		return (lastoccurence - firstOccurence) + 1;
	}

	private static int binarySearchLast(int[] array, int target) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = array.length - 1;

		int result = -1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == target) {
				result = mid;
				low = mid + 1;

			} else if (array[mid] > target) {
				high = mid - 1;
			} else
				low = mid + 1;

		}

		return result;
	}

	private static int binarySearchfirst(int[] array, int target) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = array.length - 1;

		int result = -1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == target) {
				result = mid;
				high = mid - 1;

			} else if (array[mid] > target) {
				high = mid - 1;
			} else
				low = mid + 1;

		}

		return result;
	}

}
