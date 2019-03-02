package com.leetcode.Arrays;

import java.util.Arrays;

public class Problem628MaxProductsofThreenumbers {
	
	public static void main(String[] args) {
		
		int [] array = {1,2,3,4};
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<0)
			{
				array[i]= -array[i];
			}
		}
		
		Arrays.sort(array);
		
		int max = max(array);
		System.out.println(max);
		
	}

	private static int max(int[] arr) {
		// TODO Auto-generated method stub
		return Math.max(arr[0] * arr[1] * arr[arr.length-1], 
                arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3]);
	}

}
