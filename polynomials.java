You are given two polynomials. You have to multiply them and print the result.

You are given the coefficients of the first and second polynomials denoted by array A and array B respectively. You have to return the coefficient of the resulting polynomials.

Example:-
A = [1,2,3]
B = [3,2,1]

ANSWER:- The answer should be [3,8,14,8,3] as the polynomials are x^2 + 2x + 3 and 3x^2 + 2x + 1.On multiplying we get 3x^4 + 8x^3 + 14x^2 + 8x + 3 and hence the answer is [3, 8, 14, 8, 3].


import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] multiply(int[] a, int[] b, int n)
    {
        // Write your code here
        int[] ans=new int[2*n-1];
        Arrays.fill(ans,0);
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                    ans[j+i]+=a[i]*b[j];
            }
        }
        return ans;
    }
}



gfg problem 

  //{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int M = Integer.parseInt(input[0]); 
            int N = Integer.parseInt(input[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr1[]= new int[M];
            for(int i = 0; i < M; i++)
                Arr1[i] = Integer.parseInt(input_line[i]);
            
            String input_line1[] = read.readLine().trim().split("\\s+");
            int Arr2[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr2[i] = Integer.parseInt(input_line1[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.polyMultiply(Arr1,Arr2,M,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] polyMultiply(int Arr1[], int Arr2[], int m, int n)
    {
        // code here
       int [] ans=new int[m+n-1];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[i+j]+=Arr1[i]*Arr2[j];
            }
        }
        return ans;
         
        
    }
}
