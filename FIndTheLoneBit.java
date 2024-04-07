import java.util.* ;


You are given a single non-negative integer ‘N’ who’s binary representation consists of a single ‘1’ digit and the rest of the digits are ‘0’s. Your task is to find the position of the only ‘1’ digit. In other words, your task is to find the position of the only set bit in the binary representation of the input integer ‘N’.

The position of the set bit must be counted from the LSB (Least Significant Bit) end of the Binary number. If the count of set bits in the Binary number is not equal to 1, then your function should return ‘-1’ as output.

Example:-




import java.io.*; 
public class Solution {
	public static int findSetBit(int n) {
		// WRITE YOUR CODE HERE
		//int ans=-1;
		int count=0;
		int position=0;
		while(n>0)
		{
			if((n&1)==1)
			{
				count++;
			}
			if(count>1)
			{
				return -1;
			}
			position=position+1;
			n=n>>1;
		}
		if(count!=1)
		{
			return -1;
		}
		return position;
	}
}
