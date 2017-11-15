import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int k = 3;
		Deque<Integer> dq = new LinkedList<>();
		
		// for first K element
		dq.addLast(0);
		for(int i =1;i<k;i++){
			
			//For current element all the prevoius elemnts which are smaller, they are not useful so
			// pop their corresponding indices from queue
			while( !dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
				dq.removeLast();
			}
			dq.addLast(i);
		}
		// for all other elements
		for(int i =k;i<arr.length;i++){
			// First element of queue is greatest. So print it
			System.out.println(arr[dq.peekFirst()]);
			
			//Remove all indices from front which are not part of current window
			while(!dq.isEmpty() && dq.peekFirst()<i-k){
				dq.removeFirst();
			}
			//For current element all the prevoius elemnts which are smaller, they are not useful so
			// pop their corresponding indices from queue
			while( !dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
				dq.removeLast();
			}
			dq.addLast(i);
			
		}
		
		System.out.println(arr[dq.peekFirst()]);
		
	}
}
