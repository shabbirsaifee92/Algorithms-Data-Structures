/*
 * Find the lowest common ancestor of BST
 */
public class LowestCommonAncestor {

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
	
	Node commonAnsc(Node root, Node n1,Node n2){
		
		while(root!=null){
			
			if(root.data>n1.data && root.data>n2.data){
				root = root.left;
			}
			else if(root.data<n1.data && root.data<n2.data){
				root=root.right;
			}
			else{
				return root;
			}
			
			
		}
		return root;
	}
}
