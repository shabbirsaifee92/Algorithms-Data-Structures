
/*
 * return true if BT is mirror image /symmetric
 */
public class MirrorTree {

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
	
	boolean isMirror(Node n1,Node n2){
		//Base
		if(n1==null && n2==null)
			return true;
		
		if(n1!=null && n2!=null && n1.data==n2.data){
			return (isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left.left));
		}
		
		return false;
	}
}
