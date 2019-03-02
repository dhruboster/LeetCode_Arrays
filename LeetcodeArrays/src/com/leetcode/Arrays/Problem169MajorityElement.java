package com.leetcode.Arrays;

/*
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
  You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class Problem169MajorityElement {
	
	public static void main(String[] args) {
		
		int [] array = {2,2,1,1,1,2,2,7,7,7,7,7,7,7,7};
		
		int majorityElement = majority(array);
		System.out.println(majorityElement);
	}

	private static int majority(int[] array) {
		// TODO Auto-generated method stub
		Integer candidate = null;
		
		int count =0;
		
		for(int i=0;i<array.length;i++)
		{
			if(count ==0)
			{
				candidate = array[i];
				count =1;
				continue;
			}
			else
			{
				if(candidate==array[i])
				{
					count ++;
				}
				else
					count--;
			}
			
		}
		
		
		int sum =0;
		for(int i=0;i<array.length;i++)
		{
			if(candidate==array[i])
			{
				sum++;
			}
		}
		
		if(sum>array.length/2)
		{
			return candidate;
		}
		
		return -1;
	}

}
