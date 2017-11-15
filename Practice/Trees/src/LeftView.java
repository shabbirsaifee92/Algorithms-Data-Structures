/*
 * Given a Binary Tree, print left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from left side.
 */
public class LeftView {

	
	static class Node
	{
	    int data;
	    Node left, right;
	    Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }    
	}
	
	int maxLevel =0;
	
	public void leftView(Node root, int level){
		
		//base case
		if(root==null)
			return;
		
		if(maxLevel<level){
			System.out.print(root.data);
			maxLevel=level;
		}
		
		leftView(root.left, level+1);
		leftView(root.right, level+1);
					
	}
	
}
