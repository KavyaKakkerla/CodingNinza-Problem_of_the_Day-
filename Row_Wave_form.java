import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> rowWaveForm(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here
		ArrayList<Integer>result=new ArrayList<>();
		for(int i=0;i<mat.size();i++)
		{
			ArrayList<Integer>row=mat.get(i);
			if(i%2==0)
			{
				for(int j=0;j<row.size();j++)
				{

					result.add(row.get(j));
				}
			}
			else
			{
				for(int j=row.size()-1;j>=0;j--)
				{
					result.add(row.get(j));
				}
			}
		}
		return result;
	}
}
