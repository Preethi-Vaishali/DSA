package Collection;

import java.util.Deque;
import java.util.ArrayDeque;

public class Array_Dequeue_Example {

	public static void main(String[] args) {
		//We cannot create object for Deque as it is an interface, 
				//we can create obj of ArrayDeque or LinkedList and assign it to Deque
				Deque<String> dq = new ArrayDeque<String>();
				
				//Adding elements to the Deque. addFirst()adds element at the beginning
				//and addLast() method adds at the end
				
				dq.add("Glenn");
				dq.add("Negan");
				dq.addFirst("Rick");
				dq.addLast("Maggie");
				dq.add("Daryl");
				System.out.println("Elements in Queue: "+dq);
				/* We can remove element from Deque using remove()method,
				 * we can use normal remove() method which removes first element or 
				 * we can use removeFirst() and removeLast()methods to remove first and last element respectively. 
				 */
				System.out.println("Removed element: "+dq.removeLast());
				
				//element() method- this returns the head of the Deque. Head is the first element of Deque
				System.out.println("Head: "+dq.element());
				
				/* pollLast() method - this removes and returns the tail of the Deque(last element). 
				 * Returns null if the queue is empty
				 * We can also use poll() or pollFirst() to remove the first element of Deque
				 */
				System.out.println("Poll(): "+dq.pollLast());
				/*peek() method- it works same as element() method, however it returns null if the queue is empty
				 * We can also use peekFirst() and peekLast() to retrieve first and last element
				 */
				System.out.println("Peek(): "+dq.peek());
				//Again displaying the elements of queue
				System.out.println("Elements in Deque: "+dq);

	}

}
