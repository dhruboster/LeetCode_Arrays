package com.leetcode.Arrays;


// Given a rotated sorted array find the number of times the array is rotated

// Index of the smallest element is always the total number of rotations
public class FindRoataionCount {
	
	public static void main(String[] args) {
		
		int [] array = {5,6,1,2,3,4};
		
		int rotationCount = countRotate(array);
		
		System.out.println(rotationCount);
		
	}

	private static int countRotate(int[] array) {
		// TODO Auto-generated method stub
		
		
		
		int high = array.length-1;
		
		int low =0;
		
		if(array[high]>array[low])
		{
			return 0;
		}
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(array[mid]>array[mid-1])
			{
				return mid-1;
			}
			else if(array[mid]<array[mid+1])
			{
				return mid;
			}
			else if(array[high]>array[mid])
			{
				high = mid -1;
			}
			else
				low = mid+1;
		}
		
		
		
		return 0;
	}

}
