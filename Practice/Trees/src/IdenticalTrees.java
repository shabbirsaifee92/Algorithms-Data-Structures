
/*
 * If two BT are identical or not
 */
public class IdenticalTrees {

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
	
	boolean isIdentical(Node n1,Node n2){
		
		//Base
		if(n1 ==null && n2==null)
			return true;
		
		else if(n1!=null &&n2!=null && n1.data==n2.data){
			
			return(isIdentical(n1.left, n2.left) && isIdentical(n1.right, n2.right));
		}
		return false;
	}
}
