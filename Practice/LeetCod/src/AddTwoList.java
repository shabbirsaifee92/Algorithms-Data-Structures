import java.util.LinkedList;
import java.util.List;



public class AddTwoList {


	
	 public static ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2,int c) {
		//int c =0;
		int length1=0;

		 
		ListNode2 ls = null;
		int res = 0;
		if(l1!=null||l2!=null){
			if(l1==null)
				res = l2.val+c;
			else if(l2==null)
				res= l1.val+c;
			else
			 res = l1.val+l2.val+c;
			if(res>=10){
				ls=new ListNode2(res-10);
				c=1;
			}
			else{
				ls = new ListNode2(res);
				c=0;
			}
			
				if(l1==null||l1.next==null)
					ls.next= addTwoNumbers( null,  l2.next, c) ;
				else if(l2==null||l2.next==null)
					ls.next= addTwoNumbers( l1.next,  null, c) ;
				else
					ls.next= addTwoNumbers( l1.next,  l2.next, c) ;
			
		}
		return ls;
	 }
	 

	public static void main(String args[]){
		//List <Integer> l1 = new LinkedList<>();
		//List <Integer> l2 = new LinkedList<>();
		ListNode2 l1 = new ListNode2(1);
		ListNode2 l1a = new ListNode2(8);
		//ListNode2 l1b = new ListNode2(3);
		l1.next = l1a;
		//l1a.next= l1b;
		
		ListNode2 l2 = new ListNode2(0);
		//ListNode2 l2a = new ListNode2(6);
		//ListNode2 l2b = new ListNode2(4);
		//l2.next = l2a;
		//l2a.next= l2b;
		//l1.add(2);l1.add(4);l1.add(3);
		//l2.add(5);l2.add(6);l2.add(4);
		//addTwoNumbers(l1, l2);
		ListNode2 ln=  addTwoNumbers(l1,l2,0);
		while(ln!=null){
			System.out.println(ln.val);
			ln=ln.next;
		}
		
	}
    public static List addTwoNumbers(List<Integer> l1, List<Integer> l2) {
    	int c =0;
    	List<Integer> ls = new LinkedList<>();
		for(int i = 0;i<l1.size();i++){
			int res = (Integer)l1.get(i)+(Integer)l2.get(i)+c;
			if(res>=10){
				ls.add(res-10);
				c=1;
			}
			else{
				ls.add(res);
			}
		}
		return ls;
        
    }
}

