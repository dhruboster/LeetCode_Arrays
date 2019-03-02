package com.leetcode.Arrays;


/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction 
(i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
Note that you cannot sell a stock before you buy one.
 * Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
 */
public class Problem121BuyandSellStock {
	
	
	public static void main(String[] args) {
		
		int [] array = {7,6,4,3,1};
		
		int maxProfit = max(array);
		System.out.println(maxProfit);
	}

	private static int max(int[] array) {
		// TODO Auto-generated method stub
		
		int min = Integer.MAX_VALUE;
		int max =0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min = array[i];
			}
			else if((array[i]-min)>max)
			{
				max = array[i]-min;
			}
		}
		
		return max;
	}

}
