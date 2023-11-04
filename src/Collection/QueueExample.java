package Collection;
import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		//We cannot create object for Queue as it is an interface, 
		//we can create obj of linked list or priority Queue and assign it to queue
		Queue<String> q = new LinkedList<String>();
		
		//Adding elements to the queue
		q.add("Rick");
		q.add("Maggie");
		q.add("Glenn");
		q.add("Negan");
		q.add("Daryl");
		System.out.println("Elements in Queue: "+q);
		/* We can remove element from queue using remove()method,
		 * this would remove the first element from the queue
		 */
		System.out.println("Removed element: "+q.remove());
		//element() method- this returns the head of the queue. Head is the first element of queue
		System.out.println("Head: "+q.element());
		// poll() method - this removes and returns the head of the queue. Returns null if the queue is empty
		System.out.println("Poll(): "+q.poll());
		//peek() method- it works same as element() method, however it returns null if the queue is empty
		System.out.println("Peek(): "+q.peek());
		//Again displaying the elements of queue
		System.out.println("Elements in Queue: "+q);
		
	}

}
