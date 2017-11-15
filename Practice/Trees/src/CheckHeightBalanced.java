/*
 * Check if BT is height balanced or not
 */
public class CheckHeightBalanced {

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
	
	boolean isBalanced(Node root){
		
		//Base
		if(root ==null)
			return true;
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		if(Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right))
			return true;
		
		return false;
	}

	private int height(Node root) {
		
		//Base
		if(root==null)
			return 0;
		
		return 1+Math.max(height(root.left),height(root.right));
	}
}
