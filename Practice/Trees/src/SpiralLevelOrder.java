import java.util.Stack;

/*
 * Print level order in spiral
 */
public class SpiralLevelOrder {

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
	
	void spiral(Node root){
		
		Stack<Node> st1 = new Stack<>();
		Stack<Node> st2 = new Stack<>();
		
		st1.push(root);
		
		while(!st1.isEmpty() && !st2.isEmpty()){
			
			while(!st1.isEmpty()){
				Node n =st1.pop();
				System.out.println(n.data);
				if(n.right!=null){
					st2.add(n.right);
				}
				
				if(n.left!=null){
					st2.add(n.left);
				}
				
			}
			
			while(!st2.isEmpty()){
				Node n =st2.pop();
				System.out.println(n.data);
				if(n.left!=null){
					st1.add(n.left);
				}
				
				if(n.right!=null){
					st1.add(n.right);
				}
			}
			
		}
	}
}
