package com.leetcode.Arrays;
import java.util.HashMap;

public class Problem1TwoSum {
	public static void main(String[] args) {

		int[] array = { 2, 7, 11, 15 };

		int sum = 9;

		int[] index = new int[2];
		index = twoSum(array, sum);
		
		for(int i=0;i<index.length;i++)
		{
			System.out.println(index[i]);
		}

	}

	private static int[] twoSum(int[] array, int sum) {
		// TODO Auto-generated method stub
		
       HashMap<Integer, Integer> hs = new HashMap<>();
		
		for(int i=0;i<array.length;i++)
		{
			int key = sum -array[i];
			if(hs.containsKey(key))
			{
				return new int[]{hs.get(key),i};
			}
			else
				hs.put(array[i], i);
		}
		return null;
	}

}
