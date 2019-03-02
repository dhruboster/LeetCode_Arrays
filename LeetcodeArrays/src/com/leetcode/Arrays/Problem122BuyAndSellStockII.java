package com.leetcode.Arrays;

public class Problem122BuyAndSellStockII {

	
public static void main(String[] args) {
		
		int [] array = {1, 7, 2, 3, 6, 7, 6, 7};
		
		int maxProfit = max(array);
		System.out.println(maxProfit);
	}

private static int max(int[] array) {
	// TODO Auto-generated method stub
	
	int maxProfit = 0;
	
	for(int i=1;i<array.length;i++)
	{
		if(array[i]>array[i-1])
		{
			maxProfit= maxProfit + (array[i]-array[i-1]);
		}
	}
	

	return maxProfit;
	
}
}
