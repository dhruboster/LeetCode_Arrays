package com.leetcode.Arrays;

/*
 * 
 * A peak element is an element that is greater than its neighbors.

Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that nums[-1] = nums[n] = -∞.

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 1 or 5 
Explanation: Your function can return either index number 1 where the peak element is 2, 
             or index number 5 where the peak element is 6.
 * 
 */

public class Problem162FindPeakElement {
	
	public static void main(String[] args) {

		int[] array = { 15, 20, 25, 35, 45, 50, 60 };
		
		int peak = peakElment(array);
		
		System.out.println(peak);
		
		
	}

	private static int peakElment(int[] array) {
		// TODO Auto-generated method stub
		
		if(array.length==0)
			return -1;
		
		int left = 0;
		int right = array.length-1;
		
		while(left<=right)
		{
			int mid=(left+right)/2;
			if((mid==0 || array[mid]>=array[mid-1])&&(mid==array.length-1 || array[mid] >=array[mid+1]))
			{
				return array[mid];
			}
			else if(mid>0 && array[mid]<array[mid-1])
			{
				right = mid -1;
			}
			else
				left = mid+1;
		}
		
		
		
		return 0;
	}

}
