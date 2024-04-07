
Problem statement
Given a binary tree with ‘root’. Your task is to find the sum of all the left leaf nodes.

Properties of leaf:-

In a binary tree, a leaf is a node such that it does not have any children. Node ‘1’ is always the root of the binary tree. Left leaves are those nodes that are the left child of their parent and a leaf node.

Example:



import java.util.* ;
import java.io.*; 
/*************************************************************
    Following is the Binary Tree node structure:

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

public class Solution {
	//public  static int sum=0;
	private static void sum(TreeNode<Integer>root,boolean isleft,int[] sum)
	{
		if(isleft&&root.left==null&&root.right==null)
		{
			sum[0]+=root.data;
			return;
		}
		if(root.left!=null)
		{
			sum(root.left,true,sum);
		}
		if(root.right!=null)
		{
			sum(root.right,false,sum);
		}
		//return sum;
	}
    public static  int sumOfLeftLeaves(TreeNode<Integer> root) {
        // Write your code here.
		int sum[]=new int[1];
		if(root==null)
			return 0;
		sum(root,false,sum);
		return sum[0];
    }
}
