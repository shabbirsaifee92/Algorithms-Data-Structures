import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaxDepth {

	
	  
	  public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 

	    public int maxDepth(TreeNode root) {
	        
	        if(root == null){
	        	return 0;
	        }
	        
	        int lDepth = maxDepth(root.left);
	        int rDepth= maxDepth(root.right);
	        
	        return Math.max(lDepth, rDepth)+1;
	    }
	
}
