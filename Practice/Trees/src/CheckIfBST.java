/*
 * Given a binary tree check if it is a BST
 */
public class CheckIfBST {

	static class Node
	{
	    int data;
	    Node left, right;
	 
	    public Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	
	
	boolean isBST(Node root){
		
		//Base case
		if(root==null)
			return true;
		
		int maxLeft = getMaxVal(root.left);
		int minRight = getMaxVal(root.right);
		
		if(root.data> maxLeft && root.data< minRight && isBST(root.left) && isBST(root.right)){
			return true;
		}
		
		return false;
	}


	private int getMaxVal(Node root) {
		
		//Base case
		if(root ==null)
			return Integer.MIN_VALUE;
		
		return (Math.max(root.data, Math.max(getMaxVal(root.left), getMaxVal(root.right))));
		
	}
	
	private int getMinVal(Node root) {
		
		//Base case
		if(root ==null)
			return Integer.MAX_VALUE;
		
		return (Math.min(root.data, Math.min(getMinVal(root.left), getMinVal(root.right))));
		
	}
	
}
